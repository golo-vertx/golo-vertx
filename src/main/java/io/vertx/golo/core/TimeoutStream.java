package io.vertx.golo.core;

//[Debug] This is a debuging message to check @code{} syntax
// {0=9, -1037434662=1744780053, 816465866=1827769692, 102985718=1352313505, -98677813=-1838467464, 421874786=1782550532, -838162814=818826808, -2139955512=-2074754885, -1793161662=-1665801102, -209945263=-1956165004} 
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
//io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.TimeoutStream
  public TimeoutStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler)
//io.vertx.core.TimeoutStream
  public TimeoutStream handler(Handler<Long> handler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).handler(handler);
    return this;
  }
//io.vertx.core.TimeoutStream pause()
//io.vertx.core.TimeoutStream
  public TimeoutStream pause() {
    (  (io.vertx.core.TimeoutStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.TimeoutStream resume()
//io.vertx.core.TimeoutStream
  public TimeoutStream resume() {
    (  (io.vertx.core.TimeoutStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.TimeoutStream
  public TimeoutStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.TimeoutStream) this.delegate).endHandler(endHandler);
    return this;
  }
//void cancel()
//void
  /**
   * Cancels the timeout. Note this has the same effect as calling {@link io.vertx.golo.core.TimeoutStream#handler} with a null
   * argument.
   */
  public void cancel() {
    this.delegate.cancel();
  }
}
