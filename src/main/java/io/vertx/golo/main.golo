module Golo

import io.vertx.core.Vertx

function main = |args| {
    vertx(): createHttpServer(): requestHandler(
        |req| -> req: response(): end("Jou from stylish golo")
    ): listen(8080, |event| -> println("Started server in port 8080"))
}