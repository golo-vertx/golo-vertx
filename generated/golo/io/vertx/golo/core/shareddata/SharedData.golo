module io.vertx.golo.core.Shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.LocalMap
import io.vertx.core.shareddata.Counter
    # <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap]> void getClusterWideMap(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.AsyncMap<K,V>>> resultHandler) 
function getClusterWideMapByNameAndResultHandler =| name , resultHandler |{
        return <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetClusterWideMap],.getClusterWideMap()
}
    # void getLock(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
function getLockByNameAndResultHandler =| name , resultHandler |{
        return void.getLock()
}
    # void getLockWithTimeout(java.lang.String name, long timeout, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Lock>> resultHandler) 
function getLockWithTimeoutByNameAndTimeoutAndResultHandler =| name , timeout , resultHandler |{
        return void.getLockWithTimeout()
}
    # void getCounter(java.lang.String name, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.shareddata.Counter>> resultHandler) 
function getCounterByNameAndResultHandler =| name , resultHandler |{
        return void.getCounter()
}
    # <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap], TypeParamInfo.Method[name=V,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap]> io.vertx.core.shareddata.LocalMap<K,V> getLocalMap(java.lang.String name) 
function getLocalMapByName =| name |{
        return <TypeParamInfo.Method[name=K,typeName=io.vertx.core.shareddata.SharedData,methodNamegetLocalMap],.getLocalMap()
}
