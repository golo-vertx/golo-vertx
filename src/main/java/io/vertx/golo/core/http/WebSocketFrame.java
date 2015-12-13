package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.WebSocketFrame=9} 
//[Debug] arr = [io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal), io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal), io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal), boolean isText(), boolean isBinary(), boolean isContinuation(), java.lang.String textData(), io.vertx.core.buffer.Buffer binaryData(), boolean isFinal()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, -672966687=2018281257, -1946937977=1463864695, -1391209376=174731946, 1159977707=1211984051, -1478389464=38320071, -1576009718=-403563081, -1052195245=-164753833, -17155082=1236872681, 453035420=-224335113, 1646488142=619826330} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
//[confirm] Type: io.vertx.core.http.WebSocketFrame 
public class WebSocketFrame {
//[Debug] toChangeName = {boolean isFinal()=false, io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal)=false, java.lang.String textData()=false, io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=false, io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=false, io.vertx.core.buffer.Buffer binaryData()=false, boolean isBinary()=false, boolean isText()=false, boolean isContinuation()=false}
//[Debug] dbgMethodName = {boolean isFinal()=isFinal, io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal)=textFrame, java.lang.String textData()=textData, io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=continuationFrame, io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=binaryFrame, io.vertx.core.buffer.Buffer binaryData()=binaryData, boolean isBinary()=isBinary, boolean isText()=isText, boolean isContinuation()=isContinuation} 
//[Debug] dbgMethodParams = {boolean isFinal()=0, io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal)=2, java.lang.String textData()=0, io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=2, io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=2, io.vertx.core.buffer.Buffer binaryData()=0, boolean isBinary()=0, boolean isText()=0, boolean isContinuation()=0} 
//[INFO]  methods=[io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal), io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal), io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal), boolean isText(), boolean isBinary(), boolean isContinuation(), java.lang.String textData(), io.vertx.core.buffer.Buffer binaryData(), boolean isFinal()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=false, boolean isFinal()=false, boolean isContinuation()=false, io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)=false, io.vertx.core.buffer.Buffer binaryData()=false, boolean isText()=false, boolean isBinary()=false, io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal)=false, java.lang.String textData()=false} 
//[INFO] ifaceSimpleName=WebSocketFrame
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, -672966687=2018281257, -1946937977=1463864695, -1391209376=174731946, 1159977707=1211984051, -1478389464=38320071, -1576009718=-403563081, -1052195245=-164753833, -17155082=1236872681, 453035420=-224335113, 1646488142=619826330}
  private io.vertx.core.http.WebSocketFrame delegate;
  public WebSocketFrame(Object delegate) {
    this.delegate = (io.vertx.core.http.WebSocketFrame) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.WebSocketFrame binaryFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)
//io.vertx.core.http.WebSocketFrame
  /**
   * Create a binary WebSocket frame.
   * @param data the data for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame binaryFrame(Buffer data, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.binaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate(), isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
//io.vertx.core.http.WebSocketFrame textFrame(java.lang.String str, boolean isFinal)
//io.vertx.core.http.WebSocketFrame
  /**
   * Create a text WebSocket frame.
   * @param str the string for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame textFrame(String str, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.textFrame(str, isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
//io.vertx.core.http.WebSocketFrame continuationFrame(io.vertx.core.buffer.Buffer data, boolean isFinal)
//io.vertx.core.http.WebSocketFrame
  /**
   * Create a continuation frame
   * @param data the data for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame continuationFrame(Buffer data, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.continuationFrame((io.vertx.core.buffer.Buffer)data.getDelegate(), isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
//boolean isText()
//boolean
  /**
   * @return true if it's a text frame
   * @return 
   */
  public boolean isText() {
return    this.delegate.isText();
  }
//boolean isBinary()
//boolean
  /**
   * @return true if it's a binary frame
   * @return 
   */
  public boolean isBinary() {
return    this.delegate.isBinary();
  }
//boolean isContinuation()
//boolean
  /**
   * @return true if it's a continuation frame
   * @return 
   */
  public boolean isContinuation() {
return    this.delegate.isContinuation();
  }
//java.lang.String textData()
//java.lang.String
  /**
   * @return the content of this frame as a UTF-8 string and returns the
   * converted string. Only use this for text frames.
   * @return 
   */
  public String textData() {
return    this.delegate.textData();
  }
//io.vertx.core.buffer.Buffer binaryData()
//io.vertx.core.buffer.Buffer
  /**
   * @return the data of the frame
   * @return 
   */
  public Buffer binaryData() {
return    InternalHelper.safeCreate(this.delegate.binaryData(), io.vertx.golo.core.buffer.Buffer.class);
  }
//boolean isFinal()
//boolean
  /**
   * @return true if this is the final frame.
   * @return 
   */
  public boolean isFinal() {
return    this.delegate.isFinal();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
