package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetSocketStream 
public class NetSocketStream { 

private io.vertx.core.net.NetSocketStream delegate; 
public NetSocketStream(Object delegate) { 
    this.delegate = (io.vertx.core.net.NetSocketStream)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public NetSocketStream exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
// TypeParams: [] 
public NetSocketStream handler(Handler<NetSocket> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.net.NetSocket>() {
                          public void handle(io.vertx.core.net.NetSocket event) {
handler.handle(new io.vertx.golo.core.net.NetSocket(event));
                          }
                        }), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream pause() 
// TypeParams: [] 
public NetSocketStream pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream resume() 
// TypeParams: [] 
public NetSocketStream resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.net.NetSocketStream.class); 
}
// io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public NetSocketStream endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.net.NetSocketStream.class); 
}
}
