package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.SharedData 
public class SharedData { 

private io.vertx.core.shareddata.SharedData delegate; 
public SharedData(Object delegate) { 
    this.delegate = (io.vertx.core.shareddata.SharedData)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap]> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler) 
public <K,V> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    delegate.getClusterWideMap(name,resultHandler); 
}
// void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
public void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    delegate.getLock(name,resultHandler); 
}
// void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
public void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    delegate.getLockWithTimeout(name,timeout,resultHandler); 
}
// void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler) 
public void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    delegate.getCounter(name,resultHandler); 
}
// <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap]> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name) 
public <K,V> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.getLocalMap(name), io.vertx.golo.core.shareddata.LocalMap.class); 
}
}
