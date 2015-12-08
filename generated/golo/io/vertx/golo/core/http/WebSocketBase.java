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
        return delegate.writeQueueFull(); 
}
// io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase pause() 
public WebSocketBase pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase resume() 
public WebSocketBase resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
public WebSocketBase write(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
public WebSocketBase setWriteQueueMaxSize(int maxSize) {
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// java.lang.String binaryHandlerID() 
public String binaryHandlerID() {
        return delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public String textHandlerID() {
        return delegate.textHandlerID(); 
}
// io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) {
        return InternalHelper.safeCreate(this.delegate.writeFrame(frame), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
public WebSocketBase writeFinalTextFrame(java.lang.String text) {
        return InternalHelper.safeCreate(this.delegate.writeFinalTextFrame(text), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.writeFinalBinaryFrame(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.writeBinaryMessage(data), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) {
        return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) {
        return InternalHelper.safeCreate(this.delegate.frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
                          public void handle(io.vertx.core.http.WebSocketFrame event) {
handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
                          }
                        }), io.vertx.golo.core.http.WebSocketBaseImpl.class); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress remoteAddress() {
        return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
}
