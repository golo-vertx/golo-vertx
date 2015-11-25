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
public io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return delegate.exceptionHandler(handler); 
}
// io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return delegate.handler(handler); 
}
// io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return delegate.endHandler(endHandler); 
}
// io.vertx.core.http.HttpServerFileUpload pause() 
public io.vertx.core.http.HttpServerFileUpload pause() {
        return delegate.pause(); 
}
// io.vertx.core.http.HttpServerFileUpload resume() 
public io.vertx.core.http.HttpServerFileUpload resume() {
        return delegate.resume(); 
}
// io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) 
public io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) {
        return delegate.streamToFileSystem(filename); 
}
// java.lang.String filename() 
public java.lang.String filename() {
        return delegate.filename(); 
}
// java.lang.String name() 
public java.lang.String name() {
        return delegate.name(); 
}
// java.lang.String contentType() 
public java.lang.String contentType() {
        return delegate.contentType(); 
}
// java.lang.String contentTransferEncoding() 
public java.lang.String contentTransferEncoding() {
        return delegate.contentTransferEncoding(); 
}
// java.lang.String charset() 
public java.lang.String charset() {
        return delegate.charset(); 
}
// long size() 
public long size() {
        return delegate.size(); 
}
// boolean isSizeAvailable() 
public boolean isSizeAvailable() {
        return delegate.isSizeAvailable(); 
}
}
