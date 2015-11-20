package io.vertx.golo.core.File;

public class FileProps { 

private io.vertx.core.file.FileProps originalInstance; 
// long creationTime() 
public long creationTime() {
        return originalInstance.creationTime(); 
}
// long lastAccessTime() 
public long lastAccessTime() {
        return originalInstance.lastAccessTime(); 
}
// long lastModifiedTime() 
public long lastModifiedTime() {
        return originalInstance.lastModifiedTime(); 
}
// boolean isDirectory() 
public boolean isDirectory() {
        return originalInstance.isDirectory(); 
}
// boolean isOther() 
public boolean isOther() {
        return originalInstance.isOther(); 
}
// boolean isRegularFile() 
public boolean isRegularFile() {
        return originalInstance.isRegularFile(); 
}
// boolean isSymbolicLink() 
public boolean isSymbolicLink() {
        return originalInstance.isSymbolicLink(); 
}
// long size() 
public long size() {
        return originalInstance.size(); 
}
}
