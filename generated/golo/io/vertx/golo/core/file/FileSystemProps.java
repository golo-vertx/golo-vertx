package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.file.FileSystemProps 
public class FileSystemProps { 

private io.vertx.core.file.FileSystemProps delegate; 
public FileSystemProps(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileSystemProps)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// long totalSpace() 
public long {
        return (long)delegate.totalSpace(); 
}
// long unallocatedSpace() 
public long {
        return (long)delegate.unallocatedSpace(); 
}
// long usableSpace() 
public long {
        return (long)delegate.usableSpace(); 
}
}
