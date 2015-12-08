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
public DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.lookup(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.lookup4(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.lookup6(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveA(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveAAAA(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveCNAME(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler) 
public DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveMX(name,new Handler<AsyncResult<List<io.vertx.core.dns.MxRecord>>>() {
         public void handle(AsyncResult<List<io.vertx.core.dns.MxRecord>> event) {
           AsyncResult<List<MxRecord>> f;
           if (event.succeeded()) {
             f = InternalHelper.<List<MxRecord>>result(event.result().collect({
            io.vertx.core.dns.MxRecord element ->
            new io.vertx.golo.core.dns.MxRecord(element)
          }) as List);
           } else {
             f = InternalHelper.<List<MxRecord>>failure(event.cause());
           }
handler.handle(f);
         }
       }), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveTXT(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolvePTR(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveNS(name,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler) 
public DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler) {
        return InternalHelper.safeCreate(this.delegate.resolveSRV(name,new Handler<AsyncResult<List<io.vertx.core.dns.SrvRecord>>>() {
         public void handle(AsyncResult<List<io.vertx.core.dns.SrvRecord>> event) {
           AsyncResult<List<SrvRecord>> f;
           if (event.succeeded()) {
             f = InternalHelper.<List<SrvRecord>>result(event.result().collect({
            io.vertx.core.dns.SrvRecord element ->
            new io.vertx.golo.core.dns.SrvRecord(element)
          }) as List);
           } else {
             f = InternalHelper.<List<SrvRecord>>failure(event.cause());
           }
handler.handle(f);
         }
       }), io.vertx.golo.core.dns.DnsClient.class); 
}
// io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.reverseLookup(ipaddress,handler), io.vertx.golo.core.dns.DnsClient.class); 
}
}
