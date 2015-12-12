package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
// {0=6, -439470966=-1332866709, -1334178689=-1764986645, -261485966=2121527155, -1049308183=-673430138, -102921872=1720585502, -2006070429=1309873384} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
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
