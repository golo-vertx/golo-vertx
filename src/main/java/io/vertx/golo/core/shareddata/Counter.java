package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, 2082204861=-1036681252, -1913545495=-1897504507, 884673794=-1568158022, 450938089=1192823715, 368012517=-957868411} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.shareddata.Counter 
public class Counter {
//[INFO] ifaceSimpleName=Counter
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, 2082204861=-1036681252, -1913545495=-1897504507, 884673794=-1568158022, 450938089=1192823715, 368012517=-957868411}
  private io.vertx.core.shareddata.Counter delegate;
  public Counter(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.Counter) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Get the current value of the counter
   * @param resultHandler handler which will be passed the value
   */
  public void get(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.get(resultHandler);
  }
//void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Increment the counter atomically and return the new count
   * @param resultHandler handler which will be passed the value
   */
  public void incrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.incrementAndGet(resultHandler);
  }
//void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Increment the counter atomically and return the value before the increment.
   * @param resultHandler handler which will be passed the value
   */
  public void getAndIncrement(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.getAndIncrement(resultHandler);
  }
//void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Decrement the counter atomically and return the new count
   * @param resultHandler handler which will be passed the value
   */
  public void decrementAndGet(Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.decrementAndGet(resultHandler);
  }
//void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Add the value to the counter atomically and return the new count
   * @param value the value to add
   * @param resultHandler handler which will be passed the value
   */
  public void addAndGet(long value, Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.addAndGet(value, resultHandler);
  }
//void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler)
//void
  /**
   * Add the value to the counter atomically and return the value before the add
   * @param value the value to add
   * @param resultHandler handler which will be passed the value
   */
  public void getAndAdd(long value, Handler<AsyncResult<Long>> resultHandler) {
    this.delegate.getAndAdd(value, resultHandler);
  }
//void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler)
//void
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
