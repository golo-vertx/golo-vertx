package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.MessageProducer<T> 
public class MessageProducer<T> implements WriteStream<T> {
      private io.vertx.core.eventbus.MessageProducer delegate;
  public MessageProducer(Object delegate) {
    this.delegate = (io.vertx.core.eventbus.MessageProducer) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.eventbus.MessageProducer#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
  public MessageProducer<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).exceptionHandler(handler);
    return this;
  }
  public MessageProducer<T> write(T data) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).write(InternalHelper.unwrapObject(data));
    return this;
  }
  public MessageProducer<T> setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public MessageProducer<T> drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.streams.WriteStream) this.delegate).drainHandler(handler);
    return this;
  }
  /**
   * Update the delivery options of this producer.
   * @param options the new options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return this producer object
   */
  public MessageProducer<T> deliveryOptions(Map<String, Object> options) {
    ((io.vertx.core.eventbus.MessageProducer) this.delegate).deliveryOptions(options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null);
    return this;
  }
  /**
   * @return The address to which the producer produces messages.
   * @return 
   */
  public String address() {
return    ((io.vertx.core.eventbus.MessageProducer) this.delegate).address();
  }
}
