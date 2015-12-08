package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
// io.vertx.core.net.NetClient 
public class NetClient { 

private io.vertx.core.net.NetClient delegate; 
public NetClient(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetClient)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) 
public NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) {
        return InternalHelper.safeCreate(this.delegate.connect(port,host,connectHandler), io.vertx.golo.core.net.NetClient.class); 
}
// void close() 
public void close() {
        delegate.close(); 
}
}
