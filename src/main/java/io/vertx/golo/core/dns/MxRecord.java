package io.vertx.golo.core.dns;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -987476064=2019706114, 806605813=-1920467223, -1861136520=-665497466, 1162618741=-1581571687, 691452477=-2034211695, 1452178898=-338945153, -255627332=252872960, 1612499411=-1417689573} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.dns.MxRecord 
public class MxRecord {
//[INFO] ifaceSimpleName=MxRecord
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -987476064=2019706114, 806605813=-1920467223, -1861136520=-665497466, 1162618741=-1581571687, 691452477=-2034211695, 1452178898=-338945153, -255627332=252872960, 1612499411=-1417689573}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
