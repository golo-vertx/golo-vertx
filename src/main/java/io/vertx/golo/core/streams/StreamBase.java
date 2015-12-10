package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.Handler;
// Type: io.vertx.core.streams.StreamBase 
public interface StreamBase {
public Object getDelegate();
  StreamBase exceptionHandler(Handler<Throwable> handler);
}
    
    class StreamBaseImpl implements StreamBase {
        private io.vertx.core.streams.StreamBase delegate; 
    public StreamBaseImpl(Object delegate) {
            this.delegate = (io.vertx.core.streams.StreamBase) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public StreamBase exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.StreamBaseImpl.class); 
    }
        }
