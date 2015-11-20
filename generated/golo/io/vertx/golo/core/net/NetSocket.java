package io.vertx.golo.core.Net;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
public class NetSocket { 

private io.vertx.core.net.NetSocket originalInstance; 
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return originalInstance.writeQueueFull(); 
}
// io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(handler); 
}
// io.vertx.core.net.NetSocket pause() 
public io.vertx.core.net.NetSocket pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.net.NetSocket resume() 
public io.vertx.core.net.NetSocket resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(endHandler); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) {
        return originalInstance.write(data); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) {
        return originalInstance.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.drainHandler(handler); 
}
// java.lang.String writeHandlerID() 
public java.lang.String writeHandlerID() {
        return originalInstance.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public io.vertx.core.net.NetSocket write(java.lang.String str) {
        return originalInstance.write(str); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) {
        return originalInstance.write(str, enc); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename) {
        return originalInstance.sendFile(filename); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) {
        return originalInstance.sendFile(filename, offset); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) {
        return originalInstance.sendFile(filename, offset, length); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) {
        return originalInstance.sendFile(filename, offset, length, resultHandler); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return originalInstance.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return originalInstance.localAddress(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.closeHandler(handler); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) {
        return originalInstance.upgradeToSsl(handler); 
}
// boolean isSsl() 
public boolean isSsl() {
        return originalInstance.isSsl(); 
}
}
