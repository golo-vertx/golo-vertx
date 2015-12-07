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
public boolean {
        return (boolean)delegate.writeQueueFull(); 
}
// io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.exceptionHandler(handler); 
}
// io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.handler(handler); 
}
// io.vertx.core.net.NetSocket pause() 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.pause(); 
}
// io.vertx.core.net.NetSocket resume() 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.resume(); 
}
// io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.endHandler(endHandler); 
}
// io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.write(data); 
}
// io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.setWriteQueueMaxSize(maxSize); 
}
// io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.drainHandler(handler); 
}
// java.lang.String writeHandlerID() 
public String {
        return (java.lang.String)delegate.writeHandlerID(); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.write(str); 
}
// io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.write(str, enc); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, length); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, resultHandler); 
}
// io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.sendFile(filename, offset, length, resultHandler); 
}
// io.vertx.core.net.SocketAddress remoteAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.remoteAddress(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// void close() 
public void {
        delegate.close(); 
}
// io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.closeHandler(handler); 
}
// io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
public NetSocket {
        return (io.vertx.core.net.NetSocket)delegate.upgradeToSsl(handler); 
}
// boolean isSsl() 
public boolean {
        return (boolean)delegate.isSsl(); 
}
}
