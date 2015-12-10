package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.MultiMap;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
import io.vertx.golo.core.net.NetSocket;
// Type: io.vertx.core.http.HttpServerRequest 
public class HttpServerRequest implements ReadStream<Buffer> {
        private io.vertx.core.http.HttpServerRequest delegate; 
    public HttpServerRequest(Object delegate) {
            this.delegate = (io.vertx.core.http.HttpServerRequest) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public HttpServerRequest exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
    // TypeParams: [] 
        public HttpServerRequest handler(Handler<Buffer> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.http.HttpServerRequest pause() 
    // TypeParams: [] 
        public HttpServerRequest pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.http.HttpServerRequest resume() 
    // TypeParams: [] 
        public HttpServerRequest resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public HttpServerRequest endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.http.HttpVersion version() 
    // TypeParams: [] 
        public HttpVersion version() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.version(); 
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
        // java.lang.String path() 
    // TypeParams: [] 
        public String path() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.path(); 
    }
        // java.lang.String query() 
    // TypeParams: [] 
        public String query() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.query(); 
    }
        // io.vertx.core.http.HttpServerResponse response() 
    // TypeParams: [] 
        public HttpServerResponse response() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.response(), io.vertx.golo.core.http.HttpServerResponse.class); 
    }
        // io.vertx.core.MultiMap headers() 
    // TypeParams: [] 
        public MultiMap headers() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class); 
    }
        // java.lang.String getHeader(java.lang.String headerName) 
    // TypeParams: [] 
        public String getHeader(String headerName) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.getHeader(headerName); 
    }
        // io.vertx.core.MultiMap params() 
    // TypeParams: [] 
        public MultiMap params() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.params(), io.vertx.golo.core.MultiMap.class); 
    }
        // java.lang.String getParam(java.lang.String paramName) 
    // TypeParams: [] 
        public String getParam(String paramName) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.getParam(paramName); 
    }
        // io.vertx.core.net.SocketAddress remoteAddress() 
    // TypeParams: [] 
        public SocketAddress remoteAddress() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class); 
    }
        // io.vertx.core.net.SocketAddress localAddress() 
    // TypeParams: [] 
        public SocketAddress localAddress() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
    }
        // java.lang.String absoluteURI() 
    // TypeParams: [] 
        public String absoluteURI() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.absoluteURI(); 
    }
        // io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler) 
    // TypeParams: [] 
        public HttpServerRequest bodyHandler(Handler<Buffer> bodyHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.net.NetSocket netSocket() 
    // TypeParams: [] 
        public NetSocket netSocket() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect) 
    // TypeParams: [] 
        public HttpServerRequest setExpectMultipart(boolean expect) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setExpectMultipart(expect), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // boolean isExpectMultipart() 
    // TypeParams: [] 
        public boolean isExpectMultipart() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isExpectMultipart(); 
    }
        // io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler) 
    // TypeParams: [] 
        public HttpServerRequest uploadHandler(Handler<HttpServerFileUpload> uploadHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.uploadHandler(new Handler<io.vertx.core.http.HttpServerFileUpload>() {
                          public void handle(io.vertx.core.http.HttpServerFileUpload event) {
uploadHandler.handle(new io.vertx.golo.core.http.HttpServerFileUpload(event));
                          }
                        }), io.vertx.golo.core.http.HttpServerRequest.class); 
    }
        // io.vertx.core.MultiMap formAttributes() 
    // TypeParams: [] 
        public MultiMap formAttributes() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.formAttributes(), io.vertx.golo.core.MultiMap.class); 
    }
        // java.lang.String getFormAttribute(java.lang.String attributeName) 
    // TypeParams: [] 
        public String getFormAttribute(String attributeName) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.getFormAttribute(attributeName); 
    }
        // io.vertx.core.http.ServerWebSocket upgrade() 
    // TypeParams: [] 
        public ServerWebSocket upgrade() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.upgrade(), io.vertx.golo.core.http.ServerWebSocket.class); 
    }
        // boolean isEnded() 
    // TypeParams: [] 
        public boolean isEnded() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isEnded(); 
    }
        }
