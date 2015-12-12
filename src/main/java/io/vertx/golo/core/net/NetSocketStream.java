package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1373391901=2066388956, -290726311=-1139167372, 1759093835=-1337107725, 1433711591=1545585232, 908963094=-1457531139, -1302926326=-1537931491, -1705366908=1321414299, 531262836=1321215115} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.net.NetSocketStream 
public class NetSocketStream implements ReadStream<NetSocket> {
//[INFO] ifaceSimpleName=NetSocketStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1373391901=2066388956, -290726311=-1139167372, 1759093835=-1337107725, 1433711591=1545585232, 908963094=-1457531139, -1302926326=-1537931491, -1705366908=1321414299, 531262836=1321215115}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
