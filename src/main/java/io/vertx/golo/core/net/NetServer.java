package io.vertx.golo.core.net;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, -573676835=-1885305426, -1088286018=-1511197371} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetServer 
public class NetServer implements Measured {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, -573676835=-1885305426, -1088286018=-1511197371}
  private io.vertx.core.net.NetServer delegate;
  public NetServer(Object delegate) {
    this.delegate = (io.vertx.core.net.NetServer) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
//io.vertx.core.net.NetSocketStream connectStream()
//io.vertx.core.net.NetSocketStream
  /**
   * Return the connect stream for this server. The server can only have at most one handler at any one time.
   * As the server accepts TCP or SSL connections it creates an instance of {@link io.vertx.golo.core.net.NetSocket} and passes it to the
   * connect stream .
   * @return the connect stream
   */
  public NetSocketStream connectStream() {
return    InternalHelper.safeCreate(this.delegate.connectStream(), io.vertx.golo.core.net.NetSocketStream.class);
  }
//io.vertx.core.net.NetServer connectHandler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)
//io.vertx.core.net.NetServer
  /**
   * Supply a connect handler for this server. The server can only have at most one connect handler at any one time.
   * As the server accepts TCP or SSL connections it creates an instance of {@link io.vertx.golo.core.net.NetSocket} and passes it to the
   * connect handler.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer connectHandler(Handler<NetSocket> handler) {
return    InternalHelper.safeCreate(this.delegate.connectHandler(new Handler<io.vertx.core.net.NetSocket>() {
      public void handle(io.vertx.core.net.NetSocket event) {
        handler.handle(new io.vertx.golo.core.net.NetSocket(event));
      }
    }), io.vertx.golo.core.net.NetServer.class);
  }
//io.vertx.core.net.NetServer listen()
//io.vertx.core.net.NetServer
  /**
   * Start listening on the port and host as configured in the <a href="../../../../../../../cheatsheet/NetServerOptions.html">NetServerOptions</a> used when
   * creating the server.
   * <p>
   * The server may not be listening until some time after the call to listen has returned.
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen() {
    this.delegate.listen();
    return this;
  }
//io.vertx.core.net.NetServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler)
//io.vertx.core.net.NetServer
  /**
   * Like {@link io.vertx.golo.core.net.NetServer#listen} but providing a handler that will be notified when the server is listening, or fails.
   * @param listenHandler handler that will be notified when listening or failed
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen(Handler<AsyncResult<NetServer>> listenHandler) {
    this.delegate.listen(new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
      public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
        AsyncResult<NetServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<NetServer>result(new NetServer(event.result()));
        } else {
          f = InternalHelper.<NetServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.net.NetServer listen(int port, java.lang.String host)
//io.vertx.core.net.NetServer
  /**
   * Start listening on the specified port and host, ignoring post and host configured in the <a href="../../../../../../../cheatsheet/NetServerOptions.html">NetServerOptions</a> used when
   * creating the server.
   * <p>
   * Port <code>0</code> can be specified meaning "choose an random port".
   * <p>
   * Host <code>0.0.0.0</code> can be specified meaning "listen on all available interfaces".
   * <p>
   * The server may not be listening until some time after the call to listen has returned.
   * @param port 
   * @param host 
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen(int port, String host) {
    this.delegate.listen(port, host);
    return this;
  }
//io.vertx.core.net.NetServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler)
//io.vertx.core.net.NetServer
  /**
   * Like {@link io.vertx.golo.core.net.NetServer#listen} but providing a handler that will be notified when the server is listening, or fails.
   * @param port the port to listen on
   * @param host the host to listen on
   * @param listenHandler handler that will be notified when listening or failed
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen(int port, String host, Handler<AsyncResult<NetServer>> listenHandler) {
    this.delegate.listen(port, host, new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
      public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
        AsyncResult<NetServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<NetServer>result(new NetServer(event.result()));
        } else {
          f = InternalHelper.<NetServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.net.NetServer listen(int port)
//io.vertx.core.net.NetServer
  /**
   * Start listening on the specified port and host "0.0.0.0", ignoring post and host configured in the
   * <a href="../../../../../../../cheatsheet/NetServerOptions.html">NetServerOptions</a> used when creating the server.
   * <p>
   * Port <code>0</code> can be specified meaning "choose an random port".
   * <p>
   * The server may not be listening until some time after the call to listen has returned.
   * @param port 
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen(int port) {
    this.delegate.listen(port);
    return this;
  }
//io.vertx.core.net.NetServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> listenHandler)
//io.vertx.core.net.NetServer
  /**
   * Like {@link io.vertx.golo.core.net.NetServer#listen} but providing a handler that will be notified when the server is listening, or fails.
   * @param port the port to listen on
   * @param listenHandler handler that will be notified when listening or failed
   * @return a reference to this, so the API can be used fluently
   */
  public NetServer listen(int port, Handler<AsyncResult<NetServer>> listenHandler) {
    this.delegate.listen(port, new Handler<AsyncResult<io.vertx.core.net.NetServer>>() {
      public void handle(AsyncResult<io.vertx.core.net.NetServer> event) {
        AsyncResult<NetServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<NetServer>result(new NetServer(event.result()));
        } else {
          f = InternalHelper.<NetServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//void close()
//void
  /**
   * Close the server. This will close any currently open connections. The close may not complete until after this
   * method has returned.
   */
  public void close() {
    this.delegate.close();
  }
//void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)
//void
  /**
   * Like {@link io.vertx.golo.core.net.NetServer#close} but supplying a handler that will be notified when close is complete.
   * @param completionHandler the handler
   */
  public void close(Handler<AsyncResult<Void>> completionHandler) {
    this.delegate.close(completionHandler);
  }
//int actualPort()
//int
  /**
   * The actual port the server is listening on. This is useful if you bound the server specifying 0 as port number
   * signifying an ephemeral port
   * @return the actual port the server is listening on.
   */
  public int actualPort() {
return    this.delegate.actualPort();
  }
}
