package io.vertx.golo.core.eventbus;

//[Debug] classMethodData = {io.vertx.core.eventbus.Message<T>=9} 
//[Debug] arr = [java.lang.String address(), io.vertx.core.MultiMap headers(), T body(), java.lang.String replyAddress(), void reply(java.lang.Object message), <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void fail(int failureCode, java.lang.String message)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, 1495323894=1293193406, -1862258826=643076391} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.eventbus.Message<T> 
public class Message<T> {
//[Debug] toChangeName = {T body()=false, void fail(int failureCode, java.lang.String message)=false, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=true, java.lang.String address()=false, java.lang.String replyAddress()=false, void reply(java.lang.Object message)=false, void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)=true, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=false, io.vertx.core.MultiMap headers()=false}
//[Debug] dbgMethodName = {T body()=body, void fail(int failureCode, java.lang.String message)=fail, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=reply, java.lang.String address()=address, java.lang.String replyAddress()=replyAddress, void reply(java.lang.Object message)=reply, void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)=reply, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=reply, io.vertx.core.MultiMap headers()=headers} 
//[Debug] dbgMethodParams = {T body()=0, void fail(int failureCode, java.lang.String message)=2, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=2, java.lang.String address()=0, java.lang.String replyAddress()=0, void reply(java.lang.Object message)=1, void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)=2, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=3, io.vertx.core.MultiMap headers()=0} 
//[INFO]  methods=[java.lang.String address(), io.vertx.core.MultiMap headers(), T body(), java.lang.String replyAddress(), void reply(java.lang.Object message), <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options), <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler), void fail(int failureCode, java.lang.String message)] 
//[INFO]  defaultDataObjectMap={java.lang.String address()=false, void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)=false, io.vertx.core.MultiMap headers()=false, java.lang.String replyAddress()=false, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=false, <TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)=false, void fail(int failureCode, java.lang.String message)=false, void reply(java.lang.Object message)=false, T body()=false} 
//[INFO] ifaceSimpleName=Message
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, 1495323894=1293193406, -1862258826=643076391}
  private io.vertx.core.eventbus.Message delegate;
  public Message(Object delegate) {
    this.delegate = (io.vertx.core.eventbus.Message) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//java.lang.String address()
//java.lang.String
  /**
   * The address the message was sent to
   * @return 
   */
  public String address() {
return    ((io.vertx.core.eventbus.Message) this.delegate).address();
  }
//io.vertx.core.MultiMap headers()
//io.vertx.core.MultiMap
  /**
   * Multi-map of message headers. Can be empty
   * @return the headers
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(((io.vertx.core.eventbus.Message) this.delegate).headers(), io.vertx.golo.core.MultiMap.class);
  }
//T body()
//T
  /**
   * The body of the message. Can be null.
   * @return the body, or null.
   */
  public T body() {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(((io.vertx.core.eventbus.Message) this.delegate).body());
  }
//java.lang.String replyAddress()
//java.lang.String
  /**
   * The reply address. Can be null.
   * @return the reply address, or null, if message was sent without a reply handler.
   */
  public String replyAddress() {
return    ((io.vertx.core.eventbus.Message) this.delegate).replyAddress();
  }
//void reply(java.lang.Object message)
//void
  /**
   * Reply to this message.
   * <p>
   * If the message was sent specifying a reply handler, that handler will be
   * called when it has received a reply. If the message wasn't sent specifying a receipt handler
   * this method does nothing.
   * @param message the message to reply with.
   */
  public void reply(Object message) {
    ((io.vertx.core.eventbus.Message) this.delegate).reply(InternalHelper.unwrapObject(message));
  }
//<TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)
//void
  /**
   * The same as <code>reply(R message)</code> but you can specify handler for the reply - i.e.
   * to receive the reply to the reply.
   * @param message the message to reply with.
   * @param replyHandler the reply handler for the reply.
   */
  public <R> void reply(Object message, Handler<AsyncResult<Message<R>>> replyHandler) {
    ((io.vertx.core.eventbus.Message) this.delegate).reply(InternalHelper.unwrapObject(message), new Handler<AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>>() {
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
  }
//void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options)
//void
  /**
   * Link {@link io.vertx.golo.core.eventbus.Message#reply} but allows you to specify delivery options for the reply.
   * @param message the reply message
   * @param options the delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   */
  public void reply(Object message, Map<String, Object> options) {
    ((io.vertx.core.eventbus.Message) this.delegate).reply(InternalHelper.unwrapObject(message), options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null);
  }
//<TypeParamInfo.Method[name=R,typeName=io.vertx.core.eventbus.Message,methodNamereply]> void reply(java.lang.Object message, io.vertx.core.eventbus.DeliveryOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<R>>> replyHandler)
//void
  /**
   * The same as <code>reply(R message, DeliveryOptions)</code> but you can specify handler for the reply - i.e.
   * to receive the reply to the reply.
   * @param message the reply message
   * @param options the delivery options (see <a href="../../../../../../../cheatsheet/DeliveryOptions.html">DeliveryOptions</a>)
   * @param replyHandler the reply handler for the reply.
   */
  public <R> void reply(Object message, Map<String, Object> options, Handler<AsyncResult<Message<R>>> replyHandler) {
    ((io.vertx.core.eventbus.Message) this.delegate).reply(InternalHelper.unwrapObject(message), options != null ? new io.vertx.core.eventbus.DeliveryOptions(new io.vertx.core.json.JsonObject(options)) : null, new Handler<AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>>() {
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
  }
//void fail(int failureCode, java.lang.String message)
//void
  /**
   * Signal to the sender that processing of this message failed.
   * <p>
   * If the message was sent specifying a result handler
   * the handler will be called with a failure corresponding to the failure code and message specified here.
   * @param failureCode A failure code to pass back to the sender
   * @param message A message to pass back to the sender
   */
  public void fail(int failureCode, String message) {
    ((io.vertx.core.eventbus.Message) this.delegate).fail(failureCode, message);
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
