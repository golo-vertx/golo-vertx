package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.WebSocket=20} 
//[Debug] arr = [boolean writeQueueFull(), java.lang.String binaryHandlerID(), java.lang.String textHandlerID(), void close(), io.vertx.core.net.SocketAddress remoteAddress(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.WebSocket pause(), io.vertx.core.http.WebSocket resume(), io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize), io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame), io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text), io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, 768651858=1680127138, -1364929415=-834984462} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.http.WebSocket 
public class WebSocket implements WebSocketBase {
//[Debug] toChangeName = {java.lang.String binaryHandlerID()=false, io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, boolean writeQueueFull()=false, io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.net.SocketAddress remoteAddress()=false, io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.net.SocketAddress localAddress()=false, void close()=false, io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=false, io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, java.lang.String textHandlerID()=false, io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=false, io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)=false, io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.http.WebSocket resume()=false, io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.WebSocket pause()=false}
//[Debug] dbgMethodName = {java.lang.String binaryHandlerID()=binaryHandlerID, io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, boolean writeQueueFull()=writeQueueFull, io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=closeHandler, io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=writeFinalBinaryFrame, io.vertx.core.net.SocketAddress remoteAddress()=remoteAddress, io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.net.SocketAddress localAddress()=localAddress, void close()=close, io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=frameHandler, io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, java.lang.String textHandlerID()=textHandlerID, io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=handler, io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=writeFrame, io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)=writeFinalTextFrame, io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, io.vertx.core.http.WebSocket resume()=resume, io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)=write, io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=writeBinaryMessage, io.vertx.core.http.WebSocket pause()=pause} 
//[Debug] dbgMethodParams = {java.lang.String binaryHandlerID()=0, io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, boolean writeQueueFull()=0, io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.net.SocketAddress remoteAddress()=0, io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.net.SocketAddress localAddress()=0, void close()=0, io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=1, io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, java.lang.String textHandlerID()=0, io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=1, io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=1, io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)=1, io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)=1, io.vertx.core.http.WebSocket resume()=0, io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.http.WebSocket pause()=0} 
//[INFO]  methods=[boolean writeQueueFull(), java.lang.String binaryHandlerID(), java.lang.String textHandlerID(), void close(), io.vertx.core.net.SocketAddress remoteAddress(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.WebSocket pause(), io.vertx.core.http.WebSocket resume(), io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize), io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame), io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text), io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data), io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)=false, java.lang.String textHandlerID()=false, io.vertx.core.http.WebSocket resume()=false, io.vertx.core.http.WebSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.net.SocketAddress localAddress()=false, io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)=false, io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)=false, io.vertx.core.net.SocketAddress remoteAddress()=false, java.lang.String binaryHandlerID()=false, io.vertx.core.http.WebSocket pause()=false, io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.WebSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, boolean writeQueueFull()=false, io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, void close()=false, io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)=false} 
//[INFO] ifaceSimpleName=WebSocket
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, 768651858=1680127138, -1364929415=-834984462}
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
  public WebSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.WebSocket
  public WebSocket handler(Handler<Buffer> handler) {
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
  public WebSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.WebSocket write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket write(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.WebSocket
  public WebSocket setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.WebSocket drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocket
  public WebSocket drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket writeFrame(io.vertx.core.http.WebSocketFrame frame)
//io.vertx.core.http.WebSocket
  public WebSocket writeFrame(WebSocketFrame frame) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFrame((io.vertx.core.http.WebSocketFrame)frame.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket writeFinalTextFrame(java.lang.String text)
//io.vertx.core.http.WebSocket
  public WebSocket writeFinalTextFrame(String text) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalTextFrame(text);
    return this;
  }
//io.vertx.core.http.WebSocket writeFinalBinaryFrame(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket writeFinalBinaryFrame(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeFinalBinaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket writeBinaryMessage(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.WebSocket
  public WebSocket writeBinaryMessage(Buffer data) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).writeBinaryMessage((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.WebSocket closeHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.WebSocket
  public WebSocket closeHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).closeHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocket frameHandler(io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> handler)
//io.vertx.core.http.WebSocket
  public WebSocket frameHandler(Handler<WebSocketFrame> handler) {
    (  (io.vertx.core.http.WebSocketBase) this.delegate).frameHandler(new Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.handle(new io.vertx.golo.core.http.WebSocketFrame(event));
      }
    });
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
