package io.vertx.golo.core.http;

//[Debug] This is a debuging message to check @code{} syntax
// {0=3, -452614573=-1505135961, 1707100327=-588745023, 722247523=-1363302829} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpServerRequestStream 
public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
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
