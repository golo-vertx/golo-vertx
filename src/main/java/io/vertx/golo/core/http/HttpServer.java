package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServer 
public class HttpServer implements Measured {
      private io.vertx.core.http.HttpServer delegate;
  public HttpServer(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServer) delegate;
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
//io.vertx.core.http.HttpServerRequestStream requestStream()
//io.vertx.core.http.HttpServerRequestStream
  /**
   * Return the request stream for the server. As HTTP requests are received by the server,
   * instances of {@link io.vertx.golo.core.http.HttpServerRequest} will be created and passed to the stream {@link io.vertx.golo.core.streams.ReadStream#handler}.
   * @return the request stream
   */
  public HttpServerRequestStream requestStream() {
return    InternalHelper.safeCreate(this.delegate.requestStream(), io.vertx.golo.core.http.HttpServerRequestStream.class);
  }
//io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)
//io.vertx.core.http.HttpServer
  /**
   * Set the request handler for the server to <code>requestHandler</code>. As HTTP requests are received by the server,
   * instances of {@link io.vertx.golo.core.http.HttpServerRequest} will be created and passed to this handler.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServer requestHandler(Handler<HttpServerRequest> handler) {
return    InternalHelper.safeCreate(this.delegate.requestHandler(new Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
      }
    }), io.vertx.golo.core.http.HttpServer.class);
  }
//io.vertx.core.http.ServerWebSocketStream websocketStream()
//io.vertx.core.http.ServerWebSocketStream
  /**
   * Return the websocket stream for the server. If a websocket connect handshake is successful a
   * new {@link io.vertx.golo.core.http.ServerWebSocket} instance will be created and passed to the stream {@link io.vertx.golo.core.streams.ReadStream#handler}.
   * @return the websocket stream
   */
  public ServerWebSocketStream websocketStream() {
return    InternalHelper.safeCreate(this.delegate.websocketStream(), io.vertx.golo.core.http.ServerWebSocketStream.class);
  }
//io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)
//io.vertx.core.http.HttpServer
  /**
   * Set the websocket handler for the server to <code>wsHandler</code>. If a websocket connect handshake is successful a
   * new {@link io.vertx.golo.core.http.ServerWebSocket} instance will be created and passed to the handler.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServer websocketHandler(Handler<ServerWebSocket> handler) {
return    InternalHelper.safeCreate(this.delegate.websocketHandler(new Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.handle(new io.vertx.golo.core.http.ServerWebSocket(event));
      }
    }), io.vertx.golo.core.http.HttpServer.class);
  }
//io.vertx.core.http.HttpServer listen()
//io.vertx.core.http.HttpServer
  /**
   * Tell the server to start listening. The server will listen on the port and host specified in the
   * <a href="../../../../../../../cheatsheet/HttpServerOptions.html">HttpServerOptions</a> that was used when creating the server.
   * <p>
   * The listen happens asynchronously and the server may not be listening until some time after the call has returned.
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServer listen() {
    this.delegate.listen();
    return this;
  }
//io.vertx.core.http.HttpServer listen(int port, java.lang.String host)
//io.vertx.core.http.HttpServer
  /**
   * Tell the server to start listening. The server will listen on the port and host specified here,
   * ignoring any value set in the <a href="../../../../../../../cheatsheet/HttpServerOptions.html">HttpServerOptions</a> that was used when creating the server.
   * <p>
   * The listen happens asynchronously and the server may not be listening until some time after the call has returned.
   * @param port the port to listen on
   * @param host the host to listen on
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServer listenPortHost(int port, String host) {
    this.delegate.listen(port, host);
    return this;
  }
//io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)
//io.vertx.core.http.HttpServer
  /**
   * Like {@link io.vertx.golo.core.http.HttpServer#listen} but supplying a handler that will be called when the server is actually
   * listening (or has failed).
   * @param port the port to listen on
   * @param host the host to listen on
   * @param listenHandler the listen handler
   * @return 
   */
  public HttpServer listen(int port, String host, Handler<AsyncResult<HttpServer>> listenHandler) {
    this.delegate.listen(port, host, new Handler<AsyncResult<io.vertx.core.http.HttpServer>>() {
      public void handle(AsyncResult<io.vertx.core.http.HttpServer> event) {
        AsyncResult<HttpServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<HttpServer>result(new HttpServer(event.result()));
        } else {
          f = InternalHelper.<HttpServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.http.HttpServer listen(int port)
//io.vertx.core.http.HttpServer
  /**
   * Like {@link io.vertx.golo.core.http.HttpServer#listen} but the server will listen on host "0.0.0.0" and port specified here ignoring
   * any value in the <a href="../../../../../../../cheatsheet/HttpServerOptions.html">HttpServerOptions</a> that was used when creating the server.
   * @param port the port to listen on
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServer listenPort(int port) {
    this.delegate.listen(port);
    return this;
  }
//io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)
//io.vertx.core.http.HttpServer
  /**
   * Like {@link io.vertx.golo.core.http.HttpServer#listen} but supplying a handler that will be called when the server is actually listening (or has failed).
   * @param port the port to listen on
   * @param listenHandler the listen handler
   * @return 
   */
  public HttpServer listenPortListenHandler(int port, Handler<AsyncResult<HttpServer>> listenHandler) {
    this.delegate.listen(port, new Handler<AsyncResult<io.vertx.core.http.HttpServer>>() {
      public void handle(AsyncResult<io.vertx.core.http.HttpServer> event) {
        AsyncResult<HttpServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<HttpServer>result(new HttpServer(event.result()));
        } else {
          f = InternalHelper.<HttpServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)
//io.vertx.core.http.HttpServer
  /**
   * Like {@link io.vertx.golo.core.http.HttpServer#listen} but supplying a handler that will be called when the server is actually listening (or has failed).
   * @param listenHandler the listen handler
   * @return 
   */
  public HttpServer listenListenHandler(Handler<AsyncResult<HttpServer>> listenHandler) {
    this.delegate.listen(new Handler<AsyncResult<io.vertx.core.http.HttpServer>>() {
      public void handle(AsyncResult<io.vertx.core.http.HttpServer> event) {
        AsyncResult<HttpServer> f;
        if (event.succeeded()) {
          f = InternalHelper.<HttpServer>result(new HttpServer(event.result()));
        } else {
          f = InternalHelper.<HttpServer>failure(event.cause());
        }
        listenHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//void close()
//void
  /**
   * Close the server. Any open HTTP connections will be closed.
   * <p>
   * The close happens asynchronously and the server may not be closed until some time after the call has returned.
   */
  public void close() {
    this.delegate.close();
  }
//void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)
//void
  /**
   * Like {@link io.vertx.golo.core.http.HttpServer#close} but supplying a handler that will be called when the server is actually closed (or has failed).
   * @param completionHandler the handler
   */
  public void close(Handler<AsyncResult<Void>> completionHandler) {
    this.delegate.close(completionHandler);
  }
}
