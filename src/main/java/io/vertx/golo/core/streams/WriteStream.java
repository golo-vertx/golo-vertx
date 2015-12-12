package io.vertx.golo.core.streams;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=7, 1274671535=1478050682, -1273451906=-949861573, 1125828290=-1626919756, -1295660244=-1866138650, -380543=-1183287564, -1473619308=1094567674, 758889493=1895146904} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.streams.WriteStream<T> 
public interface WriteStream<T> extends StreamBase {
public Object getDelegate();
  WriteStream<T> exceptionHandler(Handler<Throwable> handler);
  WriteStream<T> write(T data);
  WriteStream<T> setWriteQueueMaxSize(int maxSize);
  boolean writeQueueFull();
  WriteStream<T> drainHandler(Handler<Void> handler);
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class WriteStreamImpl<T> implements WriteStream<T> {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=7, 1274671535=1478050682, -1273451906=-949861573, 1125828290=-1626919756, -1295660244=-1866138650, -380543=-1183287564, -1473619308=1094567674, 758889493=1895146904}
  private io.vertx.core.streams.WriteStream delegate;
  public WriteStreamImpl(Object delegate) {
    this.delegate = (io.vertx.core.streams.WriteStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.streams.WriteStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.streams.WriteStream<T>
  /**
   * Set an exception handler on the write stream.
   * @param handler the exception handler
   * @return a reference to this, so the API can be used fluently
   */
  public WriteStream<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.streams.WriteStream<T> write(T data)
//io.vertx.core.streams.WriteStream<T>
  /**
   * Write some data to the stream. The data is put on an internal write queue, and the write actually happens
   * asynchronously. To avoid running out of memory by putting too much on the write queue,
   * check the {@link io.vertx.golo.core.streams.WriteStream#writeQueueFull} method before writing. This is done automatically if using a {@link io.vertx.golo.core.streams.Pump}.
   * @param data the data to write
   * @return a reference to this, so the API can be used fluently
   */
  public WriteStream<T> write(T data) {
    ((io.vertx.core.streams.WriteStream) this.delegate).write(InternalHelper.unwrapObject(data));
    return this;
  }
//io.vertx.core.streams.WriteStream<T> setWriteQueueMaxSize(int maxSize)
//io.vertx.core.streams.WriteStream<T>
  /**
   * Set the maximum size of the write queue to <code>maxSize</code>. You will still be able to write to the stream even
   * if there is more than <code>maxSize</code> bytes in the write queue. This is used as an indicator by classes such as
   * <code>Pump</code> to provide flow control.
   * @param maxSize the max size of the write stream
   * @return a reference to this, so the API can be used fluently
   */
  public WriteStream<T> setWriteQueueMaxSize(int maxSize) {
    ((io.vertx.core.streams.WriteStream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.streams.WriteStream#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.streams.WriteStream<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.streams.WriteStream<T>
  /**
   * Set a drain handler on the stream. If the write queue is full, then the handler will be called when the write
   * queue has been reduced to maxSize / 2. See {@link io.vertx.golo.core.streams.Pump} for an example of this being used.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public WriteStream<T> drainHandler(Handler<Void> handler) {
    ((io.vertx.core.streams.WriteStream) this.delegate).drainHandler(handler);
    return this;
  }
}
