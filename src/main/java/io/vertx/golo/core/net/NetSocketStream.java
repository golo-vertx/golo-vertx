package io.vertx.golo.core.net;

//[Debug] classMethodData = {io.vertx.core.net.NetSocketStream=5} 
//[Debug] arr = [io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler), io.vertx.core.net.NetSocketStream pause(), io.vertx.core.net.NetSocketStream resume(), io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -2127930310=-966750764, 965539870=971388011, -97080898=1331503815, -589350251=154717933, -357653421=777135803, -1427505500=-1609246440, 315642527=578473770, -661580434=-1952311300} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.streams.ReadStream;
import io.vertx.core.Handler;
//[confirm] Type: io.vertx.core.net.NetSocketStream 
public class NetSocketStream implements ReadStream<NetSocket> {
//[Debug] toChangeName = {io.vertx.core.net.NetSocketStream pause()=false, io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)=false, io.vertx.core.net.NetSocketStream resume()=false, io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false}
//[Debug] dbgMethodName = {io.vertx.core.net.NetSocketStream pause()=pause, io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)=handler, io.vertx.core.net.NetSocketStream resume()=resume, io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=exceptionHandler, io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=endHandler} 
//[Debug] dbgMethodParams = {io.vertx.core.net.NetSocketStream pause()=0, io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)=1, io.vertx.core.net.NetSocketStream resume()=0, io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=1, io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=1} 
//[INFO]  methods=[io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler), io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler), io.vertx.core.net.NetSocketStream pause(), io.vertx.core.net.NetSocketStream resume(), io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.net.NetSocketStream pause()=false, io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)=false, io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)=false, io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)=false, io.vertx.core.net.NetSocketStream resume()=false} 
//[INFO] ifaceSimpleName=NetSocketStream
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -2127930310=-966750764, 965539870=971388011, -97080898=1331503815, -589350251=154717933, -357653421=777135803, -1427505500=-1609246440, 315642527=578473770, -661580434=-1952311300}
  private io.vertx.core.net.NetSocketStream delegate;
  public NetSocketStream(Object delegate) {
    this.delegate = (io.vertx.core.net.NetSocketStream) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.net.NetSocketStream exceptionHandler(io.vertx.core.Handler<java.lang.Throwable> handler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream exceptionHandler(Handler<Throwable> handler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).exceptionHandler(handler);
    return this;
  }
//io.vertx.core.net.NetSocketStream handler(io.vertx.core.Handler<io.vertx.core.net.NetSocket> handler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream handler(Handler<NetSocket> handler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).handler(new Handler<io.vertx.core.net.NetSocket>() {
      public void handle(io.vertx.core.net.NetSocket event) {
        handler.handle(new io.vertx.golo.core.net.NetSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.net.NetSocketStream pause()
//io.vertx.core.net.NetSocketStream
  public NetSocketStream pause() {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).pause();
    return this;
  }
//io.vertx.core.net.NetSocketStream resume()
//io.vertx.core.net.NetSocketStream
  public NetSocketStream resume() {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).resume();
    return this;
  }
//io.vertx.core.net.NetSocketStream endHandler(io.vertx.core.Handler<java.lang.Void> endHandler)
//io.vertx.core.net.NetSocketStream
  public NetSocketStream endHandler(Handler<Void> endHandler) {
    (  (io.vertx.core.net.NetSocketStream) this.delegate).endHandler(endHandler);
    return this;
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
