package io.vertx.golo.core.datagram;

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
// Type: io.vertx.core.datagram.DatagramSocket 
public class DatagramSocket implements ReadStream<DatagramPacket>,  Measured {
      private io.vertx.core.datagram.DatagramSocket delegate;
  public DatagramSocket(Object delegate) {
    this.delegate = (io.vertx.core.datagram.DatagramSocket) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
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
  /**
   * Closes the {@link io.vertx.golo.core.datagram.DatagramSocket} implementation asynchronous
   * and notifies the handler once done.
   * @param handler the handler to notify once complete
   */
  public void close(Handler<AsyncResult<Void>> handler) {
    this.delegate.close(handler);
  }
  /**
   * Closes the {@link io.vertx.golo.core.datagram.DatagramSocket}. The close itself is asynchronous.
   */
  public void close() {
    this.delegate.close();
  }
  /**
   * Return the {@link io.vertx.golo.core.net.SocketAddress} to which
   * this {@link io.vertx.golo.core.datagram.DatagramSocket} is bound.
   * @return the socket address
   */
  public SocketAddress localAddress() {
return    InternalHelper.safeCreate(this.delegate.localAddress(), io.vertx.golo.core.net.SocketAddress.class);
  }
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
  public DatagramSocket pause() {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).pause();
    return this;
  }
  public DatagramSocket resume() {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).resume();
    return this;
  }
  public DatagramSocket endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).endHandler(endHandler);
    return this;
  }
  public DatagramSocket handler(Handler<DatagramPacket> handler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).handler(new Handler<io.vertx.core.datagram.DatagramPacket>() {
      public void handle(io.vertx.core.datagram.DatagramPacket event) {
        handler.handle(new io.vertx.golo.core.datagram.DatagramPacket(event));
      }
    });
    return this;
  }
  public DatagramSocket exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.datagram.DatagramSocket) this.delegate).exceptionHandler(handler);
    return this;
  }
}
