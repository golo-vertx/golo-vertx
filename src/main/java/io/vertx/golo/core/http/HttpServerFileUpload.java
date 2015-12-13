package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpServerFileUpload=13} 
//[Debug] arr = [io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.HttpServerFileUpload pause(), io.vertx.core.http.HttpServerFileUpload resume(), io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename), java.lang.String filename(), java.lang.String name(), java.lang.String contentType(), java.lang.String contentTransferEncoding(), java.lang.String charset(), long size(), boolean isSizeAvailable()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, 811229422=1339524870, 392135641=-893932788, 1189266932=-27920911, -1896501272=-1637685650, -1622309822=-1314814753} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.HttpServerFileUpload 
public class HttpServerFileUpload implements ReadStream<Buffer> {
//[Debug] toChangeName = {java.lang.String filename()=false, java.lang.String charset()=false, io.vertx.core.http.HttpServerFileUpload resume()=false, java.lang.String contentType()=false, io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.HttpServerFileUpload pause()=false, io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, java.lang.String contentTransferEncoding()=false, boolean isSizeAvailable()=false, long size()=false, io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename)=false, java.lang.String name()=false, io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false}
//[Debug] dbgMethodName = {java.lang.String filename()=filename, java.lang.String charset()=charset, io.vertx.core.http.HttpServerFileUpload resume()=resume, java.lang.String contentType()=contentType, io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.http.HttpServerFileUpload pause()=pause, io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=handler, java.lang.String contentTransferEncoding()=contentTransferEncoding, boolean isSizeAvailable()=isSizeAvailable, long size()=size, io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename)=streamToFileSystem, java.lang.String name()=name, io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler} 
//[Debug] dbgMethodParams = {java.lang.String filename()=0, java.lang.String charset()=0, io.vertx.core.http.HttpServerFileUpload resume()=0, java.lang.String contentType()=0, io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.http.HttpServerFileUpload pause()=0, io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=1, java.lang.String contentTransferEncoding()=0, boolean isSizeAvailable()=0, long size()=0, io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename)=1, java.lang.String name()=0, io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1} 
//[INFO]  methods=[io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler), io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.http.HttpServerFileUpload pause(), io.vertx.core.http.HttpServerFileUpload resume(), io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename), java.lang.String filename(), java.lang.String name(), java.lang.String contentType(), java.lang.String contentTransferEncoding(), java.lang.String charset(), long size(), boolean isSizeAvailable()] 
//[INFO]  defaultDataObjectMap={java.lang.String name()=false, java.lang.String contentType()=false, io.vertx.core.http.HttpServerFileUpload streamToFileSystem(java.lang.String filename)=false, boolean isSizeAvailable()=false, io.vertx.core.http.HttpServerFileUpload resume()=false, java.lang.String filename()=false, io.vertx.core.http.HttpServerFileUpload pause()=false, java.lang.String contentTransferEncoding()=false, io.vertx.core.http.HttpServerFileUpload exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpServerFileUpload handler(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> handler)=false, io.vertx.core.http.HttpServerFileUpload endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, java.lang.String charset()=false, long size()=false} 
//[INFO] ifaceSimpleName=HttpServerFileUpload
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, 811229422=1339524870, 392135641=-893932788, 1189266932=-27920911, -1896501272=-1637685650, -1622309822=-1314814753}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
