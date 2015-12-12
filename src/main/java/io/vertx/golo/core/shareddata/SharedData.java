package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, 1694364540=-1236617489, 186099333=-610228158, -572374170=2062217911, -923286050=1677605180, 385663335=-1108724180} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.shareddata.SharedData 
public class SharedData {
//[INFO] ifaceSimpleName=SharedData
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, 1694364540=-1236617489, 186099333=-610228158, -572374170=2062217911, -923286050=1677605180, 385663335=-1108724180}
  private io.vertx.core.shareddata.SharedData delegate;
  public SharedData(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.SharedData) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//<TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap]> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler)
//void
  /**
   * Get the cluster wide map with the specified name. The map is accessible to all nodes in the cluster and data
   * put into the map from any node is visible to to any other node.
   * @param name the name of the map
   * @param resultHandler the map will be returned asynchronously in this handler
   */
  public <K, V> void getClusterWideMap(String name, Handler<AsyncResult<AsyncMap<K,V>>> resultHandler) {
    this.delegate.getClusterWideMap(name, new Handler<AsyncResult<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>>>() {
      public void handle(AsyncResult<io.vertx.core.shareddata.AsyncMap<java.lang.Object,java.lang.Object>> event) {
        AsyncResult<AsyncMap<Object,Object>> f;
        if (event.succeeded()) {
          f = InternalHelper.<AsyncMap<Object,Object>>result(new AsyncMap<Object,Object>(event.result()));
        } else {
          f = InternalHelper.<AsyncMap<Object,Object>>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)
//void
  /**
   * Get a cluster wide lock with the specified name. The lock will be passed to the handler when it is available.
   * @param name the name of the lock
   * @param resultHandler the handler
   */
  public void getLock(String name, Handler<AsyncResult<Lock>> resultHandler) {
    this.delegate.getLock(name, new Handler<AsyncResult<io.vertx.core.shareddata.Lock>>() {
      public void handle(AsyncResult<io.vertx.core.shareddata.Lock> event) {
        AsyncResult<Lock> f;
        if (event.succeeded()) {
          f = InternalHelper.<Lock>result(new Lock(event.result()));
        } else {
          f = InternalHelper.<Lock>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler)
//void
  /**
   * Like {@link io.vertx.golo.core.shareddata.SharedData#getLock} but specifying a timeout. If the lock is not obtained within the timeout
   * a failure will be sent to the handler
   * @param name the name of the lock
   * @param timeout the timeout in ms
   * @param resultHandler the handler
   */
  public void getLockWithTimeout(String name, long timeout, Handler<AsyncResult<Lock>> resultHandler) {
    this.delegate.getLockWithTimeout(name, timeout, new Handler<AsyncResult<io.vertx.core.shareddata.Lock>>() {
      public void handle(AsyncResult<io.vertx.core.shareddata.Lock> event) {
        AsyncResult<Lock> f;
        if (event.succeeded()) {
          f = InternalHelper.<Lock>result(new Lock(event.result()));
        } else {
          f = InternalHelper.<Lock>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler)
//void
  /**
   * Get a cluster wide counter. The counter will be passed to the handler.
   * @param name the name of the counter.
   * @param resultHandler the handler
   */
  public void getCounter(String name, Handler<AsyncResult<Counter>> resultHandler) {
    this.delegate.getCounter(name, new Handler<AsyncResult<io.vertx.core.shareddata.Counter>>() {
      public void handle(AsyncResult<io.vertx.core.shareddata.Counter> event) {
        AsyncResult<Counter> f;
        if (event.succeeded()) {
          f = InternalHelper.<Counter>result(new Counter(event.result()));
        } else {
          f = InternalHelper.<Counter>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//<TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap]> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name)
//io.vertx.core.shareddata.LocalMap<K,V>
  /**
   * Return a <code>LocalMap</code> with the specific <code>name</code>.
   * @param name the name of the map
   * @return the msp
   */
  public <K, V> LocalMap<K,V> getLocalMap(String name) {
return    InternalHelper.safeCreate(this.delegate.getLocalMap(name), io.vertx.golo.core.shareddata.LocalMap.class);
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
