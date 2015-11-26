package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.dns.MxRecord;
import io.vertx.core.dns.SrvRecord;
// io.vertx.core.dns.DnsClient 
public class DnsClient { 

private io.vertx.core.dns.DnsClient delegate; 
public DnsClient(Object delegate) { 
    this.delegate = (io.vertx.core.dns.DnsClient)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.lookup(name, handler); 
}
// io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.lookup4(name, handler); 
}
// io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.lookup6(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveA(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveAAAA(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveCNAME(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler) 
public io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveMX(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveTXT(name, handler); 
}
// io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolvePTR(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveNS(name, handler); 
}
// io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler) 
public io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.resolveSRV(name, handler); 
}
// io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.dns.DnsClient)delegate.reverseLookup(ipaddress, handler); 
}
}
