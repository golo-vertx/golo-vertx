package io.vertx.golo.core.Http;

import io.vertx.core.buffer.Buffer;
public class WebSocketFrame { 

private io.vertx.core.http.WebSocketFrame originalInstance;// io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        return originalInstance.binaryFrame(); 
}
// io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) 
public io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) {
        return originalInstance.textFrame(); 
}
// io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        return originalInstance.continuationFrame(); 
}
// boolean isText() 
public boolean isText() {
        return originalInstance.isText(); 
}
// boolean isBinary() 
public boolean isBinary() {
        return originalInstance.isBinary(); 
}
// boolean isContinuation() 
public boolean isContinuation() {
        return originalInstance.isContinuation(); 
}
// java.lang.String textData() 
public java.lang.String textData() {
        return originalInstance.textData(); 
}
// io.vertx.core.buffer.Buffer binaryData() 
public io.vertx.core.buffer.Buffer binaryData() {
        return originalInstance.binaryData(); 
}
// boolean isFinal() 
public boolean isFinal() {
        return originalInstance.isFinal(); 
}
}
