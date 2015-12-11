package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
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
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
  /**
   * Creates a non clustered instance using default options.
   * @return the instance
   */
  public static Vertx vertx() {
return    InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(), io.vertx.golo.core.Vertx.class);
  }
  /**
   * Creates a non clustered instance using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/VertxOptions.html">VertxOptions</a>)
   * @return the instance
   */
  public static Vertx vertx(Map<String, Object> options) {
return    InternalHelper.safeCreate(io.vertx.core.Vertx.vertx(options != null ? new io.vertx.core.VertxOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.Vertx.class);
  }
  /**
   * Creates a clustered instance using the specified options.
   * <p>
   * The instance is created asynchronously and the resultHandler is called with the result when it is ready.
   * @param options the options to use (see <a href="../../../../../../cheatsheet/VertxOptions.html">VertxOptions</a>)
   * @param resultHandler the result handler that will receive the result
   */
  public static void clusteredVertx(Map<String, Object> options, Handler<AsyncResult<Vertx>> resultHandler) {
    io.vertx.core.Vertx.clusteredVertx(options != null ? new io.vertx.core.VertxOptions(new io.vertx.core.json.JsonObject(options)) : null, new Handler<AsyncResult<io.vertx.core.Vertx>>() {
      public void handle(AsyncResult<io.vertx.core.Vertx> event) {
        AsyncResult<Vertx> f;
        if (event.succeeded()) {
          f = InternalHelper.<Vertx>result(new Vertx(event.result()));
        } else {
          f = InternalHelper.<Vertx>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Gets the current context
   * @return The current context or null if no current context
   */
  public static Context currentContext() {
return    InternalHelper.safeCreate(io.vertx.core.Vertx.currentContext(), io.vertx.golo.core.Context.class);
  }
  /**
   * Gets the current context, or creates one if there isn't one
   * @return The current context (created if didn't exist)
   */
  public Context getOrCreateContext() {
return    InternalHelper.safeCreate(this.delegate.getOrCreateContext(), io.vertx.golo.core.Context.class);
  }
  /**
   * Create a TCP/SSL server using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/NetServerOptions.html">NetServerOptions</a>)
   * @return the server
   */
  public NetServer createNetServer(Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.createNetServer(options != null ? new io.vertx.core.net.NetServerOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.net.NetServer.class);
  }
  /**
   * Create a TCP/SSL server using default options
   * @return the server
   */
  public NetServer createNetServer() {
return    InternalHelper.safeCreate(this.delegate.createNetServer(), io.vertx.golo.core.net.NetServer.class);
  }
  /**
   * Create a TCP/SSL client using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/NetClientOptions.html">NetClientOptions</a>)
   * @return the client
   */
  public NetClient createNetClient(Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.createNetClient(options != null ? new io.vertx.core.net.NetClientOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.net.NetClient.class);
  }
  /**
   * Create a TCP/SSL client using default options
   * @return the client
   */
  public NetClient createNetClient() {
return    InternalHelper.safeCreate(this.delegate.createNetClient(), io.vertx.golo.core.net.NetClient.class);
  }
  /**
   * Create an HTTP/HTTPS server using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/HttpServerOptions.html">HttpServerOptions</a>)
   * @return the server
   */
  public HttpServer createHttpServer(Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.createHttpServer(options != null ? new io.vertx.core.http.HttpServerOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.http.HttpServer.class);
  }
  /**
   * Create an HTTP/HTTPS server using default options
   * @return the server
   */
  public HttpServer createHttpServer() {
return    InternalHelper.safeCreate(this.delegate.createHttpServer(), io.vertx.golo.core.http.HttpServer.class);
  }
  /**
   * Create a HTTP/HTTPS client using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/HttpClientOptions.html">HttpClientOptions</a>)
   * @return the client
   */
  public HttpClient createHttpClient(Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.createHttpClient(options != null ? new io.vertx.core.http.HttpClientOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Create a HTTP/HTTPS client using default options
   * @return the client
   */
  public HttpClient createHttpClient() {
return    InternalHelper.safeCreate(this.delegate.createHttpClient(), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Create a datagram socket using the specified options
   * @param options the options to use (see <a href="../../../../../../cheatsheet/DatagramSocketOptions.html">DatagramSocketOptions</a>)
   * @return the socket
   */
  public DatagramSocket createDatagramSocket(Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.createDatagramSocket(options != null ? new io.vertx.core.datagram.DatagramSocketOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.datagram.DatagramSocket.class);
  }
  /**
   * Create a datagram socket using default options
   * @return the socket
   */
  public DatagramSocket createDatagramSocket() {
return    InternalHelper.safeCreate(this.delegate.createDatagramSocket(), io.vertx.golo.core.datagram.DatagramSocket.class);
  }
  /**
   * Get the filesystem object. There is a single instance of FileSystem per Vertx instance.
   * @return the filesystem object
   */
  public FileSystem fileSystem() {
return    InternalHelper.safeCreate(this.delegate.fileSystem(), io.vertx.golo.core.file.FileSystem.class);
  }
  /**
   * Get the event bus object. There is a single instance of EventBus per Vertx instance.
   * @return the event bus object
   */
  public EventBus eventBus() {
return    InternalHelper.safeCreate(this.delegate.eventBus(), io.vertx.golo.core.eventbus.EventBus.class);
  }
  /**
   * Create a DNS client to connect to a DNS server at the specified host and port
   * @param port the port
   * @param host the host
   * @return the DNS client
   */
  public DnsClient createDnsClient(int port, String host) {
return    InternalHelper.safeCreate(this.delegate.createDnsClient(port, host), io.vertx.golo.core.dns.DnsClient.class);
  }
  /**
   * Get the shared data object. There is a single instance of SharedData per Vertx instance.
   * @return the shared data object
   */
  public SharedData sharedData() {
return    InternalHelper.safeCreate(this.delegate.sharedData(), io.vertx.golo.core.shareddata.SharedData.class);
  }
  /**
   * Set a one-shot timer to fire after <code>delay</code> milliseconds, at which point <code>handler</code> will be called with
   * the id of the timer.
   * @param delay the delay in milliseconds, after which the timer will fire
   * @param handler the handler that will be called with the timer ID when the timer fires
   * @return the unique ID of the timer
   */
  public long setTimer(long delay, Handler<Long> handler) {
return    this.delegate.setTimer(delay, handler);
  }
  /**
   * Returns a one-shot timer as a read stream. The timer will be fired after <code>delay</code> milliseconds after
   * the  has been called.
   * @param delay the delay in milliseconds, after which the timer will fire
   * @return the timer stream
   */
  public TimeoutStream timerStream(long delay) {
return    InternalHelper.safeCreate(this.delegate.timerStream(delay), io.vertx.golo.core.TimeoutStream.class);
  }
  /**
   * Set a periodic timer to fire every <code>delay</code> milliseconds, at which point <code>handler</code> will be called with
   * the id of the timer.
   * @param delay the delay in milliseconds, after which the timer will fire
   * @param handler the handler that will be called with the timer ID when the timer fires
   * @return the unique ID of the timer
   */
  public long setPeriodic(long delay, Handler<Long> handler) {
return    this.delegate.setPeriodic(delay, handler);
  }
  /**
   * Returns a periodic timer as a read stream. The timer will be fired every <code>delay</code> milliseconds after
   * the  has been called.
   * @param delay the delay in milliseconds, after which the timer will fire
   * @return the periodic stream
   */
  public TimeoutStream periodicStream(long delay) {
return    InternalHelper.safeCreate(this.delegate.periodicStream(delay), io.vertx.golo.core.TimeoutStream.class);
  }
  /**
   * Cancels the timer with the specified <code>id</code>.
   * @param id The id of the timer to cancel
   * @return true if the timer was successfully cancelled, or false if the timer does not exist.
   */
  public boolean cancelTimer(long id) {
return    this.delegate.cancelTimer(id);
  }
  /**
   * Puts the handler on the event queue for the current context so it will be run asynchronously ASAP after all
   * preceeding events have been handled.
   * @param action - a handler representing the action to execute
   */
  public void runOnContext(Handler<Void> action) {
    this.delegate.runOnContext(action);
  }
  /**
   * Stop the the Vertx instance and release any resources held by it.
   * <p>
   * The instance cannot be used after it has been closed.
   * <p>
   * The actual close is asynchronous and may not complete until after the call has returned.
   */
  public void close() {
    this.delegate.close();
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx#close} but the completionHandler will be called when the close is complete
   * @param completionHandler The handler will be notified when the close is complete.
   */
  public void close(Handler<AsyncResult<Void>> completionHandler) {
    this.delegate.close(completionHandler);
  }
  /**
   * Deploy a verticle instance given a name.
   * <p>
   * Given the name, Vert.x selects a  instance to use to instantiate the verticle.
   * <p>
   * For the rules on how factories are selected please consult the user manual.
   * @param name the name.
   */
  public void deployVerticle(String name) {
    this.delegate.deployVerticle(name);
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx#deployVerticle} but the completionHandler will be notified when the deployment is complete.
   * <p>
   * If the deployment is successful the result will contain a String representing the unique deployment ID of the
   * deployment.
   * <p>
   * This deployment ID can subsequently be used to undeploy the verticle.
   * @param name The identifier
   * @param completionHandler a handler which will be notified when the deployment is complete
   */
  public void deployVerticle(String name, Handler<AsyncResult<String>> completionHandler) {
    this.delegate.deployVerticle(name, completionHandler);
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx#deployVerticle} but <a href="../../../../../../cheatsheet/DeploymentOptions.html">DeploymentOptions</a> are provided to configure the
   * deployment.
   * @param name the name
   * @param options the deployment options. (see <a href="../../../../../../cheatsheet/DeploymentOptions.html">DeploymentOptions</a>)
   */
  public void deployVerticle(String name, Map<String, Object> options) {
    this.delegate.deployVerticle(name, options != null ? new io.vertx.core.DeploymentOptions(new io.vertx.core.json.JsonObject(options)) : null);
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx#deployVerticle} but <a href="../../../../../../cheatsheet/DeploymentOptions.html">DeploymentOptions</a> are provided to configure the
   * deployment.
   * @param name the name
   * @param options the deployment options. (see <a href="../../../../../../cheatsheet/DeploymentOptions.html">DeploymentOptions</a>)
   * @param completionHandler a handler which will be notified when the deployment is complete
   */
  public void deployVerticle(String name, Map<String, Object> options, Handler<AsyncResult<String>> completionHandler) {
    this.delegate.deployVerticle(name, options != null ? new io.vertx.core.DeploymentOptions(new io.vertx.core.json.JsonObject(options)) : null, completionHandler);
  }
  /**
   * Undeploy a verticle deployment.
   * <p>
   * The actual undeployment happens asynchronously and may not complete until after the method has returned.
   * @param deploymentID the deployment ID
   */
  public void undeploy(String deploymentID) {
    this.delegate.undeploy(deploymentID);
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx #undeploy(String)} but the completionHandler will be notified when the undeployment is complete.
   * @param deploymentID the deployment ID
   * @param completionHandler a handler which will be notified when the undeployment is complete
   */
  public void undeploy(String deploymentID, Handler<AsyncResult<Void>> completionHandler) {
    this.delegate.undeploy(deploymentID, completionHandler);
  }
  /**
   * Return a Set of deployment IDs for the currently deployed deploymentIDs.
   * @return Set of deployment IDs
   */
  public Set<String> deploymentIDs() {
return    this.delegate.deploymentIDs();
  }
  /**
   * Is this Vert.x instance clustered?
   * @return true if clustered
   */
  public boolean isClustered() {
return    this.delegate.isClustered();
  }
  /**
   * Safely execute some blocking code.
   * <p>
   * Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.
   * <p>
   * When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context
   * (e.g. on the original event loop of the caller).
   * <p>
   * A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,
   * the handler should call the {@link io.vertx.golo.core.Future#complete} or {@link io.vertx.golo.core.Future#complete} method, or the {@link io.vertx.golo.core.Future#fail}
   * method if it failed.
   * @param blockingCodeHandler handler representing the blocking code to run
   * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
   * @param resultHandler handler that will be called when the blocking code is complete
   */
  public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler, boolean ordered, Handler<AsyncResult<T>> resultHandler) {
    this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
      }
    }, ordered, new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Like {@link io.vertx.golo.core.Vertx#executeBlocking} called with ordered = true.
   * @param blockingCodeHandler 
   * @param resultHandler 
   */
  public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler, Handler<AsyncResult<T>> resultHandler) {
    this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
      }
    }, new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
}
