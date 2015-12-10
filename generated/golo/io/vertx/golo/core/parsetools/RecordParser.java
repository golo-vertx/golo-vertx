package io.vertx.golo.core.parsetools;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
// Type: io.vertx.core.parsetools.RecordParser 
public class RecordParser { 

private io.vertx.core.parsetools.RecordParser delegate; 
public RecordParser(Object delegate) { 
    this.delegate = (io.vertx.core.parsetools.RecordParser)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
// TypeParams: [] 
public void setOutput(Handler<Buffer> output) {
        //param classes(remove later):   HANDLER  
    //evenTypes (remove later):    API   
    this.delegate.setOutput(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
// TypeParams: [] 
public static RecordParser newDelimited(String delim,Handler<Buffer> output) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited(delim,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
// TypeParams: [] 
public static RecordParser newDelimited(Buffer delim,Handler<Buffer> output) {
        //param classes(remove later):   API   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited(delim,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
// TypeParams: [] 
public static RecordParser newFixed(int size,Handler<Buffer> output) {
        //param classes(remove later):   PRIMITIVE   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newFixed(size,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// void delimitedMode(java.lang.String delim) 
// TypeParams: [] 
public void delimitedMode(String delim) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    this.delegate.delimitedMode(delim); 
}
// void delimitedMode(io.vertx.core.buffer.Buffer delim) 
// TypeParams: [] 
public void delimitedMode(Buffer delim) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    this.delegate.delimitedMode(delim); 
}
// void fixedSizeMode(int size) 
// TypeParams: [] 
public void fixedSizeMode(int size) {
        //param classes(remove later):   PRIMITIVE  
    //evenTypes (remove later):    
    this.delegate.fixedSizeMode(size); 
}
// void handle(io.vertx.core.buffer.Buffer buffer) 
// TypeParams: [] 
public void handle(Buffer buffer) {
        //param classes(remove later):   API  
    //evenTypes (remove later):    
    this.delegate.handle(buffer); 
}
}
