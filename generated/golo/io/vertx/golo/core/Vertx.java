package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.datagram.DatagramSocket;
import io.vertx.core.http.HttpServer;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.shareddata.SharedData;
import io.vertx.core.TimeoutStream;
import io.vertx.core.dns.DnsClient;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.NetServer;
import io.vertx.core.file.FileSystem;
import io.vertx.core.net.NetClient;
import io.vertx.core.http.HttpClient;
// io.vertx.core.Vertx 
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
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.Vertx vertx() 
public static io.vertx.core.Vertx vertx() {
        return (io.vertx.core.Vertx)InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(), io.vertx.golo.core.Vertx.class); 
}
// io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) 
public static io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) {
        return (io.vertx.core.Vertx)InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(options), io.vertx.golo.core.Vertx.class); 
}
// void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) 
public static void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) {
        io.vertx.core.Vertx.clusteredVertx(options, resultHandler); 
}
// io.vertx.core.Context currentContext() 
public static io.vertx.core.Context currentContext() {
        return (io.vertx.core.Context)io.vertx.core.Vertx.currentContext(); 
}
// io.vertx.core.Context getOrCreateContext() 
public io.vertx.core.Context getOrCreateContext() {
        return (io.vertx.core.Context)delegate.getOrCreateContext(); 
}
// io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) 
public io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) {
        return (io.vertx.core.net.NetServer)delegate.createNetServer(options); 
}
// io.vertx.core.net.NetServer createNetServer() 
public io.vertx.core.net.NetServer createNetServer() {
        return (io.vertx.core.net.NetServer)delegate.createNetServer(); 
}
// io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) 
public io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) {
        return (io.vertx.core.net.NetClient)delegate.createNetClient(options); 
}
// io.vertx.core.net.NetClient createNetClient() 
public io.vertx.core.net.NetClient createNetClient() {
        return (io.vertx.core.net.NetClient)delegate.createNetClient(); 
}
// io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) 
public io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) {
        return (io.vertx.core.http.HttpServer)delegate.createHttpServer(options); 
}
// io.vertx.core.http.HttpServer createHttpServer() 
public io.vertx.core.http.HttpServer createHttpServer() {
        return (io.vertx.core.http.HttpServer)delegate.createHttpServer(); 
}
// io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) 
public io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) {
        return (io.vertx.core.http.HttpClient)delegate.createHttpClient(options); 
}
// io.vertx.core.http.HttpClient createHttpClient() 
public io.vertx.core.http.HttpClient createHttpClient() {
        return (io.vertx.core.http.HttpClient)delegate.createHttpClient(); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) 
public io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) {
        return (io.vertx.core.datagram.DatagramSocket)delegate.createDatagramSocket(options); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket() 
public io.vertx.core.datagram.DatagramSocket createDatagramSocket() {
        return (io.vertx.core.datagram.DatagramSocket)delegate.createDatagramSocket(); 
}
// io.vertx.core.file.FileSystem fileSystem() 
public io.vertx.core.file.FileSystem fileSystem() {
        return (io.vertx.core.file.FileSystem)delegate.fileSystem(); 
}
// io.vertx.core.eventbus.EventBus eventBus() 
public io.vertx.core.eventbus.EventBus eventBus() {
        return (io.vertx.core.eventbus.EventBus)delegate.eventBus(); 
}
// io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) 
public io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) {
        return (io.vertx.core.dns.DnsClient)delegate.createDnsClient(port, host); 
}
// io.vertx.core.shareddata.SharedData sharedData() 
public io.vertx.core.shareddata.SharedData sharedData() {
        return (io.vertx.core.shareddata.SharedData)delegate.sharedData(); 
}
// long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        return (long)delegate.setTimer(delay, handler); 
}
// io.vertx.core.TimeoutStream timerStream(long delay) 
public io.vertx.core.TimeoutStream timerStream(long delay) {
        return (io.vertx.core.TimeoutStream)delegate.timerStream(delay); 
}
// long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        return (long)delegate.setPeriodic(delay, handler); 
}
// io.vertx.core.TimeoutStream periodicStream(long delay) 
public io.vertx.core.TimeoutStream periodicStream(long delay) {
        return (io.vertx.core.TimeoutStream)delegate.periodicStream(delay); 
}
// boolean cancelTimer(long id) 
public boolean cancelTimer(long id) {
        return (boolean)delegate.cancelTimer(id); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        delegate.runOnContext(action); 
}
// void close() 
public void close() {
        delegate.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.close(completionHandler); 
}
// void deployVerticle(java.lang.String name) 
public void deployVerticle(java.lang.String name) {
        delegate.deployVerticle(name); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        delegate.deployVerticle(name, completionHandler); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) {
        delegate.deployVerticle(name, options); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        delegate.deployVerticle(name, options, completionHandler); 
}
// void undeploy(java.lang.String deploymentID) 
public void undeploy(java.lang.String deploymentID) {
        delegate.undeploy(deploymentID); 
}
// void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        delegate.undeploy(deploymentID, completionHandler); 
}
// java.util.Set<java.lang.String> deploymentIDs() 
public java.util.Set<java.lang.String> deploymentIDs() {
        return (java.util.Set<java.lang.String>)delegate.deploymentIDs(); 
}
// boolean isClustered() 
public boolean isClustered() {
        return (boolean)delegate.isClustered(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T>void {
        delegate.executeBlocking(blockingCodeHandler, ordered, resultHandler); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <T>void {
        delegate.executeBlocking(blockingCodeHandler, resultHandler); 
}
}
