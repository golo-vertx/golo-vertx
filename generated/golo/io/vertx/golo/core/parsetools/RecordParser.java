package io.vertx.golo.core.Parsetools;

import io.vertx.core.buffer.Buffer;
public class RecordParser { 

private io.vertx.core.parsetools.RecordParser originalInstance; 
// void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return originalInstance.setOutput(output); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return originalInstance.newDelimited(delim, output); 
}
// io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return originalInstance.newDelimited(delim, output); 
}
// io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
public io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) {
        return originalInstance.newFixed(size, output); 
}
// void delimitedMode(java.lang.String delim) 
public void delimitedMode(java.lang.String delim) {
        return originalInstance.delimitedMode(delim); 
}
// void delimitedMode(io.vertx.core.buffer.Buffer delim) 
public void delimitedMode(io.vertx.core.buffer.Buffer delim) {
        return originalInstance.delimitedMode(delim); 
}
// void fixedSizeMode(int size) 
public void fixedSizeMode(int size) {
        return originalInstance.fixedSizeMode(size); 
}
// void handle(io.vertx.core.buffer.Buffer buffer) 
public void handle(io.vertx.core.buffer.Buffer buffer) {
        return originalInstance.handle(buffer); 
}
}
