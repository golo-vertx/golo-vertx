package io.vertx.golo.core.metrics;

//[Debug] This is a debuging message to check @code{} syntax
// {0=3, -1594531676=-90291594, 810216428=-1761246922, 2083290131=2015929715} 
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
