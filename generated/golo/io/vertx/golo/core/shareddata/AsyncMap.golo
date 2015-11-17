module io.vertx.golo.core.Shareddata

    # void get(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
function getByKAndResultHandler =| k , resultHandler |{
        return void.get()
}
    # void put(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function putByKAndVAndCompletionHandler =| k , v , completionHandler |{
        return void.put()
}
    # void put(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> completionHandler) 
function putByKAndVAndTtlAndCompletionHandler =| k , v , ttl , completionHandler |{
        return void.put()
}
    # void putIfAbsent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
function putIfAbsentByKAndVAndCompletionHandler =| k , v , completionHandler |{
        return void.putIfAbsent()
}
    # void putIfAbsent(K k, V v, long ttl, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> completionHandler) 
function putIfAbsentByKAndVAndTtlAndCompletionHandler =| k , v , ttl , completionHandler |{
        return void.putIfAbsent()
}
    # void remove(K k, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
function removeByKAndResultHandler =| k , resultHandler |{
        return void.remove()
}
    # void removeIfPresent(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
function removeIfPresentByKAndVAndResultHandler =| k , v , resultHandler |{
        return void.removeIfPresent()
}
    # void replace(K k, V v, io.vertx.core.Handler<io.vertx.core.AsyncResult<V>> resultHandler) 
function replaceByKAndVAndResultHandler =| k , v , resultHandler |{
        return void.replace()
}
    # void replaceIfPresent(K k, V oldValue, V newValue, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> resultHandler) 
function replaceIfPresentByKAndOldValueAndNewValueAndResultHandler =| k , oldValue , newValue , resultHandler |{
        return void.replaceIfPresent()
}
    # void clear(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler) 
function clearByResultHandler =| resultHandler |{
        return void.clear()
}
    # void size(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> resultHandler) 
function sizeByResultHandler =| resultHandler |{
        return void.size()
}
