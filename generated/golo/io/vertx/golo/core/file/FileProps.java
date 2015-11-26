package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.file.FileProps 
public class FileProps { 

private io.vertx.core.file.FileProps delegate; 
public FileProps(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileProps)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// long creationTime() 
public long creationTime() {
        return (long)delegate.creationTime(); 
}
// long lastAccessTime() 
public long lastAccessTime() {
        return (long)delegate.lastAccessTime(); 
}
// long lastModifiedTime() 
public long lastModifiedTime() {
        return (long)delegate.lastModifiedTime(); 
}
// boolean isDirectory() 
public boolean isDirectory() {
        return (boolean)delegate.isDirectory(); 
}
// boolean isOther() 
public boolean isOther() {
        return (boolean)delegate.isOther(); 
}
// boolean isRegularFile() 
public boolean isRegularFile() {
        return (boolean)delegate.isRegularFile(); 
}
// boolean isSymbolicLink() 
public boolean isSymbolicLink() {
        return (boolean)delegate.isSymbolicLink(); 
}
// long size() 
public long size() {
        return (long)delegate.size(); 
}
}
