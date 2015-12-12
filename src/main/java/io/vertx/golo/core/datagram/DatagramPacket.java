package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=7, -17613791=-2141168084, 202494658=1301965770, -337777913=-2122897512, 1583788666=623676254, -949450619=1271146057, -1937095836=-262728630, -802437468=722127852} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket {
//[INFO] ifaceSimpleName=DatagramPacket
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=7, -17613791=-2141168084, 202494658=1301965770, -337777913=-2122897512, 1583788666=623676254, -949450619=1271146057, -1937095836=-262728630, -802437468=722127852}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
