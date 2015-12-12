package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 1893785680=1106428157, 931410720=2131142180, 20838184=-217646958, -1465189521=-166793369, -379670648=1201255854, 8981070=-2067680207, 2039127821=-248822382, 829267562=-124754138, -996019352=922801315, 1090774751=-34951580} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
// Type: io.vertx.core.http.WebSocketFrame 
public class WebSocketFrame {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 1893785680=1106428157, 931410720=2131142180, 20838184=-217646958, -1465189521=-166793369, -379670648=1201255854, 8981070=-2067680207, 2039127821=-248822382, 829267562=-124754138, -996019352=922801315, 1090774751=-34951580}
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
}
