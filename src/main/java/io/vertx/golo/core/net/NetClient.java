package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, -113752213=-1973395767, 2040142201=-1008994004, -693368747=61200408, -336589478=-699301957, -1020112818=619201232, 1254411019=-1697517894} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.net.NetClient 
public class NetClient implements Measured {
//[INFO] ifaceSimpleName=NetClient
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, -113752213=-1973395767, 2040142201=-1008994004, -693368747=61200408, -336589478=-699301957, -1020112818=619201232, 1254411019=-1697517894}
  private io.vertx.core.net.NetClient delegate;
  public NetClient(Object delegate) {
    this.delegate = (io.vertx.core.net.NetClient) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
//io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler)
//io.vertx.core.net.NetClient
  /**
   * Open a connection to a server at the specific <code>port</code> and <code>host</code>.
   * <p>
   * <code>host</code> can be a valid host name or IP address. The connect is done asynchronously and on success, a
   * {@link io.vertx.golo.core.net.NetSocket} instance is supplied via the <code>connectHandler</code> instance
   * @param port the port
   * @param host the host
   * @param connectHandler 
   * @return a reference to this, so the API can be used fluently
   */
  public NetClient connect(int port, String host, Handler<AsyncResult<NetSocket>> connectHandler) {
    this.delegate.connect(port, host, new Handler<AsyncResult<io.vertx.core.net.NetSocket>>() {
      public void handle(AsyncResult<io.vertx.core.net.NetSocket> event) {
        AsyncResult<NetSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<NetSocket>result(new NetSocket(event.result()));
        } else {
          f = InternalHelper.<NetSocket>failure(event.cause());
        }
        connectHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//void close()
//void
  /**
   * Close the client.
   * <p>
   * Any sockets which have not been closed manually will be closed here. The close is asynchronous and may not
   * complete until some time after the method has returned.
   */
  public void close() {
    this.delegate.close();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
