package io.vertx.golo.core.net;

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
