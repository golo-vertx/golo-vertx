package io.vertx.golo.core.net;

//[Debug] classMethodData = {io.vertx.core.net.NetClient=3} 
//[Debug] arr = [boolean isMetricsEnabled(), io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler), void close()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, -2143271534=296476146, 1975712129=2141130466, 1712357459=740671032, 2052068838=1018971161, -1169030507=-1928299039, -384285182=-622118766, -1720901535=-1161583444, -1356045152=-647546692, 2009712548=-736208252, 1430384270=579511587} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.net.NetClient 
public class NetClient implements Measured {
//[Debug] toChangeName = {boolean isMetricsEnabled()=false, void close()=false, io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler)=false}
//[Debug] dbgMethodName = {boolean isMetricsEnabled()=isMetricsEnabled, void close()=close, io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler)=connect} 
//[Debug] dbgMethodParams = {boolean isMetricsEnabled()=0, void close()=0, io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler)=3} 
//[INFO]  methods=[boolean isMetricsEnabled(), io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler), void close()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler)=false, void close()=false, boolean isMetricsEnabled()=false} 
//[INFO] ifaceSimpleName=NetClient
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, -2143271534=296476146, 1975712129=2141130466, 1712357459=740671032, 2052068838=1018971161, -1169030507=-1928299039, -384285182=-622118766, -1720901535=-1161583444, -1356045152=-647546692, 2009712548=-736208252, 1430384270=579511587}
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
