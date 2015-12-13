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
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.WebSocket#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//java.lang.String binaryHandlerID()
//java.lang.String
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
//java.lang.String textHandlerID()
//java.lang.String
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
//void close()
//void
  /**
   * Close the WebSocket.
   */
  public void close() {
    ((io.vertx.core.http.WebSocketBase) this.delegate).close();
  }
//io.vertx.core.net.SocketAddress remoteAddress()
//io.vertx.core.net.SocketAddress
  /**
   * @return the remote address for this socket
   * @return 
   */
  public SocketAddress remoteAddress() {
return    InternalHelper.safeCreate(((io.vertx.core.http.WebSocketBase) this.delegate).remoteAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
//io.vertx.core.net.SocketAddress localAddress()
//io.vertx.core.net.SocketAddress
  /**
   * @return the local address for this socket
   * @return 
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(((io.vertx.core.http.WebSocketBase) this.delegate).localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
//io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.WebSocket
  public WebSocket exceptionHandlerHandler<Throwable>(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.WebSocket
  public WebSocket handlerHandler<Buffer>(Handler<Buffer> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.WebSocket pause()
//io.vertx.core.http.WebSocket
  public WebSocket pause() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.WebSocket resume()
//io.vertx.core.http.WebSocket
  public WebSocket resume() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.WebSocket
  public WebSocket endHandlerHandler<Void>(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket writeBuffer(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.WebSocket
  public WebSocket setWriteQueueMaxSizeInt(int maxSize) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocket
  public WebSocket drainHandlerHandler<Void>(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)
//io.vertx.core.http.WebSocket
  public WebSocket writeFrameWebSocketFrame(WebSocketFrame frame) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)
//io.vertx.core.http.WebSocket
  public WebSocket writeFinalTextFrameString(String text) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalTextFrame(text);
    return this;
  }
//io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket writeFinalBinaryFrameBuffer(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket writeBinaryMessageBuffer(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocket
  public WebSocket closeHandlerHandler<Void>(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).closeHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)
//io.vertx.core.http.WebSocket
  public WebSocket frameHandlerHandler<WebSocketFrame>(Handler<WebSocketFrame> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
  }
}
