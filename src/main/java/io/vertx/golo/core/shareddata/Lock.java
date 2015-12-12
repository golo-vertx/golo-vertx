package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
// {0=1, 2138562454=1922037566} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.shareddata.Lock 
public class Lock {
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
