package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.WebSocketStream 
public class WebSocketStream implements ReadStream<WebSocket> {
      private io.vertx.core.http.WebSocketStream delegate;
  public WebSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.http.WebSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.http.WebSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.http.WebSocketStream handler(io.vertx.core.Handler<io.vertx.core.http.WebSocket> handler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream handler(Handler<WebSocket> handler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).handler(new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        handler.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.WebSocketStream pause()
//io.vertx.core.http.WebSocketStream
  public WebSocketStream pause() {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.http.WebSocketStream resume()
//io.vertx.core.http.WebSocketStream
  public WebSocketStream resume() {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.http.WebSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.http.WebSocketStream
  public WebSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.http.WebSocketStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
