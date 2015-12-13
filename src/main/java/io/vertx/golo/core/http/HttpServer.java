package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpServer=13} 
//[Debug] arr = [boolean isMetricsEnabled(), io.vertx.core.http.HttpServerRequestStream requestStream(), io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler), io.vertx.core.http.ServerWebSocketStream websocketStream(), io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler), io.vertx.core.http.HttpServer listen(), io.vertx.core.http.HttpServer listen(int port, java.lang.String host), io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(int port), io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=3, 789239674=1459547637, -2000549778=1536176041, -943094268=-559228579} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.HttpServer 
public class HttpServer implements Measured {
//[Debug] toChangeName = {io.vertx.core.http.HttpServerRequestStream requestStream()=false, io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=true, void close()=false, io.vertx.core.http.HttpServer listen(int port)=true, io.vertx.core.http.HttpServer listen()=false, io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=true, io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=false, io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=false, boolean isMetricsEnabled()=false, io.vertx.core.http.HttpServer listen(int port, java.lang.String host)=true, io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=false, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)=false, io.vertx.core.http.ServerWebSocketStream websocketStream()=false}
//[Debug] dbgMethodName = {io.vertx.core.http.HttpServerRequestStream requestStream()=requestStream, io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=listen, void close()=close, io.vertx.core.http.HttpServer listen(int port)=listen, io.vertx.core.http.HttpServer listen()=listen, io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=listen, io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=requestHandler, io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=websocketHandler, boolean isMetricsEnabled()=isMetricsEnabled, io.vertx.core.http.HttpServer listen(int port, java.lang.String host)=listen, io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=listen, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)=close, io.vertx.core.http.ServerWebSocketStream websocketStream()=websocketStream} 
//[Debug] dbgMethodParams = {io.vertx.core.http.HttpServerRequestStream requestStream()=0, io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=1, void close()=0, io.vertx.core.http.HttpServer listen(int port)=1, io.vertx.core.http.HttpServer listen()=0, io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=2, io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=1, io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=1, boolean isMetricsEnabled()=0, io.vertx.core.http.HttpServer listen(int port, java.lang.String host)=2, io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=3, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)=1, io.vertx.core.http.ServerWebSocketStream websocketStream()=0} 
//[INFO]  methods=[boolean isMetricsEnabled(), io.vertx.core.http.HttpServerRequestStream requestStream(), io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler), io.vertx.core.http.ServerWebSocketStream websocketStream(), io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler), io.vertx.core.http.HttpServer listen(), io.vertx.core.http.HttpServer listen(int port, java.lang.String host), io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(int port), io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler), void close(), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)] 
//[INFO]  defaultDataObjectMap={void close()=false, io.vertx.core.http.HttpServer requestHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=false, io.vertx.core.http.HttpServer listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=false, io.vertx.core.http.HttpServer listen(int port, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=false, io.vertx.core.http.HttpServer websocketHandler(io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> handler)=false, io.vertx.core.http.HttpServerRequestStream requestStream()=false, io.vertx.core.http.HttpServer listen(int port, java.lang.String host)=false, io.vertx.core.http.HttpServer listen(int port)=false, io.vertx.core.http.ServerWebSocketStream websocketStream()=false, io.vertx.core.http.HttpServer listen(io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> listenHandler)=false, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)=false, boolean isMetricsEnabled()=false, io.vertx.core.http.HttpServer listen()=false} 
//[INFO] ifaceSimpleName=HttpServer
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=3, 789239674=1459547637, -2000549778=1536176041, -943094268=-559228579}
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
  public HttpServer listen(int port, String host) {
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
  public HttpServer listen(int port) {
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
  public HttpServer listen(int port, Handler<AsyncResult<HttpServer>> listenHandler) {
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
  public HttpServer listen(Handler<AsyncResult<HttpServer>> listenHandler) {
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
