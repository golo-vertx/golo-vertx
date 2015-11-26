package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
// io.vertx.core.http.WebSocketFrame 
public class WebSocketFrame { 

private io.vertx.core.http.WebSocketFrame delegate; 
public WebSocketFrame(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocketFrame)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public static io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        return (io.vertx.core.http.WebSocketFrame)InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.binaryFrame(data, isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) 
public static io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) {
        return (io.vertx.core.http.WebSocketFrame)InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.textFrame(str, isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public static io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        return (io.vertx.core.http.WebSocketFrame)InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.continuationFrame(data, isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// boolean isText() 
public boolean isText() {
        return (boolean)delegate.isText(); 
}
// boolean isBinary() 
public boolean isBinary() {
        return (boolean)delegate.isBinary(); 
}
// boolean isContinuation() 
public boolean isContinuation() {
        return (boolean)delegate.isContinuation(); 
}
// java.lang.String textData() 
public java.lang.String textData() {
        return (java.lang.String)delegate.textData(); 
}
// io.vertx.core.buffer.Buffer binaryData() 
public io.vertx.core.buffer.Buffer binaryData() {
        return (io.vertx.core.buffer.Buffer)delegate.binaryData(); 
}
// boolean isFinal() 
public boolean isFinal() {
        return (boolean)delegate.isFinal(); 
}
}
