package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.Handler;
// Type: io.vertx.core.streams.ReadStream<T> 
public interface ReadStream<T> extends StreamBase {
public Object getDelegate();
  ReadStream<T> exceptionHandler(Handler<Throwable> handler);
  ReadStream<T> handler(Handler<T> handler);
  ReadStream<T> pause();
  ReadStream<T> resume();
  ReadStream<T> endHandler(Handler<Void> endHandler);
}
    
    class ReadStreamImpl<T> implements ReadStream<T> {
        private io.vertx.core.streams.ReadStream delegate; 
    public ReadStreamImpl(Object delegate) {
            this.delegate = (io.vertx.core.streams.ReadStream) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public ReadStream<T> exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.streams.ReadStreamImpl.class); 
    }
        // io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler) 
    // TypeParams: [] 
        public ReadStream<T> handler(Handler<T> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    OBJECT   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<Object>() {
                  public void handle(Object event) {
handler.handle(InternalHelper.wrapObject(event));
                  }
                }), io.vertx.golo.core.streams.ReadStreamImpl.class); 
    }
        // io.vertx.core.streams.ReadStream<T> pause() 
    // TypeParams: [] 
        public ReadStream<T> pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
    }
        // io.vertx.core.streams.ReadStream<T> resume() 
    // TypeParams: [] 
        public ReadStream<T> resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.streams.ReadStreamImpl.class); 
    }
        // io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public ReadStream<T> endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.streams.ReadStreamImpl.class); 
    }
        }
