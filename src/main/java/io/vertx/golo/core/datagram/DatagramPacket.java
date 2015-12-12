package io.vertx.golo.core.datagram;

//[Debug] This is a debuging message to check @code{} syntax
// {0=9, 758202709=-1434217489, -551313338=-805364873, -13032292=1926617021, -436048924=2096597837, 880049059=-621632521, -749522165=2140405227, 1903695616=-151737949, 1889884783=-951852556, -579928493=2039920580} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.net.SocketAddress;
// Type: io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket {
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
