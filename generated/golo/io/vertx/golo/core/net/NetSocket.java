package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetSocket 
public class NetSocket { 

private io.vertx.core.net.NetSocket delegate; 
public NetSocket(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        //param classes(remove later):  
    return delegate.writeQueueFull(); 
}
// io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket pause() 
public NetSocket pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket resume() 
public NetSocket resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public NetSocket write(io.vertx.core.buffer.Buffer data) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public NetSocket setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// java.lang.String writeHandlerID() 
public String writeHandlerID() {
        //param classes(remove later):  
    return delegate.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public NetSocket write(java.lang.String str) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.write(str), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public NetSocket write(java.lang.String str, java.lang.String enc) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.write(str,enc), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public NetSocket sendFile(java.lang.String filename) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public NetSocket sendFile(java.lang.String filename, long offset) {
        //param classes(remove later):   STRING   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public NetSocket sendFile(java.lang.String filename, long offset, long length) {
        //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress remoteAddress() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// void close() 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.upgradeToSsl(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// boolean isSsl() 
public boolean isSsl() {
        //param classes(remove later):  
    return delegate.isSsl(); 
}
}
