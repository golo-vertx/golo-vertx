package io.vertx.golo.core.dns;

//[Debug] classMethodData = {io.vertx.core.dns.MxRecord=2} 
//[Debug] arr = [int priority(), java.lang.String name()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, 524372693=1836402193, 1172456980=1525883446, -720146891=1094540497, 142342755=1447874915, -813836636=694716595} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.dns.MxRecord 
public class MxRecord {
//[Debug] toChangeName = {java.lang.String name()=false, int priority()=false}
//[Debug] dbgMethodName = {java.lang.String name()=name, int priority()=priority} 
//[Debug] dbgMethodParams = {java.lang.String name()=0, int priority()=0} 
//[INFO]  methods=[int priority(), java.lang.String name()] 
//[INFO]  defaultDataObjectMap={int priority()=false, java.lang.String name()=false} 
//[INFO] ifaceSimpleName=MxRecord
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, 524372693=1836402193, 1172456980=1525883446, -720146891=1094540497, 142342755=1447874915, -813836636=694716595}
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
