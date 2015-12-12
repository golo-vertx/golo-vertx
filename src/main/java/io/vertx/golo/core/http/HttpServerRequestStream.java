package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
// {0=9, 853439005=-1024269014, -306084075=398969698, 529811585=1563891943, -1581394312=1228103577, -334702474=-931307345, -2112567160=1113878099, -1262086293=-1169028220, 1435941912=1563542204, 504055332=-318141236} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {
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
}
