package io.vertx.golo.core.parsetools;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.buffer.Buffer;
// io.vertx.core.parsetools.RecordParser 
public class RecordParser { 

private io.vertx.core.parsetools.RecordParser delegate; 
public RecordParser(Object delegate) { 
    this.delegate = (io.vertx.core.parsetools.RecordParser)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        delegate.setOutput(new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public static RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited(delim,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public static RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited(delim,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public static RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newFixed(size,new Handler<io.vertx.core.buffer.Buffer>() {
                          public void handle(io.vertx.core.buffer.Buffer event) {
output.handle(new io.vertx.golo.core.buffer.Buffer(event));
                          }
                        }), io.vertx.golo.core.parsetools.RecordParser.class); 
}
// void delimitedMode(java.lang.String delim) 
public void delimitedMode(java.lang.String delim) {
        delegate.delimitedMode(delim); 
}
// void delimitedMode(io.vertx.core.buffer.Buffer delim) 
public void delimitedMode(io.vertx.core.buffer.Buffer delim) {
        delegate.delimitedMode(delim); 
}
// void fixedSizeMode(int size) 
public void fixedSizeMode(int size) {
        delegate.fixedSizeMode(size); 
}
// void handle(io.vertx.core.buffer.Buffer buffer) 
public void handle(io.vertx.core.buffer.Buffer buffer) {
        delegate.handle(buffer); 
}
}
