package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.shareddata.Lock 
public class Lock { 

private io.vertx.core.shareddata.Lock delegate; 
public Lock(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.Lock)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void release() 
// TypeParams: [] 
public void release() {
        //param classes(remove later):  
    delegate.release(); 
}
}
