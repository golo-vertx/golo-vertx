package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.dns.MxRecord 
public class MxRecord { 

private io.vertx.core.dns.MxRecord delegate; 
public MxRecord(Object delegate) { 
    this.delegate = (io.vertx.core.dns.MxRecord)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// int priority() 
public int priority() {
        //param classes(remove later):  
    return delegate.priority(); 
}
// java.lang.String name() 
public String name() {
        //param classes(remove later):  
    return delegate.name(); 
}
}
