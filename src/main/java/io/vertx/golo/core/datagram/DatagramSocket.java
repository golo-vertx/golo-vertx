package io.vertx.golo.core.datagram;

//[Debug] classMethodData = {io.vertx.core.datagram.DatagramSocket=20} 
//[Debug] arr = [boolean isMetricsEnabled(), io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host), io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler), void close(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket pause(), io.vertx.core.datagram.DatagramSocket resume(), io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler), io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=3, 983859905=1815211995, -32688203=-1998358587, -63427802=-1200691144} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.golo.core.net.SocketAddress;
//[confirm] Type: io.vertx.core.datagram.DatagramSocket 
public class DatagramSocket implements ReadStream<DatagramPacket>,  Measured {
//[Debug] toChangeName = {io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host)=false, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=true, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler)=false, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, void close()=false, boolean isMetricsEnabled()=false, io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket pause()=false, io.vertx.core.datagram.DatagramSocket resume()=false, io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=true, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)=false, io.vertx.core.net.SocketAddress localAddress()=false}
//[Debug] dbgMethodName = {io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host)=sender, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=blockMulticastGroup, io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=unlistenMulticastGroup, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=send, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=send, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=listenMulticastGroup, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=unlistenMulticastGroup, io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler)=handler, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=listenMulticastGroup, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=blockMulticastGroup, void close()=close, boolean isMetricsEnabled()=isMetricsEnabled, io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=listen, io.vertx.core.datagram.DatagramSocket pause()=pause, io.vertx.core.datagram.DatagramSocket resume()=resume, io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=send, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)=close, io.vertx.core.net.SocketAddress localAddress()=localAddress} 
//[Debug] dbgMethodParams = {io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host)=2, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=4, io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=4, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=4, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=5, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=4, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=2, io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler)=1, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=2, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=3, void close()=0, boolean isMetricsEnabled()=0, io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=3, io.vertx.core.datagram.DatagramSocket pause()=0, io.vertx.core.datagram.DatagramSocket resume()=0, io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=4, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)=1, io.vertx.core.net.SocketAddress localAddress()=0} 
//[INFO]  methods=[boolean isMetricsEnabled(), io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host), io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler), void close(), io.vertx.core.net.SocketAddress localAddress(), io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler), io.vertx.core.datagram.DatagramSocket pause(), io.vertx.core.datagram.DatagramSocket resume(), io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler), io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler), io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)] 
//[INFO]  defaultDataObjectMap={void close()=false, io.vertx.core.datagram.DatagramSocket pause()=false, void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)=false, io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, boolean isMetricsEnabled()=false, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.datagram.DatagramSocket resume()=false, io.vertx.core.net.SocketAddress localAddress()=false, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host)=false, io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)=false, io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler)=false} 
//[INFO] ifaceSimpleName=DatagramSocket
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=3, 983859905=1815211995, -32688203=-1998358587, -63427802=-1200691144}
  private io.vertx.core.datagram.DatagramSocket delegate;
  public DatagramSocket(Object delegate) {
    this.delegate = (io.vertx.core.datagram.DatagramSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
//io.vertx.core.datagram.DatagramSocket send(io.vertx.core.buffer.Buffer packet, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Write the given {@link io.vertx.golo.core.buffer.Buffer} to the {@link io.vertx.golo.core.net.SocketAddress}.
   * The {@link io.vertx.golo.core.Handler} will be notified once the write completes.
   * @param packet the {@link io.vertx.golo.core.buffer.Buffer} to write
   * @param port the host port of the remote peer
   * @param host the host address of the remote peer
   * @param handler the {@link io.vertx.golo.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket send(Buffer packet, int port, String host, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.send((io.vertx.core.buffer.Buffer)packet.getDelegate(), port, host, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.PacketWritestream sender(int port, java.lang.String host)
//io.vertx.core.datagram.PacketWritestream
  /**
   * Returns a {@link io.vertx.golo.core.datagram.PacketWritestream} able to send  to the
   * {@link io.vertx.golo.core.net.SocketAddress}.
   * @param port the port of the remote peer
   * @param host the host address of the remote peer
   * @return the write stream for sending packets
   */
  public PacketWritestream sender(int port, String host) {
return    InternalHelper.safeCreate(this.delegate.sender(port, host), io.vertx.golo.core.datagram.PacketWritestream.class);
  }
//io.vertx.core.datagram.DatagramSocket send(java.lang.String str, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Write the given {@link java.lang.String} to the {@link io.vertx.golo.core.net.SocketAddress} using UTF8 encoding.
   * The  will be notified once the write completes.
   * @param str the {@link java.lang.String} to write
   * @param port the host port of the remote peer
   * @param host the host address of the remote peer
   * @param handler the {@link io.vertx.golo.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket send(String str, int port, String host, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.send(str, port, host, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket send(java.lang.String str, java.lang.String enc, int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Write the given {@link java.lang.String} to the {@link io.vertx.golo.core.net.SocketAddress} using the given encoding.
   * The  will be notified once the write completes.
   * @param str the {@link java.lang.String} to write
   * @param enc the charset used for encoding
   * @param port the host port of the remote peer
   * @param host the host address of the remote peer
   * @param handler the {@link io.vertx.golo.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket send(String str, String enc, int port, String host, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.send(str, enc, port, host, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//void close(io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler)
//void
  /**
   * Closes the {@link io.vertx.golo.core.datagram.DatagramSocket} implementation asynchronous
   * and notifies the handler once done.
   * @param handler the handler to notify once complete
   */
  public void close(Handler<AsyncResult<Void>> handler) {
    this.delegate.close(handler);
  }
//void close()
//void
  /**
   * Closes the {@link io.vertx.golo.core.datagram.DatagramSocket}. The close itself is asynchronous.
   */
  public void close() {
    this.delegate.close();
  }
//io.vertx.core.net.SocketAddress localAddress()
//io.vertx.core.net.SocketAddress
  /**
   * Return the {@link io.vertx.golo.core.net.SocketAddress} to which
   * this {@link io.vertx.golo.core.datagram.DatagramSocket} is bound.
   * @return the socket address
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
//io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Joins a multicast group and listens for packets send to it.
   * The  is notified once the operation completes.
   * @param multicastAddress the address of the multicast group to join
   * @param handler then handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket listenMulticastGroup(String multicastAddress, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.listenMulticastGroup(multicastAddress, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket listenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Joins a multicast group and listens for packets send to it on the given network interface.
   * The  is notified once the operation completes.
   * @param multicastAddress the address of the multicast group to join
   * @param networkInterface the network interface on which to listen for packets.
   * @param source the address of the source for which we will listen for multicast packets
   * @param handler then handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket listenMulticastGroup(String multicastAddress, String networkInterface, String source, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.listenMulticastGroup(multicastAddress, networkInterface, source, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Leaves a multicast group and stops listening for packets send to it.
   * The  is notified once the operation completes.
   * @param multicastAddress the address of the multicast group to leave
   * @param handler then handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket unlistenMulticastGroup(String multicastAddress, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.unlistenMulticastGroup(multicastAddress, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket unlistenMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String source, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Leaves a multicast group and stops listening for packets send to it on the given network interface.
   * The  is notified once the operation completes.
   * @param multicastAddress the address of the multicast group to join
   * @param networkInterface the network interface on which to listen for packets.
   * @param source the address of the source for which we will listen for multicast packets
   * @param handler the handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket unlistenMulticastGroup(String multicastAddress, String networkInterface, String source, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.unlistenMulticastGroup(multicastAddress, networkInterface, source, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Block the given address for the given multicast address and notifies the  once
   * the operation completes.
   * @param multicastAddress the address for which you want to block the source address
   * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
   * @param handler the handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket blockMulticastGroup(String multicastAddress, String sourceToBlock, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.blockMulticastGroup(multicastAddress, sourceToBlock, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket blockMulticastGroup(java.lang.String multicastAddress, java.lang.String networkInterface, java.lang.String sourceToBlock, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Block the given address for the given multicast address on the given network interface and notifies
   * the  once the operation completes.
   * @param multicastAddress the address for which you want to block the source address
   * @param networkInterface the network interface on which the blocking should occur.
   * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
   * @param handler the handler to notify once the operation completes
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket blockMulticastGroup(String multicastAddress, String networkInterface, String sourceToBlock, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket listen(int port, java.lang.String host, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> handler)
//io.vertx.core.datagram.DatagramSocket
  /**
   * Start listening on the given port and host. The handler will be called when the socket is listening.
   * @param port the port to listen on
   * @param host the host to listen on
   * @param handler the handler will be called when listening
   * @return a reference to this, so the API can be used fluently
   */
  public DatagramSocket listen(int port, String host, Handler<AsyncResult<DatagramSocket>> handler) {
    this.delegate.listen(port, host, new Handler<AsyncResult<io.vertx.core.datagram.DatagramSocket>>() {
      public void handle(AsyncResult<io.vertx.core.datagram.DatagramSocket> event) {
        AsyncResult<DatagramSocket> f;
        if (event.succeeded()) {
          f = InternalHelper.<DatagramSocket>result(new DatagramSocket(event.result()));
        } else {
          f = InternalHelper.<DatagramSocket>failure(event.cause());
        }
        handler.handle((AsyncResult)f);
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket pause()
//io.vertx.core.datagram.DatagramSocket
  public DatagramSocket pause() {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).pause();
    return this;
  }
//io.vertx.core.datagram.DatagramSocket resume()
//io.vertx.core.datagram.DatagramSocket
  public DatagramSocket resume() {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).resume();
    return this;
  }
//io.vertx.core.datagram.DatagramSocket endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.datagram.DatagramSocket
  public DatagramSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).endHandler(endHandler);
    return this;
  }
//io.vertx.core.datagram.DatagramSocket handler(io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> handler)
//io.vertx.core.datagram.DatagramSocket
  public DatagramSocket handler(Handler<DatagramPacket> handler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).handler(new Handler<io.vertx.core.datagram.DatagramPacket>() {
      public void handle(io.vertx.core.datagram.DatagramPacket event) {
        handler.handle(new io.vertx.golo.core.datagram.DatagramPacket(event));
      }
    });
    return this;
  }
//io.vertx.core.datagram.DatagramSocket exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.datagram.DatagramSocket
  public DatagramSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).exceptionHandler(handler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
