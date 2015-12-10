package io.vertx.golo.core.dns;

import io.vertx.lang.golo.InternalHelper;
// Type: io.vertx.core.dns.MxRecord 
public class MxRecord {
        private io.vertx.core.dns.MxRecord delegate; 
    public MxRecord(Object delegate) {
            this.delegate = (io.vertx.core.dns.MxRecord) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // int priority() 
    // TypeParams: [] 
        public int priority() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.priority(); 
    }
        // java.lang.String name() 
    // TypeParams: [] 
        public String name() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.name(); 
    }
        }
