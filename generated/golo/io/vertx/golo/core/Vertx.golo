module io.vertx.golo.Core

import io.vertx.core.datagram.DatagramSocket
import io.vertx.core.http.HttpServer
import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.shareddata.SharedData
import io.vertx.core.TimeoutStream
import io.vertx.core.dns.DnsClient
import io.vertx.core.eventbus.EventBus
import io.vertx.core.metrics.Measured
import io.vertx.core.net.NetServer
import io.vertx.core.file.FileSystem
import io.vertx.core.net.NetClient
import io.vertx.core.http.HttpClient
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.Vertx vertx() 
function vertx ={
        return io.vertx.core.Vertx.vertx()
}
    # io.vertx.core.Vertx vertx(io.vertx.core.VertxOptions options) 
function vertxByOptions =| options |{
        return io.vertx.core.Vertx.vertx()
}
    # void clusteredVertx(io.vertx.core.VertxOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> resultHandler) 
function clusteredVertxByOptionsAndResultHandler =| options , resultHandler |{
        return void.clusteredVertx()
}
    # io.vertx.core.Context currentContext() 
function currentContext ={
        return io.vertx.core.Context.currentContext()
}
    # io.vertx.core.Context getOrCreateContext() 
function getOrCreateContext ={
        return io.vertx.core.Context.getOrCreateContext()
}
    # io.vertx.core.net.NetServer createNetServer(io.vertx.core.net.NetServerOptions options) 
function createNetServerByOptions =| options |{
        return io.vertx.core.net.NetServer.createNetServer()
}
    # io.vertx.core.net.NetServer createNetServer() 
function createNetServer ={
        return io.vertx.core.net.NetServer.createNetServer()
}
    # io.vertx.core.net.NetClient createNetClient(io.vertx.core.net.NetClientOptions options) 
function createNetClientByOptions =| options |{
        return io.vertx.core.net.NetClient.createNetClient()
}
    # io.vertx.core.net.NetClient createNetClient() 
function createNetClient ={
        return io.vertx.core.net.NetClient.createNetClient()
}
    # io.vertx.core.http.HttpServer createHttpServer(io.vertx.core.http.HttpServerOptions options) 
function createHttpServerByOptions =| options |{
        return io.vertx.core.http.HttpServer.createHttpServer()
}
    # io.vertx.core.http.HttpServer createHttpServer() 
function createHttpServer ={
        return io.vertx.core.http.HttpServer.createHttpServer()
}
    # io.vertx.core.http.HttpClient createHttpClient(io.vertx.core.http.HttpClientOptions options) 
function createHttpClientByOptions =| options |{
        return io.vertx.core.http.HttpClient.createHttpClient()
}
    # io.vertx.core.http.HttpClient createHttpClient() 
function createHttpClient ={
        return io.vertx.core.http.HttpClient.createHttpClient()
}
    # io.vertx.core.datagram.DatagramSocket createDatagramSocket(io.vertx.core.datagram.DatagramSocketOptions options) 
function createDatagramSocketByOptions =| options |{
        return io.vertx.core.datagram.DatagramSocket.createDatagramSocket()
}
    # io.vertx.core.datagram.DatagramSocket createDatagramSocket() 
function createDatagramSocket ={
        return io.vertx.core.datagram.DatagramSocket.createDatagramSocket()
}
    # io.vertx.core.file.FileSystem fileSystem() 
function fileSystem ={
        return io.vertx.core.file.FileSystem.fileSystem()
}
    # io.vertx.core.eventbus.EventBus eventBus() 
function eventBus ={
        return io.vertx.core.eventbus.EventBus.eventBus()
}
    # io.vertx.core.dns.DnsClient createDnsClient(int port, java.lang.String host) 
function createDnsClientByPortAndHost =| port , host |{
        return io.vertx.core.dns.DnsClient.createDnsClient()
}
    # io.vertx.core.shareddata.SharedData sharedData() 
function sharedData ={
        return io.vertx.core.shareddata.SharedData.sharedData()
}
    # long setTimer(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
function setTimerByDelayAndHandler =| delay , handler |{
        return long.setTimer()
}
    # io.vertx.core.TimeoutStream timerStream(long delay) 
function timerStreamByDelay =| delay |{
        return io.vertx.core.TimeoutStream.timerStream()
}
    # long setPeriodic(long delay, io.vertx.core.Handler<java.lang.Long> handler) 
function setPeriodicByDelayAndHandler =| delay , handler |{
        return long.setPeriodic()
}
    # io.vertx.core.TimeoutStream periodicStream(long delay) 
function periodicStreamByDelay =| delay |{
        return io.vertx.core.TimeoutStream.periodicStream()
}
    # boolean cancelTimer(long id) 
function cancelTimerById =| id |{
        return boolean.cancelTimer()
}
    # void runOnContext(io.vertx.core.Handler<java.lang.Void> action) 
function runOnContextByAction =| action |{
        return void.runOnContext()
}
    # void close() 
function close ={
        return void.close()
}
    # void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function closeByCompletionHandler =| completionHandler |{
        return void.close()
}
    # void deployVerticle(java.lang.String name) 
function deployVerticleByName =| name |{
        return void.deployVerticle()
}
    # void deployVerticle(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
function deployVerticleByNameAndCompletionHandler =| name , completionHandler |{
        return void.deployVerticle()
}
    # void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options) 
function deployVerticleByNameAndOptions =| name , options |{
        return void.deployVerticle()
}
    # void deployVerticle(java.lang.String name, io.vertx.core.DeploymentOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> completionHandler) 
function deployVerticleByNameAndOptionsAndCompletionHandler =| name , options , completionHandler |{
        return void.deployVerticle()
}
    # void undeploy(java.lang.String deploymentID) 
function undeployByDeploymentID =| deploymentID |{
        return void.undeploy()
}
    # void undeploy(java.lang.String deploymentID, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function undeployByDeploymentIDAndCompletionHandler =| deploymentID , completionHandler |{
        return void.undeploy()
}
    # java.util.Set<java.lang.String> deploymentIDs() 
function deploymentIDs ={
        return java.util.Set<java.lang.String>.deploymentIDs()
}
    # boolean isClustered() 
function isClustered ={
        return boolean.isClustered()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
function executeBlockingByBlockingCodeHandlerAndOrderedAndResultHandler =| blockingCodeHandler , ordered , resultHandler |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]>.executeBlocking()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler) 
function executeBlockingByBlockingCodeHandlerAndResultHandler =| blockingCodeHandler , resultHandler |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Vertx,methodNameexecuteBlocking]>.executeBlocking()
}
