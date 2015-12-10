package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetServer 
public class NetServer implements Measured {
        private io.vertx.core.net.NetServer delegate; 
    public NetServer(Object delegate) {
            this.delegate = (io.vertx.core.net.NetServer) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // boolean isMetricsEnabled() 
    // TypeParams: [] 
        public boolean isMetricsEnabled() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isMetricsEnabled(); 
    }
        // io.vertx.core.net.NetSocketStream connectStream() 
    // TypeParams: [] 
        public NetSocketStream connectStream() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.connectStream(), io.vertx.golo.core.net.NetSocketStream.class); 
    }
        // io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler) 
    // TypeParams: [] 
        public NetServer connectHandler(Handler<NetSocket> handler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    API   
        return InternalHelper.safeCreate(this.delegate.connectHandler(new Handler<io.vertx.core.net.NetSocket>() {
                          public void handle(io.vertx.core.net.NetSocket event) {
handler.handle(new io.vertx.golo.core.net.NetSocket(event));
                          }
                        }), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen() 
    // TypeParams: [] 
        public NetServer listen() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.listen(), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
    // TypeParams: [] 
        public NetServer listen(Handler<AsyncResult<NetServer>> listenHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.listen(new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
         public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
           AsyncResult<NetServer> f;
           if (event.succeeded()) {
             f = InternalHelper.<NetServer>result(new NetServer(event.result()));
           } else {
             f = InternalHelper.<NetServer>failure(event.cause());
           }
listenHandler.handle((AsyncResult<NetServer>)f);
         }
       }
), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen(int port, java.lang.String host) 
    // TypeParams: [] 
        public NetServer listen(int port,String host) {
                //param classes(remove later):   PRIMITIVE   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.listen(port,host), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
    // TypeParams: [] 
        public NetServer listen(int port,String host,Handler<AsyncResult<NetServer>> listenHandler) {
                //param classes(remove later):   PRIMITIVE   STRING   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.listen(port,host,new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
         public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
           AsyncResult<NetServer> f;
           if (event.succeeded()) {
             f = InternalHelper.<NetServer>result(new NetServer(event.result()));
           } else {
             f = InternalHelper.<NetServer>failure(event.cause());
           }
listenHandler.handle((AsyncResult<NetServer>)f);
         }
       }
), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen(int port) 
    // TypeParams: [] 
        public NetServer listen(int port) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.listen(port), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler) 
    // TypeParams: [] 
        public NetServer listen(int port,Handler<AsyncResult<NetServer>> listenHandler) {
                //param classes(remove later):   PRIMITIVE   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        return InternalHelper.safeCreate(this.delegate.listen(port,new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
         public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
           AsyncResult<NetServer> f;
           if (event.succeeded()) {
             f = InternalHelper.<NetServer>result(new NetServer(event.result()));
           } else {
             f = InternalHelper.<NetServer>failure(event.cause());
           }
listenHandler.handle((AsyncResult<NetServer>)f);
         }
       }
), io.vertx.golo.core.net.NetServer.class); 
    }
        // void close() 
    // TypeParams: [] 
        public void close() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        this.delegate.close(); 
    }
        // void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
    // TypeParams: [] 
        public void close(Handler<AsyncResult<Void>> completionHandler) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    ASYNC_RESULT   
        this.delegate.close(completionHandler); 
    }
        // int actualPort() 
    // TypeParams: [] 
        public int actualPort() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.actualPort(); 
    }
        }
