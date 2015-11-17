module io.vertx.golo.core.Shareddata

    # void get(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function getByResultHandler =| resultHandler |{
        return void.get()
}
    # void incrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function incrementAndGetByResultHandler =| resultHandler |{
        return void.incrementAndGet()
}
    # void getAndIncrement(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function getAndIncrementByResultHandler =| resultHandler |{
        return void.getAndIncrement()
}
    # void decrementAndGet(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function decrementAndGetByResultHandler =| resultHandler |{
        return void.decrementAndGet()
}
    # void addAndGet(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function addAndGetByValueAndResultHandler =| value , resultHandler |{
        return void.addAndGet()
}
    # void getAndAdd(long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> resultHandler) 
function getAndAddByValueAndResultHandler =| value , resultHandler |{
        return void.getAndAdd()
}
    # void compareAndSet(long expected, long value, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
function compareAndSetByExpectedAndValueAndResultHandler =| expected , value , resultHandler |{
        return void.compareAndSet()
}
