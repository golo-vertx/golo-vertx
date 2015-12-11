package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.shareddata.AsyncMap<K,V> 
public class AsyncMap<K,V> {
      private io.vertx.core.shareddata.AsyncMap delegate;
  public AsyncMap(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.AsyncMap) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Get a value from the map, asynchronously.
   * @param k the key
   * @param resultHandler - this will be called some time later with the async result.
   */
  public void get(K k, Handler<AsyncResult<V>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).get(InternalHelper.unwrapObject(k), new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Put a value in the map, asynchronously.
   * @param k the key
   * @param v the value
   * @param completionHandler - this will be called some time later to signify the value has been put
   */
  public void put(K k, V v, Handler<AsyncResult<Void>> completionHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).put(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), completionHandler);
  }
  /**
   * Like {@link io.vertx.golo.core.shareddata.AsyncMap#put} but specifying a timeout. If the value cannot be put within the timeout a
   * failure will be passed to the handler
   * @param k the key
   * @param v the value
   * @param ttl The time to live (in ms) for the entry
   * @param completionHandler the handler
   */
  public void put(K k, V v, long ttl, Handler<AsyncResult<Void>> completionHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).put(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), ttl, completionHandler);
  }
  /**
   * Put the entry only if there is no entry with the key already present. If key already present then the existing
   * value will be returned to the handler, otherwise null.
   * @param k the key
   * @param v the value
   * @param completionHandler the handler
   */
  public void putIfAbsent(K k, V v, Handler<AsyncResult<V>> completionHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).putIfAbsent(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        completionHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Link {@link io.vertx.golo.core.shareddata.AsyncMap#putIfAbsent} but specifying a timeout. If the value cannot be put within the timeout a
   * failure will be passed to the handler
   * @param k the key
   * @param v the value
   * @param ttl The time to live (in ms) for the entry
   * @param completionHandler the handler
   */
  public void putIfAbsent(K k, V v, long ttl, Handler<AsyncResult<V>> completionHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).putIfAbsent(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), ttl, new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        completionHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Remove a value from the map, asynchronously.
   * @param k the key
   * @param resultHandler - this will be called some time later to signify the value has been removed
   */
  public void remove(K k, Handler<AsyncResult<V>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).remove(InternalHelper.unwrapObject(k), new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Remove a value from the map, only if entry already exists with same value.
   * @param k the key
   * @param v the value
   * @param resultHandler - this will be called some time later to signify the value has been removed
   */
  public void removeIfPresent(K k, V v, Handler<AsyncResult<Boolean>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).removeIfPresent(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), resultHandler);
  }
  /**
   * Replace the entry only if it is currently mapped to some value
   * @param k the key
   * @param v the new value
   * @param resultHandler the result handler will be passed the previous value
   */
  public void replace(K k, V v, Handler<AsyncResult<V>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).replace(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(v), new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
  /**
   * Replace the entry only if it is currently mapped to a specific value
   * @param k the key
   * @param oldValue the existing value
   * @param newValue the new value
   * @param resultHandler the result handler
   */
  public void replaceIfPresent(K k, V oldValue, V newValue, Handler<AsyncResult<Boolean>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).replaceIfPresent(InternalHelper.unwrapObject(k), InternalHelper.unwrapObject(oldValue), InternalHelper.unwrapObject(newValue), resultHandler);
  }
  /**
   * Clear all entries in the map
   * @param resultHandler called on completion
   */
  public void clear(Handler<AsyncResult<Void>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).clear(resultHandler);
  }
  /**
   * Provide the number of entries in the map
   * @param resultHandler handler which will receive the number of entries
   */
  public void size(Handler<AsyncResult<Integer>> resultHandler) {
    ((io.vertx.core.shareddata.AsyncMap) this.delegate).size(resultHandler);
  }
}
