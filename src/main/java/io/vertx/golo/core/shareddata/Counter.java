package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.Counter 
public class Counter {
      private io.vertx.core.shareddata.Counter delegate;
  public Counter(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.Counter) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Get the current value of the counter
   * @param resultHandler handler which will be passed the value
   */
  public void get(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.get(resultHandler);
  }
  /**
   * Increment the counter atomically and return the new count
   * @param resultHandler handler which will be passed the value
   */
  public void incrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.incrementAndGet(resultHandler);
  }
  /**
   * Increment the counter atomically and return the value before the increment.
   * @param resultHandler handler which will be passed the value
   */
  public void getAndIncrement(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.getAndIncrement(resultHandler);
  }
  /**
   * Decrement the counter atomically and return the new count
   * @param resultHandler handler which will be passed the value
   */
  public void decrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.decrementAndGet(resultHandler);
  }
  /**
   * Add the value to the counter atomically and return the new count
   * @param value the value to add
   * @param resultHandler handler which will be passed the value
   */
  public void addAndGet(long value, Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.addAndGet(value, resultHandler);
  }
  /**
   * Add the value to the counter atomically and return the value before the add
   * @param value the value to add
   * @param resultHandler handler which will be passed the value
   */
  public void getAndAdd(long value, Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.getAndAdd(value, resultHandler);
  }
  /**
   * Set the counter to the specified value only if the current value is the expectec value. This happens
   * atomically.
   * @param expected the expected value
   * @param value the new value
   * @param resultHandler the handler will be passed true on success
   */
  public void compareAndSet(long expected, long value, Handler<AsyncResult<Boolean>> resultHandler) {
    this.delegate.compareAndSet(expected, value, resultHandler);
  }
}
