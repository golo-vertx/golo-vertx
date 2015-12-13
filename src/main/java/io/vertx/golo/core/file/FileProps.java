package io.vertx.golo.core.file;

//[Debug] classMethodData = {io.vertx.core.file.FileProps=8} 
//[Debug] arr = [long creationTime(), long lastAccessTime(), long lastModifiedTime(), boolean isDirectory(), boolean isOther(), boolean isRegularFile(), boolean isSymbolicLink(), long size()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, -490486463=-2033400708, 1120918442=1466698748, 1666275574=-1491273037, -1171949299=-1748139538, 90070455=306462574, -1410441596=-1234405115, 428998364=608067054, 591369745=2112199346} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.file.FileProps 
public class FileProps {
//[Debug] toChangeName = {boolean isDirectory()=false, long lastModifiedTime()=false, boolean isRegularFile()=false, long size()=false, boolean isSymbolicLink()=false, long creationTime()=false, long lastAccessTime()=false, boolean isOther()=false}
//[Debug] dbgMethodName = {boolean isDirectory()=isDirectory, long lastModifiedTime()=lastModifiedTime, boolean isRegularFile()=isRegularFile, long size()=size, boolean isSymbolicLink()=isSymbolicLink, long creationTime()=creationTime, long lastAccessTime()=lastAccessTime, boolean isOther()=isOther} 
//[Debug] dbgMethodParams = {boolean isDirectory()=0, long lastModifiedTime()=0, boolean isRegularFile()=0, long size()=0, boolean isSymbolicLink()=0, long creationTime()=0, long lastAccessTime()=0, boolean isOther()=0} 
//[INFO]  methods=[long creationTime(), long lastAccessTime(), long lastModifiedTime(), boolean isDirectory(), boolean isOther(), boolean isRegularFile(), boolean isSymbolicLink(), long size()] 
//[INFO]  defaultDataObjectMap={long lastModifiedTime()=false, long lastAccessTime()=false, boolean isOther()=false, long creationTime()=false, boolean isSymbolicLink()=false, boolean isDirectory()=false, long size()=false, boolean isRegularFile()=false} 
//[INFO] ifaceSimpleName=FileProps
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, -490486463=-2033400708, 1120918442=1466698748, 1666275574=-1491273037, -1171949299=-1748139538, 90070455=306462574, -1410441596=-1234405115, 428998364=608067054, 591369745=2112199346}
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
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
