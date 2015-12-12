package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 754570361=-249930978, 446748000=629065431, -1145041440=-220545681, -1382887374=-752169602, -1129215741=1319107943, 592788598=1096423843, 509369306=1329436355, 155804053=1539714062, -380062732=304489119, -395056705=1400805647} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.http.WebSocketBase 
public interface WebSocketBase extends ReadStream<Buffer>,  WriteStream<Buffer> {
public Object getDelegate();
  boolean writeQueueFull();
  WebSocketBase exceptionHandler(Handler<Throwable> handler);
  WebSocketBase handler(Handler<Buffer> handler);
  WebSocketBase pause();
  WebSocketBase resume();
  WebSocketBase endHandler(Handler<Void> endHandler);
  WebSocketBase write(Buffer data);
  WebSocketBase setWriteQueueMaxSize(int maxSize);
  WebSocketBase drainHandler(Handler<Void> handler);
  String binaryHandlerID();
  String textHandlerID();
  WebSocketBase writeFrame(WebSocketFrame frame);
  WebSocketBase writeFinalTextFrame(String text);
  WebSocketBase writeFinalBinaryFrame(Buffer data);
  WebSocketBase writeBinaryMessage(Buffer data);
  WebSocketBase closeHandler(Handler<Void> handler);
  WebSocketBase frameHandler(Handler<WebSocketFrame> handler);
  void close();
  SocketAddress remoteAddress();
  SocketAddress localAddress();
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class WebSocketBaseImpl implements WebSocketBase {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 754570361=-249930978, 446748000=629065431, -1145041440=-220545681, -1382887374=-752169602, -1129215741=1319107943, 592788598=1096423843, 509369306=1329436355, 155804053=1539714062, -380062732=304489119, -395056705=1400805647}
  private io.vertx.core.http.WebSocketBase delegate;
  public WebSocketBaseImpl(Object delegate) {
    this.delegate = (io.vertx.core.http.WebSocketBase) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.WebSocketBase#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.http.WebSocketBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocketBase handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.WebSocketBase pause()
//io.vertx.core.http.WebSocketBase
  public WebSocketBase pause() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.WebSocketBase resume()
//io.vertx.core.http.WebSocketBase
  public WebSocketBase resume() {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.WebSocketBase endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.WebSocketBase write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase write(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocketBase setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.WebSocketBase drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocketBase
  public WebSocketBase drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).drainHandler(handler);
    return this;
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
//io.vertx.core.http.WebSocketBase writeFrame(io.vertx.core.http.WebSocketFrame frame)
//io.vertx.core.http.WebSocketBase
  /**
   * Write a WebSocket frame to the connection
   * @param frame the frame to write
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase writeFrame(WebSocketFrame frame) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocketBase writeFinalTextFrame(java.lang.String text)
//io.vertx.core.http.WebSocketBase
  /**
   * Write a final WebSocket text frame to the connection
   * @param text The text to write
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase writeFinalTextFrame(String text) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).writeFinalTextFrame(text);
    return this;
  }
//io.vertx.core.http.WebSocketBase writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocketBase
  /**
   * Write a final WebSocket binary frame to the connection
   * @param data The data to write
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase writeFinalBinaryFrame(Buffer data) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocketBase writeBinaryMessage(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocketBase
  /**
   * Writes a (potentially large) piece of binary data to the connection. This data might be written as multiple frames
   * if it exceeds the maximum WebSocket frame size.
   * @param data the data to write
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase writeBinaryMessage(Buffer data) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocketBase closeHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocketBase
  /**
   * Set a close handler. This will be called when the WebSocket is closed.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase closeHandler(Handler<Void> handler) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).closeHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocketBase frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)
//io.vertx.core.http.WebSocketBase
  /**
   * Set a frame handler on the connection. This handler will be called when frames are read on the connection.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketBase frameHandler(Handler<WebSocketFrame> handler) {
    ((io.vertx.core.http.WebSocketBase) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
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
}
