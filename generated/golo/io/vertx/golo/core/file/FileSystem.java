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
public io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.copy(from, to, handler); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) {
        return (io.vertx.core.file.FileSystem)delegate.copyBlocking(from, to); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.copyRecursive(from, to, recursive, handler); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
public io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) {
        return (io.vertx.core.file.FileSystem)delegate.copyRecursiveBlocking(from, to, recursive); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.move(from, to, handler); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) {
        return (io.vertx.core.file.FileSystem)delegate.moveBlocking(from, to); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.truncate(path, len, handler); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
public io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) {
        return (io.vertx.core.file.FileSystem)delegate.truncateBlocking(path, len); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.chmod(path, perms, handler); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) {
        return (io.vertx.core.file.FileSystem)delegate.chmodBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.chmodRecursive(path, perms, dirPerms, handler); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
public io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) {
        return (io.vertx.core.file.FileSystem)delegate.chmodRecursiveBlocking(path, perms, dirPerms); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.chown(path, user, group, handler); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
public io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) {
        return (io.vertx.core.file.FileSystem)delegate.chownBlocking(path, user, group); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.props(path, handler); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps propsBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileProps)delegate.propsBlocking(path); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.lprops(path, handler); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileProps)delegate.lpropsBlocking(path); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.link(link, existing, handler); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) {
        return (io.vertx.core.file.FileSystem)delegate.linkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.symlink(link, existing, handler); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) {
        return (io.vertx.core.file.FileSystem)delegate.symlinkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.unlink(link, handler); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
public io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) {
        return (io.vertx.core.file.FileSystem)delegate.unlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.readSymlink(link, handler); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
public java.lang.String readSymlinkBlocking(java.lang.String link) {
        return (java.lang.String)delegate.readSymlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.delete(path, handler); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileSystem)delegate.deleteBlocking(path); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.deleteRecursive(path, recursive, handler); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
public io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) {
        return (io.vertx.core.file.FileSystem)delegate.deleteRecursiveBlocking(path, recursive); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.mkdir(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.mkdir(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirs(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirsBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirs(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) {
        return (io.vertx.core.file.FileSystem)delegate.mkdirsBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.readDir(path, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path) {
        return (java.util.List<java.lang.String>)delegate.readDirBlocking(path); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.readDir(path, filter, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) {
        return (java.util.List<java.lang.String>)delegate.readDirBlocking(path, filter); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.readFile(path, handler); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
public io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) {
        return (io.vertx.core.buffer.Buffer)delegate.readFileBlocking(path); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.writeFile(path, data, handler); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) {
        return (io.vertx.core.file.FileSystem)delegate.writeFileBlocking(path, data); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
public io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.open(path, options, handler); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
public io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) {
        return (io.vertx.core.file.AsyncFile)delegate.openBlocking(path, options); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.createFile(path, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileSystem)delegate.createFileBlocking(path); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.createFile(path, perms, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) {
        return (io.vertx.core.file.FileSystem)delegate.createFileBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
public io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.exists(path, handler); 
}
// boolean existsBlocking(java.lang.String path) 
public boolean existsBlocking(java.lang.String path) {
        return (boolean)delegate.existsBlocking(path); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
public io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) {
        return (io.vertx.core.file.FileSystem)delegate.fsProps(path, handler); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) {
        return (io.vertx.core.file.FileSystemProps)delegate.fsPropsBlocking(path); 
}
}
