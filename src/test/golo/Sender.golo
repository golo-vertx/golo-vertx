
module Sender

import io.vertx.core.Verticle
import io.vertx.core.Vertx
import io.vertx.core.VertxOptions

function main = |args| {
    var senderStart = |verticle| {
        let vertx = verticle: getVertx()
        let eb = vertx: eventBus()
        vertx: setPeriodic(1000,|v|{
            eb:send("pingad","ping", |rep|{
                println(rep: result(): body())
            })
        })
    }
    var stop = |verticle| {
    }
    var factory = io.vertx.lang.golo.GoloVerticleFactory()
    var sender = factory: createGoloVerticle(senderStart, stop)

    Vertx.clusteredVertx(VertxOptions(), |rep|{
            let vertx = rep: result()
            println(vertx)
            vertx: deployVerticle(sender)
        })
}