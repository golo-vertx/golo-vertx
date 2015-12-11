package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
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
  public TimeoutStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).exceptionHandler(handler);
    return this;
  }
  public TimeoutStream handler(Handler<Long> handler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).handler(handler);
    return this;
  }
  public TimeoutStream pause() {
    (  (io.vertx.core.TimeoutStream) this.delegate).pause();
    return this;
  }
  public TimeoutStream resume() {
    (  (io.vertx.core.TimeoutStream) this.delegate).resume();
    return this;
  }
  public TimeoutStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).endHandler(endHandler);
    return this;
  }
  /**
   * Cancels the timeout. Note this has the same effect as calling {@link io.vertx.golo.core.TimeoutStream#handler} with a null
   * argument.
   */
  public void cancel() {
    this.delegate.cancel();
  }
}
