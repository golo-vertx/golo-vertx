package io.vertx.golo.core;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, -736036704=1289953348, -1030369296=967931340, 1735690305=1343476915, 2141656032=118886, -1096844541=1036388761, -360461636=-1444681016} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.TimeoutStream 
public class TimeoutStream implements ReadStream<Long> {
//[INFO] ifaceSimpleName=TimeoutStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, -736036704=1289953348, -1030369296=967931340, 1735690305=1343476915, 2141656032=118886, -1096844541=1036388761, -360461636=-1444681016}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
