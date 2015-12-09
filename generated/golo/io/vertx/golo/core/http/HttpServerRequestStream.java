package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream { 

private io.vertx.core.http.HttpServerRequestStream delegate; 
public HttpServerRequestStream(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpServerRequestStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
public HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
// io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) 
public HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.http.HttpServerRequest>() {
                          public void handle(io.vertx.core.http.HttpServerRequest event) {
handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
// io.vertx.core.http.HttpServerRequestStream pause() 
public HttpServerRequestStream pause() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
// io.vertx.core.http.HttpServerRequestStream resume() 
public HttpServerRequestStream resume() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
// io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
public HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) {
        //param classes(remove later):   HANDLER  
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpServerRequestStream.class); 
}
}
