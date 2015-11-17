module io.vertx.golo.core.Shareddata

    # V get(K key) 
function get =| key |{
        return V.get()
}
    # V put(K key, V value) 
function put =| key , value |{
        return V.put()
}
    # V remove(K key) 
function remove =| key |{
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
function putIfAbsent =| key , value |{
        return V.putIfAbsent()
}
    # boolean removeIfPresent(K key, V value) 
function removeIfPresent =| key , value |{
        return boolean.removeIfPresent()
}
    # boolean replaceIfPresent(K key, V oldValue, V newValue) 
function replaceIfPresent =| key , oldValue , newValue |{
        return boolean.replaceIfPresent()
}
    # V replace(K key, V value) 
function replace =| key , value |{
        return V.replace()
}
    # void close() 
function close ={
        return void.close()
}
