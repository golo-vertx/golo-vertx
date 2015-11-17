module io.vertx.golo.core.Streams

import io.vertx.core.streams.WriteStream
import io.vertx.core.streams.ReadStream
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws) 
function pump =| rs , ws |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]>.pump()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize) 
function pumpByRsAndWsAndWriteQueueMaxSize =| rs , ws , writeQueueMaxSize |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]>.pump()
}
    # io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.streams.Pump.setWriteQueueMaxSize()
}
    # io.vertx.core.streams.Pump start() 
function start ={
        return io.vertx.core.streams.Pump.start()
}
    # io.vertx.core.streams.Pump stop() 
function stop ={
        return io.vertx.core.streams.Pump.stop()
}
    # int numberPumped() 
function numberPumped ={
        return int.numberPumped()
}
