package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
// {0=5, -664287513=702068671, -1766303224=1633498220, 782911656=-431107575, -12025507=-50939818, -1105907621=-1930676396} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
// Type: io.vertx.core.datagram.PacketWritestream 
public class PacketWritestream implements WriteStream<Buffer> {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  private io.vertx.core.datagram.PacketWritestream delegate;
  public PacketWritestream(Object delegate) {
    this.delegate = (io.vertx.core.datagram.PacketWritestream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean writeQueueFull()
//boolean
  /**
   * This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link io.vertx.golo.core.datagram.PacketWritestream#setWriteQueueMaxSize}
   * @return true if write queue is full
   */
  public boolean writeQueueFull() {
return    ((io.vertx.core.streams.WriteStream) this.delegate).writeQueueFull();
  }
//io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.datagram.PacketWritestream
  public PacketWritestream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data)
//io.vertx.core.datagram.PacketWritestream
  public PacketWritestream write(Buffer data) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).write((io.vertx.core.buffer.Buffer)data.getDelegate());
    return this;
  }
//io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize)
//io.vertx.core.datagram.PacketWritestream
  public PacketWritestream setWriteQueueMaxSize(int maxSize) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)
//io.vertx.core.datagram.PacketWritestream
  public PacketWritestream drainHandler(Handler<Void> handler) {
    (  (io.vertx.core.datagram.PacketWritestream) this.delegate).drainHandler(handler);
    return this;
  }
}
