module io.vertx.golo.core.Http

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.core.MultiMap
    # boolean writeQueueFull() 
function writeQueueFull ={
        return boolean.writeQueueFull()
}
    # io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandler =| handler |{
        return io.vertx.core.http.HttpServerResponse.exceptionHandler()
}
    # io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
function write =| data |{
        return io.vertx.core.http.HttpServerResponse.write()
}
    # io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
function setWriteQueueMaxSize =| maxSize |{
        return io.vertx.core.http.HttpServerResponse.setWriteQueueMaxSize()
}
    # io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function drainHandler =| handler |{
        return io.vertx.core.http.HttpServerResponse.drainHandler()
}
    # int getStatusCode() 
function getStatusCode ={
        return int.getStatusCode()
}
    # io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
function setStatusCode =| statusCode |{
        return io.vertx.core.http.HttpServerResponse.setStatusCode()
}
    # java.lang.String getStatusMessage() 
function getStatusMessage ={
        return java.lang.String.getStatusMessage()
}
    # io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
function setStatusMessage =| statusMessage |{
        return io.vertx.core.http.HttpServerResponse.setStatusMessage()
}
    # io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
function setChunked =| chunked |{
        return io.vertx.core.http.HttpServerResponse.setChunked()
}
    # boolean isChunked() 
function isChunked ={
        return boolean.isChunked()
}
    # io.vertx.core.MultiMap headers() 
function headers ={
        return io.vertx.core.MultiMap.headers()
}
    # io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
function putHeader =| name , value |{
        return io.vertx.core.http.HttpServerResponse.putHeader()
}
    # io.vertx.core.MultiMap trailers() 
function trailers ={
        return io.vertx.core.MultiMap.trailers()
}
    # io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
function putTrailer =| name , value |{
        return io.vertx.core.http.HttpServerResponse.putTrailer()
}
    # io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function closeHandler =| handler |{
        return io.vertx.core.http.HttpServerResponse.closeHandler()
}
    # io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
function writeByChunkAndEnc =| chunk , enc |{
        return io.vertx.core.http.HttpServerResponse.write()
}
    # io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
function writeByChunk =| chunk |{
        return io.vertx.core.http.HttpServerResponse.write()
}
    # io.vertx.core.http.HttpServerResponse writeContinue() 
function writeContinue ={
        return io.vertx.core.http.HttpServerResponse.writeContinue()
}
    # void end(java.lang.String chunk) 
function end =| chunk |{
        return void.end()
}
    # void end(java.lang.String chunk, java.lang.String enc) 
function endByChunkAndEnc =| chunk , enc |{
        return void.end()
}
    # void end(io.vertx.core.buffer.Buffer chunk) 
function endByChunk =| chunk |{
        return void.end()
}
    # void end() 
function end ={
        return void.end()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) 
function sendFile =| filename |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
function sendFileByFilenameAndOffset =| filename , offset |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
function sendFileByFilenameAndOffsetAndLength =| filename , offset , length |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndResultHandler =| filename , resultHandler |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndOffsetAndResultHandler =| filename , offset , resultHandler |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function sendFileByFilenameAndOffsetAndLengthAndResultHandler =| filename , offset , length , resultHandler |{
        return io.vertx.core.http.HttpServerResponse.sendFile()
}
    # void close() 
function close ={
        return void.close()
}
    # boolean ended() 
function ended ={
        return boolean.ended()
}
    # boolean closed() 
function closed ={
        return boolean.closed()
}
    # boolean headWritten() 
function headWritten ={
        return boolean.headWritten()
}
    # io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function headersEndHandler =| handler |{
        return io.vertx.core.http.HttpServerResponse.headersEndHandler()
}
    # io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
function bodyEndHandler =| handler |{
        return io.vertx.core.http.HttpServerResponse.bodyEndHandler()
}
