package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=9, 1777822023=-1951822771, 1159369883=759285222, -1661022657=1988280886, 1061343905=-918517439, 2120574489=-537829206, -478311088=422814837, -1546322806=-1640617327, 1844116756=-347016953, 687174698=604457935} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.datagram.PacketWritestream 
public class PacketWritestream implements WriteStream<Buffer> {
//[INFO] ifaceSimpleName=PacketWritestream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=9, 1777822023=-1951822771, 1159369883=759285222, -1661022657=1988280886, 1061343905=-918517439, 2120574489=-537829206, -478311088=422814837, -1546322806=-1640617327, 1844116756=-347016953, 687174698=604457935}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
