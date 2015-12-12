package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
// {0=10, 619030709=344600564, 991833054=1401460468, 1602910874=428694680, -1422560332=1770231921, 1505628751=-2068690136, -823311435=-574256551, -1084752818=1549374453, 2106955967=-92393393, 236362875=-757541002, 1952426097=-1405193546} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.net.SocketAddress 
public class SocketAddress {
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
