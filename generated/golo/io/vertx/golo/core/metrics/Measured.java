package io.vertx.golo.core.Metrics;

public class Measured { 

private io.vertx.core.metrics.Measured originalInstance;// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
}
