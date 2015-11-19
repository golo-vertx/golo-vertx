package io.vertx.golo.core.File;

public class FileSystemProps { 

private io.vertx.core.file.FileSystemProps originalInstance;// long totalSpace() 
public long totalSpace() {
        return originalInstance.totalSpace(); 
}
// long unallocatedSpace() 
public long unallocatedSpace() {
        return originalInstance.unallocatedSpace(); 
}
// long usableSpace() 
public long usableSpace() {
        return originalInstance.usableSpace(); 
}
}
