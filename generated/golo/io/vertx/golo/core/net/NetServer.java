package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.net.NetSocketStream;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetSocket;
// io.vertx.core.net.NetServer 
public class NetServer { 

private io.vertx.core.net.NetServer delegate; 
public NetServer(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetServer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean {
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.net.NetSocketStream connectStream() 
public NetSocketStream {
        return (io.vertx.core.net.NetSocketStream)delegate.connectStream(); 
}
// io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.connectHandler(handler); 
}
// io.vertx.core.net.NetServer listen() 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(); 
}
// io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(port, host); 
}
// io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(port, host, listenHandler); 
}
// io.vertx.core.net.NetServer listen(int port) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(port); 
}
// io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
public NetServer {
        return (io.vertx.core.net.NetServer)delegate.listen(port, listenHandler); 
}
// void close() 
public void {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void {
        delegate.close(completionHandler); 
}
// int actualPort() 
public int {
        return (int)delegate.actualPort(); 
}
}
