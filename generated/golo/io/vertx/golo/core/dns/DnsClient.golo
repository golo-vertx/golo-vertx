module io.vertx.golo.core.Dns

import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
    # io.vertx.core.dns.DnsClient lookup(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function lookup =| name , handler |{
        return io.vertx.core.dns.DnsClient.lookup()
}
    # io.vertx.core.dns.DnsClient lookup4(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function lookup4 =| name , handler |{
        return io.vertx.core.dns.DnsClient.lookup4()
}
    # io.vertx.core.dns.DnsClient lookup6(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function lookup6 =| name , handler |{
        return io.vertx.core.dns.DnsClient.lookup6()
}
    # io.vertx.core.dns.DnsClient resolveA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function resolveA =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveA()
}
    # io.vertx.core.dns.DnsClient resolveAAAA(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function resolveAAAA =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveAAAA()
}
    # io.vertx.core.dns.DnsClient resolveCNAME(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function resolveCNAME =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveCNAME()
}
    # io.vertx.core.dns.DnsClient resolveMX(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> handler) 
function resolveMX =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveMX()
}
    # io.vertx.core.dns.DnsClient resolveTXT(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function resolveTXT =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveTXT()
}
    # io.vertx.core.dns.DnsClient resolvePTR(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function resolvePTR =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolvePTR()
}
    # io.vertx.core.dns.DnsClient resolveNS(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function resolveNS =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveNS()
}
    # io.vertx.core.dns.DnsClient resolveSRV(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> handler) 
function resolveSRV =| name , handler |{
        return io.vertx.core.dns.DnsClient.resolveSRV()
}
    # io.vertx.core.dns.DnsClient reverseLookup(java.lang.String ipaddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function reverseLookup =| ipaddress , handler |{
        return io.vertx.core.dns.DnsClient.reverseLookup()
}
