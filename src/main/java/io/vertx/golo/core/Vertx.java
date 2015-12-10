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
public class Vertx implements Measured {
        private io.vertx.core.Vertx delegate; 
    public Vertx(Object delegate) {
            this.delegate = (io.vertx.core.Vertx) delegate;
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
        // io.vertx.core.Vertx vertx() 
    // TypeParams: [] 
        public static Vertx vertx() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(), io.vertx.golo.core.Vertx.class); 
    }
        // io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) 
    // TypeParams: [] 
        public static Vertx vertx(VertxOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(options), io.vertx.golo.core.Vertx.class); 
    }
        // void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) 
    // TypeParams: [] 
        public static void clusteredVertx(VertxOptions options,Handler<AsyncResult<Vertx>> resultHandler) {
                //param classes(remove later):   DATA_OBJECT   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        io.vertx.core.Vertx.clusteredVertx(options,new Handler<AsyncResult<io.vertx.core.Vertx>>() {
         public void handle(AsyncResult<io.vertx.core.Vertx> event) {
           AsyncResult<Vertx> f;
           if (event.succeeded()) {
             f = InternalHelper.<Vertx>result(new Vertx(event.result()));
           } else {
             f = InternalHelper.<Vertx>failure(event.cause());
           }
resultHandler.handle((AsyncResult<Vertx>)f);
         }
       }
); 
    }
        // io.vertx.core.Context currentContext() 
    // TypeParams: [] 
        public static Context currentContext() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(io.vertx.core.Vertx.currentContext(), io.vertx.golo.core.Context.class); 
    }
        // io.vertx.core.Context getOrCreateContext() 
    // TypeParams: [] 
        public Context getOrCreateContext() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.getOrCreateContext(), io.vertx.golo.core.Context.class); 
    }
        // io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) 
    // TypeParams: [] 
        public NetServer createNetServer(NetServerOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.createNetServer(options), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetServer createNetServer() 
    // TypeParams: [] 
        public NetServer createNetServer() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.createNetServer(), io.vertx.golo.core.net.NetServer.class); 
    }
        // io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) 
    // TypeParams: [] 
        public NetClient createNetClient(NetClientOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.createNetClient(options), io.vertx.golo.core.net.NetClient.class); 
    }
        // io.vertx.core.net.NetClient createNetClient() 
    // TypeParams: [] 
        public NetClient createNetClient() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.createNetClient(), io.vertx.golo.core.net.NetClient.class); 
    }
        // io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) 
    // TypeParams: [] 
        public HttpServer createHttpServer(HttpServerOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.createHttpServer(options), io.vertx.golo.core.http.HttpServer.class); 
    }
        // io.vertx.core.http.HttpServer createHttpServer() 
    // TypeParams: [] 
        public HttpServer createHttpServer() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.createHttpServer(), io.vertx.golo.core.http.HttpServer.class); 
    }
        // io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) 
    // TypeParams: [] 
        public HttpClient createHttpClient(HttpClientOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.createHttpClient(options), io.vertx.golo.core.http.HttpClient.class); 
    }
        // io.vertx.core.http.HttpClient createHttpClient() 
    // TypeParams: [] 
        public HttpClient createHttpClient() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.createHttpClient(), io.vertx.golo.core.http.HttpClient.class); 
    }
        // io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) 
    // TypeParams: [] 
        public DatagramSocket createDatagramSocket(DatagramSocketOptions options) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.createDatagramSocket(options), io.vertx.golo.core.datagram.DatagramSocket.class); 
    }
        // io.vertx.core.datagram.DatagramSocket createDatagramSocket() 
    // TypeParams: [] 
        public DatagramSocket createDatagramSocket() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.createDatagramSocket(), io.vertx.golo.core.datagram.DatagramSocket.class); 
    }
        // io.vertx.core.file.FileSystem fileSystem() 
    // TypeParams: [] 
        public FileSystem fileSystem() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.fileSystem(), io.vertx.golo.core.file.FileSystem.class); 
    }
        // io.vertx.core.eventbus.EventBus eventBus() 
    // TypeParams: [] 
        public EventBus eventBus() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.eventBus(), io.vertx.golo.core.eventbus.EventBus.class); 
    }
        // io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) 
    // TypeParams: [] 
        public DnsClient createDnsClient(int port,String host) {
                //param classes(remove later):   PRIMITIVE   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.createDnsClient(port,host), io.vertx.golo.core.dns.DnsClient.class); 
    }
        // io.vertx.core.shareddata.SharedData sharedData() 
    // TypeParams: [] 
        public SharedData sharedData() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.sharedData(), io.vertx.golo.core.shareddata.SharedData.class); 
    }
        // long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
    // TypeParams: [] 
        public long setTimer(long delay,Handler<Long> handler) {
                //param classes(remove later):   PRIMITIVE   HANDLER  
        //evenTypes (remove later):      BOXED_PRIMITIVE   
        return this.delegate.setTimer(delay,handler); 
    }
        // io.vertx.core.TimeoutStream timerStream(long delay) 
    // TypeParams: [] 
        public TimeoutStream timerStream(long delay) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.timerStream(delay), io.vertx.golo.core.TimeoutStream.class); 
    }
        // long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
    // TypeParams: [] 
        public long setPeriodic(long delay,Handler<Long> handler) {
                //param classes(remove later):   PRIMITIVE   HANDLER  
        //evenTypes (remove later):      BOXED_PRIMITIVE   
        return this.delegate.setPeriodic(delay,handler); 
    }
        // io.vertx.core.TimeoutStream periodicStream(long delay) 
    // TypeParams: [] 
        public TimeoutStream periodicStream(long delay) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.periodicStream(delay), io.vertx.golo.core.TimeoutStream.class); 
    }
        // boolean cancelTimer(long id) 
    // TypeParams: [] 
        public boolean cancelTimer(long id) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.cancelTimer(id); 
    }
        // void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
    // TypeParams: [] 
        public void runOnContext(Handler<Void> action) {
                //param classes(remove later):   HANDLER  
        //evenTypes (remove later):    VOID   
        this.delegate.runOnContext(action); 
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
        // void deployVerticle(java.lang.String name) 
    // TypeParams: [] 
        public void deployVerticle(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        this.delegate.deployVerticle(name); 
    }
        // void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
    // TypeParams: [] 
        public void deployVerticle(String name,Handler<AsyncResult<String>> completionHandler) {
                //param classes(remove later):   STRING   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.deployVerticle(name,completionHandler); 
    }
        // void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) 
    // TypeParams: [] 
        public void deployVerticle(String name,DeploymentOptions options) {
                //param classes(remove later):   STRING   DATA_OBJECT  
        //evenTypes (remove later):      
        this.delegate.deployVerticle(name,options); 
    }
        // void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
    // TypeParams: [] 
        public void deployVerticle(String name,DeploymentOptions options,Handler<AsyncResult<String>> completionHandler) {
                //param classes(remove later):   STRING   DATA_OBJECT   HANDLER  
        //evenTypes (remove later):        ASYNC_RESULT   
        this.delegate.deployVerticle(name,options,completionHandler); 
    }
        // void undeploy(java.lang.String deploymentID) 
    // TypeParams: [] 
        public void undeploy(String deploymentID) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        this.delegate.undeploy(deploymentID); 
    }
        // void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
    // TypeParams: [] 
        public void undeploy(String deploymentID,Handler<AsyncResult<Void>> completionHandler) {
                //param classes(remove later):   STRING   HANDLER  
        //evenTypes (remove later):      ASYNC_RESULT   
        this.delegate.undeploy(deploymentID,completionHandler); 
    }
        // java.util.Set<java.lang.String> deploymentIDs() 
    // TypeParams: [] 
        public Set<String> deploymentIDs() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.deploymentIDs(); 
    }
        // boolean isClustered() 
    // TypeParams: [] 
        public boolean isClustered() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isClustered(); 
    }
        // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]] 
        public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler,boolean ordered,Handler<AsyncResult<T>> resultHandler) {
                //param classes(remove later):   HANDLER   PRIMITIVE   HANDLER  
        //evenTypes (remove later):    API       ASYNC_RESULT   
        this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
                          public void handle(io.vertx.core.Future<java.lang.Object> event) {
blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
                          }
                        },ordered,new Handler<AsyncResult<Object>>() {
         public void handle(AsyncResult<Object> event) {
           AsyncResult<Object> f;
           if (event.succeeded()) {
             f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
           } else {
             f = InternalHelper.<Object>failure(event.cause());
           }
resultHandler.handle((AsyncResult<T>)f);
         }
       }
); 
    }
        // <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
    // TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]] 
        public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler,Handler<AsyncResult<T>> resultHandler) {
                //param classes(remove later):   HANDLER   HANDLER  
        //evenTypes (remove later):    API     ASYNC_RESULT   
        this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
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
resultHandler.handle((AsyncResult<T>)f);
         }
       }
); 
    }
        }
