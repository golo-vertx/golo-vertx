package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.datagram.DatagramSocket 
public class DatagramSocket { 

private io.vertx.core.datagram.DatagramSocket delegate; 
public DatagramSocket(Object delegate) { 
    this.delegate = (io.vertx.core.datagram.DatagramSocket)delegate; 
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
// io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket send(Buffer packet,int port,String host,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   API   PRIMITIVE   STRING   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.send(packet,port,host,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host) 
// TypeParams: [] 
public PacketWritestream sender(int port,String host) {
        //param classes(remove later):   PRIMITIVE   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.sender(port,host), io.vertx.golo.core.datagram.PacketWritestream.class); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket send(String str,int port,String host,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   PRIMITIVE   STRING   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.send(str,port,host,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket send(String str,String enc,int port,String host,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   STRING   PRIMITIVE   STRING   HANDLER  
    //evenTypes (remove later):            ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.send(str,enc,port,host,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public void close(Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    ASYNC_RESULT   
    this.delegate.close(handler); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.close(); 
}
// io.vertx.core.net.SocketAddress localAddress() 
// TypeParams: [] 
public SocketAddress localAddress() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket listenMulticastGroup(String multicastAddress,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.listenMulticastGroup(multicastAddress,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket listenMulticastGroup(String multicastAddress,String networkInterface,String source,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   STRING   STRING   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.listenMulticastGroup(multicastAddress,networkInterface,source,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket unlistenMulticastGroup(String multicastAddress,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.unlistenMulticastGroup(multicastAddress,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket unlistenMulticastGroup(String multicastAddress,String networkInterface,String source,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   STRING   STRING   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.unlistenMulticastGroup(multicastAddress,networkInterface,source,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket blockMulticastGroup(String multicastAddress,String sourceToBlock,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.blockMulticastGroup(multicastAddress,sourceToBlock,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket blockMulticastGroup(String multicastAddress,String networkInterface,String sourceToBlock,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   STRING   STRING   STRING   HANDLER  
    //evenTypes (remove later):          ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.blockMulticastGroup(multicastAddress,networkInterface,sourceToBlock,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler) 
// TypeParams: [] 
public DatagramSocket listen(int port,String host,Handler<AsyncResult<DatagramSocket>> handler) {
        //param classes(remove later):   PRIMITIVE   STRING   HANDLER  
    //evenTypes (remove later):        ASYNC_RESULT   
    return InternalHelper.safeCreate(this.delegate.listen(port,host,new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
         public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
           AsyncResult<DatagramSocket> f;
           if (event.succeeded()) {
             f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
           } else {
             f = InternalHelper.<DatagramSocket>failure(event.cause());
           }
handler.handle((AsyncResult<DatagramSocket>)f);
         }
       }
), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket pause() 
// TypeParams: [] 
public DatagramSocket pause() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.pause(), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket resume() 
// TypeParams: [] 
public DatagramSocket resume() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return InternalHelper.safeCreate(this.delegate.resume(), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler) 
// TypeParams: [] 
public DatagramSocket endHandler(Handler<Void> endHandler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    VOID   
    return InternalHelper.safeCreate(this.delegate.endHandler(endHandler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler) 
// TypeParams: [] 
public DatagramSocket handler(Handler<DatagramPacket> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    return InternalHelper.safeCreate(this.delegate.handler(new Handler<io.vertx.core.datagram.DatagramPacket>() {
                          public void handle(io.vertx.core.datagram.DatagramPacket event) {
handler.handle(new io.vertx.golo.core.datagram.DatagramPacket(event));
                          }
                        }), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
// TypeParams: [] 
public DatagramSocket exceptionHandler(Handler<Throwable> handler) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    THROWABLE   
    return InternalHelper.safeCreate(this.delegate.exceptionHandler(handler), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
}
