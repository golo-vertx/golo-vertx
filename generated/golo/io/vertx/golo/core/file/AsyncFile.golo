module io.vertx.golo.core.File

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.core.streams.ReadStream
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handler =| handler |{
        return io.vertx.core.file.AsyncFile.handler()
}
    # io.vertx.core.file.AsyncFile pause() 
function pause ={
        return io.vertx.core.file.AsyncFile.pause()
}
    # io.vertx.core.file.AsyncFile resume() 
function resume ={
        return io.vertx.core.file.AsyncFile.resume()
}
    # io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandler =| endHandler |{
        return io.vertx.core.file.AsyncFile.endHandler()
}
    # io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data) 
function write =| data |{
        return io.vertx.core.file.AsyncFile.write()
}
    # io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.file.AsyncFile.setWriteQueueMaxSize()
}
    # io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.file.AsyncFile.drainHandler()
}
    # io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.file.AsyncFile.exceptionHandler()
}
    # void close() 
function close ={
        return void.close()
}
    # void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function closeByHandler =| handler |{
        return void.close()
}
    # io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function writeByBufferAndPositionAndHandler =| buffer , position , handler |{
        return io.vertx.core.file.AsyncFile.write()
}
    # io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
function read =| buffer , offset , position , length , handler |{
        return io.vertx.core.file.AsyncFile.read()
}
    # io.vertx.core.file.AsyncFile flush() 
function flush ={
        return io.vertx.core.file.AsyncFile.flush()
}
    # io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function flushByHandler =| handler |{
        return io.vertx.core.file.AsyncFile.flush()
}
    # io.vertx.core.file.AsyncFile setReadPos(long readPos) 
function setReadPos =| readPos |{
        return io.vertx.core.file.AsyncFile.setReadPos()
}
    # io.vertx.core.file.AsyncFile setWritePos(long writePos) 
function setWritePos =| writePos |{
        return io.vertx.core.file.AsyncFile.setWritePos()
}
    # io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize) 
function setReadBufferSize =| readBufferSize |{
        return io.vertx.core.file.AsyncFile.setReadBufferSize()
}
