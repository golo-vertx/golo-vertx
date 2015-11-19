package io.vertx.golo.core.Streams;

import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
public class Pump { 

private io.vertx.core.streams.Pump originalInstance;// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) {
        return originalInstance.pump(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) {
        return originalInstance.pump(); 
}
// io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.streams.Pump start() 
public io.vertx.core.streams.Pump start() {
        return originalInstance.start(); 
}
// io.vertx.core.streams.Pump stop() 
public io.vertx.core.streams.Pump stop() {
        return originalInstance.stop(); 
}
// int numberPumped() 
public int numberPumped() {
        return originalInstance.numberPumped(); 
}
}
