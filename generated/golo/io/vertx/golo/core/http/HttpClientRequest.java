package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpClientRequest 
public class HttpClientRequest { 

private io.vertx.core.http.HttpClientRequest delegate; 
public HttpClientRequest(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClientRequest)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean writeQueueFull() 
// TypeParams: [] 
public boolean writeQueueFull() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.writeQueueFull(); 
}
// io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public HttpClientRequest exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public HttpClientRequest write(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public HttpClientRequest setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpClientRequest drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler) 
// TypeParams: [] 
public HttpClientRequest handler(Handler<HttpClientResponse> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
handler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest pause() 
// TypeParams: [] 
public HttpClientRequest pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest resume() 
// TypeParams: [] 
public HttpClientRequest resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public HttpClientRequest endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest setChunked(boolean chunked) 
// TypeParams: [] 
public HttpClientRequest setChunked(boolean chunked) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setChunked(chunked), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// boolean isChunked() 
// TypeParams: [] 
public boolean isChunked() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.isChunked(); 
}
// io.vertx.core.http.HttpMethod method() 
// TypeParams: [] 
public HttpMethod method() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.method(); 
}
// java.lang.String uri() 
// TypeParams: [] 
public String uri() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.uri(); 
}
// io.vertx.core.MultiMap headers() 
// TypeParams: [] 
public MultiMap headers() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value) 
// TypeParams: [] 
public HttpClientRequest putHeader(String name,String value) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.putHeader(name,value), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk) 
// TypeParams: [] 
public HttpClientRequest write(String chunk) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(chunk), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc) 
// TypeParams: [] 
public HttpClientRequest write(String chunk,String enc) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.write(chunk,enc), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpClientRequest continueHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.continueHandler(handler), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest sendHead() 
// TypeParams: [] 
public HttpClientRequest sendHead() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.sendHead(), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// void end(java.lang.String chunk) 
// TypeParams: [] 
public void end(String chunk) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    this.delegate.end(chunk); 
}
// void end(java.lang.String chunk, java.lang.String enc) 
// TypeParams: [] 
public void end(String chunk,String enc) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    this.delegate.end(chunk,enc); 
}
// void end(io.vertx.core.buffer.Buffer chunk) 
// TypeParams: [] 
public void end(Buffer chunk) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    this.delegate.end(chunk); 
}
// void end() 
// TypeParams: [] 
public void end() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.end(); 
}
// io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs) 
// TypeParams: [] 
public HttpClientRequest setTimeout(long timeoutMs) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setTimeout(timeoutMs), io.vertx.golo.core.http.HttpClientRequest.class); 
}
}
