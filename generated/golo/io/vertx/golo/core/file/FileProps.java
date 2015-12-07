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
public long {
        return (long)delegate.creationTime(); 
}
// long lastAccessTime() 
public long {
        return (long)delegate.lastAccessTime(); 
}
// long lastModifiedTime() 
public long {
        return (long)delegate.lastModifiedTime(); 
}
// boolean isDirectory() 
public boolean {
        return (boolean)delegate.isDirectory(); 
}
// boolean isOther() 
public boolean {
        return (boolean)delegate.isOther(); 
}
// boolean isRegularFile() 
public boolean {
        return (boolean)delegate.isRegularFile(); 
}
// boolean isSymbolicLink() 
public boolean {
        return (boolean)delegate.isSymbolicLink(); 
}
// long size() 
public long {
        return (long)delegate.size(); 
}
}
