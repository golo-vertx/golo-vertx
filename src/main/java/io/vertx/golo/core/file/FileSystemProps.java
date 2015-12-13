package io.vertx.golo.core.file;

//[Debug] classMethodData = {io.vertx.core.file.FileSystemProps=3} 
//[Debug] arr = [long totalSpace(), long unallocatedSpace(), long usableSpace()] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=10, 813471836=-1008947965, -1892586975=-1065809220, 61967552=916619303, -1799738880=-580811566, -135607354=-1830646432, 1593395141=1808161122, -1549243932=-1920211211, -643342326=-511846322, 770633680=-1102035822, -636955610=348711813} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
//[confirm] Type: io.vertx.core.file.FileSystemProps 
public class FileSystemProps {
//[Debug] toChangeName = {long unallocatedSpace()=false, long totalSpace()=false, long usableSpace()=false}
//[Debug] dbgMethodName = {long unallocatedSpace()=unallocatedSpace, long totalSpace()=totalSpace, long usableSpace()=usableSpace} 
//[Debug] dbgMethodParams = {long unallocatedSpace()=0, long totalSpace()=0, long usableSpace()=0} 
//[INFO]  methods=[long totalSpace(), long unallocatedSpace(), long usableSpace()] 
//[INFO]  defaultDataObjectMap={long totalSpace()=false, long usableSpace()=false, long unallocatedSpace()=false} 
//[INFO] ifaceSimpleName=FileSystemProps
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=10, 813471836=-1008947965, -1892586975=-1065809220, 61967552=916619303, -1799738880=-580811566, -135607354=-1830646432, 1593395141=1808161122, -1549243932=-1920211211, -643342326=-511846322, 770633680=-1102035822, -636955610=348711813}
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
