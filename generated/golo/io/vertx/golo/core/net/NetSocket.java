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
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.net.NetSocket)delegate.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return (io.vertx.core.net.NetSocket)delegate.handler(handler); 
}
// io.vertx.core.net.NetSocket pause() 
public io.vertx.core.net.NetSocket pause() {
        return (io.vertx.core.net.NetSocket)delegate.pause(); 
}
// io.vertx.core.net.NetSocket resume() 
public io.vertx.core.net.NetSocket resume() {
        return (io.vertx.core.net.NetSocket)delegate.resume(); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.net.NetSocket)delegate.endHandler(endHandler); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.net.NetSocket)delegate.write(data); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.net.NetSocket)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.net.NetSocket)delegate.drainHandler(handler); 
}
// java.lang.String writeHandlerID() 
public java.lang.String writeHandlerID() {
        return (java.lang.String)delegate.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public io.vertx.core.net.NetSocket write(java.lang.String str) {
        return (io.vertx.core.net.NetSocket)delegate.write(str); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) {
        return (io.vertx.core.net.NetSocket)delegate.write(str, enc); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, length); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, length, resultHandler); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.net.NetSocket)delegate.closeHandler(handler); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.net.NetSocket)delegate.upgradeToSsl(handler); 
}
// boolean isSsl() 
public boolean isSsl() {
        return (boolean)delegate.isSsl(); 
}
}
