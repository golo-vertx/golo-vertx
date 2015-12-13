package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.Future<T> 
public class Future<T> {
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
  public static <T> Future<T> succeededFutureT(T result) {
return    InternalHelper.safeCreate(io.vertx.core.Future.succeededFuture(InternalHelper.unwrapObject(result)), io.vertx.golo.core.Future.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Future,methodNamefailedFuture]> io.vertx.core.Future<T> failedFuture(java.lang.String failureMessage)
//io.vertx.core.Future<T>
  /**
   * Create a failed future with the specified failure message.
   * @param failureMessage the failure message
   * @return the future
   */
  public static <T> Future<T> failedFutureString(String failureMessage) {
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
  public void setHandlerHandler(Handler<AsyncResult<T>> handler) {
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
  public void completeT(T result) {
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
  public void failString(String failureMessage) {
    ((io.vertx.core.Future) this.delegate).fail(failureMessage);
  }
}
