package io.vertx.golo.core;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
// Type: io.vertx.core.MultiMap 
public class MultiMap {
      private io.vertx.core.MultiMap delegate;
  public MultiMap(Object delegate) {
    this.delegate = (io.vertx.core.MultiMap) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Create a multi-map implementation with case insensitive keys, for instance it can be used to hold some HTTP headers.
   * @return the multi-map
   */
  public static MultiMap caseInsensitiveMultiMap() {
return    InternalHelper.safeCreate(io.vertx.core.MultiMap.caseInsensitiveMultiMap(), io.vertx.golo.core.MultiMap.class);
  }
  /**
   * Returns the value of with the specified name.  If there are
   * more than one values for the specified name, the first value is returned.
   * @param name The name of the header to search
   * @return The first header value or <code>null</code> if there is no such entry
   */
  public String get(String name) {
return    this.delegate.get(name);
  }
  /**
   * Returns the values with the specified name
   * @param name The name to search
   * @return A immutable {@link java.util.List} of values which will be empty if no values are found
   */
  public List<String> getAll(String name) {
return    this.delegate.getAll(name);
  }
  /**
   * Checks to see if there is a value with the specified name
   * @param name The name to search for
   * @return true if at least one entry is found
   */
  public boolean contains(String name) {
return    this.delegate.contains(name);
  }
  /**
   * Return true if empty
   * @return 
   */
  public boolean isEmpty() {
return    this.delegate.isEmpty();
  }
  /**
   * Gets a immutable {@link java.util.Set} of all names
   * @return A {@link java.util.Set} of all names
   */
  public Set<String> names() {
return    this.delegate.names();
  }
  /**
   * Adds a new value with the specified name and value.
   * @param name The name
   * @param value The value being added
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap add(String name, String value) {
    this.delegate.add(name, value);
    return this;
  }
  /**
   * Adds all the entries from another MultiMap to this one
   * @param map 
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap addAll(MultiMap map) {
    this.delegate.addAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
  /**
   * Sets a value under the specified name.
   * <p>
   * If there is an existing header with the same name, it is removed.
   * @param name The name
   * @param value The value
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap set(String name, String value) {
    this.delegate.set(name, value);
    return this;
  }
  /**
   * Cleans this instance.
   * @param map 
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap setAll(MultiMap map) {
    this.delegate.setAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
  /**
   * Removes the value with the given name
   * @param name The name of the value to remove
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap remove(String name) {
    this.delegate.remove(name);
    return this;
  }
  /**
   * Removes all
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap clear() {
    this.delegate.clear();
    return this;
  }
  /**
   * Return the number of keys.
   * @return 
   */
  public int size() {
return    this.delegate.size();
  }
}
