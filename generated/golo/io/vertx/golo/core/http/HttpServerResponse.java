package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerResponse 
public class HttpServerResponse { 

private io.vertx.core.http.HttpServerResponse delegate; 
public HttpServerResponse(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerResponse)delegate; 
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
// io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public HttpServerResponse exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public HttpServerResponse write(Buffer data) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize) 
// TypeParams: [] 
public HttpServerResponse setWriteQueueMaxSize(int maxSize) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpServerResponse drainHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// int getStatusCode() 
// TypeParams: [] 
public int getStatusCode() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.getStatusCode(); 
}
// io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode) 
// TypeParams: [] 
public HttpServerResponse setStatusCode(int statusCode) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setStatusCode(statusCode), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// java.lang.String getStatusMessage() 
// TypeParams: [] 
public String getStatusMessage() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.getStatusMessage(); 
}
// io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage) 
// TypeParams: [] 
public HttpServerResponse setStatusMessage(String statusMessage) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setStatusMessage(statusMessage), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse setChunked(boolean chunked) 
// TypeParams: [] 
public HttpServerResponse setChunked(boolean chunked) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.setChunked(chunked), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// boolean isChunked() 
// TypeParams: [] 
public boolean isChunked() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.isChunked(); 
}
// io.vertx.core.MultiMap headers() 
// TypeParams: [] 
public MultiMap headers() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value) 
// TypeParams: [] 
public HttpServerResponse putHeader(String name,String value) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.putHeader(name,value), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.MultiMap trailers() 
// TypeParams: [] 
public MultiMap trailers() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class); 
}
// io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value) 
// TypeParams: [] 
public HttpServerResponse putTrailer(String name,String value) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.putTrailer(name,value), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpServerResponse closeHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc) 
// TypeParams: [] 
public HttpServerResponse write(String chunk,String enc) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.write(chunk,enc), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse write(java.lang.String chunk) 
// TypeParams: [] 
public HttpServerResponse write(String chunk) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.write(chunk), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse writeContinue() 
// TypeParams: [] 
public HttpServerResponse writeContinue() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.writeContinue(), io.vertx.golo.core.http.HttpServerResponse.class); 
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
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.sendFile(filename), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename,long offset) {
        //param classes(remove later):   STRING   PRIMITIVE  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename,long offset,long length) {
        //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename,Handler<AsyncResult<Void>> resultHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename,long offset,Handler<AsyncResult<Void>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
// TypeParams: [] 
public HttpServerResponse sendFile(String filename,long offset,long length,Handler<AsyncResult<Void>> resultHandler) {
        //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length,resultHandler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.close(); 
}
// boolean ended() 
// TypeParams: [] 
public boolean ended() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.ended(); 
}
// boolean closed() 
// TypeParams: [] 
public boolean closed() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.closed(); 
}
// boolean headWritten() 
// TypeParams: [] 
public boolean headWritten() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.headWritten(); 
}
// io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpServerResponse headersEndHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.headersEndHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
// io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler) 
// TypeParams: [] 
public HttpServerResponse bodyEndHandler(Handler<Void> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.bodyEndHandler(handler), io.vertx.golo.core.http.HttpServerResponse.class); 
}
}
