package io.vertx.golo.core.metrics;

import io.vertx.lang.golo.InternalHelper;

public class Measured { 

private io.vertx.core.metrics.Measured delegate; 
public Measured(Object delegate) { 
    this.delegate = (io.vertx.core.metrics.Measured)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return delegate.isMetricsEnabled(); 
}
}
