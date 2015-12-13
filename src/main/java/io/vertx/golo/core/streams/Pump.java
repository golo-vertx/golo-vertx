package io.vertx.golo.core.streams;

//[Debug] classMethodData = {io.vertx.core.streams.Pump=6} 
//[Debug] arr = [<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize), io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize), io.vertx.core.streams.Pump start(), io.vertx.core.streams.Pump stop(), int numberPumped()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 1065460993=2023730084, 1339406868=-1637339168, -207066759=-927288716, 1608701206=-71421756, 1567476073=-580595058, 2000507563=879627045, -1661197685=1778407962, 1892502548=547652148, 347455292=-476835050, 1678884490=1463483498} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.streams.Pump 
public class Pump {
//[Debug] toChangeName = {io.vertx.core.streams.Pump start()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize)=false, int numberPumped()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws)=false, io.vertx.core.streams.Pump stop()=false, io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize)=false}
//[Debug] dbgMethodName = {io.vertx.core.streams.Pump start()=start, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize)=pump, int numberPumped()=numberPumped, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws)=pump, io.vertx.core.streams.Pump stop()=stop, io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize)=setWriteQueueMaxSize} 
//[Debug] dbgMethodParams = {io.vertx.core.streams.Pump start()=0, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize)=3, int numberPumped()=0, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws)=2, io.vertx.core.streams.Pump stop()=0, io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize)=1} 
//[INFO]  methods=[<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize), io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize), io.vertx.core.streams.Pump start(), io.vertx.core.streams.Pump stop(), int numberPumped()] 
//[INFO]  defaultDataObjectMap={io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize)=false, io.vertx.core.streams.Pump stop()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws)=false, io.vertx.core.streams.Pump start()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize)=false, int numberPumped()=false} 
//[INFO] ifaceSimpleName=Pump
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 1065460993=2023730084, 1339406868=-1637339168, -207066759=-927288716, 1608701206=-71421756, 1567476073=-580595058, 2000507563=879627045, -1661197685=1778407962, 1892502548=547652148, 347455292=-476835050, 1678884490=1463483498}
  private io.vertx.core.streams.Pump delegate;
  public Pump(Object delegate) {
    this.delegate = (io.vertx.core.streams.Pump) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws)
//io.vertx.core.streams.Pump
  /**
   * Create a new <code>Pump</code> with the given <code>ReadStream</code> and <code>WriteStream</code>
   * @param rs the read stream
   * @param ws the write stream
   * @return the pump
   */
  public static <T> Pump pump(ReadStream<T> rs, WriteStream<T> ws) {
return    InternalHelper.safeCreate(io.vertx.core.streams.Pump.pump((io.vertx.core.streams.ReadStream<T>)rs.getDelegate(), (io.vertx.core.streams.WriteStream<T>)ws.getDelegate()), io.vertx.golo.core.streams.Pump.class);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.streams.Pump,methodNamepump]> io.vertx.core.streams.Pump pump(io.vertx.core.streams.ReadStream<T> rs, io.vertx.core.streams.WriteStream<T> ws, int writeQueueMaxSize)
//io.vertx.core.streams.Pump
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
//io.vertx.core.streams.Pump setWriteQueueMaxSize(int maxSize)
//io.vertx.core.streams.Pump
  /**
   * Set the write queue max size to <code>maxSize</code>
   * @param maxSize the max size
   * @return a reference to this, so the API can be used fluently
   */
  public Pump setWriteQueueMaxSize(int maxSize) {
    this.delegate.setWriteQueueMaxSize(maxSize);
    return this;
  }
//io.vertx.core.streams.Pump start()
//io.vertx.core.streams.Pump
  /**
   * Start the Pump. The Pump can be started and stopped multiple times.
   * @return a reference to this, so the API can be used fluently
   */
  public Pump start() {
    this.delegate.start();
    return this;
  }
//io.vertx.core.streams.Pump stop()
//io.vertx.core.streams.Pump
  /**
   * Stop the Pump. The Pump can be started and stopped multiple times.
   * @return a reference to this, so the API can be used fluently
   */
  public Pump stop() {
    this.delegate.stop();
    return this;
  }
//int numberPumped()
//int
  /**
   * Return the total number of items pumped by this pump.
   * @return 
   */
  public int numberPumped() {
return    this.delegate.numberPumped();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
