package io.vertx.golo.core.datagram;

//[Debug] classMethodData = {io.vertx.core.datagram.PacketWritestream=5} 
//[Debug] arr = [boolean writeQueueFull(), io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data), io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize), io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1975036296=-1924169198, 154095775=-1270185387, 833797555=114633908, 34409596=578361319, 566502743=87410594, -341382493=864303842, -2125957138=-247114613, 984798382=-803229641} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.streams.WriteStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.datagram.PacketWritestream 
public class PacketWritestream implements WriteStream<Buffer> {
//[Debug] toChangeName = {io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data)=false, io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize)=false, boolean writeQueueFull()=false}
//[Debug] dbgMethodName = {io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data)=write, io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=drainHandler, io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize, boolean writeQueueFull()=writeQueueFull} 
//[Debug] dbgMethodParams = {io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data)=1, io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=1, io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize)=1, boolean writeQueueFull()=0} 
//[INFO]  methods=[boolean writeQueueFull(), io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data), io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize), io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)] 
//[INFO]  defaultDataObjectMap={boolean writeQueueFull()=false, io.vertx.core.datagram.PacketWritestream drainHandler(io.vertx.core.Handler<java.lang.Void> handler)=false, io.vertx.core.datagram.PacketWritestream setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.datagram.PacketWritestream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.datagram.PacketWritestream write(io.vertx.core.buffer.Buffer data)=false} 
//[INFO] ifaceSimpleName=PacketWritestream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1975036296=-1924169198, 154095775=-1270185387, 833797555=114633908, 34409596=578361319, 566502743=87410594, -341382493=864303842, -2125957138=-247114613, 984798382=-803229641}
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
