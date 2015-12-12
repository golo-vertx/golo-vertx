package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=4, 929022510=1869994152, -997832425=633458835, 2114892519=-1405954441, -1404182446=-1096236462} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.ServerWebSocketStream 
public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {
//[INFO] ifaceSimpleName=ServerWebSocketStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=4, 929022510=1869994152, -997832425=633458835, 2114892519=-1405954441, -1404182446=-1096236462}
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
