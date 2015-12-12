package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, 1502892246=-1744601288, -1838315393=-1058216405, 945988484=-1154519025, 875473417=-877495416, -226422727=-1458155144, -1198202981=1771007994} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.net.SocketAddress 
public class SocketAddress {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, 1502892246=-1744601288, -1838315393=-1058216405, 945988484=-1154519025, 875473417=-877495416, -226422727=-1458155144, -1198202981=1771007994}
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
}
