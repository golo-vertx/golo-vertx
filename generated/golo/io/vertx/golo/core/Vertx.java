package io.vertx.golo.Core;

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
public class Vertx { 

private io.vertx.core.Vertx originalInstance;// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
// io.vertx.core.Vertx vertx() 
public io.vertx.core.Vertx vertx() {
        return originalInstance.vertx(); 
}
// io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) 
public io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) {
        return originalInstance.vertx(); 
}
// void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) 
public void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) {
        return originalInstance.clusteredVertx(); 
}
// io.vertx.core.Context currentContext() 
public io.vertx.core.Context currentContext() {
        return originalInstance.currentContext(); 
}
// io.vertx.core.Context getOrCreateContext() 
public io.vertx.core.Context getOrCreateContext() {
        return originalInstance.getOrCreateContext(); 
}
// io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) 
public io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) {
        return originalInstance.createNetServer(); 
}
// io.vertx.core.net.NetServer createNetServer() 
public io.vertx.core.net.NetServer createNetServer() {
        return originalInstance.createNetServer(); 
}
// io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) 
public io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) {
        return originalInstance.createNetClient(); 
}
// io.vertx.core.net.NetClient createNetClient() 
public io.vertx.core.net.NetClient createNetClient() {
        return originalInstance.createNetClient(); 
}
// io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) 
public io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) {
        return originalInstance.createHttpServer(); 
}
// io.vertx.core.http.HttpServer createHttpServer() 
public io.vertx.core.http.HttpServer createHttpServer() {
        return originalInstance.createHttpServer(); 
}
// io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) 
public io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) {
        return originalInstance.createHttpClient(); 
}
// io.vertx.core.http.HttpClient createHttpClient() 
public io.vertx.core.http.HttpClient createHttpClient() {
        return originalInstance.createHttpClient(); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) 
public io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) {
        return originalInstance.createDatagramSocket(); 
}
// io.vertx.core.datagram.DatagramSocket createDatagramSocket() 
public io.vertx.core.datagram.DatagramSocket createDatagramSocket() {
        return originalInstance.createDatagramSocket(); 
}
// io.vertx.core.file.FileSystem fileSystem() 
public io.vertx.core.file.FileSystem fileSystem() {
        return originalInstance.fileSystem(); 
}
// io.vertx.core.eventbus.EventBus eventBus() 
public io.vertx.core.eventbus.EventBus eventBus() {
        return originalInstance.eventBus(); 
}
// io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) 
public io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) {
        return originalInstance.createDnsClient(); 
}
// io.vertx.core.shareddata.SharedData sharedData() 
public io.vertx.core.shareddata.SharedData sharedData() {
        return originalInstance.sharedData(); 
}
// long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        return originalInstance.setTimer(); 
}
// io.vertx.core.TimeoutStream timerStream(long delay) 
public io.vertx.core.TimeoutStream timerStream(long delay) {
        return originalInstance.timerStream(); 
}
// long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
public long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) {
        return originalInstance.setPeriodic(); 
}
// io.vertx.core.TimeoutStream periodicStream(long delay) 
public io.vertx.core.TimeoutStream periodicStream(long delay) {
        return originalInstance.periodicStream(); 
}
// boolean cancelTimer(long id) 
public boolean cancelTimer(long id) {
        return originalInstance.cancelTimer(); 
}
// void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
public void runOnContext(io.vertx.core.Handler<java.lang.Void> action) {
        return originalInstance.runOnContext(); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
// void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.close(); 
}
// void deployVerticle(java.lang.String name) 
public void deployVerticle(java.lang.String name) {
        return originalInstance.deployVerticle(); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        return originalInstance.deployVerticle(); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) {
        return originalInstance.deployVerticle(); 
}
// void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
public void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) {
        return originalInstance.deployVerticle(); 
}
// void undeploy(java.lang.String deploymentID) 
public void undeploy(java.lang.String deploymentID) {
        return originalInstance.undeploy(); 
}
// void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
public void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) {
        return originalInstance.undeploy(); 
}
// java.util.Set<java.lang.String> deploymentIDs() 
public java.util.Set<java.lang.String> deploymentIDs() {
        return originalInstance.deploymentIDs(); 
}
// boolean isClustered() 
public boolean isClustered() {
        return originalInstance.isClustered(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        return originalInstance.executeBlocking(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) {
        return originalInstance.executeBlocking(); 
}
}
