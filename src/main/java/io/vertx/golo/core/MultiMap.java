package io.vertx.golo.core;

//[Debug] classMethodData = {io.vertx.core.MultiMap=13} 
//[Debug] arr = [io.vertx.core.MultiMap caseInsensitiveMultiMap(), java.lang.String get(java.lang.String name), java.util.List<java.lang.String> getAll(java.lang.String name), boolean contains(java.lang.String name), boolean isEmpty(), java.util.Set<java.lang.String> names(), io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map), io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map), io.vertx.core.MultiMap remove(java.lang.String name), io.vertx.core.MultiMap clear(), int size()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, -677131671=1722153981, 144798783=274337083} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
//[confirm] Type: io.vertx.core.MultiMap 
public class MultiMap {
//[Debug] toChangeName = {boolean contains(java.lang.String name)=false, java.lang.String get(java.lang.String name)=false, java.util.List<java.lang.String> getAll(java.lang.String name)=false, java.util.Set<java.lang.String> names()=false, io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value)=false, io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map)=false, io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value)=false, boolean isEmpty()=false, io.vertx.core.MultiMap remove(java.lang.String name)=false, io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map)=false, io.vertx.core.MultiMap clear()=false, int size()=false, io.vertx.core.MultiMap caseInsensitiveMultiMap()=false}
//[Debug] dbgMethodName = {boolean contains(java.lang.String name)=contains, java.lang.String get(java.lang.String name)=get, java.util.List<java.lang.String> getAll(java.lang.String name)=getAll, java.util.Set<java.lang.String> names()=names, io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value)=set, io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map)=addAll, io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value)=add, boolean isEmpty()=isEmpty, io.vertx.core.MultiMap remove(java.lang.String name)=remove, io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map)=setAll, io.vertx.core.MultiMap clear()=clear, int size()=size, io.vertx.core.MultiMap caseInsensitiveMultiMap()=caseInsensitiveMultiMap} 
//[Debug] dbgMethodParams = {boolean contains(java.lang.String name)=1, java.lang.String get(java.lang.String name)=1, java.util.List<java.lang.String> getAll(java.lang.String name)=1, java.util.Set<java.lang.String> names()=0, io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value)=2, io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map)=1, io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value)=2, boolean isEmpty()=0, io.vertx.core.MultiMap remove(java.lang.String name)=1, io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map)=1, io.vertx.core.MultiMap clear()=0, int size()=0, io.vertx.core.MultiMap caseInsensitiveMultiMap()=0} 
//[INFO]  methods=[io.vertx.core.MultiMap caseInsensitiveMultiMap(), java.lang.String get(java.lang.String name), java.util.List<java.lang.String> getAll(java.lang.String name), boolean contains(java.lang.String name), boolean isEmpty(), java.util.Set<java.lang.String> names(), io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map), io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map), io.vertx.core.MultiMap remove(java.lang.String name), io.vertx.core.MultiMap clear(), int size()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map)=false, boolean contains(java.lang.String name)=false, io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value)=false, java.util.Set<java.lang.String> names()=false, io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value)=false, boolean isEmpty()=false, io.vertx.core.MultiMap clear()=false, io.vertx.core.MultiMap remove(java.lang.String name)=false, io.vertx.core.MultiMap caseInsensitiveMultiMap()=false, java.util.List<java.lang.String> getAll(java.lang.String name)=false, io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map)=false, int size()=false, java.lang.String get(java.lang.String name)=false} 
//[INFO] ifaceSimpleName=MultiMap
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, -677131671=1722153981, 144798783=274337083}
  private io.vertx.core.MultiMap delegate;
  public MultiMap(Object delegate) {
    this.delegate = (io.vertx.core.MultiMap) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.MultiMap caseInsensitiveMultiMap()
//io.vertx.core.MultiMap
  /**
   * Create a multi-map implementation with case insensitive keys, for instance it can be used to hold some HTTP headers.
   * @return the multi-map
   */
  public static MultiMap caseInsensitiveMultiMap() {
return    InternalHelper.safeCreate(io.vertx.core.MultiMap.caseInsensitiveMultiMap(), io.vertx.golo.core.MultiMap.class);
  }
//java.lang.String get(java.lang.String name)
//java.lang.String
  /**
   * Returns the value of with the specified name.  If there are
   * more than one values for the specified name, the first value is returned.
   * @param name The name of the header to search
   * @return The first header value or <code>null</code> if there is no such entry
   */
  public String get(String name) {
return    this.delegate.get(name);
  }
//java.util.List<java.lang.String> getAll(java.lang.String name)
//java.util.List<java.lang.String>
  /**
   * Returns the values with the specified name
   * @param name The name to search
   * @return A immutable {@link java.util.List} of values which will be empty if no values are found
   */
  public List<String> getAll(String name) {
return    this.delegate.getAll(name);
  }
//boolean contains(java.lang.String name)
//boolean
  /**
   * Checks to see if there is a value with the specified name
   * @param name The name to search for
   * @return true if at least one entry is found
   */
  public boolean contains(String name) {
return    this.delegate.contains(name);
  }
//boolean isEmpty()
//boolean
  /**
   * Return true if empty
   * @return 
   */
  public boolean isEmpty() {
return    this.delegate.isEmpty();
  }
//java.util.Set<java.lang.String> names()
//java.util.Set<java.lang.String>
  /**
   * Gets a immutable {@link java.util.Set} of all names
   * @return A {@link java.util.Set} of all names
   */
  public Set<String> names() {
return    this.delegate.names();
  }
//io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value)
//io.vertx.core.MultiMap
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
//io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map)
//io.vertx.core.MultiMap
  /**
   * Adds all the entries from another MultiMap to this one
   * @param map 
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap addAll(MultiMap map) {
    this.delegate.addAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
//io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value)
//io.vertx.core.MultiMap
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
//io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map)
//io.vertx.core.MultiMap
  /**
   * Cleans this instance.
   * @param map 
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap setAll(MultiMap map) {
    this.delegate.setAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
//io.vertx.core.MultiMap remove(java.lang.String name)
//io.vertx.core.MultiMap
  /**
   * Removes the value with the given name
   * @param name The name of the value to remove
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap remove(String name) {
    this.delegate.remove(name);
    return this;
  }
//io.vertx.core.MultiMap clear()
//io.vertx.core.MultiMap
  /**
   * Removes all
   * @return a reference to this, so the API can be used fluently
   */
  public MultiMap clear() {
    this.delegate.clear();
    return this;
  }
//int size()
//int
  /**
   * Return the number of keys.
   * @return 
   */
  public int size() {
return    this.delegate.size();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
