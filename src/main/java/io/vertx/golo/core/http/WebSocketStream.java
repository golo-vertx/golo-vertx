package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.WebSocketStream 
public class WebSocketStream implements ReadStream<WebSocket> {
        private io.vertx.core.http.WebSocketStream delegate; 
    public WebSocketStream(Object delegate) {
            this.delegate = (io.vertx.core.http.WebSocketStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public WebSocketStream exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.WebSocketStream.class); 
    }
        // io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler) 
    // TypeParams: [] 
        public WebSocketStream handler(Handler<WebSocket> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
handler.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketStream.class); 
    }
        // io.vertx.core.http.WebSocketStream pause() 
    // TypeParams: [] 
        public WebSocketStream pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.WebSocketStream.class); 
    }
        // io.vertx.core.http.WebSocketStream resume() 
    // TypeParams: [] 
        public WebSocketStream resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.WebSocketStream.class); 
    }
        // io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public WebSocketStream endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.WebSocketStream.class); 
    }
        }
