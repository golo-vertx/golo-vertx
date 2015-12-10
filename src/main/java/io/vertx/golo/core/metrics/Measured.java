package io.vertx.golo.core.metrics;

import io.vertx.lang.golo.InternalHelper;
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
                // boolean isMetricsEnabled() 
    // TypeParams: [] 
        public boolean isMetricsEnabled() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isMetricsEnabled(); 
    }
        }
