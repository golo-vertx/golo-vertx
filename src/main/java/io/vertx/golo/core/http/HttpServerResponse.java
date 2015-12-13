package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpServerResponse=35} 
//[Debug] arr = [boolean writeQueueFull(), io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize), io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler), int getStatusCode(), io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode), java.lang.String getStatusMessage(), io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage), io.vertx.core.http.HttpServerResponse setChunked(boolean chunked), boolean isChunked(), io.vertx.core.MultiMap headers(), io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap trailers(), io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value), io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc), io.vertx.core.http.HttpServerResponse write(java.lang.String chunk), io.vertx.core.http.HttpServerResponse writeContinue(), void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end(), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), void close(), boolean ended(), boolean closed(), boolean headWritten(), io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1246513182=-1767059914, -1503739636=-1682167193, 81404195=-309379202, 840587473=-1292185259, -889494976=1051399350, 1379044559=655576989, -96937787=1860704725, -855508548=-901943111} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.HttpServerResponse 
public class HttpServerResponse implements WriteStream<Buffer> {
//[Debug] toChangeName = {io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, int getStatusCode()=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=true, boolean headWritten()=false, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk)=true, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset)=true, io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=false, java.lang.String getStatusMessage()=false, boolean closed()=false, boolean writeQueueFull()=false, io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value)=false, io.vertx.core.MultiMap headers()=false, io.vertx.core.http.HttpServerResponse writeContinue()=false, void end(java.lang.String chunk)=true, boolean isChunked()=false, io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length)=true, boolean ended()=false, void end()=false, io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename)=false, io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize)=false, void end(io.vertx.core.buffer.Buffer chunk)=true, io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data)=true, void close()=false, io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode)=false, io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, void end(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage)=false, io.vertx.core.MultiMap trailers()=false, io.vertx.core.http.HttpServerResponse setChunked(boolean chunked)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=true}
//[Debug] dbgMethodName = {io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, int getStatusCode()=getStatusCode, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=sendFile, boolean headWritten()=headWritten, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk)=write, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc)=write, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset)=sendFile, io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=bodyEndHandler, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=sendFile, java.lang.String getStatusMessage()=getStatusMessage, boolean closed()=closed, boolean writeQueueFull()=writeQueueFull, io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value)=putTrailer, io.vertx.core.MultiMap headers()=headers, io.vertx.core.http.HttpServerResponse writeContinue()=writeContinue, void end(java.lang.String chunk)=end, boolean isChunked()=isChunked, io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value)=putHeader, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length)=sendFile, boolean ended()=ended, void end()=end, io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=closeHandler, io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename)=sendFile, io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, void end(io.vertx.core.buffer.Buffer chunk)=end, io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data)=write, void close()=close, io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode)=setStatusCode, io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=headersEndHandler, void end(java.lang.String chunk, java.lang.String enc)=end, io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage)=setStatusMessage, io.vertx.core.MultiMap trailers()=trailers, io.vertx.core.http.HttpServerResponse setChunked(boolean chunked)=setChunked, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=sendFile} 
//[Debug] dbgMethodParams = {io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, int getStatusCode()=0, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=3, boolean headWritten()=0, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk)=1, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc)=2, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset)=2, io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=4, java.lang.String getStatusMessage()=0, boolean closed()=0, boolean writeQueueFull()=0, io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value)=2, io.vertx.core.MultiMap headers()=0, io.vertx.core.http.HttpServerResponse writeContinue()=0, void end(java.lang.String chunk)=1, boolean isChunked()=0, io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value)=2, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length)=3, boolean ended()=0, void end()=0, io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename)=1, io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize)=1, void end(io.vertx.core.buffer.Buffer chunk)=1, io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data)=1, void close()=0, io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode)=1, io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, void end(java.lang.String chunk, java.lang.String enc)=2, io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage)=1, io.vertx.core.MultiMap trailers()=0, io.vertx.core.http.HttpServerResponse setChunked(boolean chunked)=1, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=2} 
//[INFO]  methods=[boolean writeQueueFull(), io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data), io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize), io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler), int getStatusCode(), io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode), java.lang.String getStatusMessage(), io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage), io.vertx.core.http.HttpServerResponse setChunked(boolean chunked), boolean isChunked(), io.vertx.core.MultiMap headers(), io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value), io.vertx.core.MultiMap trailers(), io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value), io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc), io.vertx.core.http.HttpServerResponse write(java.lang.String chunk), io.vertx.core.http.HttpServerResponse writeContinue(), void end(java.lang.String chunk), void end(java.lang.String chunk, java.lang.String enc), void end(io.vertx.core.buffer.Buffer chunk), void end(), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler), void close(), boolean ended(), boolean closed(), boolean headWritten(), io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler), io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)] 
//[INFO]  defaultDataObjectMap={boolean isChunked()=false, io.vertx.core.MultiMap trailers()=false, io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, void end(java.lang.String chunk, java.lang.String enc)=false, boolean headWritten()=false, io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset)=false, io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk)=false, io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, boolean closed()=false, io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data)=false, void end(java.lang.String chunk)=false, io.vertx.core.http.HttpServerResponse setChunked(boolean chunked)=false, boolean writeQueueFull()=false, io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=false, io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc)=false, io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value)=false, io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value)=false, void end(io.vertx.core.buffer.Buffer chunk)=false, io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, void close()=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length)=false, java.lang.String getStatusMessage()=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)=false, io.vertx.core.MultiMap headers()=false, boolean ended()=false, void end()=false, io.vertx.core.http.HttpServerResponse writeContinue()=false, int getStatusCode()=false, io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename)=false} 
//[INFO] ifaceSimpleName=HttpServerResponse
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1246513182=-1767059914, -1503739636=-1682167193, 81404195=-309379202, 840587473=-1292185259, -889494976=1051399350, 1379044559=655576989, -96937787=1860704725, -855508548=-901943111}
  private io.vertx.core.http.HttpServerResponse delegate;
  public HttpServerResponse(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerResponse) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.HttpServerResponse#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.http.HttpServerResponse exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpServerResponse
  public HttpServerResponse exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerResponse) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerResponse write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.http.HttpServerResponse
  public HttpServerResponse write(Buffer data) {
    (  (io.vertx.core.http.HttpServerResponse) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.http.HttpServerResponse setWriteQueueMaxSize(int maxSize)
//io.vertx.core.http.HttpServerResponse
  public HttpServerResponse setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.HttpServerResponse) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.http.HttpServerResponse drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpServerResponse
  public HttpServerResponse drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.HttpServerResponse) this.delegate).drainHandler(handler);
    return this;
  }
