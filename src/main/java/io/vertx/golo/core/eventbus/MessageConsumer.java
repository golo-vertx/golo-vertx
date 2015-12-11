package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.MessageConsumer<T> 
public class MessageConsumer<T> implements ReadStream<Message<T>> {
      private io.vertx.core.eventbus.MessageConsumer delegate;
  public MessageConsumer(Object delegate) {
    this.delegate = (io.vertx.core.eventbus.MessageConsumer) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public MessageConsumer<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
  public MessageConsumer<T> handler(Handler<Message<T>> handler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.handle(new io.vertx.golo.core.eventbus.Message(event));
      }
    });
    return this;
  }
  public MessageConsumer<T> pause() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
  public MessageConsumer<T> resume() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
  public MessageConsumer<T> endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
  /**
   * @return a read stream for the body of the message stream.
   * @return 
   */
  public ReadStream<T> bodyStream() {
return    InternalHelper.safeCreate(((io.vertx.core.eventbus.MessageConsumer) this.delegate).bodyStream(), io.vertx.golo.core.streams.ReadStreamImpl.class);
  }
  /**
   * @return true if the current consumer is registered
   * @return 
   */
  public boolean isRegistered() {
return    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).isRegistered();
  }
  /**
   * @return The address the handler was registered with.
   * @return 
   */
  public String address() {
return    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).address();
  }
  /**
   * Set the number of messages this registration will buffer when this stream is paused. The default
   * value is <code>0</code>. When a new value is set, buffered messages may be discarded to reach
   * the new value.
   * @param maxBufferedMessages the maximum number of messages that can be buffered
   * @return this registration
   */
  public MessageConsumer<T> setMaxBufferedMessages(int maxBufferedMessages) {
return    InternalHelper.safeCreate(((io.vertx.core.eventbus.MessageConsumer) this.delegate).setMaxBufferedMessages(maxBufferedMessages), io.vertx.golo.core.eventbus.MessageConsumer.class);
  }
  /**
   * @return the maximum number of messages that can be buffered when this stream is paused
   * @return 
   */
  public int getMaxBufferedMessages() {
return    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).getMaxBufferedMessages();
  }
  /**
   * Optional method which can be called to indicate when the registration has been propagated across the cluster.
   * @param completionHandler the completion handler
   */
  public void completionHandler(Handler<AsyncResult<Void>> completionHandler) {
    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).completionHandler(completionHandler);
  }
  /**
   * Unregisters the handler which created this registration
   */
  public void unregister() {
    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).unregister();
  }
  /**
   * Unregisters the handler which created this registration
   * @param completionHandler the handler called when the unregister is done. For example in a cluster when all nodes of the event bus have been unregistered.
   */
  public void unregister(Handler<AsyncResult<Void>> completionHandler) {
    ((io.vertx.core.eventbus.MessageConsumer) this.delegate).unregister(completionHandler);
  }
}
