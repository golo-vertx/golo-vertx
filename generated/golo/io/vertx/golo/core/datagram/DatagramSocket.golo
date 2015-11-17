module io.vertx.golo.core.Datagram

import io.vertx.core.datagram.PacketWritestream
import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramPacket
import io.vertx.core.metrics.Measured
import io.vertx.core.streams.ReadStream
import io.vertx.core.net.SocketAddress
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function send =| packet , port , host , handler |{
        return io.vertx.core.datagram.DatagramSocket.send()
}
    # io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host) 
function sender =| port , host |{
        return io.vertx.core.datagram.PacketWritestream.sender()
}
    # io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function sendByStrAndPortAndHostAndHandler =| str , port , host , handler |{
        return io.vertx.core.datagram.DatagramSocket.send()
}
    # io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function sendByStrAndEncAndPortAndHostAndHandler =| str , enc , port , host , handler |{
        return io.vertx.core.datagram.DatagramSocket.send()
}
    # void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function close =| handler |{
        return void.close()
}
    # void close() 
function close ={
        return void.close()
}
    # io.vertx.core.net.SocketAddress localAddress() 
function localAddress ={
        return io.vertx.core.net.SocketAddress.localAddress()
}
    # io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function listenMulticastGroup =| multicastAddress , handler |{
        return io.vertx.core.datagram.DatagramSocket.listenMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function listenMulticastGroupByMulticastAddressAndNetworkInterfaceAndSourceAndHandler =| multicastAddress , networkInterface , source , handler |{
        return io.vertx.core.datagram.DatagramSocket.listenMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function unlistenMulticastGroup =| multicastAddress , handler |{
        return io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function unlistenMulticastGroupByMulticastAddressAndNetworkInterfaceAndSourceAndHandler =| multicastAddress , networkInterface , source , handler |{
        return io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function blockMulticastGroup =| multicastAddress , sourceToBlock , handler |{
        return io.vertx.core.datagram.DatagramSocket.blockMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function blockMulticastGroupByMulticastAddressAndNetworkInterfaceAndSourceToBlockAndHandler =| multicastAddress , networkInterface , sourceToBlock , handler |{
        return io.vertx.core.datagram.DatagramSocket.blockMulticastGroup()
}
    # io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
function listen =| port , host , handler |{
        return io.vertx.core.datagram.DatagramSocket.listen()
}
    # io.vertx.core.datagram.DatagramSocket pause() 
function pause ={
        return io.vertx.core.datagram.DatagramSocket.pause()
}
    # io.vertx.core.datagram.DatagramSocket resume() 
function resume ={
        return io.vertx.core.datagram.DatagramSocket.resume()
}
    # io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.datagram.DatagramSocket.endHandler()
}
    # io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) 
function handler =| handler |{
        return io.vertx.core.datagram.DatagramSocket.handler()
}
    # io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.datagram.DatagramSocket.exceptionHandler()
}
