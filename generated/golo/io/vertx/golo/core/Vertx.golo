module io.vertx.golo.Core

import io.vertx.core.datagram.DatagramSocket
import io.vertx.core.http.HttpServer
import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.shareddata.SharedData
import io.vertx.core.TimeoutStream
import io.vertx.core.dns.DnsClient
import io.vertx.core.eventbus.EventBus
import io.vertx.core.metrics.Measured
import io.vertx.core.net.NetServer
import io.vertx.core.file.FileSystem
import io.vertx.core.net.NetClient
import io.vertx.core.http.HttpClient
