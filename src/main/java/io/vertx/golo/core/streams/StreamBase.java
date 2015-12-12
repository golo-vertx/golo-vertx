package io.vertx.golo.core.streams;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, 1860699001=1240316989, -1946123391=1442619244, -416970668=996072580, -1747192151=650513403, 205355464=-1873633654, 1804177359=-666813730, 1587063663=-66639966, 1393115876=-183548548, -1130385775=1795490939} 
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
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, 1860699001=1240316989, -1946123391=1442619244, -416970668=996072580, -1747192151=650513403, 205355464=-1873633654, 1804177359=-666813730, 1587063663=-66639966, 1393115876=-183548548, -1130385775=1795490939}
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
