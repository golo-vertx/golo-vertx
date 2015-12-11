package io.vertx.golo.core.http;

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
  public HttpServerRequestStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).exceptionHandler(handler);
    return this;
  }
  public HttpServerRequestStream handler(Handler<HttpServerRequest> handler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).handler(new Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.handle(new io.vertx.golo.core.http.HttpServerRequest(event));
      }
    });
    return this;
  }
  public HttpServerRequestStream pause() {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).pause();
    return this;
  }
  public HttpServerRequestStream resume() {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).resume();
    return this;
  }
  public HttpServerRequestStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.HttpServerRequestStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
