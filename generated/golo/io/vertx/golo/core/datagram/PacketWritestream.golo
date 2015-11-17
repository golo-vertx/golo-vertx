module io.vertx.golo.core.Datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.datagram.PacketWritestream.exceptionHandler()
}
    # io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data) 
function writeByData =| data |{
        return io.vertx.core.datagram.PacketWritestream.write()
}
    # io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSizeByMaxSize =| maxSize |{
        return io.vertx.core.datagram.PacketWritestream.setWriteQueueMaxSize()
}
    # io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandlerByHandler =| handler |{
        return io.vertx.core.datagram.PacketWritestream.drainHandler()
}
