package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {
        private io.vertx.core.http.HttpServerRequestStream delegate; 
    public HttpServerRequestStream(Object delegate) {
            this.delegate = (io.vertx.core.http.HttpServerRequestStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public HttpServerRequestStream exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerRequestStream.class); 
    }
        // io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
    // TypeParams: [] 
        public HttpServerRequestStream handler(Handler<HttpServerRequest> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.HttpServerRequest>() {
                          public void handle(io.vertx.core.http.HttpServerRequest event) {
handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequestStream.class); 
    }
        // io.vertx.core.http.HttpServerRequestStream pause() 
    // TypeParams: [] 
        public HttpServerRequestStream pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpServerRequestStream.class); 
    }
        // io.vertx.core.http.HttpServerRequestStream resume() 
    // TypeParams: [] 
        public HttpServerRequestStream resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpServerRequestStream.class); 
    }
        // io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public HttpServerRequestStream endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpServerRequestStream.class); 
    }
        }
