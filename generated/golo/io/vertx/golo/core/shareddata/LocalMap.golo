module io.vertx.golo.core.Shareddata

    # V get(K key) 
function getByKey =| key |{
        return V.get()
}
    # V put(K key, V value) 
function putByKeyAndValue =| key , value |{
        return V.put()
}
    # V remove(K key) 
function removeByKey =| key |{
        return V.remove()
}
    # void clear() 
function clear ={
        return void.clear()
}
    # int size() 
function size ={
        return int.size()
}
    # boolean isEmpty() 
function isEmpty ={
        return boolean.isEmpty()
}
    # V putIfAbsent(K key, V value) 
function putIfAbsentByKeyAndValue =| key , value |{
        return V.putIfAbsent()
}
    # boolean removeIfPresent(K key, V value) 
function removeIfPresentByKeyAndValue =| key , value |{
        return boolean.removeIfPresent()
}
    # boolean replaceIfPresent(K key, V oldValue, V newValue) 
function replaceIfPresentByKeyAndOldValueAndNewValue =| key , oldValue , newValue |{
        return boolean.replaceIfPresent()
}
    # V replace(K key, V value) 
function replaceByKeyAndValue =| key , value |{
        return V.replace()
}
    # void close() 
function close ={
        return void.close()
}
