package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, 887918813=-1297498284, -1987243521=-2029076283} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.net.SocketAddress 
public class SocketAddress {
//[INFO] ifaceSimpleName=SocketAddress
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, 887918813=-1297498284, -1987243521=-2029076283}
  private io.vertx.core.net.SocketAddress delegate;
  public SocketAddress(Object delegate) {
    this.delegate = (io.vertx.core.net.SocketAddress) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//java.lang.String host()
//java.lang.String
  public String host() {
return    this.delegate.host();
  }
//int port()
//int
  public int port() {
return    this.delegate.port();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
