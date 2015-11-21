package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;

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
        return delegate.priority(); 
}
// java.lang.String name() 
public java.lang.String name() {
        return delegate.name(); 
}
}
