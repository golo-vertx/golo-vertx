package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, -790891205=286687405, 1530095650=258206165, 1700794599=23380983, -454564913=39905148, 470893467=-1927590968, 975857440=-562830283, -1101012140=112572421, -579659937=26128239, 1051357734=1264215796} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetSocketStream 
public class NetSocketStream implements ReadStream<NetSocket> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, -790891205=286687405, 1530095650=258206165, 1700794599=23380983, -454564913=39905148, 470893467=-1927590968, 975857440=-562830283, -1101012140=112572421, -579659937=26128239, 1051357734=1264215796}
  private io.vertx.core.net.NetSocketStream delegate;
  public NetSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.net.NetSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream handler(Handler<NetSocket> handler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).handler(new Handler<io.vertx.core.net.NetSocket>() {
      public void handle(io.vertx.core.net.NetSocket event) {
        handler.handle(new io.vertx.golo.core.net.NetSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.net.NetSocketStream pause()
//io.vertx.core.net.NetSocketStream
  public NetSocketStream pause() {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.net.NetSocketStream resume()
//io.vertx.core.net.NetSocketStream
  public NetSocketStream resume() {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
