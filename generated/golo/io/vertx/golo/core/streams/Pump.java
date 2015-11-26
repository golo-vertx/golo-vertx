package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
// io.vertx.core.streams.Pump 
public class Pump { 

private io.vertx.core.streams.Pump delegate; 
public Pump(Object delegate) { 
    this.delegate = (io.vertx.core.streams.Pump)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) {
        return (io.vertx.core.streams.Pump)io.vertx.core.streams.Pump.pump(rs, ws); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) {
        return (io.vertx.core.streams.Pump)io.vertx.core.streams.Pump.pump(rs, ws, writeQueueMaxSize); 
}
// io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.streams.Pump)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.streams.Pump start() 
public io.vertx.core.streams.Pump start() {
        return (io.vertx.core.streams.Pump)delegate.start(); 
}
// io.vertx.core.streams.Pump stop() 
public io.vertx.core.streams.Pump stop() {
        return (io.vertx.core.streams.Pump)delegate.stop(); 
}
// int numberPumped() 
public int numberPumped() {
        return (int)delegate.numberPumped(); 
}
}
