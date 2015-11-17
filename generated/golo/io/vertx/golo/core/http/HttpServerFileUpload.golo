module io.vertx.golo.core.Http

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.ReadStream
    # io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerFileUpload.exceptionHandler()
}
    # io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
function handlerByHandler =| handler |{
        return io.vertx.core.http.HttpServerFileUpload.handler()
}
    # io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
function endHandlerByEndHandler =| endHandler |{
        return io.vertx.core.http.HttpServerFileUpload.endHandler()
}
    # io.vertx.core.http.HttpServerFileUpload pause() 
function pause ={
        return io.vertx.core.http.HttpServerFileUpload.pause()
}
    # io.vertx.core.http.HttpServerFileUpload resume() 
function resume ={
        return io.vertx.core.http.HttpServerFileUpload.resume()
}
    # io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) 
function streamToFileSystemByFilename =| filename |{
        return io.vertx.core.http.HttpServerFileUpload.streamToFileSystem()
}
    # java.lang.String filename() 
function filename ={
        return java.lang.String.filename()
}
    # java.lang.String name() 
function name ={
        return java.lang.String.name()
}
    # java.lang.String contentType() 
function contentType ={
        return java.lang.String.contentType()
}
    # java.lang.String contentTransferEncoding() 
function contentTransferEncoding ={
        return java.lang.String.contentTransferEncoding()
}
    # java.lang.String charset() 
function charset ={
        return java.lang.String.charset()
}
    # long size() 
function size ={
        return long.size()
}
    # boolean isSizeAvailable() 
function isSizeAvailable ={
        return boolean.isSizeAvailable()
}
