package io.vertx.golo.core.shareddata;

//[Debug] classMethodData = {io.vertx.core.shareddata.Lock=1} 
//[Debug] arr = [void release()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -1329774307=-1487292879, -1994969322=529322997, -780109370=-775584361, 924478748=-861943652, -1791142550=-1557226325, -1588914026=232875818, 1940721683=1959809499, 1058352122=-808945401} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.shareddata.Lock 
public class Lock {
//[Debug] toChangeName = {void release()=false}
//[Debug] dbgMethodName = {void release()=release} 
//[Debug] dbgMethodParams = {void release()=0} 
//[INFO]  methods=[void release()] 
//[INFO]  defaultDataObjectMap={void release()=false} 
//[INFO] ifaceSimpleName=Lock
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -1329774307=-1487292879, -1994969322=529322997, -780109370=-775584361, 924478748=-861943652, -1791142550=-1557226325, -1588914026=232875818, 1940721683=1959809499, 1058352122=-808945401}
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
