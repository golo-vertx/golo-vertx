package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.streams.Pump 
public class Pump { 

private io.vertx.core.streams.Pump delegate; 
public Pump(Object delegate) { 
    this.delegate = (io.vertx.core.streams.Pump)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]] 
public static <T> io.vertx.core.streams.Pump pump(ReadStream<T> rs,WriteStream<T> ws) {
        //param classes(remove later):   API   API  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump(rs,ws), io.vertx.golo.core.streams.Pump.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]] 
public static <T> io.vertx.core.streams.Pump pump(ReadStream<T> rs,WriteStream<T> ws,int writeQueueMaxSize) {
        //param classes(remove later):   API   API   PRIMITIVE  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump(rs,ws,writeQueueMaxSize), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public Pump setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump start() 
// TypeParams: [] 
public Pump start() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.start(), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump stop() 
// TypeParams: [] 
public Pump stop() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.stop(), io.vertx.golo.core.streams.Pump.class); 
}
// int numberPumped() 
// TypeParams: [] 
public int numberPumped() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.numberPumped(); 
}
}
