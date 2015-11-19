package io.vertx.golo.core.File;

import io.vertx.core.file.AsyncFile;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.FileSystemProps;
import io.vertx.core.file.FileProps;
public class FileSystem { 

private io.vertx.core.file.FileSystem originalInstance;// io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.copy(); 
}
// io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) {
        return originalInstance.copyBlocking(); 
}
// io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.copyRecursive(); 
}
// io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
public io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) {
        return originalInstance.copyRecursiveBlocking(); 
}
// io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.move(); 
}
// io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
public io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) {
        return originalInstance.moveBlocking(); 
}
// io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.truncate(); 
}
// io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
public io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) {
        return originalInstance.truncateBlocking(); 
}
// io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chmod(); 
}
// io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.chmodBlocking(); 
}
// io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chmodRecursive(); 
}
// io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
public io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) {
        return originalInstance.chmodRecursiveBlocking(); 
}
// io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.chown(); 
}
// io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
public io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) {
        return originalInstance.chownBlocking(); 
}
// io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return originalInstance.props(); 
}
// io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps propsBlocking(java.lang.String path) {
        return originalInstance.propsBlocking(); 
}
// io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
public io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) {
        return originalInstance.lprops(); 
}
// io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) {
        return originalInstance.lpropsBlocking(); 
}
// io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.link(); 
}
// io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) {
        return originalInstance.linkBlocking(); 
}
// io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.symlink(); 
}
// io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
public io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) {
        return originalInstance.symlinkBlocking(); 
}
// io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.unlink(); 
}
// io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
public io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) {
        return originalInstance.unlinkBlocking(); 
}
// io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
public io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) {
        return originalInstance.readSymlink(); 
}
// java.lang.String readSymlinkBlocking(java.lang.String link) 
public java.lang.String readSymlinkBlocking(java.lang.String link) {
        return originalInstance.readSymlinkBlocking(); 
}
// io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.delete(); 
}
// io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) {
        return originalInstance.deleteBlocking(); 
}
// io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.deleteRecursive(); 
}
// io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
public io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) {
        return originalInstance.deleteRecursiveBlocking(); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdir(); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) {
        return originalInstance.mkdirBlocking(); 
}
// io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdir(); 
}
// io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.mkdirBlocking(); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdirs(); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) {
        return originalInstance.mkdirsBlocking(); 
}
// io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.mkdirs(); 
}
// io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.mkdirsBlocking(); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return originalInstance.readDir(); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path) {
        return originalInstance.readDirBlocking(); 
}
// io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
public io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) {
        return originalInstance.readDir(); 
}
// java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
public java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) {
        return originalInstance.readDirBlocking(); 
}
// io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
public io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) {
        return originalInstance.readFile(); 
}
// io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
public io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) {
        return originalInstance.readFileBlocking(); 
}
// io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.writeFile(); 
}
// io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
public io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) {
        return originalInstance.writeFileBlocking(); 
}
// io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
public io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) {
        return originalInstance.open(); 
}
// io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
public io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) {
        return originalInstance.openBlocking(); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.createFile(); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) {
        return originalInstance.createFileBlocking(); 
}
// io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
public io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) {
        return originalInstance.createFile(); 
}
// io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
public io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) {
        return originalInstance.createFileBlocking(); 
}
// io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
public io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) {
        return originalInstance.exists(); 
}
// boolean existsBlocking(java.lang.String path) 
public boolean existsBlocking(java.lang.String path) {
        return originalInstance.existsBlocking(); 
}
// io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
public io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) {
        return originalInstance.fsProps(); 
}
// io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
public io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) {
        return originalInstance.fsPropsBlocking(); 
}
}
