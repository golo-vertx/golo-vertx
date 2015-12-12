package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
// {0=10, -1023657459=-611783316, -165153838=1990701456, 101500890=1264159522, -295445020=899196936, -1215759104=454665357, 1593626005=-1822527985, -1223661557=1878090170, 1069632330=-281254197, -1745618209=731529065, 1690718299=963303989} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.shareddata.Lock 
public class Lock {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
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
