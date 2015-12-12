package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, 1796911738=2055848116, 1080902527=1518706257, -1046853316=-843237615, 1381902377=1886445225, 1746280492=-868056389, -84289436=-336702889} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.shareddata.Lock 
public class Lock {
//[INFO] ifaceSimpleName=Lock
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, 1796911738=2055848116, 1080902527=1518706257, -1046853316=-843237615, 1381902377=1886445225, 1746280492=-868056389, -84289436=-336702889}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
