package io.vertx.golo.core.parsetools;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
// Type: io.vertx.core.parsetools.RecordParser 
public class RecordParser {
      private io.vertx.core.parsetools.RecordParser delegate;
  public RecordParser(Object delegate) {
    this.delegate = (io.vertx.core.parsetools.RecordParser) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)
//void
  public void setOutput(Handler<Buffer> output) {
    this.delegate.setOutput(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
  }
//io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)
//io.vertx.core.parsetools.RecordParser
  /**
   * Create a new <code>RecordParser</code> instance, initially in delimited mode, and where the delimiter can be represented
   * by the String <code></code> delim endcoded in latin-1 . Don't use this if your String contains other than latin-1 characters.
   * <p>
   * <code>output</code> Will receive whole records which have been parsed.
   * @param delim the initial delimiter string
   * @param output handler that will receive the output
   * @return 
   */
  public static RecordParser newDelimiteddelimoutput(String delim, Handler<Buffer> output) {
return    InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited(delim, new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    }), io.vertx.golo.core.parsetools.RecordParser.class);
  }
//io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)
//io.vertx.core.parsetools.RecordParser
  /**
   * Create a new <code>RecordParser</code> instance, initially in delimited mode, and where the delimiter can be represented
   * by the <code>Buffer</code> delim.
   * <p>
   * <code>output</code> Will receive whole records which have been parsed.
   * @param delim the initial delimiter buffer
   * @param output handler that will receive the output
   * @return 
   */
  public static RecordParser newDelimiteddelimoutput(Buffer delim, Handler<Buffer> output) {
return    InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newDelimited((io.vertx.core.buffer.Buffer)delim.getDelegate(), new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    }), io.vertx.golo.core.parsetools.RecordParser.class);
  }
//io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)
//io.vertx.core.parsetools.RecordParser
  /**
   * Create a new <code>RecordParser</code> instance, initially in fixed size mode, and where the record size is specified
   * by the <code>size</code> parameter.
   * <p>
   * <code>output</code> Will receive whole records which have been parsed.
   * @param size the initial record size
   * @param output handler that will receive the output
   * @return 
   */
  public static RecordParser newFixed(int size, Handler<Buffer> output) {
return    InternalHelper.safeCreate(io.vertx.core.parsetools.RecordParser.newFixed(size, new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    }), io.vertx.golo.core.parsetools.RecordParser.class);
  }
//void delimitedMode(java.lang.String delim)
//void
  /**
   * Flip the parser into delimited mode, and where the delimiter can be represented
   * by the String <code>delim</code> encoded in latin-1 . Don't use this if your String contains other than latin-1 characters.
   * <p>
   * This method can be called multiple times with different values of delim while data is being parsed.
   * @param delim the new delimeter
   */
  public void delimitedModedelim(String delim) {
    this.delegate.delimitedMode(delim);
  }
//void delimitedMode(io.vertx.core.buffer.Buffer delim)
//void
  /**
   * Flip the parser into delimited mode, and where the delimiter can be represented
   * by the delimiter <code>delim</code>.
   * <p>
   * This method can be called multiple times with different values of delim while data is being parsed.
   * @param delim the new delimiter
   */
  public void delimitedModedelim(Buffer delim) {
    this.delegate.delimitedMode((io.vertx.core.buffer.Buffer)delim.getDelegate());
  }
//void fixedSizeMode(int size)
//void
  /**
   * Flip the parser into fixed size mode, where the record size is specified by <code>size</code> in bytes.
   * <p>
   * This method can be called multiple times with different values of size while data is being parsed.
   * @param size the new record size
   */
  public void fixedSizeMode(int size) {
    this.delegate.fixedSizeMode(size);
  }
//void handle(io.vertx.core.buffer.Buffer buffer)
//void
  /**
   * This method is called to provide the parser with data.
   * @param buffer a chunk of data
   */
  public void handle(Buffer buffer) {
    this.delegate.handle((io.vertx.core.buffer.Buffer)buffer.getDelegate());
  }
}
