package io.vertx.golo.core.dns;

//[Debug] This is a debuging message to check @code{} syntax
// {0=1, 1301863558=513403825} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.dns.MxRecord 
public class MxRecord {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  private io.vertx.core.dns.MxRecord delegate;
  public MxRecord(Object delegate) {
    this.delegate = (io.vertx.core.dns.MxRecord) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//int priority()
//int
  /**
   * The priority of the MX record.
   * @return 
   */
  public int priority() {
return    this.delegate.priority();
  }
//java.lang.String name()
//java.lang.String
  /**
   * The name of the MX record
   * @return 
   */
  public String name() {
return    this.delegate.name();
  }
}
