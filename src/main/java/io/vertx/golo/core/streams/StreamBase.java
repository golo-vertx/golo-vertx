package io.vertx.golo.core.streams;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 2014844745=-1972128936, -424955495=395781, 1845308040=-1750564416, 1946555072=725983679, 483258661=-424411460, 1583631006=-320761946, 1640097323=901726906, -366511526=707591217, 318447204=-1212559972, -1035843363=267355517} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.streams.StreamBase 
public interface StreamBase {
public Object getDelegate();
  StreamBase exceptionHandler(Handler<Throwable> handler);
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class StreamBaseImpl implements StreamBase {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 2014844745=-1972128936, -424955495=395781, 1845308040=-1750564416, 1946555072=725983679, 483258661=-424411460, 1583631006=-320761946, 1640097323=901726906, -366511526=707591217, 318447204=-1212559972, -1035843363=267355517}
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
