package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, -1207633308=-66502003, 1762707345=-1505268100, 2004890626=-1827698499, -685265516=657094096, -958151737=-1872629617, -462055142=-202478954} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, -1207633308=-66502003, 1762707345=-1505268100, 2004890626=-1827698499, -685265516=657094096, -958151737=-1872629617, -462055142=-202478954}
  private io.vertx.core.datagram.DatagramPacket delegate;
  public DatagramPacket(Object delegate) {
    this.delegate = (io.vertx.core.datagram.DatagramPacket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.net.SocketAddress sender()
//io.vertx.core.net.SocketAddress
  /**
   * Returns the {@link io.vertx.golo.core.net.SocketAddress} of the sender that sent
   * this {@link io.vertx.golo.core.datagram.DatagramPacket}.
   * @return the address of the sender
   */
  public SocketAddress sender() {
return    InternalHelper.safeCreate(this.delegate.sender(), io.vertx.golo.core.net.SocketAddress.class);
  }
//io.vertx.core.buffer.Buffer data()
//io.vertx.core.buffer.Buffer
  /**
   * Returns the data of the {@link io.vertx.golo.core.datagram.DatagramPacket}
   * @return the data
   */
  public Buffer data() {
return    InternalHelper.safeCreate(this.delegate.data(), io.vertx.golo.core.buffer.Buffer.class);
  }
}
