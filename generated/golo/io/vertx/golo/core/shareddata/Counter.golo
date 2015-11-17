module io.vertx.golo.core.Shareddata

    # void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function get =| resultHandler |{
        return void.get()
}
    # void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function incrementAndGet =| resultHandler |{
        return void.incrementAndGet()
}
    # void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function getAndIncrement =| resultHandler |{
        return void.getAndIncrement()
}
    # void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function decrementAndGet =| resultHandler |{
        return void.decrementAndGet()
}
    # void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function addAndGet =| value , resultHandler |{
        return void.addAndGet()
}
    # void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function getAndAdd =| value , resultHandler |{
        return void.getAndAdd()
}
    # void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
function compareAndSet =| expected , value , resultHandler |{
        return void.compareAndSet()
}
