package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.Message<T> 
public class Message<T> {
        private io.vertx.core.eventbus.Message delegate; 
    public Message(Object delegate) {
            this.delegate = (io.vertx.core.eventbus.Message) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // java.lang.String address() 
    // TypeParams: [] 
        public String address() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.address(); 
    }
        // io.vertx.core.MultiMap headers() 
    // TypeParams: [] 
        public MultiMap headers() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
    }
        // T body() 
    // TypeParams: [] 
        public T body() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.body(); 
    }
        // java.lang.String replyAddress() 
    // TypeParams: [] 
        public String replyAddress() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.replyAddress(); 
    }
        // void reply(java.lang.Object message) 
    // TypeParams: [] 
        public void reply(Object message) {
                //param classes(remove later):   OBJECT  
        //evenTypes (remove later):    
        this.delegate.reply(message); 
    }
        // <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
    // TypeParams: [TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]] 
        public <R> void reply(Object message,Handler<AsyncResult<Message<R>>> replyHandler) {
                //param classes(remove later):   OBJECT   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.reply(message,new Handler<AsyncResult<io.vertx.core.eventbus.Message<R>>>() {
         public void handle(AsyncResult<io.vertx.core.eventbus.Message<R>> event) {
           AsyncResult<Message<R>> f;
           if (event.succeeded()) {
             f = InternalHelper.<Message<R>>result(new Message<R>(event.result()));
           } else {
             f = InternalHelper.<Message<R>>failure(event.cause());
           }
replyHandler.handle((AsyncResult<Message<R>>)f);
         }
       }
); 
    }
        // void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options) 
    // TypeParams: [] 
        public void reply(Object message,DeliveryOptions options) {
                //param classes(remove later):   OBJECT   DATA_OBJECT  
        //evenTypes (remove later):      
        this.delegate.reply(message,options); 
    }
        // <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler) 
    // TypeParams: [TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]] 
        public <R> void reply(Object message,DeliveryOptions options,Handler<AsyncResult<Message<R>>> replyHandler) {
                //param classes(remove later):   OBJECT   DATA_OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.reply(message,options,new Handler<AsyncResult<io.vertx.core.eventbus.Message<R>>>() {
         public void handle(AsyncResult<io.vertx.core.eventbus.Message<R>> event) {
           AsyncResult<Message<R>> f;
           if (event.succeeded()) {
             f = InternalHelper.<Message<R>>result(new Message<R>(event.result()));
           } else {
             f = InternalHelper.<Message<R>>failure(event.cause());
           }
replyHandler.handle((AsyncResult<Message<R>>)f);
         }
       }
); 
    }
        // void fail(int failureCode, java.lang.String message) 
    // TypeParams: [] 
        public void fail(int failureCode,String message) {
                //param classes(remove later):   PRIMITIVE   STRING  
        //evenTypes (remove later):      
        this.delegate.fail(failureCode,message); 
    }
        }
