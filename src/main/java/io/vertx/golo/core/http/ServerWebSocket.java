package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.http.ServerWebSocket 
public class ServerWebSocket implements WebSocketBase {
      private io.vertx.core.http.ServerWebSocket delegate;
  public ServerWebSocket(Object delegate) {
    this.delegate = (io.vertx.core.http.ServerWebSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.ServerWebSocket#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
  /**
   * When a <code>Websocket</code> is created it automatically registers an event handler with the event bus - the ID of that
   * handler is given by this method.
   * <p>
   * Given this ID, a different event loop can send a binary frame to that event handler using the event bus and
   * that buffer will be received by this instance in its own event loop and written to the underlying connection. This
   * allows you to write data to other WebSockets which are owned by different event loops.
   * @return the binary handler id
   */
  public String binaryHandlerID() {
return    ((io.vertx.core.http.WebSocketBase) this.delegate).binaryHandlerID();
  }
  /**
   * When a <code>Websocket</code> is created it automatically registers an event handler with the eventbus, the ID of that
   * handler is given by <code>textHandlerID</code>.
   * <p>
   * Given this ID, a different event loop can send a text frame to that event handler using the event bus and
   * that buffer will be received by this instance in its own event loop and written to the underlying connection. This
   * allows you to write data to other WebSockets which are owned by different event loops.
   * @return 
   */
  public String textHandlerID() {
return    ((io.vertx.core.http.WebSocketBase) this.delegate).textHandlerID();
  }
  /**
   * Close the WebSocket.
   */
  public void close() {
    ((io.vertx.core.http.WebSocketBase) this.delegate).close();
  }
  /**
   * @return the remote address for this socket
   * @return 
   */
  public SocketAddress remoteAddress() {
return    InternalHelper.safeCreate(((io.vertx.core.http.WebSocketBase) this.delegate).remoteAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
  /**
   * @return the local address for this socket
   * @return 
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(((io.vertx.core.http.WebSocketBase) this.delegate).localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
  public ServerWebSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).exceptionHandler(handler);
    return this;
  }
  public ServerWebSocket handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
  public ServerWebSocket pause() {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).pause();
    return this;
  }
  public ServerWebSocket resume() {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).resume();
    return this;
  }
  public ServerWebSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).endHandler(endHandler);
    return this;
  }
  public ServerWebSocket write(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public ServerWebSocket setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public ServerWebSocket drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).drainHandler(handler);
    return this;
  }
  public ServerWebSocket writeFrame(WebSocketFrame frame) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
  public ServerWebSocket writeFinalTextFrame(String text) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFinalTextFrame(text);
    return this;
  }
  public ServerWebSocket writeFinalBinaryFrame(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public ServerWebSocket writeBinaryMessage(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public ServerWebSocket closeHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).closeHandler(handler);
    return this;
  }
  public ServerWebSocket frameHandler(Handler<WebSocketFrame> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
  }
  public String uri() {
return    this.delegate.uri();
  }
  /**
   * @return the WebSocket handshake path.
   * @return 
   */
  public String path() {
return    this.delegate.path();
  }
  /**
   * @return the WebSocket handshake query string.
   * @return 
   */
  public String query() {
return    this.delegate.query();
  }
  /**
   * @return the headers in the WebSocket handshake
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
  /**
   * Reject the WebSocket.
   * <p>
   * Calling this method from the websocket handler when it is first passed to you gives you the opportunity to reject
   * the websocket, which will cause the websocket handshake to fail by returning
   * a 404 response code.
   * <p>
   * You might use this method, if for example you only want to accept WebSockets with a particular path.
   */
  public void reject() {
    this.delegate.reject();
  }
}
