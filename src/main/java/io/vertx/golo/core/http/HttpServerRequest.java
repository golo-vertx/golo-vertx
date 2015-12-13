package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.MultiMap;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
import io.vertx.golo.core.net.NetSocket;
// Type: io.vertx.core.http.HttpServerRequest 
public class HttpServerRequest implements ReadStream<Buffer> {
      private io.vertx.core.http.HttpServerRequest delegate;
  public HttpServerRequest(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerRequest) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.HttpServerRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpServerRequest
  public HttpServerRequest exceptionHandlerHandler<Throwable>(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerRequest) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerRequest handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.HttpServerRequest
  public HttpServerRequest handlerHandler<Buffer>(Handler<Buffer> handler) {
    (  (io.vertx.core.http.HttpServerRequest) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpServerRequest pause()
//io.vertx.core.http.HttpServerRequest
  public HttpServerRequest pause() {
    (  (io.vertx.core.http.HttpServerRequest) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.HttpServerRequest resume()
//io.vertx.core.http.HttpServerRequest
  public HttpServerRequest resume() {
    (  (io.vertx.core.http.HttpServerRequest) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.HttpServerRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.HttpServerRequest
  public HttpServerRequest endHandlerHandler<Void>(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpServerRequest) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.HttpVersion version()
//io.vertx.core.http.HttpVersion
  /**
   * @return the HTTP version of the request
   * @return 
   */
  public HttpVersion version() {
return    this.delegate.version();
  }
//io.vertx.core.http.HttpMethod method()
//io.vertx.core.http.HttpMethod
  /**
   * @return the HTTP method for the request.
   * @return 
   */
  public HttpMethod method() {
return    this.delegate.method();
  }
//java.lang.String uri()
//java.lang.String
  /**
   * @return the URI of the request. This is usually a relative URI
   * @return 
   */
  public String uri() {
return    this.delegate.uri();
  }
//java.lang.String path()
//java.lang.String
  /**
   * @return The path part of the uri. For example /somepath/somemorepath/someresource.foo
   * @return 
   */
  public String path() {
return    this.delegate.path();
  }
//java.lang.String query()
//java.lang.String
  /**
   * @return the query part of the uri. For example someparam=32&amp;someotherparam=x
   * @return 
   */
  public String query() {
return    this.delegate.query();
  }
//io.vertx.core.http.HttpServerResponse response()
//io.vertx.core.http.HttpServerResponse
  /**
   * @return the response. Each instance of this class has an {@link io.vertx.golo.core.http.HttpServerResponse} instance attached to it. This is used
   * to send the response back to the client.
   * @return 
   */
  public HttpServerResponse response() {
return    InternalHelper.safeCreate(this.delegate.response(), io.vertx.golo.core.http.HttpServerResponse.class);
  }
//io.vertx.core.MultiMap headers()
//io.vertx.core.MultiMap
  /**
   * @return the headers in the request.
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
//java.lang.String getHeader(java.lang.String headerName)
//java.lang.String
  /**
   * Return the first header value with the specified name
   * @param headerName the header name
   * @return the header value
   */
  public String getHeaderString(String headerName) {
return    this.delegate.getHeader(headerName);
  }
//io.vertx.core.MultiMap params()
//io.vertx.core.MultiMap
  /**
   * @return the query parameters in the request
   * @return 
   */
  public MultiMap params() {
return    InternalHelper.safeCreate(this.delegate.params(), io.vertx.golo.core.MultiMap.class);
  }
//java.lang.String getParam(java.lang.String paramName)
//java.lang.String
  /**
   * Return the first param value with the specified name
   * @param paramName the param name
   * @return the param value
   */
  public String getParamString(String paramName) {
return    this.delegate.getParam(paramName);
  }
//io.vertx.core.net.SocketAddress remoteAddress()
//io.vertx.core.net.SocketAddress
  /**
   * @return the remote (client side) address of the request
   * @return 
   */
  public SocketAddress remoteAddress() {
return    InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
//io.vertx.core.net.SocketAddress localAddress()
//io.vertx.core.net.SocketAddress
  /**
   * @return the local (server side) address of the server that handles the request
   * @return 
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
//java.lang.String absoluteURI()
//java.lang.String
  /**
   * @return the absolute URI corresponding to the the HTTP request
   * @return 
   */
  public String absoluteURI() {
return    this.delegate.absoluteURI();
  }
//io.vertx.core.http.HttpServerRequest bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)
//io.vertx.core.http.HttpServerRequest
  /**
   * Convenience method for receiving the entire request body in one piece.
   * <p>
   * This saves the user having to manually setting a data and end handler and append the chunks of the body until
   * the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.
   * @param bodyHandler This handler will be called after all the body has been received
   * @return 
   */
  public HttpServerRequest bodyHandlerHandler<Buffer>(Handler<Buffer> bodyHandler) {
    this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.net.NetSocket netSocket()
//io.vertx.core.net.NetSocket
  /**
   * Get a net socket for the underlying connection of this request.
   * <p>
   * USE THIS WITH CAUTION!
   * <p>
   * Once you have called this method, you must handle writing to the connection yourself using the net socket,
   * the server request instance will no longer be usable as normal.
   * Writing to the socket directly if you don't know what you're doing can easily break the HTTP protocol.
   * @return the net socket
   */
  public NetSocket netSocket() {
return    InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class);
  }
//io.vertx.core.http.HttpServerRequest setExpectMultipart(boolean expect)
//io.vertx.core.http.HttpServerRequest
  /**
   * Call this with true if you are expecting a multi-part body to be submitted in the request.
   * This must be called before the body of the request has been received
   * @param expect true - if you are expecting a multi-part body
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerRequest setExpectMultipartBoolean(boolean expect) {
    this.delegate.setExpectMultipart(expect);
    return this;
  }
//boolean isExpectMultipart()
//boolean
  /**
   * @return  true if we are expecting a multi-part body for this request. See {@link io.vertx.golo.core.http.HttpServerRequest#setExpectMultipart}.
   * @return 
   */
  public boolean isExpectMultipart() {
return    this.delegate.isExpectMultipart();
  }
//io.vertx.core.http.HttpServerRequest uploadHandler(io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> uploadHandler)
//io.vertx.core.http.HttpServerRequest
  /**
   * Set an upload handler. The handler will get notified once a new file upload was received to allow you to deal
   * with the file upload.
   * @param uploadHandler 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerRequest uploadHandlerHandler<HttpServerFileUpload>(Handler<HttpServerFileUpload> uploadHandler) {
    this.delegate.uploadHandler(new Handler<io.vertx.core.http.HttpServerFileUpload>() {
      public void handle(io.vertx.core.http.HttpServerFileUpload event) {
        uploadHandler.handle(new io.vertx.golo.core.http.HttpServerFileUpload(event));
      }
    });
    return this;
  }
//io.vertx.core.MultiMap formAttributes()
//io.vertx.core.MultiMap
  /**
   * Returns a map of all form attributes in the request.
   * <p>
   * Be aware that the attributes will only be available after the whole body has been received, i.e. after
   * the request end handler has been called.
   * <p>
   * {@link io.vertx.golo.core.http.HttpServerRequest#setExpectMultipart} must be called first before trying to get the form attributes.
   * @return the form attributes
   */
  public MultiMap formAttributes() {
return    InternalHelper.safeCreate(this.delegate.formAttributes(), io.vertx.golo.core.MultiMap.class);
  }
//java.lang.String getFormAttribute(java.lang.String attributeName)
//java.lang.String
  /**
   * Return the first form attribute value with the specified name
   * @param attributeName the attribute name
   * @return the attribute value
   */
  public String getFormAttributeString(String attributeName) {
return    this.delegate.getFormAttribute(attributeName);
  }
//io.vertx.core.http.ServerWebSocket upgrade()
//io.vertx.core.http.ServerWebSocket
  /**
   * Upgrade the connection to a WebSocket connection.
   * <p>
   * This is an alternative way of handling WebSockets and can only be used if no websocket handlers are set on the
   * Http server, and can only be used during the upgrade request during the WebSocket handshake.
   * @return the WebSocket
   */
  public ServerWebSocket upgrade() {
return    InternalHelper.safeCreate(this.delegate.upgrade(), io.vertx.golo.core.http.ServerWebSocket.class);
  }
//boolean isEnded()
//boolean
  /**
   * Has the request ended? I.e. has the entire request, including the body been read?
   * @return true if ended
   */
  public boolean isEnded() {
return    this.delegate.isEnded();
  }
}
