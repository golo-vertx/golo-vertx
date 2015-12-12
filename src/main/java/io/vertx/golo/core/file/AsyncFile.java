package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 162839744=-1987006372, 977834094=325700734, 871647779=-1616356922, -551526902=-1967537456, 390615684=-1908092795, 1793497979=36501591, -562937681=1404363620, -1943741717=20598464, -1816884101=-715038890, 1789503142=2093536968} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.file.AsyncFile 
public class AsyncFile implements ReadStream<Buffer>,  WriteStream<Buffer> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 162839744=-1987006372, 977834094=325700734, 871647779=-1616356922, -551526902=-1967537456, 390615684=-1908092795, 1793497979=36501591, -562937681=1404363620, -1943741717=20598464, -1816884101=-715038890, 1789503142=2093536968}
  private io.vertx.core.file.AsyncFile delegate;
  public AsyncFile(Object delegate) {
    this.delegate = (io.vertx.core.file.AsyncFile) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.file.AsyncFile#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.file.AsyncFile handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.file.AsyncFile
  public AsyncFile handler(Handler<Buffer> handler) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.file.AsyncFile pause()
//io.vertx.core.file.AsyncFile
  public AsyncFile pause() {
    (  (io.vertx.core.file.AsyncFile) this.delegate).pause();
    return this;
  }
//io.vertx.core.file.AsyncFile resume()
//io.vertx.core.file.AsyncFile
  public AsyncFile resume() {
    (  (io.vertx.core.file.AsyncFile) this.delegate).resume();
    return this;
  }
//io.vertx.core.file.AsyncFile endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.file.AsyncFile
  public AsyncFile endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.file.AsyncFile
  public AsyncFile write(Buffer data) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.file.AsyncFile setWriteQueueMaxSize(int maxSize)
//io.vertx.core.file.AsyncFile
  public AsyncFile setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.file.AsyncFile drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.file.AsyncFile
  public AsyncFile drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.file.AsyncFile exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.file.AsyncFile
  public AsyncFile exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.file.AsyncFile) this.delegate).exceptionHandler(handler);
    return this;
  }
//void close()
//void
  /**
   * Close the file. The actual close happens asynchronously.
   */
  public void close() {
    this.delegate.close();
  }
//void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)
//void
  /**
   * Close the file. The actual close happens asynchronously.
   * The handler will be called when the close is complete, or an error occurs.
   * @param handler the handler
   */
  public void close(Handler<AsyncResult<Void>> handler) {
    this.delegate.close(handler);
  }
//io.vertx.core.file.AsyncFile write(io.vertx.core.buffer.Buffer buffer, long position, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)
//io.vertx.core.file.AsyncFile
  /**
   * Write a {@link io.vertx.golo.core.buffer.Buffer} to the file at position <code>position</code> in the file, asynchronously.
   * <p>
   * If <code>position</code> lies outside of the current size
   * of the file, the file will be enlarged to encompass it.
   * <p>
   * When multiple writes are invoked on the same file
   * there are no guarantees as to order in which those writes actually occur
   * <p>
   * The handler will be called when the write is complete, or if an error occurs.
   * @param buffer the buffer to write
   * @param position the position in the file to write it at
   * @param handler the handler to call when the write is complete
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile write(Buffer buffer, long position, Handler<AsyncResult<Void>> handler) {
    this.delegate.write((io.vertx.core.buffer.Buffer)buffer.getDelegate(), position, handler);
    return this;
  }
//io.vertx.core.file.AsyncFile read(io.vertx.core.buffer.Buffer buffer, int offset, long position, int length, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler)
//io.vertx.core.file.AsyncFile
  /**
   * Reads <code>length</code> bytes of data from the file at position <code>position</code> in the file, asynchronously.
   * <p>
   * The read data will be written into the specified <code>Buffer buffer</code> at position <code>offset</code>.
   * <p>
   * If data is read past the end of the file then zero bytes will be read.<p>
   * When multiple reads are invoked on the same file there are no guarantees as to order in which those reads actually occur.
   * <p>
   * The handler will be called when the close is complete, or if an error occurs.
   * @param buffer the buffer to read into
   * @param offset the offset into the buffer where the data will be read
   * @param position the position in the file where to start reading
   * @param length the number of bytes to read
   * @param handler the handler to call when the write is complete
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile read(Buffer buffer, int offset, long position, int length, Handler<AsyncResult<Buffer>> handler) {
    this.delegate.read((io.vertx.core.buffer.Buffer)buffer.getDelegate(), offset, position, length, new Handler<AsyncResult<io.vertx.core.buffer.Buffer>>() {
      public void handle(AsyncResult<io.vertx.core.buffer.Buffer> event) {
        AsyncResult<Buffer> f;
        if (event.succeeded()) {
          f = InternalHelper.<Buffer>result(new Buffer(event.result()));
        } else {
          f = InternalHelper.<Buffer>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.file.AsyncFile flush()
//io.vertx.core.file.AsyncFile
  /**
   * Flush any writes made to this file to underlying persistent storage.
   * <p>
   * If the file was opened with <code>flush</code> set to <code>true</code> then calling this method will have no effect.
   * <p>
   * The actual flush will happen asynchronously.
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile flush() {
    this.delegate.flush();
    return this;
  }
//io.vertx.core.file.AsyncFile flush(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)
//io.vertx.core.file.AsyncFile
  /**
   * Same as {@link io.vertx.golo.core.file.AsyncFile#flush} but the handler will be called when the flush is complete or if an error occurs
   * @param handler 
   * @return 
   */
  public AsyncFile flush(Handler<AsyncResult<Void>> handler) {
    this.delegate.flush(handler);
    return this;
  }
//io.vertx.core.file.AsyncFile setReadPos(long readPos)
//io.vertx.core.file.AsyncFile
  /**
   * Sets the position from which data will be read from when using the file as a {@link io.vertx.golo.core.streams.ReadStream}.
   * @param readPos the position in the file
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile setReadPos(long readPos) {
    this.delegate.setReadPos(readPos);
    return this;
  }
//io.vertx.core.file.AsyncFile setWritePos(long writePos)
//io.vertx.core.file.AsyncFile
  /**
   * Sets the position from which data will be written when using the file as a {@link io.vertx.golo.core.streams.WriteStream}.
   * @param writePos the position in the file
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile setWritePos(long writePos) {
    this.delegate.setWritePos(writePos);
    return this;
  }
//io.vertx.core.file.AsyncFile setReadBufferSize(int readBufferSize)
//io.vertx.core.file.AsyncFile
  /**
   * Sets the buffer size that will be used to read the data from the file. Changing this value will impact how much
   * the data will be read at a time from the file system.
   * @param readBufferSize the buffer size
   * @return a reference to this, so the API can be used fluently
   */
  public AsyncFile setReadBufferSize(int readBufferSize) {
    this.delegate.setReadBufferSize(readBufferSize);
    return this;
  }
}
