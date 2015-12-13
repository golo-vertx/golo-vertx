package io.vertx.golo.core.shareddata;

//[Debug] classMethodData = {io.vertx.core.shareddata.LocalMap<K,V>=11} 
//[Debug] arr = [V get(K key), V put(K key, V value), V remove(K key), void clear(), int size(), boolean isEmpty(), V putIfAbsent(K key, V value), boolean removeIfPresent(K key, V value), boolean replaceIfPresent(K key, V oldValue, V newValue), V replace(K key, V value), void close()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1982996753=-665886430, -454530531=-508919936, -662663098=-2099861780, -1101991018=-133099654, -2059016003=1429151125, -234053913=-1343539521, -165933456=-253662983, -1026498433=-1171839425} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.shareddata.LocalMap<K,V> 
public class LocalMap<K,V> {
//[Debug] toChangeName = {boolean removeIfPresent(K key, V value)=false, V put(K key, V value)=false, V putIfAbsent(K key, V value)=false, int size()=false, void close()=false, V get(K key)=false, V remove(K key)=false, boolean isEmpty()=false, V replace(K key, V value)=false, void clear()=false, boolean replaceIfPresent(K key, V oldValue, V newValue)=false}
//[Debug] dbgMethodName = {boolean removeIfPresent(K key, V value)=removeIfPresent, V put(K key, V value)=put, V putIfAbsent(K key, V value)=putIfAbsent, int size()=size, void close()=close, V get(K key)=get, V remove(K key)=remove, boolean isEmpty()=isEmpty, V replace(K key, V value)=replace, void clear()=clear, boolean replaceIfPresent(K key, V oldValue, V newValue)=replaceIfPresent} 
//[Debug] dbgMethodParams = {boolean removeIfPresent(K key, V value)=2, V put(K key, V value)=2, V putIfAbsent(K key, V value)=2, int size()=0, void close()=0, V get(K key)=1, V remove(K key)=1, boolean isEmpty()=0, V replace(K key, V value)=2, void clear()=0, boolean replaceIfPresent(K key, V oldValue, V newValue)=3} 
//[INFO]  methods=[V get(K key), V put(K key, V value), V remove(K key), void clear(), int size(), boolean isEmpty(), V putIfAbsent(K key, V value), boolean removeIfPresent(K key, V value), boolean replaceIfPresent(K key, V oldValue, V newValue), V replace(K key, V value), void close()] 
//[INFO]  defaultDataObjectMap={V put(K key, V value)=false, V replace(K key, V value)=false, void close()=false, V putIfAbsent(K key, V value)=false, V remove(K key)=false, void clear()=false, boolean removeIfPresent(K key, V value)=false, boolean replaceIfPresent(K key, V oldValue, V newValue)=false, boolean isEmpty()=false, V get(K key)=false, int size()=false} 
//[INFO] ifaceSimpleName=LocalMap
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1982996753=-665886430, -454530531=-508919936, -662663098=-2099861780, -1101991018=-133099654, -2059016003=1429151125, -234053913=-1343539521, -165933456=-253662983, -1026498433=-1171839425}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
