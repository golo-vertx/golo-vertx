package io.vertx.golo.core.metrics;

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
