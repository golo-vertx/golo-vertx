package io.vertx.golo.core.file;

//[Debug] This is a debuging message to check @code{} syntax
// {0=5, 767189370=128504965, 1902915485=401069962, 274512783=1955826206, 1673263196=1383147320, -1966084527=783514421} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
// Type: io.vertx.core.file.FileProps 
public class FileProps {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  private io.vertx.core.file.FileProps delegate;
  public FileProps(Object delegate) {
    this.delegate = (io.vertx.core.file.FileProps) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//long creationTime()
//long
  /**
   * The date the file was created
   * @return 
   */
  public long creationTime() {
return    this.delegate.creationTime();
  }
//long lastAccessTime()
//long
  /**
   * The date the file was last accessed
   * @return 
   */
  public long lastAccessTime() {
return    this.delegate.lastAccessTime();
  }
//long lastModifiedTime()
//long
  /**
   * The date the file was last modified
   * @return 
   */
  public long lastModifiedTime() {
return    this.delegate.lastModifiedTime();
  }
//boolean isDirectory()
//boolean
  /**
   * Is the file a directory?
   * @return 
   */
  public boolean isDirectory() {
return    this.delegate.isDirectory();
  }
//boolean isOther()
//boolean
  /**
   * Is the file some other type? (I.e. not a directory, regular file or symbolic link)
   * @return 
   */
  public boolean isOther() {
return    this.delegate.isOther();
  }
//boolean isRegularFile()
//boolean
  /**
   * Is the file a regular file?
   * @return 
   */
  public boolean isRegularFile() {
return    this.delegate.isRegularFile();
  }
//boolean isSymbolicLink()
//boolean
  /**
   * Is the file a symbolic link?
   * @return 
   */
  public boolean isSymbolicLink() {
return    this.delegate.isSymbolicLink();
  }
//long size()
//long
  /**
   * The size of the file, in bytes
   * @return 
   */
  public long size() {
return    this.delegate.size();
  }
}
