package io.vertx.golo.core;

//[Debug] classMethodData = {io.vertx.core.TimeoutStream=6} 
//[Debug] arr = [io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler), io.vertx.core.TimeoutStream pause(), io.vertx.core.TimeoutStream resume(), io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), void cancel()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=4, 263677239=1207289406, -1022407609=-1265260998, -1706646197=-545793485, -1813811667=-301555691} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.TimeoutStream 
public class TimeoutStream implements ReadStream<Long> {
//[Debug] toChangeName = {io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler)=false, io.vertx.core.TimeoutStream resume()=false, io.vertx.core.TimeoutStream pause()=false, io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, void cancel()=false}
//[Debug] dbgMethodName = {io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler)=handler, io.vertx.core.TimeoutStream resume()=resume, io.vertx.core.TimeoutStream pause()=pause, io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, void cancel()=cancel} 
//[Debug] dbgMethodParams = {io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler)=1, io.vertx.core.TimeoutStream resume()=0, io.vertx.core.TimeoutStream pause()=0, io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, void cancel()=0} 
//[INFO]  methods=[io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler), io.vertx.core.TimeoutStream pause(), io.vertx.core.TimeoutStream resume(), io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), void cancel()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.TimeoutStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, void cancel()=false, io.vertx.core.TimeoutStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.TimeoutStream pause()=false, io.vertx.core.TimeoutStream handler(io.vertx.core.Handler<java.lang.Long> handler)=false, io.vertx.core.TimeoutStream resume()=false} 
//[INFO] ifaceSimpleName=TimeoutStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=4, 263677239=1207289406, -1022407609=-1265260998, -1706646197=-545793485, -1813811667=-301555691}
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
