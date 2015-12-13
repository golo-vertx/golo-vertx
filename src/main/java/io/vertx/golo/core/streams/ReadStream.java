package io.vertx.golo.core.streams;

//[Debug] classMethodData = {io.vertx.core.streams.ReadStream<T>=5} 
//[Debug] arr = [io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler), io.vertx.core.streams.ReadStream<T> pause(), io.vertx.core.streams.ReadStream<T> resume(), io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1352847874=1457785424, -1673616691=44697394, -188037975=-1447710911, -1127625316=1375093317, -2060057840=-769688465, 1529345054=-208953519, -1331437912=301803320, 1942172174=-1759121176} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.streams.ReadStream<T> 
public interface ReadStream<T> extends StreamBase {
//[Debug] toChangeName = {io.vertx.core.streams.ReadStream<T> pause()=false, io.vertx.core.streams.ReadStream<T> resume()=false, io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler)=false, io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false}
//[Debug] dbgMethodName = {io.vertx.core.streams.ReadStream<T> pause()=pause, io.vertx.core.streams.ReadStream<T> resume()=resume, io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler, io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler)=handler, io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler} 
//[Debug] dbgMethodParams = {io.vertx.core.streams.ReadStream<T> pause()=0, io.vertx.core.streams.ReadStream<T> resume()=0, io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1, io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler)=1, io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1} 
//[INFO]  methods=[io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler), io.vertx.core.streams.ReadStream<T> pause(), io.vertx.core.streams.ReadStream<T> resume(), io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.streams.ReadStream<T> resume()=false, io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.streams.ReadStream<T> pause()=false, io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler)=false, io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false} 
public Object getDelegate();
  ReadStream<T> exceptionHandler(Handler<Throwable> handler);
  ReadStream<T> handler(Handler<T> handler);
  ReadStream<T> pause();
  ReadStream<T> resume();
  ReadStream<T> endHandler(Handler<Void> endHandler);
}
//[INFO] var concrete=false

//[debug] came from !concrete part 
class ReadStreamImpl<T> implements ReadStream<T> {
  //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1352847874=1457785424, -1673616691=44697394, -188037975=-1447710911, -1127625316=1375093317, -2060057840=-769688465, 1529345054=-208953519, -1331437912=301803320, 1942172174=-1759121176}
  private io.vertx.core.streams.ReadStream delegate;
  public ReadStreamImpl(Object delegate) {
    this.delegate = (io.vertx.core.streams.ReadStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.streams.ReadStream<T> exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.streams.ReadStream<T>
  /**
   * Set an exception handler on the read stream.
   * @param handler the exception handler
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.streams.StreamBase) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.streams.ReadStream<T> handler(io.vertx.core.Handler<T> handler)
//io.vertx.core.streams.ReadStream<T>
  /**
   * Set a data handler. As data is read, the handler will be called with the data.
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> handler(Handler<T> handler) {
    ((io.vertx.core.streams.ReadStream) this.delegate).handler(new Handler<Object>() {
      public void handle(Object event) {
        handler.handle((T)InternalHelper.wrapObject(event));
      }
    });
    return this;
  }
//io.vertx.core.streams.ReadStream<T> pause()
//io.vertx.core.streams.ReadStream<T>
  /**
   * Pause the <code>ReadSupport</code>. While it's paused, no data will be sent to the <code>dataHandler</code>
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> pause() {
    ((io.vertx.core.streams.ReadStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.streams.ReadStream<T> resume()
//io.vertx.core.streams.ReadStream<T>
  /**
   * Resume reading. If the <code>ReadSupport</code> has been paused, reading will recommence on it.
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> resume() {
    ((io.vertx.core.streams.ReadStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.streams.ReadStream<T> endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.streams.ReadStream<T>
  /**
   * Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.
   * @param endHandler 
   * @return a reference to this, so the API can be used fluently
   */
  public ReadStream<T> endHandler(Handler<Void> endHandler) {
    ((io.vertx.core.streams.ReadStream) this.delegate).endHandler(endHandler);
    return this;
  }
}
