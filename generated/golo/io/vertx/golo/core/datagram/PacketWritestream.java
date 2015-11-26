package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
// io.vertx.core.datagram.PacketWritestream 
public class PacketWritestream { 

private io.vertx.core.datagram.PacketWritestream delegate; 
public PacketWritestream(Object delegate) { 
    this.delegate = (io.vertx.core.datagram.PacketWritestream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.datagram.PacketWritestream)delegate.exceptionHandler(handler); 
}
// io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.datagram.PacketWritestream)delegate.write(data); 
}
// io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.datagram.PacketWritestream)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.datagram.PacketWritestream)delegate.drainHandler(handler); 
}
}
