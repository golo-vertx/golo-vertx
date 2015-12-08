package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.file.AsyncFile;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystemProps;
import io.vertx.core.file.FileProps;
// io.vertx.core.file.FileSystem 
public class FileSystem { 

private io.vertx.core.file.FileSystem delegate; 
public FileSystem(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileSystem)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.copy(from,to,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
public FileSystem copyBlocking(java.lang.String from, java.lang.String to) {
        return InternalHelper.safeCreate(this.delegate.copyBlocking(from,to), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.copyRecursive(from,to,recursive,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
public FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) {
        return InternalHelper.safeCreate(this.delegate.copyRecursiveBlocking(from,to,recursive), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.move(from,to,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
public FileSystem moveBlocking(java.lang.String from, java.lang.String to) {
        return InternalHelper.safeCreate(this.delegate.moveBlocking(from,to), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.truncate(path,len,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
public FileSystem truncateBlocking(java.lang.String path, long len) {
        return InternalHelper.safeCreate(this.delegate.truncateBlocking(path,len), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.chmod(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
public FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) {
        return InternalHelper.safeCreate(this.delegate.chmodBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.chmodRecursive(path,perms,dirPerms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
public FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) {
        return InternalHelper.safeCreate(this.delegate.chmodRecursiveBlocking(path,perms,dirPerms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.chown(path,user,group,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
public FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) {
        return InternalHelper.safeCreate(this.delegate.chownBlocking(path,user,group), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return InternalHelper.safeCreate(this.delegate.props(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
public FileProps propsBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.propsBlocking(path), io.vertx.golo.core.file.FileProps.class); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return InternalHelper.safeCreate(this.delegate.lprops(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
public FileProps lpropsBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.lpropsBlocking(path), io.vertx.golo.core.file.FileProps.class); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.link(link,existing,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
public FileSystem linkBlocking(java.lang.String link, java.lang.String existing) {
        return InternalHelper.safeCreate(this.delegate.linkBlocking(link,existing), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.symlink(link,existing,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
public FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) {
        return InternalHelper.safeCreate(this.delegate.symlinkBlocking(link,existing), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.unlink(link,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
public FileSystem unlinkBlocking(java.lang.String link) {
        return InternalHelper.safeCreate(this.delegate.unlinkBlocking(link), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return InternalHelper.safeCreate(this.delegate.readSymlink(link,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
public String readSymlinkBlocking(java.lang.String link) {
        return delegate.readSymlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.delete(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
public FileSystem deleteBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.deleteBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.deleteRecursive(path,recursive,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
public FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) {
        return InternalHelper.safeCreate(this.delegate.deleteRecursiveBlocking(path,recursive), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.mkdir(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
public FileSystem mkdirBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.mkdirBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.mkdir(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
public FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) {
        return InternalHelper.safeCreate(this.delegate.mkdirBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.mkdirs(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
public FileSystem mkdirsBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.mkdirsBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.mkdirs(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
public FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) {
        return InternalHelper.safeCreate(this.delegate.mkdirsBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.readDir(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
public String> readDirBlocking(java.lang.String path) {
        return delegate.readDirBlocking(path); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return InternalHelper.safeCreate(this.delegate.readDir(path,filter,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
public String> readDirBlocking(java.lang.String path, java.lang.String filter) {
        return delegate.readDirBlocking(path,filter); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return InternalHelper.safeCreate(this.delegate.readFile(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
public Buffer readFileBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.readFileBlocking(path), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.writeFile(path,data,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
public FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) {
        return InternalHelper.safeCreate(this.delegate.writeFileBlocking(path,data), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
public FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) {
        return InternalHelper.safeCreate(this.delegate.open(path,options,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
public AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) {
        return InternalHelper.safeCreate(this.delegate.openBlocking(path,options), io.vertx.golo.core.file.AsyncFile.class); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.createFile(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
public FileSystem createFileBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.createFileBlocking(path), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return InternalHelper.safeCreate(this.delegate.createFile(path,perms,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
public FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) {
        return InternalHelper.safeCreate(this.delegate.createFileBlocking(path,perms), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
public FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) {
        return InternalHelper.safeCreate(this.delegate.exists(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// boolean existsBlocking(java.lang.String path) 
public boolean existsBlocking(java.lang.String path) {
        return delegate.existsBlocking(path); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
public FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) {
        return InternalHelper.safeCreate(this.delegate.fsProps(path,handler), io.vertx.golo.core.file.FileSystem.class); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
public FileSystemProps fsPropsBlocking(java.lang.String path) {
        return InternalHelper.safeCreate(this.delegate.fsPropsBlocking(path), io.vertx.golo.core.file.FileSystemProps.class); 
}
}
