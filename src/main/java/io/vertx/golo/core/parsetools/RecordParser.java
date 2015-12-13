package io.vertx.golo.core.parsetools;

//[Debug] classMethodData = {io.vertx.core.parsetools.RecordParser=8} 
//[Debug] arr = [void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), void delimitedMode(java.lang.String delim), void delimitedMode(io.vertx.core.buffer.Buffer delim), void fixedSizeMode(int size), void handle(io.vertx.core.buffer.Buffer buffer)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, -2010152177=1612810271, 863582187=-211518413, -1757949611=1555571395, -1873301579=-161534010, -501801149=-813473052, 2114119798=1092620234, 724260895=-510901405, -393373510=-345897569, -1857494638=514455166} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.parsetools.RecordParser 
public class RecordParser {
//[Debug] toChangeName = {void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, void delimitedMode(java.lang.String delim)=true, void handle(io.vertx.core.buffer.Buffer buffer)=false, io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=true, void fixedSizeMode(int size)=false, io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=true, io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, void delimitedMode(io.vertx.core.buffer.Buffer delim)=true}
//[Debug] dbgMethodName = {void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=setOutput, void delimitedMode(java.lang.String delim)=delimitedMode, void handle(io.vertx.core.buffer.Buffer buffer)=handle, io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=newDelimited, void fixedSizeMode(int size)=fixedSizeMode, io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=newDelimited, io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=newFixed, void delimitedMode(io.vertx.core.buffer.Buffer delim)=delimitedMode} 
//[Debug] dbgMethodParams = {void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=1, void delimitedMode(java.lang.String delim)=1, void handle(io.vertx.core.buffer.Buffer buffer)=1, io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=2, void fixedSizeMode(int size)=1, io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=2, io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=2, void delimitedMode(io.vertx.core.buffer.Buffer delim)=1} 
//[INFO]  methods=[void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output), void delimitedMode(java.lang.String delim), void delimitedMode(io.vertx.core.buffer.Buffer delim), void fixedSizeMode(int size), void handle(io.vertx.core.buffer.Buffer buffer)] 
//[INFO]  defaultDataObjectMap={void handle(io.vertx.core.buffer.Buffer buffer)=false, void fixedSizeMode(int size)=false, void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output)=false, void delimitedMode(java.lang.String delim)=false, void delimitedMode(io.vertx.core.buffer.Buffer delim)=false} 
//[INFO] ifaceSimpleName=RecordParser
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, -2010152177=1612810271, 863582187=-211518413, -1757949611=1555571395, -1873301579=-161534010, -501801149=-813473052, 2114119798=1092620234, 724260895=-510901405, -393373510=-345897569, -1857494638=514455166}
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
  public static RecordParser newDelimited(String delim, Handler<Buffer> output) {
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
  public static RecordParser newDelimited(Buffer delim, Handler<Buffer> output) {
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
  public void delimitedMode(String delim) {
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
  public void delimitedMode(Buffer delim) {
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
