package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.net.NetSocket 
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
        return delegate.writeQueueFull(); 
}
// io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket pause() 
public NetSocket pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket resume() 
public NetSocket resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public NetSocket write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public NetSocket setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// java.lang.String writeHandlerID() 
public String writeHandlerID() {
        return delegate.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public NetSocket write(java.lang.String str) {
        return InternalHelper.safeCreate(this.delegate.write(str), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public NetSocket write(java.lang.String str, java.lang.String enc) {
        return InternalHelper.safeCreate(this.delegate.write(str,enc), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public NetSocket sendFile(java.lang.String filename) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public NetSocket sendFile(java.lang.String filename, long offset) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public NetSocket sendFile(java.lang.String filename, long offset, long length) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress remoteAddress() {
        return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.upgradeToSsl(handler), io.vertx.golo.core.net.NetSocket.class); 
}
// boolean isSsl() 
public boolean isSsl() {
        return delegate.isSsl(); 
}
}
