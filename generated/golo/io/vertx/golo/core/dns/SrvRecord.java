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
public int {
        return (int)delegate.priority(); 
}
// int weight() 
public int {
        return (int)delegate.weight(); 
}
// int port() 
public int {
        return (int)delegate.port(); 
}
// java.lang.String name() 
public String {
        return (java.lang.String)delegate.name(); 
}
// java.lang.String protocol() 
public String {
        return (java.lang.String)delegate.protocol(); 
}
// java.lang.String service() 
public String {
        return (java.lang.String)delegate.service(); 
}
// java.lang.String target() 
public String {
        return (java.lang.String)delegate.target(); 
}
}
