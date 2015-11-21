package io.vertx.golo.core.file;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.file.AsyncFile;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystemProps;
import io.vertx.core.file.FileProps;
public class FileSystem { 

private io.vertx.core.file.FileSystem delegate; 
public FileSystem(Object delegate) { 
    this.delegate = (io.vertx.core.file.FileSystem)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.copy(from, to, handler); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) {
        return delegate.copyBlocking(from, to); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.copyRecursive(from, to, recursive, handler); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
public io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) {
        return delegate.copyRecursiveBlocking(from, to, recursive); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.move(from, to, handler); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) {
        return delegate.moveBlocking(from, to); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.truncate(path, len, handler); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
public io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) {
        return delegate.truncateBlocking(path, len); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.chmod(path, perms, handler); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) {
        return delegate.chmodBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.chmodRecursive(path, perms, dirPerms, handler); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
public io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) {
        return delegate.chmodRecursiveBlocking(path, perms, dirPerms); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.chown(path, user, group, handler); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
public io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) {
        return delegate.chownBlocking(path, user, group); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return delegate.props(path, handler); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps propsBlocking(java.lang.String path) {
        return delegate.propsBlocking(path); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return delegate.lprops(path, handler); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) {
        return delegate.lpropsBlocking(path); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.link(link, existing, handler); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) {
        return delegate.linkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.symlink(link, existing, handler); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) {
        return delegate.symlinkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.unlink(link, handler); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
public io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) {
        return delegate.unlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return delegate.readSymlink(link, handler); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
public java.lang.String readSymlinkBlocking(java.lang.String link) {
        return delegate.readSymlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.delete(path, handler); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) {
        return delegate.deleteBlocking(path); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.deleteRecursive(path, recursive, handler); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
public io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) {
        return delegate.deleteRecursiveBlocking(path, recursive); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.mkdir(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) {
        return delegate.mkdirBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.mkdir(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) {
        return delegate.mkdirBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.mkdirs(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) {
        return delegate.mkdirsBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.mkdirs(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) {
        return delegate.mkdirsBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return delegate.readDir(path, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path) {
        return delegate.readDirBlocking(path); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return delegate.readDir(path, filter, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) {
        return delegate.readDirBlocking(path, filter); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return delegate.readFile(path, handler); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
public io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) {
        return delegate.readFileBlocking(path); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.writeFile(path, data, handler); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) {
        return delegate.writeFileBlocking(path, data); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
public io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) {
        return delegate.open(path, options, handler); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
public io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) {
        return delegate.openBlocking(path, options); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.createFile(path, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) {
        return delegate.createFileBlocking(path); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return delegate.createFile(path, perms, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) {
        return delegate.createFileBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
public io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) {
        return delegate.exists(path, handler); 
}
// boolean existsBlocking(java.lang.String path) 
public boolean existsBlocking(java.lang.String path) {
        return delegate.existsBlocking(path); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
public io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) {
        return delegate.fsProps(path, handler); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) {
        return delegate.fsPropsBlocking(path); 
}
}
