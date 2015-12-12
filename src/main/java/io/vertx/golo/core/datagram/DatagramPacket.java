package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
// {0=5, -1152331594=-943935005, 764311000=1716973182, -786534407=1142396912, 2031135225=-300863223, 963261030=-782932812} 
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
