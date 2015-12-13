package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpClientResponse=14} 
//[Debug] arr = [io.vertx.core.http.HttpClientResponse resume(), io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.HttpClientResponse pause(), io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), int statusCode(), java.lang.String statusMessage(), io.vertx.core.MultiMap headers(), java.lang.String getHeader(java.lang.String headerName), java.lang.String getTrailer(java.lang.String trailerName), io.vertx.core.MultiMap trailers(), java.util.List<java.lang.String> cookies(), io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler), io.vertx.core.net.NetSocket netSocket()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, 1000468528=1428844081, 1119662584=2027809467, -1154931156=-655977073, 869746586=-1680301120, 397503711=-440716612} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import java.util.List;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.NetSocket;
//[confirm] Type: io.vertx.core.http.HttpClientResponse 
public class HttpClientResponse implements ReadStream<Buffer> {
//[Debug] toChangeName = {io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, java.lang.String getTrailer(java.lang.String trailerName)=false, io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpClientResponse resume()=false, io.vertx.core.http.HttpClientResponse pause()=false, io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, java.lang.String getHeader(java.lang.String headerName)=false, int statusCode()=false, java.lang.String statusMessage()=false, io.vertx.core.net.NetSocket netSocket()=false, io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)=false, io.vertx.core.MultiMap headers()=false, java.util.List<java.lang.String> cookies()=false, io.vertx.core.MultiMap trailers()=false}
//[Debug] dbgMethodName = {io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, java.lang.String getTrailer(java.lang.String trailerName)=getTrailer, io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.http.HttpClientResponse resume()=resume, io.vertx.core.http.HttpClientResponse pause()=pause, io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=handler, java.lang.String getHeader(java.lang.String headerName)=getHeader, int statusCode()=statusCode, java.lang.String statusMessage()=statusMessage, io.vertx.core.net.NetSocket netSocket()=netSocket, io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)=bodyHandler, io.vertx.core.MultiMap headers()=headers, java.util.List<java.lang.String> cookies()=cookies, io.vertx.core.MultiMap trailers()=trailers} 
//[Debug] dbgMethodParams = {io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, java.lang.String getTrailer(java.lang.String trailerName)=1, io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.http.HttpClientResponse resume()=0, io.vertx.core.http.HttpClientResponse pause()=0, io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=1, java.lang.String getHeader(java.lang.String headerName)=1, int statusCode()=0, java.lang.String statusMessage()=0, io.vertx.core.net.NetSocket netSocket()=0, io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)=1, io.vertx.core.MultiMap headers()=0, java.util.List<java.lang.String> cookies()=0, io.vertx.core.MultiMap trailers()=0} 
//[INFO]  methods=[io.vertx.core.http.HttpClientResponse resume(), io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.HttpClientResponse pause(), io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), int statusCode(), java.lang.String statusMessage(), io.vertx.core.MultiMap headers(), java.lang.String getHeader(java.lang.String headerName), java.lang.String getTrailer(java.lang.String trailerName), io.vertx.core.MultiMap trailers(), java.util.List<java.lang.String> cookies(), io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler), io.vertx.core.net.NetSocket netSocket()] 
//[INFO]  defaultDataObjectMap={java.lang.String getHeader(java.lang.String headerName)=false, io.vertx.core.http.HttpClientResponse resume()=false, io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, int statusCode()=false, java.lang.String statusMessage()=false, java.lang.String getTrailer(java.lang.String trailerName)=false, io.vertx.core.http.HttpClientResponse pause()=false, io.vertx.core.MultiMap headers()=false, io.vertx.core.net.NetSocket netSocket()=false, io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)=false, io.vertx.core.MultiMap trailers()=false, io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, java.util.List<java.lang.String> cookies()=false} 
//[INFO] ifaceSimpleName=HttpClientResponse
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, 1000468528=1428844081, 1119662584=2027809467, -1154931156=-655977073, 869746586=-1680301120, 397503711=-440716612}
  private io.vertx.core.http.HttpClientResponse delegate;
  public HttpClientResponse(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpClientResponse) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.HttpClientResponse resume()
//io.vertx.core.http.HttpClientResponse
  public HttpClientResponse resume() {
    (  (io.vertx.core.http.HttpClientResponse) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.HttpClientResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpClientResponse
  public HttpClientResponse exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpClientResponse) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpClientResponse handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.HttpClientResponse
  public HttpClientResponse handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.HttpClientResponse) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClientResponse pause()
//io.vertx.core.http.HttpClientResponse
  public HttpClientResponse pause() {
    (  (io.vertx.core.http.HttpClientResponse) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.HttpClientResponse endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.HttpClientResponse
  public HttpClientResponse endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpClientResponse) this.delegate).endHandler(endHandler);
    return this;
  }
//int statusCode()
//int
  /**
   * @return the status code of the response
   * @return 
   */
  public int statusCode() {
return    this.delegate.statusCode();
  }
//java.lang.String statusMessage()
//java.lang.String
  /**
   * @return the status message of the response
   * @return 
   */
  public String statusMessage() {
return    this.delegate.statusMessage();
  }
//io.vertx.core.MultiMap headers()
//io.vertx.core.MultiMap
  /**
   * @return the headers
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
//java.lang.String getHeader(java.lang.String headerName)
//java.lang.String
  /**
   * Return the first header value with the specified name
   * @param headerName the header name
   * @return the header value
   */
  public String getHeader(String headerName) {
return    this.delegate.getHeader(headerName);
  }
//java.lang.String getTrailer(java.lang.String trailerName)
//java.lang.String
  /**
   * Return the first trailer value with the specified name
   * @param trailerName the trailer name
   * @return the trailer value
   */
  public String getTrailer(String trailerName) {
return    this.delegate.getTrailer(trailerName);
  }
//io.vertx.core.MultiMap trailers()
//io.vertx.core.MultiMap
  /**
   * @return the trailers
   * @return 
   */
  public MultiMap trailers() {
return    InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class);
  }
//java.util.List<java.lang.String> cookies()
//java.util.List<java.lang.String>
  /**
   * @return the Set-Cookie headers (including trailers)
   * @return 
   */
  public List<String> cookies() {
return    this.delegate.cookies();
  }
//io.vertx.core.http.HttpClientResponse bodyHandler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> bodyHandler)
//io.vertx.core.http.HttpClientResponse
  /**
   * Convenience method for receiving the entire request body in one piece.
   * <p>
   * This saves you having to manually set a dataHandler and an endHandler and append the chunks of the body until
   * the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.
   * @param bodyHandler This handler will be called after all the body has been received
   * @return 
   */
  public HttpClientResponse bodyHandler(Handler<Buffer> bodyHandler) {
    this.delegate.bodyHandler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        bodyHandler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.net.NetSocket netSocket()
//io.vertx.core.net.NetSocket
  /**
   * Get a net socket for the underlying connection of this request.
   * <p>
   * USE THIS WITH CAUTION! Writing to the socket directly if you don't know what you're doing can easily break the HTTP protocol
   * <p>
   * One valid use-case for calling this is to receive the {@link io.vertx.golo.core.net.NetSocket} after a HTTP CONNECT was issued to the
   * remote peer and it responded with a status code of 200.
   * @return the net socket
   */
  public NetSocket netSocket() {
return    InternalHelper.safeCreate(this.delegate.netSocket(), io.vertx.golo.core.net.NetSocket.class);
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
