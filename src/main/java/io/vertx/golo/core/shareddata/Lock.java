package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=4, -628312977=1291838331, 395704737=-280583257, 1844440984=1487217993, 616979691=1622805397} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.shareddata.Lock 
public class Lock {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=4, -628312977=1291838331, 395704737=-280583257, 1844440984=1487217993, 616979691=1622805397}
  private io.vertx.core.shareddata.Lock delegate;
  public Lock(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.Lock) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//void release()
//void
  /**
   * Release the lock. Once the lock is released another will be able to obtain the lock.
   */
  public void release() {
    this.delegate.release();
  }
}
