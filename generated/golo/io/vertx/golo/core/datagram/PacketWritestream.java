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
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.writeQueueFull(); 
}
// io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public PacketWritestream exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public PacketWritestream write(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public PacketWritestream setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public PacketWritestream drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
}
