package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.net.SocketAddress 
public class SocketAddress { 

private io.vertx.core.net.SocketAddress delegate; 
public SocketAddress(Object delegate) { 
    this.delegate = (io.vertx.core.net.SocketAddress)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// java.lang.String host() 
public String host() {
        //param classes(remove later):  
    return delegate.host(); 
}
// int port() 
public int port() {
        //param classes(remove later):  
    return delegate.port(); 
}
}
