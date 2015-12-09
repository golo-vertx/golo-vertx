package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket { 

private io.vertx.core.datagram.DatagramPacket delegate; 
public DatagramPacket(Object delegate) { 
    this.delegate = (io.vertx.core.datagram.DatagramPacket)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.net.SocketAddress sender() 
public SocketAddress sender() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.sender(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.buffer.Buffer data() 
public Buffer data() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.data(), io.vertx.golo.core.buffer.Buffer.class); 
}
}
