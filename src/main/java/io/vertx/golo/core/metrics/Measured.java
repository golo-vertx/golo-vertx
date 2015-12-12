package io.vertx.golo.core.metrics;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 2060991288=1498482545, -96508658=100327479, -753796142=-345435548, -562927226=-1253014531, 1500141055=-324694211, 775977174=-1319262724, 878084668=-835010890, -255566402=-459390598, 59748179=1713186862, 596072043=1698679210} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.metrics.Measured 
public interface Measured {
public Object getDelegate();
  boolean isMetricsEnabled();
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class MeasuredImpl implements Measured {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 2060991288=1498482545, -96508658=100327479, -753796142=-345435548, -562927226=-1253014531, 1500141055=-324694211, 775977174=-1319262724, 878084668=-835010890, -255566402=-459390598, 59748179=1713186862, 596072043=1698679210}
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
