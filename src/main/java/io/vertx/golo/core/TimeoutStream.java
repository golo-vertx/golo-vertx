package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.TimeoutStream 
public class TimeoutStream implements ReadStream<Long> {
        private io.vertx.core.TimeoutStream delegate; 
    public TimeoutStream(Object delegate) {
            this.delegate = (io.vertx.core.TimeoutStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public TimeoutStream exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.TimeoutStream.class); 
    }
        // io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler) 
    // TypeParams: [] 
        public TimeoutStream handler(Handler<Long> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    BOXED_PRIMITIVE   
        return InternalHelper.safeCreate(this.delegate.handler(handler), io.vertx.golo.core.TimeoutStream.class); 
    }
        // io.vertx.core.TimeoutStream pause() 
    // TypeParams: [] 
        public TimeoutStream pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.TimeoutStream.class); 
    }
        // io.vertx.core.TimeoutStream resume() 
    // TypeParams: [] 
        public TimeoutStream resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.TimeoutStream.class); 
    }
        // io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public TimeoutStream endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.TimeoutStream.class); 
    }
        // void cancel() 
    // TypeParams: [] 
        public void cancel() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        this.delegate.cancel(); 
    }
        }