//int getStatusCode()
//int
  /**
   * @return the HTTP status code of the response. The default is <code>200</code> representing <code>OK</code>.
   * @return 
   */
  public int getStatusCode() {
return    this.delegate.getStatusCode();
  }
//io.vertx.core.http.HttpServerResponse setStatusCode(int statusCode)
//io.vertx.core.http.HttpServerResponse
  /**
   * Set the status code. If the status message hasn't been explicitly set, a default status message corresponding
   * to the code will be looked-up and used.
   * @param statusCode 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse setStatusCode(int statusCode) {
    this.delegate.setStatusCode(statusCode);
    return this;
  }
//java.lang.String getStatusMessage()
//java.lang.String
  /**
   * @return the HTTP status message of the response. If this is not specified a default value will be used depending on what
   * {@link io.vertx.golo.core.http.HttpServerResponse#setStatusCode} has been set to.
   * @return 
   */
  public String getStatusMessage() {
return    this.delegate.getStatusMessage();
  }
//io.vertx.core.http.HttpServerResponse setStatusMessage(java.lang.String statusMessage)
//io.vertx.core.http.HttpServerResponse
  /**
   * Set the status message
   * @param statusMessage 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse setStatusMessage(String statusMessage) {
    this.delegate.setStatusMessage(statusMessage);
    return this;
  }
//io.vertx.core.http.HttpServerResponse setChunked(boolean chunked)
//io.vertx.core.http.HttpServerResponse
  /**
   * If <code>chunked</code> is <code>true</code>, this response will use HTTP chunked encoding, and each call to write to the body
   * will correspond to a new HTTP chunk sent on the wire.
   * <p>
   * If chunked encoding is used the HTTP header <code>Transfer-Encoding</code> with a value of <code>Chunked</code> will be
   * automatically inserted in the response.
   * <p>
   * If <code>chunked</code> is <code>false</code>, this response will not use HTTP chunked encoding, and therefore the total size
   * of any data that is written in the respone body must be set in the <code>Content-Length</code> header <b>before</b> any
   * data is written out.
   * <p>
   * An HTTP chunked response is typically used when you do not know the total size of the request body up front.
   * @param chunked 
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse setChunked(boolean chunked) {
    this.delegate.setChunked(chunked);
    return this;
  }
//boolean isChunked()
//boolean
  /**
   * @return is the response chunked?
   * @return 
   */
  public boolean isChunked() {
return    this.delegate.isChunked();
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
//io.vertx.core.http.HttpServerResponse putHeader(java.lang.String name, java.lang.String value)
//io.vertx.core.http.HttpServerResponse
  /**
   * Put an HTTP header
   * @param name the header name
   * @param value the header value.
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse putHeader(String name, String value) {
    this.delegate.putHeader(name, value);
    return this;
  }
//io.vertx.core.MultiMap trailers()
//io.vertx.core.MultiMap
  /**
   * @return The HTTP trailers
   * @return 
   */
  public MultiMap trailers() {
return    InternalHelper.safeCreate(this.delegate.trailers(), io.vertx.golo.core.MultiMap.class);
  }
//io.vertx.core.http.HttpServerResponse putTrailer(java.lang.String name, java.lang.String value)
//io.vertx.core.http.HttpServerResponse
  /**
   * Put an HTTP trailer
   * @param name the trailer name
   * @param value the trailer value
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse putTrailer(String name, String value) {
    this.delegate.putTrailer(name, value);
    return this;
  }
//io.vertx.core.http.HttpServerResponse closeHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Set a close handler for the response. This will be called if the underlying connection closes before the response
   * is complete.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse closeHandler(Handler<Void> handler) {
    this.delegate.closeHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerResponse write(java.lang.String chunk, java.lang.String enc)
//io.vertx.core.http.HttpServerResponse
  /**
   * Write a {@link java.lang.String} to the response body, encoded using the encoding <code>enc</code>.
   * @param chunk the string to write
   * @param enc the encoding to use
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse write(String chunk, String enc) {
    this.delegate.write(chunk, enc);
    return this;
  }
//io.vertx.core.http.HttpServerResponse write(java.lang.String chunk)
//io.vertx.core.http.HttpServerResponse
  /**
   * Write a {@link java.lang.String} to the response body, encoded in UTF-8.
   * @param chunk the string to write
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse write(String chunk) {
    this.delegate.write(chunk);
    return this;
  }
//io.vertx.core.http.HttpServerResponse writeContinue()
//io.vertx.core.http.HttpServerResponse
  /**
   * Used to write an interim 100 Continue response to signify that the client should send the rest of the request.
   * Must only be used if the request contains an "Expect:100-Continue" header
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse writeContinue() {
    this.delegate.writeContinue();
    return this;
  }
//void end(java.lang.String chunk)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpServerResponse#end} but writes a String in UTF-8 encoding before ending the response.
   * @param chunk the string to write before ending the response
   */
  public void end(String chunk) {
    this.delegate.end(chunk);
  }
//void end(java.lang.String chunk, java.lang.String enc)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpServerResponse#end} but writes a String with the specified encoding before ending the response.
   * @param chunk the string to write before ending the response
   * @param enc the encoding to use
   */
  public void end(String chunk, String enc) {
    this.delegate.end(chunk, enc);
  }
//void end(io.vertx.core.buffer.Buffer chunk)
//void
  /**
   * Same as {@link io.vertx.golo.core.http.HttpServerResponse#end} but writes some data to the response body before ending. If the response is not chunked and
   * no other data has been written then the @code{Content-Length} header will be automatically set.
   * @param chunk the buffer to write before ending the response
   */
  public void end(Buffer chunk) {
    this.delegate.end((io.vertx.core.buffer.Buffer)chunk.getDelegate());
  }
//void end()
//void
  /**
   * Ends the response. If no data has been written to the response body,
   * the actual response won't get written until this method gets called.
   * <p>
   * Once the response has ended, it cannot be used any more.
   */
  public void end() {
    this.delegate.end();
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename)
//io.vertx.core.http.HttpServerResponse
  /**
   * Same as {@link io.vertx.golo.core.http.HttpServerResponse#sendFile} using offset @code{0} which means starting from the beginning of the file.
   * @param filename path to the file to serve
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename) {
    this.delegate.sendFile(filename);
    return this;
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset)
//io.vertx.core.http.HttpServerResponse
  /**
   * Same as {@link io.vertx.golo.core.http.HttpServerResponse#sendFile} using length @code{Long.MAX_VALUE} which means until the end of the
   * file.
   * @param filename path to the file to serve
   * @param offset offset to start serving from
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename, long offset) {
    this.delegate.sendFile(filename, offset);
    return this;
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length)
//io.vertx.core.http.HttpServerResponse
  /**
   * Ask the OS to stream a file as specified by <code>filename</code> directly
   * from disk to the outgoing connection, bypassing userspace altogether
   * (where supported by the underlying operating system.
   * This is a very efficient way to serve files.<p>
   * The actual serve is asynchronous and may not complete until some time after this method has returned.
   * @param filename path to the file to serve
   * @param offset offset to start serving from
   * @param length length to serve to
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename, long offset, long length) {
    this.delegate.sendFile(filename, offset, length);
    return this;
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Like {@link io.vertx.golo.core.http.HttpServerResponse#sendFile} but providing a handler which will be notified once the file has been completely
   * written to the wire.
   * @param filename path to the file to serve
   * @param resultHandler handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, resultHandler);
    return this;
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Like {@link io.vertx.golo.core.http.HttpServerResponse#sendFile} but providing a handler which will be notified once the file has been completely
   * written to the wire.
   * @param filename path to the file to serve
   * @param offset the offset to serve from
   * @param resultHandler handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename, long offset, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, offset, resultHandler);
    return this;
  }
//io.vertx.core.http.HttpServerResponse sendFile(java.lang.String filename, long offset, long length, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> resultHandler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Like {@link io.vertx.golo.core.http.HttpServerResponse#sendFile} but providing a handler which will be notified once the file has been
   * completely written to the wire.
   * @param filename path to the file to serve
   * @param offset the offset to serve from
   * @param length the length to serve to
   * @param resultHandler handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse sendFile(String filename, long offset, long length, Handler<AsyncResult<Void>> resultHandler) {
    this.delegate.sendFile(filename, offset, length, resultHandler);
    return this;
  }
//void close()
//void
  /**
   * Close the underlying TCP connection corresponding to the request.
   */
  public void close() {
    this.delegate.close();
  }
//boolean ended()
//boolean
  /**
   * @return has the response already ended?
   * @return 
   */
  public boolean ended() {
return    this.delegate.ended();
  }
//boolean closed()
//boolean
  /**
   * @return has the underlying TCP connection corresponding to the request already been closed?
   * @return 
   */
  public boolean closed() {
return    this.delegate.closed();
  }
//boolean headWritten()
//boolean
  /**
   * @return have the headers for the response already been written?
   * @return 
   */
  public boolean headWritten() {
return    this.delegate.headWritten();
  }
//io.vertx.core.http.HttpServerResponse headersEndHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Provide a handler that will be called just before the headers are written to the wire.<p>
   * This provides a hook allowing you to add any more headers or do any more operations before this occurs.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse headersEndHandler(Handler<Void> handler) {
    this.delegate.headersEndHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerResponse bodyEndHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.http.HttpServerResponse
  /**
   * Provide a handler that will be called just before the last part of the body is written to the wire
   * and the response is ended.<p>
   * This provides a hook allowing you to do any more operations before this occurs.
   * @param handler the handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpServerResponse bodyEndHandler(Handler<Void> handler) {
    this.delegate.bodyEndHandler(handler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
