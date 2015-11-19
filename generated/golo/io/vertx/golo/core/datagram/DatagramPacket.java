package io.vertx.golo.core.Datagram;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.net.SocketAddress;
public class DatagramPacket { 

private io.vertx.core.datagram.DatagramPacket originalInstance;// io.vertx.core.net.SocketAddress sender() 
public io.vertx.core.net.SocketAddress sender() {
        return originalInstance.sender(); 
}
// io.vertx.core.buffer.Buffer data() 
public io.vertx.core.buffer.Buffer data() {
        return originalInstance.data(); 
}
}
