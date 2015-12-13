package io.vertx.golo.core.metrics;

//[Debug] classMethodData = {io.vertx.core.metrics.Measured=1} 
//[Debug] arr = [boolean isMetricsEnabled()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, -1826406078=-1252447847, 1425939850=-570680476, -1923880937=307724037, -863582989=-1668258484, -202675363=1826697906, 1564493334=2109579339, 140677210=406209169, -347616129=1098575770, -1834983365=501249661, 29659513=983569851} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.metrics.Measured 
public interface Measured {
//[Debug] toChangeName = {boolean isMetricsEnabled()=false}
//[Debug] dbgMethodName = {boolean isMetricsEnabled()=isMetricsEnabled} 
//[Debug] dbgMethodParams = {boolean isMetricsEnabled()=0} 
//[INFO]  methods=[boolean isMetricsEnabled()] 
//[INFO]  defaultDataObjectMap={boolean isMetricsEnabled()=false} 
public Object getDelegate();
  boolean isMetricsEnabled();
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class MeasuredImpl implements Measured {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, -1826406078=-1252447847, 1425939850=-570680476, -1923880937=307724037, -863582989=-1668258484, -202675363=1826697906, 1564493334=2109579339, 140677210=406209169, -347616129=1098575770, -1834983365=501249661, 29659513=983569851}
  private io.vertx.core.metrics.Measured delegate;
  public MeasuredImpl(Object delegate) {
    this.delegate = (io.vertx.core.metrics.Measured) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
}
