package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
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
public io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.net.NetSocket pause() 
public io.vertx.core.net.NetSocket pause() {
        return delegate.pause(); 
}
// io.vertx.core.net.NetSocket resume() 
public io.vertx.core.net.NetSocket resume() {
        return delegate.resume(); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) {
        return delegate.write(data); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) {
        return delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.drainHandler(handler); 
}
// java.lang.String writeHandlerID() 
public java.lang.String writeHandlerID() {
        return delegate.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public io.vertx.core.net.NetSocket write(java.lang.String str) {
        return delegate.write(str); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) {
        return delegate.write(str, enc); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename) {
        return delegate.sendFile(filename); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) {
        return delegate.sendFile(filename, offset); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) {
        return delegate.sendFile(filename, offset, length); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return delegate.sendFile(filename, offset, length, resultHandler); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return delegate.localAddress(); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.closeHandler(handler); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) {
        return delegate.upgradeToSsl(handler); 
}
// boolean isSsl() 
public boolean isSsl() {
        return delegate.isSsl(); 
}
}
