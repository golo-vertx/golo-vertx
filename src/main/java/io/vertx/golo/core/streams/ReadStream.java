package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
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
  /**
   * Set an exception handler on the read stream.
   * @param handler the exception handler
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
  /**
   * Set a data handler. As data is read, the handler will be called with the data.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> handler(Handler<T> handler) {
    ((io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<Object>() {
      public void handle(Object event) {
        handler.handle((T)InternalHelper.wrapObject(event));
      }
    });
    return this;
  }
  /**
   * Pause the <code>ReadSupport</code>. While it's paused, no data will be sent to the <code>dataHandler</code>
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> pause() {
    ((io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
  /**
   * Resume reading. If the <code>ReadSupport</code> has been paused, reading will recommence on it.
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> resume() {
    ((io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
  /**
   * Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.
   * @param endHandler 
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> endHandler(Handler<Void> endHandler) {
    ((io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
