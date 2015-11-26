package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.dns.SrvRecord 
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
        return (int)delegate.priority(); 
}
// int weight() 
public int weight() {
        return (int)delegate.weight(); 
}
// int port() 
public int port() {
        return (int)delegate.port(); 
}
// java.lang.String name() 
public java.lang.String name() {
        return (java.lang.String)delegate.name(); 
}
// java.lang.String protocol() 
public java.lang.String protocol() {
        return (java.lang.String)delegate.protocol(); 
}
// java.lang.String service() 
public java.lang.String service() {
        return (java.lang.String)delegate.service(); 
}
// java.lang.String target() 
public java.lang.String target() {
        return (java.lang.String)delegate.target(); 
}
}
