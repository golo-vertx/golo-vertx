package io.vertx.golo.core.datagram;

//[Debug] classMethodData = {io.vertx.core.datagram.DatagramPacket=2} 
//[Debug] arr = [io.vertx.core.net.SocketAddress sender(), io.vertx.core.buffer.Buffer data()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=6, -948183295=-182955979, 269974349=307798289, 31345794=1051933783, -712765095=539233513, 763582398=-1952483501, 460258115=-916156108} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.datagram.DatagramPacket 
public class DatagramPacket {
//[Debug] toChangeName = {io.vertx.core.net.SocketAddress sender()=false, io.vertx.core.buffer.Buffer data()=false}
//[Debug] dbgMethodName = {io.vertx.core.net.SocketAddress sender()=sender, io.vertx.core.buffer.Buffer data()=data} 
//[Debug] dbgMethodParams = {io.vertx.core.net.SocketAddress sender()=0, io.vertx.core.buffer.Buffer data()=0} 
//[INFO]  methods=[io.vertx.core.net.SocketAddress sender(), io.vertx.core.buffer.Buffer data()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.net.SocketAddress sender()=false, io.vertx.core.buffer.Buffer data()=false} 
//[INFO] ifaceSimpleName=DatagramPacket
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=6, -948183295=-182955979, 269974349=307798289, 31345794=1051933783, -712765095=539233513, 763582398=-1952483501, 460258115=-916156108}
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
