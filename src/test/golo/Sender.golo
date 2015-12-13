
module Sender

import io.vertx.core.Verticle

function main = |args| {
    var senderStart = |verticle| {
        let vertx = verticle: getVertx()
        let eb = vertx: eventBus()
        vertx: setPeriodic(1000,|v|{
            eb:send("pingad","ping", |rep|{
                println(rep)
            })
        })
    }
    var stop = |verticle| {
    }
    var factory = io.vertx.lang.golo.GoloVerticleFactory()
    var sender = factory: createGoloVerticle(senderStart, stop)

    let vertx = io.vertx.core.Vertx.vertx()
    vertx: deployVerticle(sender)
}