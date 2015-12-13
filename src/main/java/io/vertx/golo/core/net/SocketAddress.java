package io.vertx.golo.core.net;

//[Debug] classMethodData = {io.vertx.core.net.SocketAddress=2} 
//[Debug] arr = [java.lang.String host(), int port()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 1556191440=-783281790, -692910219=-501226917, 84719018=768831487, 1229517406=-1082786835, 1956637832=-1360612956, 1900063531=1161187302, 678453771=1814206777, -386978412=-1848446700, -1954556718=-1060569316, -556103643=-319271604} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.net.SocketAddress 
public class SocketAddress {
//[Debug] toChangeName = {int port()=false, java.lang.String host()=false}
//[Debug] dbgMethodName = {int port()=port, java.lang.String host()=host} 
//[Debug] dbgMethodParams = {int port()=0, java.lang.String host()=0} 
//[INFO]  methods=[java.lang.String host(), int port()] 
//[INFO]  defaultDataObjectMap={int port()=false, java.lang.String host()=false} 
//[INFO] ifaceSimpleName=SocketAddress
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 1556191440=-783281790, -692910219=-501226917, 84719018=768831487, 1229517406=-1082786835, 1956637832=-1360612956, 1900063531=1161187302, 678453771=1814206777, -386978412=-1848446700, -1954556718=-1060569316, -556103643=-319271604}
  private io.vertx.core.net.SocketAddress delegate;
  public SocketAddress(Object delegate) {
    this.delegate = (io.vertx.core.net.SocketAddress) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//java.lang.String host()
//java.lang.String
  public String host() {
return    this.delegate.host();
  }
//int port()
//int
  public int port() {
return    this.delegate.port();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
