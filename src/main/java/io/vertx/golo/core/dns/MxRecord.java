package io.vertx.golo.core.dns;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, -253232217=-393782408, 499907624=-1659008230, -1764785206=947612003, -1812337167=912016955, 959907901=-462507927, -1252934438=-937502719, 336669242=196274568, -228660558=-1334839455, -1245672708=-931165996} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.dns.MxRecord 
public class MxRecord {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, -253232217=-393782408, 499907624=-1659008230, -1764785206=947612003, -1812337167=912016955, 959907901=-462507927, -1252934438=-937502719, 336669242=196274568, -228660558=-1334839455, -1245672708=-931165996}
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
