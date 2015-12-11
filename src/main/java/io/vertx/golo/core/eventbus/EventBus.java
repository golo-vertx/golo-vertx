package io.vertx.golo.core.eventbus;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.eventbus.EventBus 
public class EventBus implements Measured {
      private io.vertx.core.eventbus.EventBus delegate;
  public EventBus(Object delegate) {
    this.delegate = (io.vertx.core.eventbus.EventBus) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
//io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message)
//io.vertx.core.eventbus.EventBus
  /**
   * Sends a message.
   * <p>
   * The message will be delivered to at most one of the handlers registered to the address.
   * @param address the address to send it to
   * @param message the message, may be <code>null</code>
   * @return a reference to this, so the API can be used fluently
   */
  public EventBus send(String address, Object message) {
    this.delegate.send(address, InternalHelper.unwrapObject(message));
    return this;
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler)
//io.vertx.core.eventbus.EventBus
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#send} but specifying a <code>replyHandler</code> that will be called if the recipient
   * subsequently replies to the message.
   * @param address the address to send it to
   * @param message the message, may be <code>null</code>
   * @param replyHandler reply handler will be called when any reply from the recipient is received, may be <code>null</code>
   * @return a reference to this, so the API can be used fluently
   */
  public <T> EventBus send(String address, Object message, Handler<AsyncResult<Message<T>>> replyHandler) {
    this.delegate.send(address, InternalHelper.unwrapObject(message), new Handler<AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>>() {
      public void handle(AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>> event) {
        AsyncResult<Message<Object>> f;
        if (event.succeeded()) {
          f = InternalHelper.<Message<Object>>result(new Message<Object>(event.result()));
        } else {
          f = InternalHelper.<Message<Object>>failure(event.cause());
        }
        replyHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)
//io.vertx.core.eventbus.EventBus
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#send} but specifying <code>options</code> that can be used to configure the delivery.
   * @param address the address to send it to
   * @param message the message, may be <code>null</code>
   * @param options delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return a reference to this, so the API can be used fluently
   */
  public EventBus send(String address, Object message, Map<String, Object> options) {
    this.delegate.send(address, InternalHelper.unwrapObject(message), options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null);
    return this;
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesend]> io.vertx.core.eventbus.EventBus send(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<T>>> replyHandler)
//io.vertx.core.eventbus.EventBus
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#send} but specifying a <code>replyHandler</code> that will be called if the recipient
   * subsequently replies to the message.
   * @param address the address to send it to
   * @param message the message, may be <code>null</code>
   * @param options delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @param replyHandler reply handler will be called when any reply from the recipient is received, may be <code>null</code>
   * @return a reference to this, so the API can be used fluently
   */
  public <T> EventBus send(String address, Object message, Map<String, Object> options, Handler<AsyncResult<Message<T>>> replyHandler) {
    this.delegate.send(address, InternalHelper.unwrapObject(message), options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null, new Handler<AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>>() {
      public void handle(AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>> event) {
        AsyncResult<Message<Object>> f;
        if (event.succeeded()) {
          f = InternalHelper.<Message<Object>>result(new Message<Object>(event.result()));
        } else {
          f = InternalHelper.<Message<Object>>failure(event.cause());
        }
        replyHandler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message)
//io.vertx.core.eventbus.EventBus
  /**
   * Publish a message.<p>
   * The message will be delivered to all handlers registered to the address.
   * @param address the address to publish it to
   * @param message the message, may be <code>null</code>
   * @return a reference to this, so the API can be used fluently
   */
  public EventBus publish(String address, Object message) {
    this.delegate.publish(address, InternalHelper.unwrapObject(message));
    return this;
  }
//io.vertx.core.eventbus.EventBus publish(java.lang.String address, java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)
//io.vertx.core.eventbus.EventBus
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#publish} but specifying <code>options</code> that can be used to configure the delivery.
   * @param address the address to publish it to
   * @param message the message, may be <code>null</code>
   * @param options the delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return a reference to this, so the API can be used fluently
   */
  public EventBus publish(String address, Object message, Map<String, Object> options) {
    this.delegate.publish(address, InternalHelper.unwrapObject(message), options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null);
    return this;
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address)
//io.vertx.core.eventbus.MessageConsumer<T>
  /**
   * Create a message consumer against the specified address.
   * <p>
   * The returned consumer is not yet registered
   * at the address, registration will be effective when {@link io.vertx.golo.core.eventbus.MessageConsumer#handler}
   * is called.
   * @param address the address that it will register it at
   * @return the event bus message consumer
   */
  public <T> MessageConsumer<T> consumer(String address) {
return    InternalHelper.safeCreate(this.delegate.consumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNameconsumer]> io.vertx.core.eventbus.MessageConsumer<T> consumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)
//io.vertx.core.eventbus.MessageConsumer<T>
  /**
   * Create a consumer and register it against the specified address.
   * @param address the address that will register it at
   * @param handler the handler that will process the received messages
   * @return the event bus message consumer
   */
  public <T> MessageConsumer<T> consumer(String address, Handler<Message<T>> handler) {
return    InternalHelper.safeCreate(this.delegate.consumer(address, new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.handle(new io.vertx.golo.core.eventbus.Message(event));
      }
    }), io.vertx.golo.core.eventbus.MessageConsumer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address)
//io.vertx.core.eventbus.MessageConsumer<T>
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#consumer} but the address won't be propagated across the cluster.
   * @param address the address to register it at
   * @return the event bus message consumer
   */
  public <T> MessageConsumer<T> localConsumer(String address) {
return    InternalHelper.safeCreate(this.delegate.localConsumer(address), io.vertx.golo.core.eventbus.MessageConsumer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamelocalConsumer]> io.vertx.core.eventbus.MessageConsumer<T> localConsumer(java.lang.String address, io.vertx.core.Handler<io.vertx.core.eventbus.Message<T>> handler)
//io.vertx.core.eventbus.MessageConsumer<T>
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#consumer} but the address won't be propagated across the cluster.
   * @param address the address that will register it at
   * @param handler the handler that will process the received messages
   * @return the event bus message consumer
   */
  public <T> MessageConsumer<T> localConsumer(String address, Handler<Message<T>> handler) {
return    InternalHelper.safeCreate(this.delegate.localConsumer(address, new Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.handle(new io.vertx.golo.core.eventbus.Message(event));
      }
    }), io.vertx.golo.core.eventbus.MessageConsumer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address)
//io.vertx.core.eventbus.MessageProducer<T>
  /**
   * Create a message sender against the specified address.
   * <p>
   * The returned sender will invoke the {@link io.vertx.golo.core.eventbus.EventBus#send}
   * method when the stream {@link io.vertx.golo.core.streams.WriteStream#write} method is called with the sender
   * address and the provided data.
   * @param address the address to send it to
   * @return The sender
   */
  public <T> MessageProducer<T> sender(String address) {
return    InternalHelper.safeCreate(this.delegate.sender(address), io.vertx.golo.core.eventbus.MessageProducer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamesender]> io.vertx.core.eventbus.MessageProducer<T> sender(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)
//io.vertx.core.eventbus.MessageProducer<T>
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#sender} but specifying delivery options that will be used for configuring the delivery of
   * the message.
   * @param address the address to send it to
   * @param options the delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return The sender
   */
  public <T> MessageProducer<T> sender(String address, Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.sender(address, options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.eventbus.MessageProducer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address)
//io.vertx.core.eventbus.MessageProducer<T>
  /**
   * Create a message publisher against the specified address.
   * <p>
   * The returned publisher will invoke the {@link io.vertx.golo.core.eventbus.EventBus#publish}
   * method when the stream {@link io.vertx.golo.core.streams.WriteStream#write} method is called with the publisher
   * address and the provided data.
   * @param address The address to publish it to
   * @return The publisher
   */
  public <T> MessageProducer<T> publisher(String address) {
return    InternalHelper.safeCreate(this.delegate.publisher(address), io.vertx.golo.core.eventbus.MessageProducer.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.eventbus.EventBus,methodNamepublisher]> io.vertx.core.eventbus.MessageProducer<T> publisher(java.lang.String address, io.vertx.core.eventbus.DeliveryOptions options)
//io.vertx.core.eventbus.MessageProducer<T>
  /**
   * Like {@link io.vertx.golo.core.eventbus.EventBus#publisher} but specifying delivery options that will be used for configuring the delivery of
   * the message.
   * @param address the address to publish it to
   * @param options the delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @return The publisher
   */
  public <T> MessageProducer<T> publisher(String address, Map<String, Object> options) {
return    InternalHelper.safeCreate(this.delegate.publisher(address, options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.golo.core.eventbus.MessageProducer.class);
  }
//void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler)
//void
  /**
   * Close the event bus and release any resources held
   * @param completionHandler may be <code>null</code>
   */
  public void close(Handler<AsyncResult<Void>> completionHandler) {
    this.delegate.close(completionHandler);
  }
}
