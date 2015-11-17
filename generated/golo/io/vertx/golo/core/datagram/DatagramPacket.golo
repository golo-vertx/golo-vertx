module io.vertx.golo.core.Datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.SocketAddress
    # io.vertx.core.net.SocketAddress sender() 
function sender ={
        return io.vertx.core.net.SocketAddress.sender()
}
    # io.vertx.core.buffer.Buffer data() 
function data ={
        return io.vertx.core.buffer.Buffer.data()
}
