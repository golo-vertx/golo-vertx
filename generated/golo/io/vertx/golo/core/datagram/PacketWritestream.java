package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.datagram.PacketWritestream 
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
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) 
public PacketWritestream write(io.vertx.core.buffer.Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) 
public PacketWritestream setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
}
