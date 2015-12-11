package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.http.WebSocket 
public class WebSocket implements WebSocketBase {
      private io.vertx.core.http.WebSocket delegate;
  public WebSocket(Object delegate) {
    this.delegate = (io.vertx.core.http.WebSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.WebSocket#setWriteQueueMaxSize}
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
  public WebSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).exceptionHandler(handler);
    return this;
  }
  public WebSocket handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
  public WebSocket pause() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).pause();
    return this;
  }
  public WebSocket resume() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).resume();
    return this;
  }
  public WebSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).endHandler(endHandler);
    return this;
  }
  public WebSocket write(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public WebSocket setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public WebSocket drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).drainHandler(handler);
    return this;
  }
  public WebSocket writeFrame(WebSocketFrame frame) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
  public WebSocket writeFinalTextFrame(String text) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalTextFrame(text);
    return this;
  }
  public WebSocket writeFinalBinaryFrame(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public WebSocket writeBinaryMessage(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public WebSocket closeHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).closeHandler(handler);
    return this;
  }
  public WebSocket frameHandler(Handler<WebSocketFrame> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
  }
}
