package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.EventBus 
public class EventBus { 

private io.vertx.core.eventbus.EventBus delegate; 
public EventBus(Object delegate) { 
    this.delegate = (io.vertx.core.eventbus.EventBus)delegate; 
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
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message) 
// TypeParams: [] 
public EventBus send(String address,Object message) {
        //param classes(remove later):   STRING   OBJECT  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.send(address,message), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]] 
public <T> io.vertx.core.eventbus.EventBus send(String address,Object message,Handler<AsyncResult<Message<T>>> replyHandler) {
        //param classes(remove later):   STRING   OBJECT   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.send(address,message,new Handler<AsyncResult<io.vertx.core.eventbus.Message<T>>>() {
         public void handle(AsyncResult<io.vertx.core.eventbus.Message<T>> event) {
           AsyncResult<Message<T>> f;
           if (event.succeeded()) {
             f = InternalHelper.<Message<T>>result(new Message<T>(event.result()));
           } else {
             f = InternalHelper.<Message<T>>failure(event.cause());
           }
replyHandler.handle((AsyncResult<Message<T>>)f);
         }
       }
), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
// TypeParams: [] 
public EventBus send(String address,Object message,DeliveryOptions options) {
        //param classes(remove later):   STRING   OBJECT   DATA_OBJECT  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.send(address,message,options), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]] 
public <T> io.vertx.core.eventbus.EventBus send(String address,Object message,DeliveryOptions options,Handler<AsyncResult<Message<T>>> replyHandler) {
        //param classes(remove later):   STRING   OBJECT   DATA_OBJECT   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.send(address,message,options,new Handler<AsyncResult<io.vertx.core.eventbus.Message<T>>>() {
         public void handle(AsyncResult<io.vertx.core.eventbus.Message<T>> event) {
           AsyncResult<Message<T>> f;
           if (event.succeeded()) {
             f = InternalHelper.<Message<T>>result(new Message<T>(event.result()));
           } else {
             f = InternalHelper.<Message<T>>failure(event.cause());
           }
replyHandler.handle((AsyncResult<Message<T>>)f);
         }
       }
), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message) 
// TypeParams: [] 
public EventBus publish(String address,Object message) {
        //param classes(remove later):   STRING   OBJECT  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.publish(address,message), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
// TypeParams: [] 
public EventBus publish(String address,Object message,DeliveryOptions options) {
        //param classes(remove later):   STRING   OBJECT   DATA_OBJECT  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.publish(address,message,options), io.vertx.golo.core.eventbus.EventBus.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]] 
public <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(String address) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.consumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]] 
public <T> io.vertx.core.eventbus.MessageConsumer<T> consumer(String address,Handler<Message<T>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.consumer(address,new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]] 
public <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(String address) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.localConsumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]] 
public <T> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(String address,Handler<Message<T>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.localConsumer(address,new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
                          public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
handler.handle(new io.vertx.golo.core.eventbus.Message(event));
                          }
                        }), io.vertx.golo.core.eventbus.MessageConsumer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]] 
public <T> io.vertx.core.eventbus.MessageProducer<T> sender(String address) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.sender(address), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]] 
public <T> io.vertx.core.eventbus.MessageProducer<T> sender(String address,DeliveryOptions options) {
        //param classes(remove later):   STRING   DATA_OBJECT  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.sender(address,options), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]] 
public <T> io.vertx.core.eventbus.MessageProducer<T> publisher(String address) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.publisher(address), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]] 
public <T> io.vertx.core.eventbus.MessageProducer<T> publisher(String address,DeliveryOptions options) {
        //param classes(remove later):   STRING   DATA_OBJECT  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.publisher(address,options), io.vertx.golo.core.eventbus.MessageProducer.class); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
// TypeParams: [] 
public void close(Handler<AsyncResult<Void>> completionHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    ASYNC_RESULT   
    this.delegate.close(completionHandler); 
}
}
