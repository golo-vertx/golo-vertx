package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.datagram.PacketWritestream;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.datagram.DatagramPacket;
import io.vertx.core.metrics.Measured;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.datagram.DatagramSocket 
public class DatagramSocket { 

private io.vertx.core.datagram.DatagramSocket delegate; 
public DatagramSocket(Object delegate) { 
    this.delegate = (io.vertx.core.datagram.DatagramSocket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.send(packet,port,host,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host) 
public PacketWritestream sender(int port, java.lang.String host) {
        return InternalHelper.safeCreate(this.delegate.sender(port,host), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.send(str,port,host,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.send(str,enc,port,host,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        delegate.close(handler); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
public SocketAddress localAddress() {
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.listenMulticastGroup(multicastAddress,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.listenMulticastGroup(multicastAddress,networkInterface,source,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.unlistenMulticastGroup(multicastAddress,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.unlistenMulticastGroup(multicastAddress,networkInterface,source,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.blockMulticastGroup(multicastAddress,sourceToBlock,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.blockMulticastGroup(multicastAddress,networkInterface,sourceToBlock,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return InternalHelper.safeCreate(this.delegate.listen(port,host,handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket pause() 
public DatagramSocket pause() {
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket resume() 
public DatagramSocket resume() {
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) 
public DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) {
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.datagram.DatagramPacket>() {
                          public void handle(io.vertx.core.datagram.DatagramPacket event) {
handler.handle(new io.vertx.golo.core.datagram.DatagramPacket(event));
                          }
                        }), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
}
