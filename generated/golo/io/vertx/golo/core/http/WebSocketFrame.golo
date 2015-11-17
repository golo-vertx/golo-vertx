module io.vertx.golo.core.Http

import io.vertx.core.buffer.Buffer
    # io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
function binaryFrame =| data , isFinal |{
        return io.vertx.core.http.WebSocketFrame.binaryFrame()
}
    # io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) 
function textFrame =| str , isFinal |{
        return io.vertx.core.http.WebSocketFrame.textFrame()
}
    # io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
function continuationFrame =| data , isFinal |{
        return io.vertx.core.http.WebSocketFrame.continuationFrame()
}
    # boolean isText() 
function isText ={
        return boolean.isText()
}
    # boolean isBinary() 
function isBinary ={
        return boolean.isBinary()
}
    # boolean isContinuation() 
function isContinuation ={
        return boolean.isContinuation()
}
    # java.lang.String textData() 
function textData ={
        return java.lang.String.textData()
}
    # io.vertx.core.buffer.Buffer binaryData() 
function binaryData ={
        return io.vertx.core.buffer.Buffer.binaryData()
}
    # boolean isFinal() 
function isFinal ={
        return boolean.isFinal()
}
