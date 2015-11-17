module io.vertx.golo.core.File

    # long creationTime() 
function creationTime ={
        return long.creationTime()
}
    # long lastAccessTime() 
function lastAccessTime ={
        return long.lastAccessTime()
}
    # long lastModifiedTime() 
function lastModifiedTime ={
        return long.lastModifiedTime()
}
    # boolean isDirectory() 
function isDirectory ={
        return boolean.isDirectory()
}
    # boolean isOther() 
function isOther ={
        return boolean.isOther()
}
    # boolean isRegularFile() 
function isRegularFile ={
        return boolean.isRegularFile()
}
    # boolean isSymbolicLink() 
function isSymbolicLink ={
        return boolean.isSymbolicLink()
}
    # long size() 
function size ={
        return long.size()
}
