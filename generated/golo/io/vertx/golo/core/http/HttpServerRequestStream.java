package io.vertx.golo.core.Http;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.streams.ReadStream;
public class HttpServerRequestStream { 

private io.vertx.core.http.HttpServerRequestStream originalInstance;// io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        return originalInstance.exceptionHandler(); 
}
// io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        return originalInstance.handler(); 
}
// io.vertx.core.http.HttpServerRequestStream pause() 
public io.vertx.core.http.HttpServerRequestStream pause() {
        return originalInstance.pause(); 
}
// io.vertx.core.http.HttpServerRequestStream resume() 
public io.vertx.core.http.HttpServerRequestStream resume() {
        return originalInstance.resume(); 
}
// io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        return originalInstance.endHandler(); 
}
}
