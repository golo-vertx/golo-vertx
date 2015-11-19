package io.vertx.golo.core.Http;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
public class HttpServerFileUpload { 

private io.vertx.core.http.HttpServerFileUpload originalInstance;// io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
public io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
// io.vertx.core.http.HttpServerFileUpload pause() 
public io.vertx.core.http.HttpServerFileUpload pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.HttpServerFileUpload resume() 
public io.vertx.core.http.HttpServerFileUpload resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) 
public io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename) {
        return originalInstance.streamToFileSystem(); 
}
// java.lang.String filename() 
public java.lang.String filename() {
        return originalInstance.filename(); 
}
// java.lang.String name() 
public java.lang.String name() {
        return originalInstance.name(); 
}
// java.lang.String contentType() 
public java.lang.String contentType() {
        return originalInstance.contentType(); 
}
// java.lang.String contentTransferEncoding() 
public java.lang.String contentTransferEncoding() {
        return originalInstance.contentTransferEncoding(); 
}
// java.lang.String charset() 
public java.lang.String charset() {
        return originalInstance.charset(); 
}
// long size() 
public long size() {
        return originalInstance.size(); 
}
// boolean isSizeAvailable() 
public boolean isSizeAvailable() {
        return originalInstance.isSizeAvailable(); 
}
}
