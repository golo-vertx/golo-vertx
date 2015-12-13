package io.vertx.golo.core;

//[Debug] classMethodData = {io.vertx.core.Future<T>=9} 
//[Debug] arr = [<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage), boolean isComplete(), void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler), void complete(T result), void complete(), void fail(java.lang.String failureMessage)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=3, -151246872=-1628312939, 981379589=-1392716072, -1773555758=-1921473753} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.Future<T> 
public class Future<T> {
//[Debug] toChangeName = {<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)=false, void fail(java.lang.String failureMessage)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result)=false, boolean isComplete()=false, void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture()=false, void complete(T result)=false, void complete()=false}
//[Debug] dbgMethodName = {<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)=failedFuture, void fail(java.lang.String failureMessage)=fail, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future()=future, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result)=succeededFuture, boolean isComplete()=isComplete, void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler)=setHandler, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture()=succeededFuture, void complete(T result)=complete, void complete()=complete} 
//[Debug] dbgMethodParams = {<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)=1, void fail(java.lang.String failureMessage)=1, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future()=0, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result)=1, boolean isComplete()=0, void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler)=1, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture()=0, void complete(T result)=1, void complete()=0} 
//[INFO]  methods=[<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage), boolean isComplete(), void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler), void complete(T result), void complete(), void fail(java.lang.String failureMessage)] 
//[INFO]  defaultDataObjectMap={<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture()=false, void complete(T result)=false, void complete()=false, void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future()=false, void fail(java.lang.String failureMessage)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)=false, boolean isComplete()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result)=false} 
//[INFO] ifaceSimpleName=Future
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=3, -151246872=-1628312939, 981379589=-1392716072, -1773555758=-1921473753}
  private io.vertx.core.Future delegate;
  public Future(Object delegate) {
    this.delegate = (io.vertx.core.Future) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefuture]> io.vertx.core.Future<T> future()
//io.vertx.core.Future<T>
  /**
   * Create a future that hasn't completed yet
   * @return the future
   */
  public static <T> Future<T> future() {
return    InternalHelper.safeCreate(io.vertx.core.Future.future(), io.vertx.golo.core.Future.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture()
//io.vertx.core.Future<T>
  /**
   * Create a succeeded future with a null result
   * @return the future
   */
  public static <T> Future<T> succeededFuture() {
return    InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(), io.vertx.golo.core.Future.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamesucceededFuture]> io.vertx.core.Future<T> succeededFuture(T result)
//io.vertx.core.Future<T>
  /**
   * Created a succeeded future with the specified result.
   * @param result the result
   * @return the future
   */
  public static <T> Future<T> succeededFuture(T result) {
return    InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(InternalHelper.unwrapObject(result)), io.vertx.golo.core.Future.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)
//io.vertx.core.Future<T>
  /**
   * Create a failed future with the specified failure message.
   * @param failureMessage the failure message
   * @return the future
   */
  public static <T> Future<T> failedFuture(String failureMessage) {
return    InternalHelper.safeCreate(io.vertx.core.Future.failedFuture(failureMessage), io.vertx.golo.core.Future.class);
  }
//boolean isComplete()
//boolean
  /**
   * Has the future completed?
   * <p>
   * It's completed if it's either succeeded or failed.
   * @return true if completed, false if not
   */
  public boolean isComplete() {
return    ((io.vertx.core.Future) this.delegate).isComplete();
  }
//void setHandler(io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler)
//void
  /**
   * Set a handler for the result.
   * <p>
   * If the future has already been completed it will be called immediately. Otherwise it will be called when the
   * future is completed.
   * @param handler the Handler that will be called with the result
   */
  public void setHandler(Handler<AsyncResult<T>> handler) {
    ((io.vertx.core.Future) this.delegate).setHandler(new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
  }
//void complete(T result)
//void
  /**
   * Set the result. Any handler will be called, if there is one, and the future will be marked as completed.
   * @param result the result
   */
  public void complete(T result) {
    ((io.vertx.core.Future) this.delegate).complete(InternalHelper.unwrapObject(result));
  }
//void complete()
//void
  /**
   * Set a null result. Any handler will be called, if there is one, and the future will be marked as completed.
   */
  public void complete() {
    ((io.vertx.core.Future) this.delegate).complete();
  }
//void fail(java.lang.String failureMessage)
//void
  /**
   * Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.
   * @param failureMessage the failure message
   */
  public void fail(String failureMessage) {
    ((io.vertx.core.Future) this.delegate).fail(failureMessage);
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
