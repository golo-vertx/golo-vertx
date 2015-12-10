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
// TypeParams: [TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap]] 
public <K,V> void getClusterWideMap(String name,Handler<AsyncResult<AsyncMap<K,V>>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    this.delegate.getClusterWideMap(name,new Handler<AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>>() {
         public void handle(AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>> event) {
           AsyncResult<AsyncMap<K,V>> f;
           if (event.succeeded()) {
             f = InternalHelper.<AsyncMap<K,V>>result(new AsyncMap<K,V>(event.result()));
           } else {
             f = InternalHelper.<AsyncMap<K,V>>failure(event.cause());
           }
resultHandler.handle((AsyncResult<AsyncMap<K,V>>)f);
         }
       }
); 
}
// void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
// TypeParams: [] 
public void getLock(String name,Handler<AsyncResult<Lock>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    this.delegate.getLock(name,new Handler<AsyncResult<io.vertx.core.shareddata.Lock>>() {
         public void handle(AsyncResult<io.vertx.core.shareddata.Lock> event) {
           AsyncResult<Lock> f;
           if (event.succeeded()) {
             f = InternalHelper.<Lock>result(new Lock(event.result()));
           } else {
             f = InternalHelper.<Lock>failure(event.cause());
           }
resultHandler.handle((AsyncResult<Lock>)f);
         }
       }
); 
}
// void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
// TypeParams: [] 
public void getLockWithTimeout(String name,long timeout,Handler<AsyncResult<Lock>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    this.delegate.getLockWithTimeout(name,timeout,new Handler<AsyncResult<io.vertx.core.shareddata.Lock>>() {
         public void handle(AsyncResult<io.vertx.core.shareddata.Lock> event) {
           AsyncResult<Lock> f;
           if (event.succeeded()) {
             f = InternalHelper.<Lock>result(new Lock(event.result()));
           } else {
             f = InternalHelper.<Lock>failure(event.cause());
           }
resultHandler.handle((AsyncResult<Lock>)f);
         }
       }
); 
}
// void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler) 
// TypeParams: [] 
public void getCounter(String name,Handler<AsyncResult<Counter>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    this.delegate.getCounter(name,new Handler<AsyncResult<io.vertx.core.shareddata.Counter>>() {
         public void handle(AsyncResult<io.vertx.core.shareddata.Counter> event) {
           AsyncResult<Counter> f;
           if (event.succeeded()) {
             f = InternalHelper.<Counter>result(new Counter(event.result()));
           } else {
             f = InternalHelper.<Counter>failure(event.cause());
           }
resultHandler.handle((AsyncResult<Counter>)f);
         }
       }
); 
}
// <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap]> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name) 
// TypeParams: [TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap]] 
public <K,V> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(String name) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.getLocalMap(name), io.vertx.golo.core.shareddata.LocalMap.class); 
}
}
