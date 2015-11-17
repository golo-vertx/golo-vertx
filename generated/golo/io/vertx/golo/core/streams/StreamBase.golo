module io.vertx.golo.core.Streams

    # io.vertx.core.streams.StreamBase exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler) 
function exceptionHandlerByHandler =| handler |{
        return io.vertx.core.streams.StreamBase.exceptionHandler()
}
