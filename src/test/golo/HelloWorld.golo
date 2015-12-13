
module HelloWorld

import io.vertx.golo.core.Vertx

function main=|args| {
    let vertx = Vertx.vertx()
    vertx : createHttpServer() : requestHandler(|req| -> req:
    		response():
    		putHeader("content-type","text/plain"):
    		end("Hello from Vertx.x!")
    	) : listen(8080)
}