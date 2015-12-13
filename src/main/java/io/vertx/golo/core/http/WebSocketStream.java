package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.WebSocketStream=5} 
//[Debug] arr = [io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler), io.vertx.core.http.WebSocketStream pause(), io.vertx.core.http.WebSocketStream resume(), io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -2104438368=1895981341, -9643268=-1734663935, 1167474455=-1611440615, 1349449455=-2043507562, 250538236=-30972279, -690497861=-2066682707, 1996929033=-1316251957, 905636533=-280059830} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.WebSocketStream 
public class WebSocketStream implements ReadStream<WebSocket> {
//[Debug] toChangeName = {io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)=false, io.vertx.core.http.WebSocketStream resume()=false, io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.WebSocketStream pause()=false, io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false}
//[Debug] dbgMethodName = {io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)=handler, io.vertx.core.http.WebSocketStream resume()=resume, io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.http.WebSocketStream pause()=pause, io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler} 
//[Debug] dbgMethodParams = {io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)=1, io.vertx.core.http.WebSocketStream resume()=0, io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.http.WebSocketStream pause()=0, io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1} 
//[INFO]  methods=[io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler), io.vertx.core.http.WebSocketStream pause(), io.vertx.core.http.WebSocketStream resume(), io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)=false, io.vertx.core.http.WebSocketStream resume()=false, io.vertx.core.http.WebSocketStream pause()=false, io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false} 
//[INFO] ifaceSimpleName=WebSocketStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -2104438368=1895981341, -9643268=-1734663935, 1167474455=-1611440615, 1349449455=-2043507562, 250538236=-30972279, -690497861=-2066682707, 1996929033=-1316251957, 905636533=-280059830}
  private io.vertx.core.http.WebSocketStream delegate;
  public WebSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.http.WebSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream handler(Handler<WebSocket> handler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).handler(new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        handler.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.WebSocketStream pause()
//io.vertx.core.http.WebSocketStream
  public WebSocketStream pause() {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.WebSocketStream resume()
//io.vertx.core.http.WebSocketStream
  public WebSocketStream resume() {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).endHandler(endHandler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
