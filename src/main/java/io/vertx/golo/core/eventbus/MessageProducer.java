package io.vertx.golo.core.eventbus;

//[Debug] This is a debuging message to check @code{} syntax
// {0=10, 1462370872=457235966, -791099829=1129348601, 1221282430=-1387439831, 1715671830=-2138727838, 1203731881=1576716662, 442352363=504277240, -1544775306=968282507, 455121517=-434657933, 318383125=1372830053, -1435448273=-1582102363} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.MessageProducer<T> 
public class MessageProducer<T> implements WriteStream<T> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  private io.vertx.core.eventbus.MessageProducer delegate;
  public MessageProducer(Object delegate) {
    this.delegate = (io.vertx.core.eventbus.MessageProducer) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.eventbus.MessageProducer#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.eventbus.MessageProducer<T>
  public MessageProducer<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.eventbus.MessageProducer<T> write(T data)
//io.vertx.core.eventbus.MessageProducer<T>
  public MessageProducer<T> write(T data) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).write(InternalHelper.unwrapObject(data));
    return this;
  }
//io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)
//io.vertx.core.eventbus.MessageProducer<T>
  public MessageProducer<T> setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.eventbus.MessageProducer<T>
  public MessageProducer<T> drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)
//io.vertx.core.eventbus.MessageProducer<T>
  /**
   * Update the delivery options of this producer.
   * @param options the new options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return this producer object
   */
  public MessageProducer<T> deliveryOptions(Map<String, Object> options) {
    ((io.vertx.core.eventbus.MessageProducer) this.delegate).deliveryOptions(options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null);
    return this;
  }
//java.lang.String address()
//java.lang.String
  /**
   * @return The address to which the producer produces messages.
   * @return 
   */
  public String address() {
return    ((io.vertx.core.eventbus.MessageProducer) this.delegate).address();
  }
}
