package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
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
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]>.pump(rs, ws), io.vertx.golo.core.streams.Pump.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
public static <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) {
        return InternalHelper.safeCreate(<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]>.pump(rs, ws, writeQueueMaxSize), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.streams.Pump start() 
public io.vertx.core.streams.Pump start() {
        return delegate.start(); 
}
// io.vertx.core.streams.Pump stop() 
public io.vertx.core.streams.Pump stop() {
        return delegate.stop(); 
}
// int numberPumped() 
public int numberPumped() {
        return delegate.numberPumped(); 
}
}
