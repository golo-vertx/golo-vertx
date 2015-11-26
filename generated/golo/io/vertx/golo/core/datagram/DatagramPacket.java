package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.net.SocketAddress;
// io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket { 

private io.vertx.core.datagram.DatagramPacket delegate; 
public DatagramPacket(Object delegate) { 
    this.delegate = (io.vertx.core.datagram.DatagramPacket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.net.SocketAddress sender() 
public io.vertx.core.net.SocketAddress sender() {
        return (io.vertx.core.net.SocketAddress)delegate.sender(); 
}
// io.vertx.core.buffer.Buffer data() 
public io.vertx.core.buffer.Buffer data() {
        return (io.vertx.core.buffer.Buffer)delegate.data(); 
}
}
