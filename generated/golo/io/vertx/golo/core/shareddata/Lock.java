package io.vertx.golo.core.Shareddata;

public class Lock { 

private io.vertx.core.shareddata.Lock originalInstance;// void release() 
public void release() {
        return originalInstance.release(); 
}
}
