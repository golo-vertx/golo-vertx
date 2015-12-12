package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=7, 921032423=-1328754799, -802803419=1779727554, 1325022377=-1935862929, 730440956=-2063528947, -69099258=618128633, 1422591986=-354643542, -843533769=2146022627} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps {
//[INFO] ifaceSimpleName=FileSystemProps
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=7, 921032423=-1328754799, -802803419=1779727554, 1325022377=-1935862929, 730440956=-2063528947, -69099258=618128633, 1422591986=-354643542, -843533769=2146022627}
  private io.vertx.core.file.FileSystemProps delegate;
  public FileSystemProps(Object delegate) {
    this.delegate = (io.vertx.core.file.FileSystemProps) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//long totalSpace()
//long
  /**
   * @return The total space on the file system, in bytes
   * @return 
   */
  public long totalSpace() {
return    this.delegate.totalSpace();
  }
//long unallocatedSpace()
//long
  /**
   * @return The total un-allocated space on the file system, in bytes
   * @return 
   */
  public long unallocatedSpace() {
return    this.delegate.unallocatedSpace();
  }
//long usableSpace()
//long
  /**
   * @return The total usable space on the file system, in bytes
   * @return 
   */
  public long usableSpace() {
return    this.delegate.usableSpace();
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
