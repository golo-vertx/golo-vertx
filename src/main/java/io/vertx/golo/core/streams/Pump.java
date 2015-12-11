package io.vertx.golo.core.streams;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.streams.Pump 
public class Pump {
      private io.vertx.core.streams.Pump delegate;
  public Pump(Object delegate) {
    this.delegate = (io.vertx.core.streams.Pump) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Create a new <code>Pump</code> with the given <code>ReadStream</code> and <code>WriteStream</code>
   * @param rs the read stream
   * @param ws the write stream
   * @return the pump
   */
  public static <T> Pump pump(ReadStream<T> rs, WriteStream<T> ws) {
return    InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump((io.vertx.core.streams.ReadStream<T>)rs.getDelegate(), (io.vertx.core.streams.WriteStream<T>)ws.getDelegate()), io.vertx.golo.core.streams.Pump.class);
  }
  /**
   * Create a new <code>Pump</code> with the given <code>ReadStream</code> and <code>WriteStream</code> and
   * <code>writeQueueMaxSize</code>
   * @param rs the read stream
   * @param ws the write stream
   * @param writeQueueMaxSize the max size of the write queue
   * @return the pump
   */
  public static <T> Pump pump(ReadStream<T> rs, WriteStream<T> ws, int writeQueueMaxSize) {
return    InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump((io.vertx.core.streams.ReadStream<T>)rs.getDelegate(), (io.vertx.core.streams.WriteStream<T>)ws.getDelegate(), writeQueueMaxSize), io.vertx.golo.core.streams.Pump.class);
  }
  /**
   * Set the write queue max size to <code>maxSize</code>
   * @param maxSize the max size
   * @return a reference to this, so the API can be used fluently
   */
  public Pump setWriteQueueMaxSize(int maxSize) {
    this.delegate.setWriteQueueMaxSize(maxSize);
    return this;
  }
  /**
   * Start the Pump. The Pump can be started and stopped multiple times.
   * @return a reference to this, so the API can be used fluently
   */
  public Pump start() {
    this.delegate.start();
    return this;
  }
  /**
   * Stop the Pump. The Pump can be started and stopped multiple times.
   * @return a reference to this, so the API can be used fluently
   */
  public Pump stop() {
    this.delegate.stop();
    return this;
  }
  /**
   * Return the total number of items pumped by this pump.
   * @return 
   */
  public int numberPumped() {
return    this.delegate.numberPumped();
  }
}
