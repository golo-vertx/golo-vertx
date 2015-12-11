package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
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
  /**
   * Create a binary WebSocket frame.
   * @param data the data for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame binaryFrame(Buffer data, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.binaryFrame((io.vertx.core.buffer.Buffer)data.getDelegate(), isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
  /**
   * Create a text WebSocket frame.
   * @param str the string for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame textFrame(String str, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.textFrame(str, isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
  /**
   * Create a continuation frame
   * @param data the data for the frame
   * @param isFinal true if it's the final frame in the WebSocket message
   * @return the frame
   */
  public static WebSocketFrame continuationFrame(Buffer data, boolean isFinal) {
return    InternalHelper.safeCreate(io.vertx.core.http.WebSocketFrame.continuationFrame((io.vertx.core.buffer.Buffer)data.getDelegate(), isFinal), io.vertx.golo.core.http.WebSocketFrame.class);
  }
  /**
   * @return true if it's a text frame
   * @return 
   */
  public boolean isText() {
return    this.delegate.isText();
  }
  /**
   * @return true if it's a binary frame
   * @return 
   */
  public boolean isBinary() {
return    this.delegate.isBinary();
  }
  /**
   * @return true if it's a continuation frame
   * @return 
   */
  public boolean isContinuation() {
return    this.delegate.isContinuation();
  }
  /**
   * @return the content of this frame as a UTF-8 string and returns the
   * converted string. Only use this for text frames.
   * @return 
   */
  public String textData() {
return    this.delegate.textData();
  }
  /**
   * @return the data of the frame
   * @return 
   */
  public Buffer binaryData() {
return    InternalHelper.safeCreate(this.delegate.binaryData(), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * @return true if this is the final frame.
   * @return 
   */
  public boolean isFinal() {
return    this.delegate.isFinal();
  }
}
