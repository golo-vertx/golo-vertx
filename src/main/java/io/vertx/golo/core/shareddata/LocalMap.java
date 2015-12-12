package io.vertx.golo.core.shareddata;

//[Debug] This is a debuging message to check @code{} syntax
// {0=6, -1883841146=715616148, 1877280484=1635111669, -272450920=1851505589, 703412199=-476760960, -480164982=-2141906837, 1094703715=-317417212} 
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
//V get(K key)
//V
  /**
   * Get a value from the map
   * @param key the key
   * @return the value, or null if none
   */
  public V get(K key) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).get(InternalHelper.unwrapObject(key)));
  }
//V put(K key, V value)
//V
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
//V remove(K key)
//V
  /**
   * Remove an entry from the map
   * @param key the key
   * @return the old value
   */
  public V remove(K key) {
return    // This cast is cleary flawed
    (V) InternalHelper.wrapObject(((io.vertx.core.shareddata.LocalMap) this.delegate).remove(InternalHelper.unwrapObject(key)));
  }
//void clear()
//void
  /**
   * Clear all entries in the map
   */
  public void clear() {
    ((io.vertx.core.shareddata.LocalMap) this.delegate).clear();
  }
//int size()
//int
  /**
   * Get the size of the map
   * @return the number of entries in the map
   */
  public int size() {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).size();
  }
//boolean isEmpty()
//boolean
  /**
   * @return true if there are zero entries in the map
   * @return 
   */
  public boolean isEmpty() {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).isEmpty();
  }
//V putIfAbsent(K key, V value)
//V
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
//boolean removeIfPresent(K key, V value)
//boolean
  /**
   * Remove the entry only if there is an entry with the specified key and value
   * @param key the key
   * @param value the value
   * @return true if removed
   */
  public boolean removeIfPresent(K key, V value) {
return    ((io.vertx.core.shareddata.LocalMap) this.delegate).removeIfPresent(InternalHelper.unwrapObject(key), InternalHelper.unwrapObject(value));
  }
//boolean replaceIfPresent(K key, V oldValue, V newValue)
//boolean
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
//V replace(K key, V value)
//V
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
//void close()
//void
  /**
   * Close and release the map
   */
  public void close() {
    ((io.vertx.core.shareddata.LocalMap) this.delegate).close();
  }
}
