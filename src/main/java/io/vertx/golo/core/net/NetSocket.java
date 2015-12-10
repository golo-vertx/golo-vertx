package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetSocket 
public class NetSocket implements ReadStream<Buffer>,  WriteStream<Buffer> {
        private io.vertx.core.net.NetSocket delegate; 
    public NetSocket(Object delegate) {
            this.delegate = (io.vertx.core.net.NetSocket) delegate;
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
        // io.vertx.core.net.NetSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
    // TypeParams: [] 
        public NetSocket exceptionHandler(Handler<Throwable> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    THROWABLE   
        return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler) 
    // TypeParams: [] 
        public NetSocket handler(Handler<Buffer> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket pause() 
    // TypeParams: [] 
        public NetSocket pause() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket resume() 
    // TypeParams: [] 
        public NetSocket resume() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
    // TypeParams: [] 
        public NetSocket endHandler(Handler<Void> endHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket write(io.vertx.core.buffer.Buffer data) 
    // TypeParams: [] 
        public NetSocket write(Buffer data) {
                //param classes(remove later):   API  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.write(data), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket setWriteQueueMaxSize(int maxSize) 
    // TypeParams: [] 
        public NetSocket setWriteQueueMaxSize(int maxSize) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setWriteQueueMaxSize(maxSize), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler) 
    // TypeParams: [] 
        public NetSocket drainHandler(Handler<Void> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.drainHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // java.lang.String writeHandlerID() 
    // TypeParams: [] 
        public String writeHandlerID() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.writeHandlerID(); 
    }
        // io.vertx.core.net.NetSocket write(java.lang.String str) 
    // TypeParams: [] 
        public NetSocket write(String str) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.write(str), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket write(java.lang.String str, java.lang.String enc) 
    // TypeParams: [] 
        public NetSocket write(String str,String enc) {
                //param classes(remove later):   STRING   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.write(str,enc), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.sendFile(filename), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename,long offset) {
                //param classes(remove later):   STRING   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename,long offset,long length) {
                //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):        
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename,Handler<AsyncResult<Void>> resultHandler) {
                //param classes(remove later):   STRING   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename,long offset,Handler<AsyncResult<Void>> resultHandler) {
                //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
    // TypeParams: [] 
        public NetSocket sendFile(String filename,long offset,long length,Handler<AsyncResult<Void>> resultHandler) {
                //param classes(remove later):   STRING   PRIMITIVE   PRIMITIVE   HANDLER  
        //evenTypes (remove later):          ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.sendFile(filename,offset,length,resultHandler), io.vertx.golo.core.net.NetSocket.class); 
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
        // void close() 
    // TypeParams: [] 
        public void close() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        this.delegate.close(); 
    }
        // io.vertx.core.net.NetSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler) 
    // TypeParams: [] 
        public NetSocket closeHandler(Handler<Void> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.closeHandler(handler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // io.vertx.core.net.NetSocket upgradeToSsl(io.vertx.core.Handler<java.lang.Void> handler) 
    // TypeParams: [] 
        public NetSocket upgradeToSsl(Handler<Void> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        return InternalHelper.safeCreate(this.delegate.upgradeToSsl(handler), io.vertx.golo.core.net.NetSocket.class); 
    }
        // boolean isSsl() 
    // TypeParams: [] 
        public boolean isSsl() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isSsl(); 
    }
        }
