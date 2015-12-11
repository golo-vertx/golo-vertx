package io.vertx.golo.core.net;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.net.NetSocket 
public class NetSocket implements ReadStream<Buffer>,  WriteStream<Buffer> {
      private io.vertx.core.net.NetSocket delegate;
  public NetSocket(Object delegate) {
    this.delegate = (io.vertx.core.net.NetSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.net.NetSocket#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
  public NetSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).exceptionHandler(handler);
    return this;
  }
  public NetSocket handler(Handler<Buffer> handler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
  public NetSocket pause() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
  public NetSocket resume() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
  public NetSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
  public NetSocket write(Buffer data) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public NetSocket setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public NetSocket drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).drainHandler(handler);
    return this;
  }
  /**
   * When a <code>NetSocket</code> is created it automatically registers an event handler with the event bus, the ID of that
   * handler is given by <code>writeHandlerID</code>.
   * <p>
   * Given this ID, a different event loop can send a buffer to that event handler using the event bus and
   * that buffer will be received by this instance in its own event loop and written to the underlying connection. This
   * allows you to write data to other connections which are owned by different event loops.
   * @return the write handler ID
   */
  public String writeHandlerID() {
return    this.delegate.writeHandlerID();
  }
  /**
   * Write a {@link java.lang.String} to the connection, encoded in UTF-8.
   * @param str the string to write
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket write(String str) {
    this.delegate.write(str);
    return this;
  }
  /**
   * Write a {@link java.lang.String} to the connection, encoded using the encoding <code>enc</code>.
   * @param str the string to write
   * @param enc the encoding to use
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket write(String str, String enc) {
    this.delegate.write(str, enc);
    return this;
  }
  /**
   * Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,
   * bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.
   * @param filename file name of the file to send
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename) {
    this.delegate.sendFile(filename);
    return this;
  }
  /**
   * Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,
   * bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.
   * @param filename file name of the file to send
   * @param offset offset
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename, long offset) {
    this.delegate.sendFile(filename, offset);
    return this;
  }
  /**
   * Tell the operating system to stream a file as specified by <code>filename</code> directly from disk to the outgoing connection,
   * bypassing userspace altogether (where supported by the underlying operating system. This is a very efficient way to stream files.
   * @param filename file name of the file to send
   * @param offset offset
   * @param length length
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename, long offset, long length) {
    this.delegate.sendFile(filename, offset, length);
    return this;
  }
  /**
   * Same as {@link io.vertx.golo.core.net.NetSocket#sendFile} but also takes a handler that will be called when the send has completed or
   * a failure has occurred
   * @param filename file name of the file to send
   * @param resultHandler handler
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, resultHandler);
    return this;
  }
  /**
   * Same as {@link io.vertx.golo.core.net.NetSocket#sendFile} but also takes a handler that will be called when the send has completed or
   * a failure has occurred
   * @param filename file name of the file to send
   * @param offset offset
   * @param resultHandler handler
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename, long offset, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, offset, resultHandler);
    return this;
  }
  /**
   * Same as {@link io.vertx.golo.core.net.NetSocket#sendFile} but also takes a handler that will be called when the send has completed or
   * a failure has occurred
   * @param filename file name of the file to send
   * @param offset offset
   * @param length length
   * @param resultHandler handler
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket sendFile(String filename, long offset, long length, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, offset, length, resultHandler);
    return this;
  }
  /**
   * @return the remote address for this socket
   * @return 
   */
  public SocketAddress remoteAddress() {
return    InternalHelper.safeCreate(this.delegate.remoteAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
  /**
   * @return the local address for this socket
   * @return 
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
  /**
   * Close the NetSocket
   */
  public void close() {
    this.delegate.close();
  }
  /**
   * Set a handler that will be called when the NetSocket is closed
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket closeHandler(Handler<Void> handler) {
    this.delegate.closeHandler(handler);
    return this;
  }
  /**
   * Upgrade channel to use SSL/TLS. Be aware that for this to work SSL must be configured.
   * @param handler the handler will be notified when it's upgraded
   * @return a reference to this, so the API can be used fluently
   */
  public NetSocket upgradeToSsl(Handler<Void> handler) {
    this.delegate.upgradeToSsl(handler);
    return this;
  }
  /**
   * @return true if this {@link io.vertx.golo.core.net.NetSocket} is encrypted via SSL/TLS.
   * @return 
   */
  public boolean isSsl() {
return    this.delegate.isSsl();
  }
}
