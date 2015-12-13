package io.vertx.golo.core.dns;

//[Debug] classMethodData = {io.vertx.core.dns.SrvRecord=7} 
//[Debug] arr = [int priority(), int weight(), int port(), java.lang.String name(), java.lang.String protocol(), java.lang.String service(), java.lang.String target()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=3, -1464262615=1985183966, 103027920=-2037401250, -1430344685=970093049} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.dns.SrvRecord 
public class SrvRecord {
//[Debug] toChangeName = {int weight()=false, int port()=false, java.lang.String protocol()=false, java.lang.String name()=false, int priority()=false, java.lang.String target()=false, java.lang.String service()=false}
//[Debug] dbgMethodName = {int weight()=weight, int port()=port, java.lang.String protocol()=protocol, java.lang.String name()=name, int priority()=priority, java.lang.String target()=target, java.lang.String service()=service} 
//[Debug] dbgMethodParams = {int weight()=0, int port()=0, java.lang.String protocol()=0, java.lang.String name()=0, int priority()=0, java.lang.String target()=0, java.lang.String service()=0} 
//[INFO]  methods=[int priority(), int weight(), int port(), java.lang.String name(), java.lang.String protocol(), java.lang.String service(), java.lang.String target()] 
//[INFO]  defaultDataObjectMap={java.lang.String name()=false, java.lang.String protocol()=false, int priority()=false, int port()=false, int weight()=false, java.lang.String service()=false, java.lang.String target()=false} 
//[INFO] ifaceSimpleName=SrvRecord
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=3, -1464262615=1985183966, 103027920=-2037401250, -1430344685=970093049}
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
