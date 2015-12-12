package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
// {0=8, 794879344=2099833376, -506037466=1582719160, -1962284774=-419629137, 1037804257=-1348483666, -816427396=-596367859, -1932005540=-661196028, -2116600484=261123093, -1689494=655801029} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps {
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
