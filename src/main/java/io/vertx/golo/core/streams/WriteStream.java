package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.Handler;
// Type: io.vertx.core.streams.WriteStream<T> 
public interface WriteStream<T> extends StreamBase {
public Object getDelegate();
  WriteStream<T> exceptionHandler(Handler<Throwable> handler);
  WriteStream<T> write(T data);
  WriteStream<T> setWriteQueueMaxSize(int maxSize);
  boolean writeQueueFull();
  WriteStream<T> drainHandler(Handler<Void> handler);
}
    
    class WriteStreamImpl<T> implements WriteStream<T> {
        private io.vertx.core.streams.WriteStream delegate; 
    public WriteStreamImpl(Object delegate) {
            this.delegate = (io.vertx.core.streams.WriteStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public WriteStream<T> exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
    }
        // io.vertx.core.streams.WriteStream<T> write(T data) 
    // TypeParams: [] 
        public WriteStream<T> write(T data) {
                //param classes(remove later):   OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.streams.WriteStreamImpl.class); 
    }
        // io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize) 
    // TypeParams: [] 
        public WriteStream<T> setWriteQueueMaxSize(int maxSize) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.streams.WriteStreamImpl.class); 
    }
        // boolean writeQueueFull() 
    // TypeParams: [] 
        public boolean writeQueueFull() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.writeQueueFull(); 
    }
        // io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
    // TypeParams: [] 
        public WriteStream<T> drainHandler(Handler<Void> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.streams.WriteStreamImpl.class); 
    }
        }
