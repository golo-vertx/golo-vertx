package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
// {0=3, -681546637=-2102887915, -1790321453=-1401681401, 1127891013=-298839837} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerFileUpload 
public class HttpServerFileUpload implements ReadStream<Buffer> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  private io.vertx.core.http.HttpServerFileUpload delegate;
  public HttpServerFileUpload(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerFileUpload) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpServerFileUpload
  public HttpServerFileUpload exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)
//io.vertx.core.http.HttpServerFileUpload
  public HttpServerFileUpload handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.HttpServerFileUpload
  public HttpServerFileUpload endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.http.HttpServerFileUpload pause()
//io.vertx.core.http.HttpServerFileUpload
  public HttpServerFileUpload pause() {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.HttpServerFileUpload resume()
//io.vertx.core.http.HttpServerFileUpload
  public HttpServerFileUpload resume() {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename)
//io.vertx.core.http.HttpServerFileUpload
  /**
   * Stream the content of this upload to the given file on storage.
   * @param filename the name of the file
   * @return 
   */
  public HttpServerFileUpload streamToFileSystem(String filename) {
    this.delegate.streamToFileSystem(filename);
    return this;
  }
//java.lang.String filename()
//java.lang.String
  /**
   * @return the filename which was used when upload the file.
   * @return 
   */
  public String filename() {
return    this.delegate.filename();
  }
//java.lang.String name()
//java.lang.String
  /**
   * @return the name of the attribute
   * @return 
   */
  public String name() {
return    this.delegate.name();
  }
//java.lang.String contentType()
//java.lang.String
  /**
   * @return  the content type for the upload
   * @return 
   */
  public String contentType() {
return    this.delegate.contentType();
  }
//java.lang.String contentTransferEncoding()
//java.lang.String
  /**
   * @return the contentTransferEncoding for the upload
   * @return 
   */
  public String contentTransferEncoding() {
return    this.delegate.contentTransferEncoding();
  }
//java.lang.String charset()
//java.lang.String
  /**
   * @return the charset for the upload
   * @return 
   */
  public String charset() {
return    this.delegate.charset();
  }
//long size()
//long
  /**
   * The size of the upload may not be available until it is all read.
   * Check {@link io.vertx.golo.core.http.HttpServerFileUpload#isSizeAvailable} to determine this
   * @return the size of the upload (in bytes)
   */
  public long size() {
return    this.delegate.size();
  }
//boolean isSizeAvailable()
//boolean
  /**
   * @return true if the size of the upload can be retrieved via {@link io.vertx.golo.core.http.HttpServerFileUpload#size}.
   * @return 
   */
  public boolean isSizeAvailable() {
return    this.delegate.isSizeAvailable();
  }
}
