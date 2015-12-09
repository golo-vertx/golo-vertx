package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;
import java.util.List;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.file.FileSystem 
public class FileSystem { 

private io.vertx.core.file.FileSystem delegate; 
public FileSystem(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileSystem)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem copy(String from,String to,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.copy(from,to,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
// TypeParams: [] 
public FileSystem copyBlocking(String from,String to) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.copyBlocking(from,to), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem copyRecursive(String from,String to,boolean recursive,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.copyRecursive(from,to,recursive,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
// TypeParams: [] 
public FileSystem copyRecursiveBlocking(String from,String to,boolean recursive) {
        //param classes(remove later):   STRING   STRING   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.copyRecursiveBlocking(from,to,recursive), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem move(String from,String to,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.move(from,to,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
// TypeParams: [] 
public FileSystem moveBlocking(String from,String to) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.moveBlocking(from,to), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem truncate(String path,long len,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.truncate(path,len,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
// TypeParams: [] 
public FileSystem truncateBlocking(String path,long len) {
        //param classes(remove later):   STRING   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.truncateBlocking(path,len), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem chmod(String path,String perms,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.chmod(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
// TypeParams: [] 
public FileSystem chmodBlocking(String path,String perms) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.chmodBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem chmodRecursive(String path,String perms,String dirPerms,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.chmodRecursive(path,perms,dirPerms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
// TypeParams: [] 
public FileSystem chmodRecursiveBlocking(String path,String perms,String dirPerms) {
        //param classes(remove later):   STRING   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.chmodRecursiveBlocking(path,perms,dirPerms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem chown(String path,String user,String group,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.chown(path,user,group,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
// TypeParams: [] 
public FileSystem chownBlocking(String path,String user,String group) {
        //param classes(remove later):   STRING   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.chownBlocking(path,user,group), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
// TypeParams: [] 
public FileSystem props(String path,Handler<AsyncResult<FileProps>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.props(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
// TypeParams: [] 
public FileProps propsBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.propsBlocking(path), io.vertx.golo.core.file.FileProps.class); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
// TypeParams: [] 
public FileSystem lprops(String path,Handler<AsyncResult<FileProps>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.lprops(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
// TypeParams: [] 
public FileProps lpropsBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.lpropsBlocking(path), io.vertx.golo.core.file.FileProps.class); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem link(String link,String existing,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.link(link,existing,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
// TypeParams: [] 
public FileSystem linkBlocking(String link,String existing) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.linkBlocking(link,existing), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem symlink(String link,String existing,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.symlink(link,existing,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
// TypeParams: [] 
public FileSystem symlinkBlocking(String link,String existing) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.symlinkBlocking(link,existing), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem unlink(String link,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.unlink(link,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
// TypeParams: [] 
public FileSystem unlinkBlocking(String link) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.unlinkBlocking(link), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
// TypeParams: [] 
public FileSystem readSymlink(String link,Handler<AsyncResult<String>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.readSymlink(link,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
// TypeParams: [] 
public String readSymlinkBlocking(String link) {
        //param classes(remove later):   STRING  
    return delegate.readSymlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem delete(String path,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.delete(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
// TypeParams: [] 
public FileSystem deleteBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.deleteBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem deleteRecursive(String path,boolean recursive,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   PRIMITIVE   HANDLER  
    return InternalHelper.safeCreate(this.delegate.deleteRecursive(path,recursive,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
// TypeParams: [] 
public FileSystem deleteRecursiveBlocking(String path,boolean recursive) {
        //param classes(remove later):   STRING   PRIMITIVE  
    return InternalHelper.safeCreate(this.delegate.deleteRecursiveBlocking(path,recursive), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem mkdir(String path,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.mkdir(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
// TypeParams: [] 
public FileSystem mkdirBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.mkdirBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem mkdir(String path,String perms,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.mkdir(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
// TypeParams: [] 
public FileSystem mkdirBlocking(String path,String perms) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.mkdirBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem mkdirs(String path,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.mkdirs(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
// TypeParams: [] 
public FileSystem mkdirsBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.mkdirsBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem mkdirs(String path,String perms,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.mkdirs(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
// TypeParams: [] 
public FileSystem mkdirsBlocking(String path,String perms) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.mkdirsBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
// TypeParams: [] 
public FileSystem readDir(String path,Handler<AsyncResult<List<String>>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.readDir(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
// TypeParams: [] 
public List<String> readDirBlocking(String path) {
        //param classes(remove later):   STRING  
    return delegate.readDirBlocking(path); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
// TypeParams: [] 
public FileSystem readDir(String path,String filter,Handler<AsyncResult<List<String>>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.readDir(path,filter,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
// TypeParams: [] 
public List<String> readDirBlocking(String path,String filter) {
        //param classes(remove later):   STRING   STRING  
    return delegate.readDirBlocking(path,filter); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
// TypeParams: [] 
public FileSystem readFile(String path,Handler<AsyncResult<Buffer>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.readFile(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
// TypeParams: [] 
public Buffer readFileBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.readFileBlocking(path), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem writeFile(String path,Buffer data,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   API   HANDLER  
    return InternalHelper.safeCreate(this.delegate.writeFile(path,data,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
// TypeParams: [] 
public FileSystem writeFileBlocking(String path,Buffer data) {
        //param classes(remove later):   STRING   API  
    return InternalHelper.safeCreate(this.delegate.writeFileBlocking(path,data), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
// TypeParams: [] 
public FileSystem open(String path,OpenOptions options,Handler<AsyncResult<AsyncFile>> handler) {
        //param classes(remove later):   STRING   DATA_OBJECT   HANDLER  
    return InternalHelper.safeCreate(this.delegate.open(path,options,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
// TypeParams: [] 
public AsyncFile openBlocking(String path,OpenOptions options) {
        //param classes(remove later):   STRING   DATA_OBJECT  
    return InternalHelper.safeCreate(this.delegate.openBlocking(path,options), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem createFile(String path,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.createFile(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
// TypeParams: [] 
public FileSystem createFileBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.createFileBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
// TypeParams: [] 
public FileSystem createFile(String path,String perms,Handler<AsyncResult<Void>> handler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.createFile(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
// TypeParams: [] 
public FileSystem createFileBlocking(String path,String perms) {
        //param classes(remove later):   STRING   STRING  
    return InternalHelper.safeCreate(this.delegate.createFileBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
// TypeParams: [] 
public FileSystem exists(String path,Handler<AsyncResult<Boolean>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.exists(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// boolean existsBlocking(java.lang.String path) 
// TypeParams: [] 
public boolean existsBlocking(String path) {
        //param classes(remove later):   STRING  
    return delegate.existsBlocking(path); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
// TypeParams: [] 
public FileSystem fsProps(String path,Handler<AsyncResult<FileSystemProps>> handler) {
        //param classes(remove later):   STRING   HANDLER  
    return InternalHelper.safeCreate(this.delegate.fsProps(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
// TypeParams: [] 
public FileSystemProps fsPropsBlocking(String path) {
        //param classes(remove later):   STRING  
    return InternalHelper.safeCreate(this.delegate.fsPropsBlocking(path), io.vertx.golo.core.file.FileSystemProps.class); 
}
}
