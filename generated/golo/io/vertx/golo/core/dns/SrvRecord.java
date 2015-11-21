package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;

public class SrvRecord { 

private io.vertx.core.dns.SrvRecord delegate; 
public SrvRecord(Object delegate) { 
    this.delegate = (io.vertx.core.dns.SrvRecord)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// int priority() 
public int priority() {
        return delegate.priority(); 
}
// int weight() 
public int weight() {
        return delegate.weight(); 
}
// int port() 
public int port() {
        return delegate.port(); 
}
// java.lang.String name() 
public java.lang.String name() {
        return delegate.name(); 
}
// java.lang.String protocol() 
public java.lang.String protocol() {
        return delegate.protocol(); 
}
// java.lang.String service() 
public java.lang.String service() {
        return delegate.service(); 
}
// java.lang.String target() 
public java.lang.String target() {
        return delegate.target(); 
}
}
