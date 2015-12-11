package io.vertx.golo.core.http;

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
// Type: io.vertx.core.http.HttpClientRequest 
public class HttpClientRequest implements WriteStream<Buffer>,  ReadStream<HttpClientResponse> {
      private io.vertx.core.http.HttpClientRequest delegate;
  public HttpClientRequest(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpClientRequest) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.http.HttpClientRequest#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
  public HttpClientRequest exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).exceptionHandler(handler);
    return this;
  }
  /**
   * @throws java.lang.IllegalStateException when no response handler is set
   * @param data 
   * @return 
   */
  public HttpClientRequest write(Buffer data) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public HttpClientRequest setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public HttpClientRequest drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).drainHandler(handler);
    return this;
  }
  public HttpClientRequest handler(Handler<HttpClientResponse> handler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).handler(new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        handler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  public HttpClientRequest pause() {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).pause();
    return this;
  }
  public HttpClientRequest resume() {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).resume();
    return this;
  }
  public HttpClientRequest endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpClientRequest) this.delegate).endHandler(endHandler);
    return this;
  }
  /**
   * If chunked is true then the request will be set into HTTP chunked mode
   * @param chunked true if chunked encoding
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest setChunked(boolean chunked) {
    this.delegate.setChunked(chunked);
    return this;
  }
  /**
   * @return Is the request chunked?
   * @return 
   */
  public boolean isChunked() {
return    this.delegate.isChunked();
  }
  /**
   * The HTTP method for the request.
   * @return 
   */
  public HttpMethod method() {
return    this.delegate.method();
  }
  /**
   * @return The URI of the request.
   * @return 
   */
  public String uri() {
return    this.delegate.uri();
  }
  /**
   * @return The HTTP headers
   * @return 
   */
  public MultiMap headers() {
return    InternalHelper.safeCreate(this.delegate.headers(), io.vertx.golo.core.MultiMap.class);
  }
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
  /**
   * Write a {@link java.lang.String} to the request body, encoded as UTF-8.
   * @param chunk 
   * @return @return a reference to this, so the API can be used fluently
   */
  public HttpClientRequest write(String chunk) {
    this.delegate.write(chunk);
    return this;
  }
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
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes a String in UTF-8 encoding
   * @param chunk 
   */
  public void end(String chunk) {
    this.delegate.end(chunk);
  }
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes a String with the specified encoding
   * @param chunk 
   * @param enc 
   */
  public void end(String chunk, String enc) {
    this.delegate.end(chunk, enc);
  }
  /**
   * Same as {@link io.vertx.golo.core.http.HttpClientRequest#end} but writes some data to the request body before ending. If the request is not chunked and
   * no other data has been written then the <code>Content-Length</code> header will be automatically set
   * @param chunk 
   */
  public void end(Buffer chunk) {
    this.delegate.end((io.vertx.core.buffer.Buffer)chunk.getDelegate());
  }
  /**
   * Ends the request. If no data has been written to the request body, and {@link io.vertx.golo.core.http.HttpClientRequest#sendHead} has not been called then
   * the actual request won't get written until this method gets called.
   * <p>
   * Once the request has ended, it cannot be used any more,
   */
  public void end() {
    this.delegate.end();
  }
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
}
