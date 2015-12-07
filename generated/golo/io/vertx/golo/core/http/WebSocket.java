package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.WebSocketBase;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocketFrame;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.http.WebSocket 
public class WebSocket { 

private io.vertx.core.http.WebSocket delegate; 
public WebSocket(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
public boolean {
        return (boolean)delegate.writeQueueFull(); 
}
// java.lang.String binaryHandlerID() 
public String {
        return (java.lang.String)delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public String {
        return (java.lang.String)delegate.textHandlerID(); 
}
// void close() 
public void {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.handler(handler); 
}
// io.vertx.core.http.WebSocket pause() 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.pause(); 
}
// io.vertx.core.http.WebSocket resume() 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.resume(); 
}
// io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.write(data); 
}
// io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.drainHandler(handler); 
}
// io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.writeFrame(frame); 
}
// io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.writeFinalTextFrame(text); 
}
// io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.writeFinalBinaryFrame(data); 
}
// io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.writeBinaryMessage(data); 
}
// io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.closeHandler(handler); 
}
// io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public WebSocket {
        return (io.vertx.core.http.WebSocket)delegate.frameHandler(handler); 
}
}
