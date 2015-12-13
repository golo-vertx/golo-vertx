
module Consumer

import io.vertx.core.Vertx
import io.vertx.core.VertxOptions

function main = |args| {
    println("HEIHEI")
    var consumerStart = |verticle| {
        let vertx = verticle: getVertx()
        let eb = vertx: eventBus()
        eb: consumer("pingad"): handler(|mes|{
            println(mes: body())
            mes: reply("pong")
        })
    }

    var stop = |verticle| {
    }
    var factory = io.vertx.lang.golo.GoloVerticleFactory()
    var consumer = factory: createGoloVerticle(consumerStart, stop)

    println("jou")
    Vertx.clusteredVertx(VertxOptions(), |rep|{
        let vertx = rep: result()
        println(vertx)
        vertx: deployVerticle(consumer)
    })
}