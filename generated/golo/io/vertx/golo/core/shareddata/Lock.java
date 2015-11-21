package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;

public class Lock { 

private io.vertx.core.shareddata.Lock delegate; 
public Lock(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.Lock)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void release() 
public void release() {
        delegate.release(); 
}
}
