package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpClientRequest=24} 
//[Debug] arr = [boolean writeQueueFull(), io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize), io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler), io.vertx.core.http.HttpClientRequest pause(), io.vertx.core.http.HttpClientRequest resume(), io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.HttpClientRequest setChunked(boolean chunked), boolean isChunked(), io.vertx.core.http.HttpMethod method(), java.lang.String uri(), io.vertx.core.MultiMap headers(), io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc), io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpClientRequest sendHead(), void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end(), io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=7, -1409248687=2065229921, 897351966=-628318453, 1909026062=1066203463, -1805623909=-263885616, -188469352=-1401073420, -776449947=1899274112, 1668501566=-1841776822} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.HttpClientRequest 
public class HttpClientRequest implements WriteStream<Buffer>,  ReadStream<HttpClientResponse> {
//[Debug] toChangeName = {io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, void end(io.vertx.core.buffer.Buffer chunk)=true, void end(java.lang.String chunk, java.lang.String enc)=false, void end()=false, io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)=false, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpMethod method()=false, java.lang.String uri()=false, io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data)=true, io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, boolean writeQueueFull()=false, boolean isChunked()=false, io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)=false, io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)=false, io.vertx.core.http.HttpClientRequest sendHead()=false, io.vertx.core.http.HttpClientRequest pause()=false, io.vertx.core.MultiMap headers()=false, io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpClientRequest resume()=false, void end(java.lang.String chunk)=true, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk)=true, io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)=false}
//[Debug] dbgMethodName = {io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, void end(io.vertx.core.buffer.Buffer chunk)=end, void end(java.lang.String chunk, java.lang.String enc)=end, void end()=end, io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)=putHeader, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)=write, io.vertx.core.http.HttpMethod method()=method, java.lang.String uri()=uri, io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)=continueHandler, io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data)=write, io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, boolean writeQueueFull()=writeQueueFull, boolean isChunked()=isChunked, io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)=setChunked, io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)=handler, io.vertx.core.http.HttpClientRequest sendHead()=sendHead, io.vertx.core.http.HttpClientRequest pause()=pause, io.vertx.core.MultiMap headers()=headers, io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.http.HttpClientRequest resume()=resume, void end(java.lang.String chunk)=end, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk)=write, io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)=setTimeout} 
//[Debug] dbgMethodParams = {io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, void end(io.vertx.core.buffer.Buffer chunk)=1, void end(java.lang.String chunk, java.lang.String enc)=2, void end()=0, io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)=2, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)=2, io.vertx.core.http.HttpMethod method()=0, java.lang.String uri()=0, io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)=1, io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, boolean writeQueueFull()=0, boolean isChunked()=0, io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)=1, io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)=1, io.vertx.core.http.HttpClientRequest sendHead()=0, io.vertx.core.http.HttpClientRequest pause()=0, io.vertx.core.MultiMap headers()=0, io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.http.HttpClientRequest resume()=0, void end(java.lang.String chunk)=1, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk)=1, io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)=1} 
//[INFO]  methods=[boolean writeQueueFull(), io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize), io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler), io.vertx.core.http.HttpClientRequest pause(), io.vertx.core.http.HttpClientRequest resume(), io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.HttpClientRequest setChunked(boolean chunked), boolean isChunked(), io.vertx.core.http.HttpMethod method(), java.lang.String uri(), io.vertx.core.MultiMap headers(), io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk), io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc), io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpClientRequest sendHead(), void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end(), io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)=false, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpMethod method()=false, io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)=false, io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, java.lang.String uri()=false, void end(io.vertx.core.buffer.Buffer chunk)=false, io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)=false, boolean writeQueueFull()=false, boolean isChunked()=false, void end(java.lang.String chunk)=false, void end(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpClientRequest resume()=false, io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)=false, io.vertx.core.http.HttpClientRequest sendHead()=false, io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)=false, io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpClientRequest pause()=false, io.vertx.core.http.HttpClientRequest write(java.lang.String chunk)=false, void end()=false, io.vertx.core.MultiMap headers()=false} 
//[INFO] ifaceSimpleName=HttpClientRequest
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=7, -1409248687=2065229921, 897351966=-628318453, 1909026062=1066203463, -1805623909=-263885616, -188469352=-1401073420, -776449947=1899274112, 1668501566=-1841776822}
  private io.vertx.core.http.HttpClientRequest delegate;
  public HttpClientRequest(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpClientRequest) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.HttpClientRequest#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.http.HttpClientRequest exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpClientRequest write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.HttpClientRequest
  /**
   * @throws java.lang.IllegalStateException when no response handler is set
   * @param data 
   * @return 
   */
  public HttpClientRequest write(Buffer data) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.HttpClientRequest setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.HttpClientRequest drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).drainHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpClientRequest handler(io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> handler)
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest handler(Handler<HttpClientResponse> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).handler(new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        handler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClientRequest pause()
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest pause() {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.HttpClientRequest resume()
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest resume() {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.HttpClientRequest endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.HttpClientRequest
  public HttpClientRequest endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.HttpClientRequest setChunked(boolean chunked)
//io.vertx.core.http.HttpClientRequest
  /**
   * If chunked is true then the request will be set into HTTP chunked mode
   * @param chunked true if chunked encoding
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest setChunked(boolean chunked) {
    this.delegate.setChunked(chunked);
    return this;
  }
//boolean isChunked()
//boolean
  /**
   * @return Is the request chunked?
   * @return 
   */
  public boolean isChunked() {
return    this.delegate.isChunked();
  }
//io.vertx.core.http.HttpMethod method()
//io.vertx.core.http.HttpMethod
  /**
   * The HTTP method for the request.
   * @return 
   */
  public HttpMethod method() {
return    this.delegate.method();
  }
//java.lang.String uri()
//java.lang.String
  /**
   * @return The URI of the request.
   * @return 
   */
  public String uri() {
return    this.delegate.uri();
  }
//io.vertx.core.MultiMap headers()
//io.vertx.core.MultiMap
  /**
   * @return The HTTP headers
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
//io.vertx.core.http.HttpClientRequest putHeader(java.lang.String name, java.lang.String value)
//io.vertx.core.http.HttpClientRequest
  /**
   * Put an HTTP header
   * @param name The header name
   * @param value The header value
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest putHeader(String name, String value) {
    this.delegate.putHeader(name, value);
    return this;
  }
//io.vertx.core.http.HttpClientRequest write(java.lang.String chunk)
//io.vertx.core.http.HttpClientRequest
  /**
   * Write a {@link java.lang.String} to the request body, encoded as UTF-8.
   * @param chunk 
   * @return @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest write(String chunk) {
    this.delegate.write(chunk);
    return this;
  }
//io.vertx.core.http.HttpClientRequest write(java.lang.String chunk, java.lang.String enc)
//io.vertx.core.http.HttpClientRequest
  /**
   * Write a {@link java.lang.String} to the request body, encoded using the encoding <code>enc</code>.
   * @param chunk 
   * @param enc 
   * @return @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest write(String chunk, String enc) {
    this.delegate.write(chunk, enc);
    return this;
  }
//io.vertx.core.http.HttpClientRequest continueHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpClientRequest
  /**
   * If you send an HTTP request with the header <code>Expect</code> set to the value <code>100-continue</code>
   * and the server responds with an interim HTTP response with a status code of <code>100</code> and a continue handler
   * has been set using this method, then the <code>handler</code> will be called.
   * <p>
   * You can then continue to write data to the request body and later end it. This is normally used in conjunction with
   * the {@link io.vertx.golo.core.http.HttpClientRequest#sendHead} method to force the request header to be written before the request has ended.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest continueHandler(Handler<Void> handler) {
    this.delegate.continueHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpClientRequest sendHead()
//io.vertx.core.http.HttpClientRequest
  /**
   * Forces the head of the request to be written before {@link io.vertx.golo.core.http.HttpClientRequest#end} is called on the request or any data is
   * written to it.
   * <p>
   * This is normally used to implement HTTP 100-continue handling, see {@link io.vertx.golo.core.http.HttpClientRequest#continueHandler} for
   * more information.
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest sendHead() {
    this.delegate.sendHead();
    return this;
  }
//void end(java.lang.String chunk)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes a String in UTF-8 encoding
   * @param chunk 
   */
  public void end(String chunk) {
    this.delegate.end(chunk);
  }
//void end(java.lang.String chunk, java.lang.String enc)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes a String with the specified encoding
   * @param chunk 
   * @param enc 
   */
  public void end(String chunk, String enc) {
    this.delegate.end(chunk, enc);
  }
//void end(io.vertx.core.buffer.Buffer chunk)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes some data to the request body before ending. If the request is not chunked and
   * no other data has been written then the <code>Content-Length</code> header will be automatically set
   * @param chunk 
   */
  public void end(Buffer chunk) {
    this.delegate.end((io.vertx.core.buffer.Buffer)chunk.getDelegate());
  }
//void end()
//void
  /**
   * Ends the request. If no data has been written to the request body, and {@link io.vertx.golo.core.http.HttpClientRequest#sendHead} has not been called then
   * the actual request won't get written until this method gets called.
   * <p>
   * Once the request has ended, it cannot be used any more,
   */
  public void end() {
    this.delegate.end();
  }
//io.vertx.core.http.HttpClientRequest setTimeout(long timeoutMs)
//io.vertx.core.http.HttpClientRequest
  /**
   * Set's the amount of time after which if a response is not received {@link java.util.concurrent.TimeoutException}
   * will be sent to the exception handler of this request.
   * <p>
   *  Calling this method more than once
   * has the effect of canceling any existing timeout and starting the timeout from scratch.
   * @param timeoutMs The quantity of time in milliseconds.
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest setTimeout(long timeoutMs) {
    this.delegate.setTimeout(timeoutMs);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
