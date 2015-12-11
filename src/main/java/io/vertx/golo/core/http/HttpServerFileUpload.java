package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerFileUpload 
public class HttpServerFileUpload implements ReadStream<Buffer> {
      private io.vertx.core.http.HttpServerFileUpload delegate;
  public HttpServerFileUpload(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerFileUpload) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public HttpServerFileUpload exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).exceptionHandler(handler);
    return this;
  }
  public HttpServerFileUpload handler(Handler<Buffer> handler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).handler(new Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(new io.vertx.golo.core.buffer.Buffer(event));
      }
    });
    return this;
  }
  public HttpServerFileUpload endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).endHandler(endHandler);
    return this;
  }
  public HttpServerFileUpload pause() {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).pause();
    return this;
  }
  public HttpServerFileUpload resume() {
    (  (io.vertx.core.http.HttpServerFileUpload) this.delegate).resume();
    return this;
  }
  /**
   * Stream the content of this upload to the given file on storage.
   * @param filename the name of the file
   * @return 
   */
  public HttpServerFileUpload streamToFileSystem(String filename) {
    this.delegate.streamToFileSystem(filename);
    return this;
  }
  /**
   * @return the filename which was used when upload the file.
   * @return 
   */
  public String filename() {
return    this.delegate.filename();
  }
  /**
   * @return the name of the attribute
   * @return 
   */
  public String name() {
return    this.delegate.name();
  }
  /**
   * @return  the content type for the upload
   * @return 
   */
  public String contentType() {
return    this.delegate.contentType();
  }
  /**
   * @return the contentTransferEncoding for the upload
   * @return 
   */
  public String contentTransferEncoding() {
return    this.delegate.contentTransferEncoding();
  }
  /**
   * @return the charset for the upload
   * @return 
   */
  public String charset() {
return    this.delegate.charset();
  }
  /**
   * The size of the upload may not be available until it is all read.
   * Check {@link io.vertx.golo.core.http.HttpServerFileUpload#isSizeAvailable} to determine this
   * @return the size of the upload (in bytes)
   */
  public long size() {
return    this.delegate.size();
  }
  /**
   * @return true if the size of the upload can be retrieved via {@link io.vertx.golo.core.http.HttpServerFileUpload#size}.
   * @return 
   */
  public boolean isSizeAvailable() {
return    this.delegate.isSizeAvailable();
  }
}
