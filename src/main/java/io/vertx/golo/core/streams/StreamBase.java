package io.vertx.golo.core.streams;

//[Debug] classMethodData = {io.vertx.core.streams.StreamBase=1} 
//[Debug] arr = [io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=4, 1867881924=1722733943, -341645343=-991443686, 1876853768=-2136914739, 856060734=1233598458} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.streams.StreamBase 
public interface StreamBase {
//[Debug] toChangeName = {io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false}
//[Debug] dbgMethodName = {io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler} 
//[Debug] dbgMethodParams = {io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1} 
//[INFO]  methods=[io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false} 
public Object getDelegate();
  StreamBase exceptionHandler(Handler<Throwable> handler);
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class StreamBaseImpl implements StreamBase {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=4, 1867881924=1722733943, -341645343=-991443686, 1876853768=-2136914739, 856060734=1233598458}
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
