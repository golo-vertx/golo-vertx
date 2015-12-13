package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.ServerWebSocketStream=5} 
//[Debug] arr = [io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler), io.vertx.core.http.ServerWebSocketStream pause(), io.vertx.core.http.ServerWebSocketStream resume(), io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -1855121491=-1213932778, 1591767249=-1209700691, 1705625903=356245207, -671828771=-220958850, -327310636=1911072165, 301561858=-1449190747, -1203991181=-17893236, -1166491433=-1828843259} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.ServerWebSocketStream 
public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {
//[Debug] toChangeName = {io.vertx.core.http.ServerWebSocketStream pause()=false, io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=false, io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.ServerWebSocketStream resume()=false}
//[Debug] dbgMethodName = {io.vertx.core.http.ServerWebSocketStream pause()=pause, io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=handler, io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.http.ServerWebSocketStream resume()=resume} 
//[Debug] dbgMethodParams = {io.vertx.core.http.ServerWebSocketStream pause()=0, io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=1, io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.http.ServerWebSocketStream resume()=0} 
//[INFO]  methods=[io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler), io.vertx.core.http.ServerWebSocketStream pause(), io.vertx.core.http.ServerWebSocketStream resume(), io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.ServerWebSocketStream resume()=false, io.vertx.core.http.ServerWebSocketStream pause()=false, io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=false} 
//[INFO] ifaceSimpleName=ServerWebSocketStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -1855121491=-1213932778, 1591767249=-1209700691, 1705625903=356245207, -671828771=-220958850, -327310636=1911072165, 301561858=-1449190747, -1203991181=-17893236, -1166491433=-1828843259}
  private io.vertx.core.http.ServerWebSocketStream delegate;
  public ServerWebSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.http.ServerWebSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.ServerWebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.ServerWebSocketStream
  public ServerWebSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.ServerWebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)
//io.vertx.core.http.ServerWebSocketStream
  public ServerWebSocketStream handler(Handler<ServerWebSocket> handler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.handle(new io.vertx.golo.core.http.ServerWebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.ServerWebSocketStream pause()
//io.vertx.core.http.ServerWebSocketStream
  public ServerWebSocketStream pause() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.ServerWebSocketStream resume()
//io.vertx.core.http.ServerWebSocketStream
  public ServerWebSocketStream resume() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.ServerWebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.ServerWebSocketStream
  public ServerWebSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
