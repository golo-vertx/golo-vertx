
module Consumer

import io.vertx.core.Verticle

function main = |args| {
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

    let vertx = io.vertx.core.Vertx.vertx()
    vertx: deployVerticle(consumer)


    let powerOfPairs = powerOfPairs: filter(|x| -> (x % 2) == 0): map(|x| -> x * 2)

}