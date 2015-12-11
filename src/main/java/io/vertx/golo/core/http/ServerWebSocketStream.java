package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.ServerWebSocketStream 
public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {
      private io.vertx.core.http.ServerWebSocketStream delegate;
  public ServerWebSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.http.ServerWebSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public ServerWebSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
  public ServerWebSocketStream handler(Handler<ServerWebSocket> handler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.handle(new io.vertx.golo.core.http.ServerWebSocket(event));
      }
    });
    return this;
  }
  public ServerWebSocketStream pause() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
  public ServerWebSocketStream resume() {
    (  (io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
  public ServerWebSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
