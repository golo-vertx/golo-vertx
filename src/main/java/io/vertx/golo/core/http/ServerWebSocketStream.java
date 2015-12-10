package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.ServerWebSocketStream 
public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {
        private io.vertx.core.http.ServerWebSocketStream delegate; 
    public ServerWebSocketStream(Object delegate) {
            this.delegate = (io.vertx.core.http.ServerWebSocketStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public ServerWebSocketStream exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.ServerWebSocketStream.class); 
    }
        // io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler) 
    // TypeParams: [] 
        public ServerWebSocketStream handler(Handler<ServerWebSocket> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.ServerWebSocket>() {
                          public void handle(io.vertx.core.http.ServerWebSocket event) {
handler.handle(new io.vertx.golo.core.http.ServerWebSocket(event));
                          }
                        }), io.vertx.golo.core.http.ServerWebSocketStream.class); 
    }
        // io.vertx.core.http.ServerWebSocketStream pause() 
    // TypeParams: [] 
        public ServerWebSocketStream pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.ServerWebSocketStream.class); 
    }
        // io.vertx.core.http.ServerWebSocketStream resume() 
    // TypeParams: [] 
        public ServerWebSocketStream resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.ServerWebSocketStream.class); 
    }
        // io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public ServerWebSocketStream endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.ServerWebSocketStream.class); 
    }
        }
