package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.ServerWebSocket=25} 
//[Debug] arr = [boolean writeQueueFull(), java.lang.String binaryHandlerID(), java.lang.String textHandlerID(), void close(), io.vertx.core.net.SocketAddress remoteAddress(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.ServerWebSocket pause(), io.vertx.core.http.ServerWebSocket resume(), io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize), io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame), io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text), io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler), java.lang.String uri(), java.lang.String path(), java.lang.String query(), io.vertx.core.MultiMap headers(), void reject()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, -509451216=-273829318, 532011200=1767259305, -1787574459=-1008548613, 46165575=1322752322, -92408054=1300899638, 2063155521=467670257, 332524872=-1882066994, 310885629=-2077534096, 1108632971=-1978885553} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.http.ServerWebSocket 
public class ServerWebSocket implements WebSocketBase {
//[Debug] toChangeName = {io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text)=false, io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize)=false, java.lang.String uri()=false, java.lang.String query()=false, io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=false, io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=false, boolean writeQueueFull()=false, void close()=false, io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, void reject()=false, io.vertx.core.net.SocketAddress remoteAddress()=false, io.vertx.core.net.SocketAddress localAddress()=false, java.lang.String path()=false, io.vertx.core.http.ServerWebSocket resume()=false, io.vertx.core.http.ServerWebSocket pause()=false, io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.MultiMap headers()=false, java.lang.String binaryHandlerID()=false, io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=false, java.lang.String textHandlerID()=false}
//[Debug] dbgMethodName = {io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=closeHandler, io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text)=writeFinalTextFrame, io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=writeBinaryMessage, io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=handler, io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, java.lang.String uri()=uri, java.lang.String query()=query, io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=writeFrame, io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=frameHandler, boolean writeQueueFull()=writeQueueFull, void close()=close, io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, void reject()=reject, io.vertx.core.net.SocketAddress remoteAddress()=remoteAddress, io.vertx.core.net.SocketAddress localAddress()=localAddress, java.lang.String path()=path, io.vertx.core.http.ServerWebSocket resume()=resume, io.vertx.core.http.ServerWebSocket pause()=pause, io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data)=write, io.vertx.core.MultiMap headers()=headers, java.lang.String binaryHandlerID()=binaryHandlerID, io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=writeFinalBinaryFrame, java.lang.String textHandlerID()=textHandlerID} 
//[Debug] dbgMethodParams = {io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text)=1, io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=1, io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize)=1, java.lang.String uri()=0, java.lang.String query()=0, io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=1, io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=1, boolean writeQueueFull()=0, void close()=0, io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, void reject()=0, io.vertx.core.net.SocketAddress remoteAddress()=0, io.vertx.core.net.SocketAddress localAddress()=0, java.lang.String path()=0, io.vertx.core.http.ServerWebSocket resume()=0, io.vertx.core.http.ServerWebSocket pause()=0, io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.MultiMap headers()=0, java.lang.String binaryHandlerID()=0, io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=1, java.lang.String textHandlerID()=0} 
//[INFO]  methods=[boolean writeQueueFull(), java.lang.String binaryHandlerID(), java.lang.String textHandlerID(), void close(), io.vertx.core.net.SocketAddress remoteAddress(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.ServerWebSocket pause(), io.vertx.core.http.ServerWebSocket resume(), io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize), io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame), io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text), io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data), io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler), java.lang.String uri(), java.lang.String path(), java.lang.String query(), io.vertx.core.MultiMap headers(), void reject()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text)=false, java.lang.String uri()=false, io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.net.SocketAddress remoteAddress()=false, io.vertx.core.net.SocketAddress localAddress()=false, io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, java.lang.String binaryHandlerID()=false, io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, java.lang.String path()=false, io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize)=false, java.lang.String textHandlerID()=false, boolean writeQueueFull()=false, io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=false, void close()=false, io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.ServerWebSocket pause()=false, io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=false, java.lang.String query()=false, io.vertx.core.http.ServerWebSocket resume()=false, void reject()=false, io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=false, io.vertx.core.MultiMap headers()=false} 
//[INFO] ifaceSimpleName=ServerWebSocket
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, -509451216=-273829318, 532011200=1767259305, -1787574459=-1008548613, 46165575=1322752322, -92408054=1300899638, 2063155521=467670257, 332524872=-1882066994, 310885629=-2077534096, 1108632971=-1978885553}
  private io.vertx.core.http.ServerWebSocket delegate;
  public ServerWebSocket(Object delegate) {
    this.delegate = (io.vertx.core.http.ServerWebSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.ServerWebSocket#setWriteQueueMaxSize}
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
//io.vertx.core.http.ServerWebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.ServerWebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.ServerWebSocket pause()
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket pause() {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.ServerWebSocket resume()
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket resume() {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.ServerWebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.ServerWebSocket write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket write(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.ServerWebSocket setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.ServerWebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.http.ServerWebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket writeFrame(WebSocketFrame frame) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
//io.vertx.core.http.ServerWebSocket writeFinalTextFrame(java.lang.String text)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket writeFinalTextFrame(String text) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFinalTextFrame(text);
    return this;
  }
//io.vertx.core.http.ServerWebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket writeFinalBinaryFrame(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.ServerWebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket writeBinaryMessage(Buffer data) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.ServerWebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket closeHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).closeHandler(handler);
    return this;
  }
//io.vertx.core.http.ServerWebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)
//io.vertx.core.http.ServerWebSocket
  public ServerWebSocket frameHandler(Handler<WebSocketFrame> handler) {
    (  (io.vertx.core.http.ServerWebSocket) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
  }
//java.lang.String uri()
//java.lang.String
  public String uri() {
return    this.delegate.uri();
  }
//java.lang.String path()
//java.lang.String
  /**
   * @return the WebSocket handshake path.
   * @return 
   */
  public String path() {
return    this.delegate.path();
  }
//java.lang.String query()
//java.lang.String
  /**
   * @return the WebSocket handshake query string.
   * @return 
   */
  public String query() {
return    this.delegate.query();
  }
//io.vertx.core.MultiMap headers()
//io.vertx.core.MultiMap
  /**
   * @return the headers in the WebSocket handshake
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
//void reject()
//void
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
