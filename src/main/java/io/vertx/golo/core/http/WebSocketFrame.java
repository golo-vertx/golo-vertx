package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
// Type: io.vertx.core.http.WebSocketFrame 
public class WebSocketFrame {
        private io.vertx.core.http.WebSocketFrame delegate; 
    public WebSocketFrame(Object delegate) {
            this.delegate = (io.vertx.core.http.WebSocketFrame) delegate;
      }
    public Object getDelegate() { 
        return delegate; 
    }
                // io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
    // TypeParams: [] 
        public static WebSocketFrame binaryFrame(Buffer data,boolean isFinal) {
                //param classes(remove later):   API   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.binaryFrame(data,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
    }
        // io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal) 
    // TypeParams: [] 
        public static WebSocketFrame textFrame(String str,boolean isFinal) {
                //param classes(remove later):   STRING   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.textFrame(str,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
    }
        // io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal) 
    // TypeParams: [] 
        public static WebSocketFrame continuationFrame(Buffer data,boolean isFinal) {
                //param classes(remove later):   API   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.continuationFrame(data,isFinal), io.vertx.golo.core.http.WebSocketFrame.class); 
    }
        // boolean isText() 
    // TypeParams: [] 
        public boolean isText() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isText(); 
    }
        // boolean isBinary() 
    // TypeParams: [] 
        public boolean isBinary() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isBinary(); 
    }
        // boolean isContinuation() 
    // TypeParams: [] 
        public boolean isContinuation() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isContinuation(); 
    }
        // java.lang.String textData() 
    // TypeParams: [] 
        public String textData() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.textData(); 
    }
        // io.vertx.core.buffer.Buffer binaryData() 
    // TypeParams: [] 
        public Buffer binaryData() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.binaryData(), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // boolean isFinal() 
    // TypeParams: [] 
        public boolean isFinal() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isFinal(); 
    }
        }
