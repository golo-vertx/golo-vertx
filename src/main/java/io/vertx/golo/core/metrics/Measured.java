package io.vertx.golo.core.metrics;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=7, 129435959=-1286216147, -133295106=1531560584, 17898690=624196229, 480509878=-1098347463, 2041272750=1864511622, 956813855=-818883705, -1776764377=-81918280} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.metrics.Measured 
public interface Measured {
public Object getDelegate();
  boolean isMetricsEnabled();
}

class MeasuredImpl implements Measured {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=7, 129435959=-1286216147, -133295106=1531560584, 17898690=624196229, 480509878=-1098347463, 2041272750=1864511622, 956813855=-818883705, -1776764377=-81918280}
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
