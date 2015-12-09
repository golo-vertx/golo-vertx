package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.datagram.DatagramSocket;
import io.vertx.golo.core.http.HttpServer;
import io.vertx.golo.core.shareddata.SharedData;
import io.vertx.golo.core.eventbus.EventBus;
import io.vertx.core.AsyncResult;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.datagram.DatagramSocketOptions;
import io.vertx.golo.core.net.NetClient;
import io.vertx.core.VertxOptions;
import java.util.Set;
import io.vertx.core.net.NetClientOptions;
import io.vertx.golo.core.dns.DnsClient;
import io.vertx.core.net.NetServerOptions;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.golo.core.net.NetServer;
import io.vertx.core.DeploymentOptions;
import io.vertx.golo.core.file.FileSystem;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.Handler;
import io.vertx.golo.core.http.HttpClient;
// Type: io.vertx.core.Vertx 
public class Vertx { 

private io.vertx.core.Vertx delegate; 
public Vertx(Object delegate) { 
    this.delegate = (io.vertx.core.Vertx)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        //param classes(remove later):  
    return delegate.isMetricsEnabled(); 
}
// io.vertx.core.Vertx vertx() 
public static Vertx vertx() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(), io.vertx.golo.core.Vertx.class); 
}
// io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) 
public static Vertx vertx(io.vertx.core.VertxOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(options), io.vertx.golo.core.Vertx.class); 
}
// void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) 
public static void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) {
        //param classes(remove later):   DATA_OBJECT   HANDLER  
    io.vertx.core.Vertx.clusteredVertx(options,resultHandler); 
}
// io.vertx.core.Context currentContext() 
public static Context currentContext() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(io.vertx.core.Vertx.currentContext(), io.vertx.golo.core.Context.class); 
}
// io.vertx.core.Context getOrCreateContext() 
public Context getOrCreateContext() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.getOrCreateContext(), io.vertx.golo.core.Context.class); 
}
// io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) 
public NetServer createNetServer(io.vertx.core.net.NetServerOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.createNetServer(options), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetServer createNetServer() 
public NetServer createNetServer() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.createNetServer(), io.vertx.golo.core.net.NetServer.class); 
}
// io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) 
public NetClient createNetClient(io.vertx.core.net.NetClientOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.createNetClient(options), io.vertx.golo.core.net.NetClient.class); 
}
// io.vertx.core.net.NetClient createNetClient() 
public NetClient createNetClient() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.createNetClient(), io.vertx.golo.core.net.NetClient.class); 
}
// io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) 
public HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.createHttpServer(options), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpServer createHttpServer() 
public HttpServer createHttpServer() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.createHttpServer(), io.vertx.golo.core.http.HttpServer.class); 
}
// io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) 
public HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.createHttpClient(options), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient createHttpClient() 
public HttpClient createHttpClient() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.createHttpClient(), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) 
public DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) {
        //param classes(remove later):   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.createDatagramSocket(options), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket() 
public DatagramSocket createDatagramSocket() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.createDatagramSocket(), io.vertx.golo.core.datagram.DatagramSocket.class); 
}
// io.vertx.core.file.FileSystem fileSystem() 
public FileSystem fileSystem() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.fileSystem(), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.eventbus.EventBus eventBus() 
public EventBus eventBus() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.eventBus(), io.vertx.golo.core.eventbus.EventBus.class); 
}
// io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) 
public DnsClient createDnsClient(int port, java.lang.String host) {
        //param classes(remove later):   PRIMITIVE   STRING  
    return InternalHelper.safeCreate(this.delegate.createDnsClient(port,host), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.shareddata.SharedData sharedData() 
public SharedData sharedData() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.sharedData(), io.vertx.golo.core.shareddata.SharedData.class); 
}
// long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    return delegate.setTimer(delay,handler); 
}
// io.vertx.core.TimeoutStream timerStream(long delay) 
public TimeoutStream timerStream(long delay) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.timerStream(delay), io.vertx.golo.core.TimeoutStream.class); 
}
// long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    return delegate.setPeriodic(delay,handler); 
}
// io.vertx.core.TimeoutStream periodicStream(long delay) 
public TimeoutStream periodicStream(long delay) {
        //param classes(remove later):   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.periodicStream(delay), io.vertx.golo.core.TimeoutStream.class); 
}
// boolean cancelTimer(long id) 
public boolean cancelTimer(long id) {
        //param classes(remove later):   PRIMITIVE  
    return delegate.cancelTimer(id); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        //param classes(remove later):   HANDLER  
    delegate.runOnContext(action); 
}
// void close() 
public void close() {
        //param classes(remove later):  
    delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        //param classes(remove later):   HANDLER  
    delegate.close(completionHandler); 
}
// void deployVerticle(java.lang.String name) 
public void deployVerticle(java.lang.String name) {
        //param classes(remove later):   STRING  
    delegate.deployVerticle(name); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        //param classes(remove later):   STRING   HANDLER  
    delegate.deployVerticle(name,completionHandler); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) {
        //param classes(remove later):   STRING   DATA_OBJECT  
    delegate.deployVerticle(name,options); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        //param classes(remove later):   STRING   DATA_OBJECT   HANDLER  
    delegate.deployVerticle(name,options,completionHandler); 
}
// void undeploy(java.lang.String deploymentID) 
public void undeploy(java.lang.String deploymentID) {
        //param classes(remove later):   STRING  
    delegate.undeploy(deploymentID); 
}
// void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        //param classes(remove later):   STRING   HANDLER  
    delegate.undeploy(deploymentID,completionHandler); 
}
// java.util.Set<java.lang.String> deploymentIDs() 
public Set<String> deploymentIDs() {
        //param classes(remove later):  
    return delegate.deploymentIDs(); 
}
// boolean isClustered() 
public boolean isClustered() {
        //param classes(remove later):  
    return delegate.isClustered(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler, boolean ordered, Handler<AsyncResult<T>> resultHandler) {
        //param classes(remove later):   HANDLER   PRIMITIVE   HANDLER  
    delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
      }
    }, ordered,
    new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
             AsyncResult<Object> f;
             if(event.succeeded()) {
                 f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
             } else {
                 f = InternalHelper.<Object>failure(event.cause());
             }
             resultHandler.handle(f);
         }
       }); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        //param classes(remove later):   HANDLER   HANDLER  
    delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
                          public void handle(io.vertx.core.Future<java.lang.Object> event) {
blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
                          }
                        },new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle(f);
         }
       }); 
}
}
