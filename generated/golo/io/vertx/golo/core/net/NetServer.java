package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetServer 
public class NetServer { 

private io.vertx.core.net.NetServer delegate; 
public NetServer(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetServer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        //param classes(remove later):  
    return delegate.isMetricsEnabled(); 
}
// io.vertx.core.net.NetSocketStream connectStream() 
public NetSocketStream connectStream() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.connectStream(), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.connectHandler(new Handler<io.vertx.core.net.NetSocket>() {
                          public void handle(io.vertx.core.net.NetSocket event) {
handler.handle(new io.vertx.golo.core.net.NetSocket(event));
                          }
                        }), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen() 
public NetServer listen() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.listen(), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.listen(listenHandler), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
public NetServer listen(int port, java.lang.String host) {
        //param classes(remove later):   PRIMITIVE   STRING  
    return InternalHelper.safeCreate(this.delegate.listen(port,host), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.listen(port,host,listenHandler), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen(int port) 
public NetServer listen(int port) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.listen(port), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.listen(port,listenHandler), io.vertx.golo.core.net.NetServer.class); 
}
// void close() 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        //param classes(remove later):   HANDLER  
    delegate.close(completionHandler); 
}
// int actualPort() 
public int actualPort() {
        //param classes(remove later):  
    return delegate.actualPort(); 
}
}
