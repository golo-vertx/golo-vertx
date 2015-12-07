package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
// io.vertx.core.http.HttpServerFileUpload 
public class HttpServerFileUpload { 

private io.vertx.core.http.HttpServerFileUpload delegate; 
public HttpServerFileUpload(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerFileUpload)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpServerFileUpload pause() 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.pause(); 
}
// io.vertx.core.http.HttpServerFileUpload resume() 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.resume(); 
}
// io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) 
public HttpServerFileUpload {
        return (io.vertx.core.http.HttpServerFileUpload)delegate.streamToFileSystem(filename); 
}
// java.lang.String filename() 
public String {
        return (java.lang.String)delegate.filename(); 
}
// java.lang.String name() 
public String {
        return (java.lang.String)delegate.name(); 
}
// java.lang.String contentType() 
public String {
        return (java.lang.String)delegate.contentType(); 
}
// java.lang.String contentTransferEncoding() 
public String {
        return (java.lang.String)delegate.contentTransferEncoding(); 
}
// java.lang.String charset() 
public String {
        return (java.lang.String)delegate.charset(); 
}
// long size() 
public long {
        return (long)delegate.size(); 
}
// boolean isSizeAvailable() 
public boolean {
        return (boolean)delegate.isSizeAvailable(); 
}
}
