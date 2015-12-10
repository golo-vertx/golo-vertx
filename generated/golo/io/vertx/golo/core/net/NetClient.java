package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetClient 
public class NetClient { 

private io.vertx.core.net.NetClient delegate; 
public NetClient(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetClient)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
// TypeParams: [] 
public boolean isMetricsEnabled() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.isMetricsEnabled(); 
}
// io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) 
// TypeParams: [] 
public NetClient connect(int port,String host,Handler<AsyncResult<NetSocket>> connectHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.connect(port,host,new Handler<AsyncResult<io.vertx.core.net.NetSocket>>() {
         public void handle(AsyncResult<io.vertx.core.net.NetSocket> event) {
           AsyncResult<NetSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<NetSocket>result(new NetSocket(event.result()));
           } else {
             f = InternalHelper.<NetSocket>failure(event.cause());
           }
connectHandler.handle((AsyncResult<NetSocket>)f);
         }
       }
), io.vertx.golo.core.net.NetClient.class); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.close(); 
}
}
