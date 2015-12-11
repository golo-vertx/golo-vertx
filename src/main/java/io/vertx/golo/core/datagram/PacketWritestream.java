package io.vertx.golo.core.datagram;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.datagram.PacketWritestream 
public class PacketWritestream implements WriteStream<Buffer> {
      private io.vertx.core.datagram.PacketWritestream delegate;
  public PacketWritestream(Object delegate) {
    this.delegate = (io.vertx.core.datagram.PacketWritestream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.datagram.PacketWritestream#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
  public PacketWritestream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).exceptionHandler(handler);
    return this;
  }
  public PacketWritestream write(Buffer data) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
  public PacketWritestream setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
  public PacketWritestream drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).drainHandler(handler);
    return this;
  }
}
