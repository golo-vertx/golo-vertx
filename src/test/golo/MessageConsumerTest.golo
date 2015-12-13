module MessageConsumerTest

function main = |args| {
    let vertx = io.vertx.golo.core.Vertx.vertx()
    let eventBus = vertx: eventBus()

    let messageConsumer = eventBus: consumer("blaablaa")
    let bodyStream = messageConsumer: bodyStream()


    vertx: close()
}