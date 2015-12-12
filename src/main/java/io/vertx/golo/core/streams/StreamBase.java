package io.vertx.golo.core.streams;

//[Debug] This is a debuging message to check @code{} syntax
// {0=4, 1210930425=928879565, -1331593158=-643595542, 1214644891=360369846, 2123266368=-345720282} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
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
//io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.streams.StreamBase
  /**
   * Set an exception handler.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public StreamBase exceptionHandler(Handler<Throwable> handler) {
    ((io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
}
