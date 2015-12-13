package io.vertx.golo.core.http;

//[Debug] classMethodData = {io.vertx.core.http.HttpServerRequestStream=5} 
//[Debug] arr = [io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler), io.vertx.core.http.HttpServerRequestStream pause(), io.vertx.core.http.HttpServerRequestStream resume(), io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, -2035848058=-1407481012, 476713691=-1577718504, -1839581726=653757760, 679526746=-352739915, 1476145266=-585463629} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {
//[Debug] toChangeName = {io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.http.HttpServerRequestStream resume()=false, io.vertx.core.http.HttpServerRequestStream pause()=false, io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=false}
//[Debug] dbgMethodName = {io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.http.HttpServerRequestStream resume()=resume, io.vertx.core.http.HttpServerRequestStream pause()=pause, io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=handler} 
//[Debug] dbgMethodParams = {io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.http.HttpServerRequestStream resume()=0, io.vertx.core.http.HttpServerRequestStream pause()=0, io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=1} 
//[INFO]  methods=[io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler), io.vertx.core.http.HttpServerRequestStream pause(), io.vertx.core.http.HttpServerRequestStream resume(), io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)=false, io.vertx.core.http.HttpServerRequestStream pause()=false, io.vertx.core.http.HttpServerRequestStream resume()=false, io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false} 
//[INFO] ifaceSimpleName=HttpServerRequestStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, -2035848058=-1407481012, 476713691=-1577718504, -1839581726=653757760, 679526746=-352739915, 1476145266=-585463629}
  private io.vertx.core.http.HttpServerRequestStream delegate;
  public HttpServerRequestStream(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerRequestStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.HttpServerRequestStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.HttpServerRequestStream
  public HttpServerRequestStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.HttpServerRequestStream handler(io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> handler)
//io.vertx.core.http.HttpServerRequestStream
  public HttpServerRequestStream handler(Handler<HttpServerRequest> handler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).handler(new Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpServerRequestStream pause()
//io.vertx.core.http.HttpServerRequestStream
  public HttpServerRequestStream pause() {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.HttpServerRequestStream resume()
//io.vertx.core.http.HttpServerRequestStream
  public HttpServerRequestStream resume() {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.HttpServerRequestStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.HttpServerRequestStream
  public HttpServerRequestStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).endHandler(endHandler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
