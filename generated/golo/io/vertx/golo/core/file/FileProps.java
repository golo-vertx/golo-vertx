package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

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
        return delegate.creationTime(); 
}
// long lastAccessTime() 
public long lastAccessTime() {
        return delegate.lastAccessTime(); 
}
// long lastModifiedTime() 
public long lastModifiedTime() {
        return delegate.lastModifiedTime(); 
}
// boolean isDirectory() 
public boolean isDirectory() {
        return delegate.isDirectory(); 
}
// boolean isOther() 
public boolean isOther() {
        return delegate.isOther(); 
}
// boolean isRegularFile() 
public boolean isRegularFile() {
        return delegate.isRegularFile(); 
}
// boolean isSymbolicLink() 
public boolean isSymbolicLink() {
        return delegate.isSymbolicLink(); 
}
// long size() 
public long size() {
        return delegate.size(); 
}
}
