package io.vertx.golo.core.shareddata;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.shareddata.LocalMap<K,V> 
public class LocalMap<K,V> {
      private io.vertx.core.shareddata.LocalMap delegate;
  public LocalMap(Object delegate) {
    this.delegate = (io.vertx.core.shareddata.LocalMap) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Get a value from the map
   * @param key the key
   * @return the value, or null if none
   */
  public V get(K key) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).get(InternalHelper.unwrapObject(key)));
  }
  /**
   * Put an entry in the map
   * @param key the key
   * @param value the value
   * @return return the old value, or null if none
   */
  public V put(K key, V value) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).put(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(value)));
  }
  /**
   * Remove an entry from the map
   * @param key the key
   * @return the old value
   */
  public V remove(K key) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).remove(InternalHelper.unwrapObject(key)));
  }
  /**
   * Clear all entries in the map
   */
  public void clear() {
    ((io.vertx.core.shareddata.LocalMap) this.delegate).clear();
  }
  /**
   * Get the size of the map
   * @return the number of entries in the map
   */
  public int size() {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).size();
  }
  /**
   * @return true if there are zero entries in the map
   * @return 
   */
  public boolean isEmpty() {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).isEmpty();
  }
  /**
   * Put the entry only if there is no existing entry for that key
   * @param key the key
   * @param value the value
   * @return the old value or null, if none
   */
  public V putIfAbsent(K key, V value) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).putIfAbsent(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(value)));
  }
  /**
   * Remove the entry only if there is an entry with the specified key and value
   * @param key the key
   * @param value the value
   * @return true if removed
   */
  public boolean removeIfPresent(K key, V value) {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).removeIfPresent(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(value));
  }
  /**
   * Replace the entry only if there is an existing entry with the specified key and value
   * @param key the key
   * @param oldValue the old value
   * @param newValue the new value
   * @return true if removed
   */
  public boolean replaceIfPresent(K key, V oldValue, V newValue) {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).replaceIfPresent(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(oldValue), InternalHelper.unwrapObject(newValue));
  }
  /**
   * Replace the entry only if there is an existing entry with the key
   * @param key the key
   * @param value the new value
   * @return the old value
   */
  public V replace(K key, V value) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).replace(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(value)));
  }
  /**
   * Close and release the map
   */
  public void close() {
    ((io.vertx.core.shareddata.LocalMap) this.delegate).close();
  }
}
