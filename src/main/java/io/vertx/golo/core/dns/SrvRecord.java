package io.vertx.golo.core.dns;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=2, 1601707923=-1770081414, -1361472012=1171129562} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.dns.SrvRecord 
public class SrvRecord {
//[INFO] ifaceSimpleName=SrvRecord
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=2, 1601707923=-1770081414, -1361472012=1171129562}
  private io.vertx.core.dns.SrvRecord delegate;
  public SrvRecord(Object delegate) {
    this.delegate = (io.vertx.core.dns.SrvRecord) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//int priority()
//int
  /**
   * Returns the priority for this service record.
   * @return 
   */
  public int priority() {
return    this.delegate.priority();
  }
//int weight()
//int
  /**
   * Returns the weight of this service record.
   * @return 
   */
  public int weight() {
return    this.delegate.weight();
  }
//int port()
//int
  /**
   * Returns the port the service is running on.
   * @return 
   */
  public int port() {
return    this.delegate.port();
  }
//java.lang.String name()
//java.lang.String
  /**
   * Returns the name for the server being queried.
   * @return 
   */
  public String name() {
return    this.delegate.name();
  }
//java.lang.String protocol()
//java.lang.String
  /**
   * Returns the protocol for the service being queried (i.e. "_tcp").
   * @return 
   */
  public String protocol() {
return    this.delegate.protocol();
  }
//java.lang.String service()
//java.lang.String
  /**
   * Returns the service's name (i.e. "_http").
   * @return 
   */
  public String service() {
return    this.delegate.service();
  }
//java.lang.String target()
//java.lang.String
  /**
   * Returns the name of the host for the service.
   * @return 
   */
  public String target() {
return    this.delegate.target();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
