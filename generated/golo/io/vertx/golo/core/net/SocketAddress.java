package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.net.SocketAddress 
public class SocketAddress { 

private io.vertx.core.net.SocketAddress delegate; 
public SocketAddress(Object delegate) { 
    this.delegate = (io.vertx.core.net.SocketAddress)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// java.lang.String host() 
public java.lang.String host() {
        return (java.lang.String)delegate.host(); 
}
// int port() 
public int port() {
        return (int)delegate.port(); 
}
}
