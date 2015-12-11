package io.vertx.golo.core.file;

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
  /**
   * @return The total space on the file system, in bytes
   * @return 
   */
  public long totalSpace() {
return    this.delegate.totalSpace();
  }
  /**
   * @return The total un-allocated space on the file system, in bytes
   * @return 
   */
  public long unallocatedSpace() {
return    this.delegate.unallocatedSpace();
  }
  /**
   * @return The total usable space on the file system, in bytes
   * @return 
   */
  public long usableSpace() {
return    this.delegate.usableSpace();
  }
}
