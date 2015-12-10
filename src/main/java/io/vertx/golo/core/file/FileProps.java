package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.file.FileProps 
public class FileProps {
        private io.vertx.core.file.FileProps delegate; 
    public FileProps(Object delegate) {
            this.delegate = (io.vertx.core.file.FileProps) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // long creationTime() 
    // TypeParams: [] 
        public long creationTime() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.creationTime(); 
    }
        // long lastAccessTime() 
    // TypeParams: [] 
        public long lastAccessTime() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.lastAccessTime(); 
    }
        // long lastModifiedTime() 
    // TypeParams: [] 
        public long lastModifiedTime() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.lastModifiedTime(); 
    }
        // boolean isDirectory() 
    // TypeParams: [] 
        public boolean isDirectory() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isDirectory(); 
    }
        // boolean isOther() 
    // TypeParams: [] 
        public boolean isOther() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isOther(); 
    }
        // boolean isRegularFile() 
    // TypeParams: [] 
        public boolean isRegularFile() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isRegularFile(); 
    }
        // boolean isSymbolicLink() 
    // TypeParams: [] 
        public boolean isSymbolicLink() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isSymbolicLink(); 
    }
        // long size() 
    // TypeParams: [] 
        public long size() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.size(); 
    }
        }
