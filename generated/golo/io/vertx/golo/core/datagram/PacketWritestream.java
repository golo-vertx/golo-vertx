package io.vertx.golo.core.Datagram;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
public class PacketWritestream { 

private io.vertx.core.datagram.PacketWritestream originalInstance;// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(); 
}
// io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(); 
}
// io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(); 
}
}
