package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerFileUpload 
public class HttpServerFileUpload { 

private io.vertx.core.http.HttpServerFileUpload delegate; 
public HttpServerFileUpload(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerFileUpload)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public HttpServerFileUpload exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
// TypeParams: [] 
public HttpServerFileUpload handler(Handler<Buffer> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public HttpServerFileUpload endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// io.vertx.core.http.HttpServerFileUpload pause() 
// TypeParams: [] 
public HttpServerFileUpload pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// io.vertx.core.http.HttpServerFileUpload resume() 
// TypeParams: [] 
public HttpServerFileUpload resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) 
// TypeParams: [] 
public HttpServerFileUpload streamToFileSystem(String filename) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.streamToFileSystem(filename), io.vertx.golo.core.http.HttpServerFileUpload.class); 
}
// java.lang.String filename() 
// TypeParams: [] 
public String filename() {
        //param classes(remove later):  
    return delegate.filename(); 
}
// java.lang.String name() 
// TypeParams: [] 
public String name() {
        //param classes(remove later):  
    return delegate.name(); 
}
// java.lang.String contentType() 
// TypeParams: [] 
public String contentType() {
        //param classes(remove later):  
    return delegate.contentType(); 
}
// java.lang.String contentTransferEncoding() 
// TypeParams: [] 
public String contentTransferEncoding() {
        //param classes(remove later):  
    return delegate.contentTransferEncoding(); 
}
// java.lang.String charset() 
// TypeParams: [] 
public String charset() {
        //param classes(remove later):  
    return delegate.charset(); 
}
// long size() 
// TypeParams: [] 
public long size() {
        //param classes(remove later):  
    return delegate.size(); 
}
// boolean isSizeAvailable() 
// TypeParams: [] 
public boolean isSizeAvailable() {
        //param classes(remove later):  
    return delegate.isSizeAvailable(); 
}
}
