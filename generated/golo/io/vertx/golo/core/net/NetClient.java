package io.vertx.golo.core.Net;

import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
public class NetClient { 

private io.vertx.core.net.NetClient originalInstance;// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
// io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) 
public io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) {
        return originalInstance.connect(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
}
