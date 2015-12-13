package io.vertx.golo.core.eventbus;

//[Debug] classMethodData = {io.vertx.core.eventbus.MessageProducer<T>=7} 
//[Debug] arr = [boolean writeQueueFull(), io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.eventbus.MessageProducer<T> write(T data), io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize), io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options), java.lang.String address()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, -1766844096=-1142360327, -518809406=5997934, -691800383=-1842918739, -730018261=-873801328, -1608514137=-179154783, -1393462968=-1564421473, -225404887=710763811, -1696120467=1072026251, 1382666965=10285284, -596790096=-221646573} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.eventbus.MessageProducer<T> 
public class MessageProducer<T> implements WriteStream<T> {
//[Debug] toChangeName = {boolean writeQueueFull()=false, java.lang.String address()=false, io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.eventbus.MessageProducer<T> write(T data)=false, io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)=false}
//[Debug] dbgMethodName = {boolean writeQueueFull()=writeQueueFull, java.lang.String address()=address, io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, io.vertx.core.eventbus.MessageProducer<T> write(T data)=write, io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)=deliveryOptions} 
//[Debug] dbgMethodParams = {boolean writeQueueFull()=0, java.lang.String address()=0, io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)=1, io.vertx.core.eventbus.MessageProducer<T> write(T data)=1, io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)=1} 
//[INFO]  methods=[boolean writeQueueFull(), io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.eventbus.MessageProducer<T> write(T data), io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize), io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options), java.lang.String address()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.eventbus.MessageProducer<T> drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.eventbus.MessageProducer<T> deliveryOptions(io.vertx.core.eventbus.DeliveryOptions options)=true, io.vertx.core.eventbus.MessageProducer<T> write(T data)=false, boolean writeQueueFull()=false, java.lang.String address()=false, io.vertx.core.eventbus.MessageProducer<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.eventbus.MessageProducer<T> setWriteQueueMaxSize(int maxSize)=false} 
//[INFO] ifaceSimpleName=MessageProducer
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, -1766844096=-1142360327, -518809406=5997934, -691800383=-1842918739, -730018261=-873801328, -1608514137=-179154783, -1393462968=-1564421473, -225404887=710763811, -1696120467=1072026251, 1382666965=10285284, -596790096=-221646573}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
