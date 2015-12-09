package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
// Type: io.vertx.core.http.WebSocketFrame 
public class WebSocketFrame { 

private io.vertx.core.http.WebSocketFrame delegate; 
public WebSocketFrame(Object delegate) { 
    this.delegate = (io.vertx.core.http.WebSocketFrame)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public static WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        //param classes(remove later):   API   PRIMITIVE  
    return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.binaryFrame(data,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) 
public static WebSocketFrame textFrame(java.lang.String str, boolean isFinal) {
        //param classes(remove later):   STRING   PRIMITIVE  
    return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.textFrame(str,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
public static WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) {
        //param classes(remove later):   API   PRIMITIVE  
    return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.continuationFrame(data,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
}
// boolean isText() 
public boolean isText() {
        //param classes(remove later):  
    return delegate.isText(); 
}
// boolean isBinary() 
public boolean isBinary() {
        //param classes(remove later):  
    return delegate.isBinary(); 
}
// boolean isContinuation() 
public boolean isContinuation() {
        //param classes(remove later):  
    return delegate.isContinuation(); 
}
// java.lang.String textData() 
public String textData() {
        //param classes(remove later):  
    return delegate.textData(); 
}
// io.vertx.core.buffer.Buffer binaryData() 
public Buffer binaryData() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.binaryData(), io.vertx.golo.core.buffer.Buffer.class); 
}
// boolean isFinal() 
public boolean isFinal() {
        //param classes(remove later):  
    return delegate.isFinal(); 
}
}
