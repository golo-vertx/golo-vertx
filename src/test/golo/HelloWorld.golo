
module BufferTest

import io.vertx.golo.core.Vertx

function main=|args| {
    let vertx = Vertx.vertx()
    vertx:createHttpServer():requestHandlerHandler(|req| -> req:
    	response():
    	putHeaderNameValue("content-type","text/html"):
    	endChunk("<html><body><h1>Hello from Vertx.x!</h1></body></html>")
    ):listenPort(8080)
    println("Server Running!")
}
