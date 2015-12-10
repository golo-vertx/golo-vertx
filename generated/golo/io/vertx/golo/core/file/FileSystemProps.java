package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps { 

private io.vertx.core.file.FileSystemProps delegate; 
public FileSystemProps(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileSystemProps)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// long totalSpace() 
// TypeParams: [] 
public long totalSpace() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.totalSpace(); 
}
// long unallocatedSpace() 
// TypeParams: [] 
public long unallocatedSpace() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.unallocatedSpace(); 
}
// long usableSpace() 
// TypeParams: [] 
public long usableSpace() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.usableSpace(); 
}
}
