module io.vertx.golo.Core

    # io.vertx.core.MultiMap caseInsensitiveMultiMap() 
function caseInsensitiveMultiMap ={
        return io.vertx.core.MultiMap.caseInsensitiveMultiMap()
}
    # java.lang.String get(java.lang.String name) 
function getByName =| name |{
        return java.lang.String.get()
}
    # java.util.List<java.lang.String> getAll(java.lang.String name) 
function getAllByName =| name |{
        return java.util.List<java.lang.String>.getAll()
}
    # boolean contains(java.lang.String name) 
function containsByName =| name |{
        return boolean.contains()
}
    # boolean isEmpty() 
function isEmpty ={
        return boolean.isEmpty()
}
    # java.util.Set<java.lang.String> names() 
function names ={
        return java.util.Set<java.lang.String>.names()
}
    # io.vertx.core.MultiMap add(java.lang.String name, java.lang.String value) 
function addByNameAndValue =| name , value |{
        return io.vertx.core.MultiMap.add()
}
    # io.vertx.core.MultiMap addAll(io.vertx.core.MultiMap map) 
function addAllByMap =| map |{
        return io.vertx.core.MultiMap.addAll()
}
    # io.vertx.core.MultiMap set(java.lang.String name, java.lang.String value) 
function setByNameAndValue =| name , value |{
        return io.vertx.core.MultiMap.set()
}
    # io.vertx.core.MultiMap setAll(io.vertx.core.MultiMap map) 
function setAllByMap =| map |{
        return io.vertx.core.MultiMap.setAll()
}
    # io.vertx.core.MultiMap remove(java.lang.String name) 
function removeByName =| name |{
        return io.vertx.core.MultiMap.remove()
}
    # io.vertx.core.MultiMap clear() 
function clear ={
        return io.vertx.core.MultiMap.clear()
}
    # int size() 
function size ={
        return int.size()
}
