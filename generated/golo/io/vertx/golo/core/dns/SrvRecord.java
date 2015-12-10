package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.dns.SrvRecord 
public class SrvRecord { 

private io.vertx.core.dns.SrvRecord delegate; 
public SrvRecord(Object delegate) { 
    this.delegate = (io.vertx.core.dns.SrvRecord)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// int priority() 
// TypeParams: [] 
public int priority() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.priority(); 
}
// int weight() 
// TypeParams: [] 
public int weight() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.weight(); 
}
// int port() 
// TypeParams: [] 
public int port() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.port(); 
}
// java.lang.String name() 
// TypeParams: [] 
public String name() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.name(); 
}
// java.lang.String protocol() 
// TypeParams: [] 
public String protocol() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.protocol(); 
}
// java.lang.String service() 
// TypeParams: [] 
public String service() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.service(); 
}
// java.lang.String target() 
// TypeParams: [] 
public String target() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.target(); 
}
}
