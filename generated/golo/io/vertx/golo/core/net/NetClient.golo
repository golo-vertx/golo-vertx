module io.vertx.golo.core.Net

import io.vertx.core.metrics.Measured
import io.vertx.core.net.NetSocket
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.net.NetClient connect(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> connectHandler) 
function connectByPortAndHostAndConnectHandler =| port , host , connectHandler |{
        return io.vertx.core.net.NetClient.connect()
}
    # void close() 
function close ={
        return void.close()
}
