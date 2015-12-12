package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
// {0=3, -267911722=1252771703, 660277164=-1960125279, -1687060534=2004124081} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.net.SocketAddress 
public class SocketAddress {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
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
