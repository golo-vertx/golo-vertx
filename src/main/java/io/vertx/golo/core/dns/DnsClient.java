package io.vertx.golo.core.dns;

//[Debug] classMethodData = {io.vertx.core.dns.DnsClient=12} 
//[Debug] arr = [io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler), io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler), io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=1, 1577881248=-1547165657} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.dns.DnsClient 
public class DnsClient {
//[Debug] toChangeName = {io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler)=false, io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler)=false}
//[Debug] dbgMethodName = {io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler)=resolveMX, io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=reverseLookup, io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=lookup, io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=resolveA, io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=lookup6, io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=resolveAAAA, io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=resolvePTR, io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=resolveNS, io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=resolveCNAME, io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=lookup4, io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=resolveTXT, io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler)=resolveSRV} 
//[Debug] dbgMethodParams = {io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler)=2, io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=2, io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=2, io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=2, io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=2, io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=2, io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=2, io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=2, io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=2, io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=2, io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=2, io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler)=2} 
//[INFO]  methods=[io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler), io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler), io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler), io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler), io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler)=false, io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler)=false, io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)=false, io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false, io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)=false} 
//[INFO] ifaceSimpleName=DnsClient
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=1, 1577881248=-1547165657}
  private io.vertx.core.dns.DnsClient delegate;
  public DnsClient(Object delegate) {
    this.delegate = (io.vertx.core.dns.DnsClient) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to lookup the A (ipv4) or AAAA (ipv6) record for the given name. The first found will be used.
   * @param name the name to resolve
   * @param handler the {@link io.vertx.golo.core.Handler} to notify with the {@link io.vertx.golo.core.AsyncResult}. The handler will get notified with the resolved address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
   */
  public DnsClient lookup(String name, Handler<AsyncResult<String>> handler) {
    this.delegate.lookup(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to lookup the A (ipv4) record for the given name. The first found will be used.
   * @param name the name to resolve
   * @param handler the  to notify with the {@link io.vertx.golo.core.AsyncResult}. The handler will get notified with the resolved {@link java.net.Inet4Address} if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
   */
  public DnsClient lookup4(String name, Handler<AsyncResult<String>> handler) {
    this.delegate.lookup4(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to lookup the AAAA (ipv6) record for the given name. The first found will be used.
   * @param name the name to resolve
   * @param handler the  to notify with the . The handler will get notified with the resolved {@link java.net.Inet6Address} if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
   */
  public DnsClient lookup6(String name, Handler<AsyncResult<String>> handler) {
    this.delegate.lookup6(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve all A (ipv4) records for the given name.
   * @param name the name to resolve
   * @param handler the {@link io.vertx.golo.core.Handler} to notify with the {@link io.vertx.golo.core.AsyncResult}. The handler will get notified with a {@link java.util.List} that contains all the resolved {@link java.net.Inet4Address}es. If none was found an empty {@link java.util.List} will be used. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
   */
  public DnsClient resolveA(String name, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.resolveA(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve all AAAA (ipv6) records for the given name.
   * @param name the name to resolve
   * @param handler the {@link io.vertx.golo.core.Handler} to notify with the {@link io.vertx.golo.core.AsyncResult}. The handler will get notified with a {@link java.util.List} that contains all the resolved {@link java.net.Inet6Address}es. If none was found an empty {@link java.util.List} will be used. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
   */
  public DnsClient resolveAAAA(String name, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.resolveAAAA(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the CNAME record for the given name.
   * @param name the name to resolve the CNAME for
   * @param handler the  to notify with the . The handler will get notified with the resolved {@link java.lang.String} if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolveCNAME(String name, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.resolveCNAME(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the MX records for the given name.
   * @param name the name for which the MX records should be resolved
   * @param handler the {@link io.vertx.golo.core.Handler} to notify with the {@link io.vertx.golo.core.AsyncResult}. The handler will get notified with a List that contains all resolved {@link io.vertx.golo.core.dns.MxRecord}s, sorted by their {@link io.vertx.golo.core.dns.MxRecord#priority}. If non was found it will get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolveMX(String name, Handler<AsyncResult<List<MxRecord>>> handler) {
    this.delegate.resolveMX(name, new Handler<AsyncResult<List<io.vertx.core.dns.MxRecord>>>() {
      public void handle(AsyncResult<List<io.vertx.core.dns.MxRecord>> event) {
        AsyncResult<List<MxRecord>> f;
        if (event.succeeded()) {
          f = InternalHelper.<List<MxRecord>>result(event.result().stream().map((element) -> {
            return new io.vertx.golo.core.dns.MxRecord(element);
          }).collect(java.util.stream.Collectors.toList()));
        } else {
          f = InternalHelper.<List<MxRecord>>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the TXT records for the given name.
   * @param name the name for which the TXT records should be resolved
   * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved {@link java.lang.String}s. If none was found it will get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolveTXT(String name, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.resolveTXT(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the PTR record for the given name.
   * @param name the name to resolve the PTR for
   * @param handler the  to notify with the . The handler will get notified with the resolved {@link java.lang.String} if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolvePTR(String name, Handler<AsyncResult<String>> handler) {
    this.delegate.resolvePTR(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the NS records for the given name.
   * @param name the name for which the NS records should be resolved
   * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved {@link java.lang.String}s. If none was found it will get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolveNS(String name, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.resolveNS(name, handler);
    return this;
  }
//io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to resolve the SRV records for the given name.
   * @param name the name for which the SRV records should be resolved
   * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved {@link io.vertx.golo.core.dns.SrvRecord}s. If none was found it will get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient resolveSRV(String name, Handler<AsyncResult<List<SrvRecord>>> handler) {
    this.delegate.resolveSRV(name, new Handler<AsyncResult<List<io.vertx.core.dns.SrvRecord>>>() {
      public void handle(AsyncResult<List<io.vertx.core.dns.SrvRecord>> event) {
        AsyncResult<List<SrvRecord>> f;
        if (event.succeeded()) {
          f = InternalHelper.<List<SrvRecord>>result(event.result().stream().map((element) -> {
            return new io.vertx.golo.core.dns.SrvRecord(element);
          }).collect(java.util.stream.Collectors.toList()));
        } else {
          f = InternalHelper.<List<SrvRecord>>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler)
//io.vertx.core.dns.DnsClient
  /**
   * Try to do a reverse lookup of an IP address. This is basically the same as doing trying to resolve a PTR record
   * but allows you to just pass in the IP address and not a valid ptr query string.
   * @param ipaddress the IP address to resolve the PTR for
   * @param handler the  to notify with the . The handler will get notified with the resolved {@link java.lang.String} if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
  public DnsClient reverseLookup(String ipaddress, Handler<AsyncResult<String>> handler) {
    this.delegate.reverseLookup(ipaddress, handler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
