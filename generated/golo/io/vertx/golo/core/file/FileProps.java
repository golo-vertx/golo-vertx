package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.file.FileProps 
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
        //param classes(remove later):  
    return delegate.creationTime(); 
}
// long lastAccessTime() 
public long lastAccessTime() {
        //param classes(remove later):  
    return delegate.lastAccessTime(); 
}
// long lastModifiedTime() 
public long lastModifiedTime() {
        //param classes(remove later):  
    return delegate.lastModifiedTime(); 
}
// boolean isDirectory() 
public boolean isDirectory() {
        //param classes(remove later):  
    return delegate.isDirectory(); 
}
// boolean isOther() 
public boolean isOther() {
        //param classes(remove later):  
    return delegate.isOther(); 
}
// boolean isRegularFile() 
public boolean isRegularFile() {
        //param classes(remove later):  
    return delegate.isRegularFile(); 
}
// boolean isSymbolicLink() 
public boolean isSymbolicLink() {
        //param classes(remove later):  
    return delegate.isSymbolicLink(); 
}
// long size() 
public long size() {
        //param classes(remove later):  
    return delegate.size(); 
}
}
