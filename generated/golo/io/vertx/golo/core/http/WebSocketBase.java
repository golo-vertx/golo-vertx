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
public boolean {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.handler(handler); 
}
// io.vertx.core.http.WebSocketBase pause() 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.pause(); 
}
// io.vertx.core.http.WebSocketBase resume() 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.resume(); 
}
// io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.write(data); 
}
// io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.drainHandler(handler); 
}
// java.lang.String binaryHandlerID() 
public String {
        return (java.lang.String)delegate.binaryHandlerID(); 
}
// java.lang.String textHandlerID() 
public String {
        return (java.lang.String)delegate.textHandlerID(); 
}
// io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFrame(frame); 
}
// io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFinalTextFrame(text); 
}
// io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.writeFinalBinaryFrame(data); 
}
// io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.writeBinaryMessage(data); 
}
// io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.closeHandler(handler); 
}
// io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler) 
public WebSocketBase {
        return (io.vertx.core.http.WebSocketBase)delegate.frameHandler(handler); 
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
}
