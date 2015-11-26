package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.http.WebSocketBase 
public class WebSocketBase { 

private io.vertx.core.http.WebSocketBase delegate; 
public WebSocketBase(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocketBase)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean writeQueueFull() {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.http.WebSocketBase)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return (io.vertx.core.http.WebSocketBase)delegate.handler(handler); 
}
// io.vertx.core.http.WebSocketBase pause() 
public io.vertx.core.http.WebSocketBase pause() {
        return (io.vertx.core.http.WebSocketBase)delegate.pause(); 
}
// io.vertx.core.http.WebSocketBase resume() 
public io.vertx.core.http.WebSocketBase resume() {
        return (io.vertx.core.http.WebSocketBase)delegate.resume(); 
}
// io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.http.WebSocketBase)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.WebSocketBase)delegate.write(data); 
}
// io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
public io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) {
        return (io.vertx.core.http.WebSocketBase)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.WebSocketBase)delegate.drainHandler(handler); 
}
// java.lang.String binaryHandlerID() 
public java.lang.String binaryHandlerID() {
        return (java.lang.String)delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public java.lang.String textHandlerID() {
        return (java.lang.String)delegate.textHandlerID(); 
}
// io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFrame(frame); 
}
// io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
public io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFinalTextFrame(text); 
}
// io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFinalBinaryFrame(data); 
}
// io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.http.WebSocketBase)delegate.writeBinaryMessage(data); 
}
// io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return (io.vertx.core.http.WebSocketBase)delegate.closeHandler(handler); 
}
// io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return (io.vertx.core.http.WebSocketBase)delegate.frameHandler(handler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public io.vertx.core.net.SocketAddress remoteAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public io.vertx.core.net.SocketAddress localAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
}
