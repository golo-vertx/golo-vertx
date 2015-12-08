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
public static <T> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) {
        return InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump(rs,ws), io.vertx.golo.core.streams.Pump.class); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
public static <T> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) {
        return InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump(rs,ws,writeQueueMaxSize), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
public Pump setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump start() 
public Pump start() {
        return InternalHelper.safeCreate(this.delegate.start(), io.vertx.golo.core.streams.Pump.class); 
}
// io.vertx.core.streams.Pump stop() 
public Pump stop() {
        return InternalHelper.safeCreate(this.delegate.stop(), io.vertx.golo.core.streams.Pump.class); 
}
// int numberPumped() 
public int numberPumped() {
        return delegate.numberPumped(); 
}
}
