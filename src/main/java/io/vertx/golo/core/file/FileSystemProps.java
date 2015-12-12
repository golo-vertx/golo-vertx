package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=5, -316188729=-1909611136, -1205619769=1958570935, -841972859=1816725950, -189458263=1778646998, 1746971919=1830050656} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=5, -316188729=-1909611136, -1205619769=1958570935, -841972859=1816725950, -189458263=1778646998, 1746971919=1830050656}
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
}
