package io.vertx.golo.core.File;

import io.vertx.core.file.AsyncFile;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystemProps;
import io.vertx.core.file.FileProps;
public class FileSystem { 

private io.vertx.core.file.FileSystem originalInstance; 
// io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.copy(from, to, handler); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) {
        return originalInstance.copyBlocking(from, to); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.copyRecursive(from, to, recursive, handler); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
public io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) {
        return originalInstance.copyRecursiveBlocking(from, to, recursive); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.move(from, to, handler); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) {
        return originalInstance.moveBlocking(from, to); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.truncate(path, len, handler); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
public io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) {
        return originalInstance.truncateBlocking(path, len); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chmod(path, perms, handler); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.chmodBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chmodRecursive(path, perms, dirPerms, handler); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
public io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) {
        return originalInstance.chmodRecursiveBlocking(path, perms, dirPerms); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chown(path, user, group, handler); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
public io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) {
        return originalInstance.chownBlocking(path, user, group); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return originalInstance.props(path, handler); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps propsBlocking(java.lang.String path) {
        return originalInstance.propsBlocking(path); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return originalInstance.lprops(path, handler); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) {
        return originalInstance.lpropsBlocking(path); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.link(link, existing, handler); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) {
        return originalInstance.linkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.symlink(link, existing, handler); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) {
        return originalInstance.symlinkBlocking(link, existing); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.unlink(link, handler); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
public io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) {
        return originalInstance.unlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return originalInstance.readSymlink(link, handler); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
public java.lang.String readSymlinkBlocking(java.lang.String link) {
        return originalInstance.readSymlinkBlocking(link); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.delete(path, handler); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) {
        return originalInstance.deleteBlocking(path); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.deleteRecursive(path, recursive, handler); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
public io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) {
        return originalInstance.deleteRecursiveBlocking(path, recursive); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdir(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) {
        return originalInstance.mkdirBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdir(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.mkdirBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdirs(path, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) {
        return originalInstance.mkdirsBlocking(path); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdirs(path, perms, handler); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.mkdirsBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return originalInstance.readDir(path, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path) {
        return originalInstance.readDirBlocking(path); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return originalInstance.readDir(path, filter, handler); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) {
        return originalInstance.readDirBlocking(path, filter); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return originalInstance.readFile(path, handler); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
public io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) {
        return originalInstance.readFileBlocking(path); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.writeFile(path, data, handler); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeFileBlocking(path, data); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
public io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) {
        return originalInstance.open(path, options, handler); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
public io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) {
        return originalInstance.openBlocking(path, options); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.createFile(path, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) {
        return originalInstance.createFileBlocking(path); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.createFile(path, perms, handler); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.createFileBlocking(path, perms); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
public io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) {
        return originalInstance.exists(path, handler); 
}
// boolean existsBlocking(java.lang.String path) 
public boolean existsBlocking(java.lang.String path) {
        return originalInstance.existsBlocking(path); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
public io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) {
        return originalInstance.fsProps(path, handler); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) {
        return originalInstance.fsPropsBlocking(path); 
}
}
