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
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.send(packet, port, host, handler); 
}
// io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host) 
public io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host) {
        return (io.vertx.core.datagram.PacketWritestream)delegate.sender(port, host); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.send(str, port, host, handler); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.send(str, enc, port, host, handler); 
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
public io.vertx.core.net.SocketAddress localAddress() {
        return (io.vertx.core.net.SocketAddress)delegate.localAddress(); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.listenMulticastGroup(multicastAddress, handler); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.listenMulticastGroup(multicastAddress, networkInterface, source, handler); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.unlistenMulticastGroup(multicastAddress, handler); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.unlistenMulticastGroup(multicastAddress, networkInterface, source, handler); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.blockMulticastGroup(multicastAddress, sourceToBlock, handler); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, handler); 
}
// io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
public io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.listen(port, host, handler); 
}
// io.vertx.core.datagram.DatagramSocket pause() 
public io.vertx.core.datagram.DatagramSocket pause() {
        return (io.vertx.core.datagram.DatagramSocket)delegate.pause(); 
}
// io.vertx.core.datagram.DatagramSocket resume() 
public io.vertx.core.datagram.DatagramSocket resume() {
        return (io.vertx.core.datagram.DatagramSocket)delegate.resume(); 
}
// io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.endHandler(endHandler); 
}
// io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) 
public io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.handler(handler); 
}
// io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.exceptionHandler(handler); 
}
}
