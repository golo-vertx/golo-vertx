module io.vertx.golo.core.File

import io.vertx.core.file.AsyncFile
import io.vertx.core.buffer.Buffer
import io.vertx.core.file.FileSystemProps
import io.vertx.core.file.FileProps
    # io.vertx.core.file.FileSystem copy(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function copy =| from , to , handler |{
        return io.vertx.core.file.FileSystem.copy()
}
    # io.vertx.core.file.FileSystem copyBlocking(java.lang.String from, java.lang.String to) 
function copyBlocking =| from , to |{
        return io.vertx.core.file.FileSystem.copyBlocking()
}
    # io.vertx.core.file.FileSystem copyRecursive(java.lang.String from, java.lang.String to, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function copyRecursive =| from , to , recursive , handler |{
        return io.vertx.core.file.FileSystem.copyRecursive()
}
    # io.vertx.core.file.FileSystem copyRecursiveBlocking(java.lang.String from, java.lang.String to, boolean recursive) 
function copyRecursiveBlocking =| from , to , recursive |{
        return io.vertx.core.file.FileSystem.copyRecursiveBlocking()
}
    # io.vertx.core.file.FileSystem move(java.lang.String from, java.lang.String to, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function move =| from , to , handler |{
        return io.vertx.core.file.FileSystem.move()
}
    # io.vertx.core.file.FileSystem moveBlocking(java.lang.String from, java.lang.String to) 
function moveBlocking =| from , to |{
        return io.vertx.core.file.FileSystem.moveBlocking()
}
    # io.vertx.core.file.FileSystem truncate(java.lang.String path, long len, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function truncate =| path , len , handler |{
        return io.vertx.core.file.FileSystem.truncate()
}
    # io.vertx.core.file.FileSystem truncateBlocking(java.lang.String path, long len) 
function truncateBlocking =| path , len |{
        return io.vertx.core.file.FileSystem.truncateBlocking()
}
    # io.vertx.core.file.FileSystem chmod(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function chmod =| path , perms , handler |{
        return io.vertx.core.file.FileSystem.chmod()
}
    # io.vertx.core.file.FileSystem chmodBlocking(java.lang.String path, java.lang.String perms) 
function chmodBlocking =| path , perms |{
        return io.vertx.core.file.FileSystem.chmodBlocking()
}
    # io.vertx.core.file.FileSystem chmodRecursive(java.lang.String path, java.lang.String perms, java.lang.String dirPerms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function chmodRecursive =| path , perms , dirPerms , handler |{
        return io.vertx.core.file.FileSystem.chmodRecursive()
}
    # io.vertx.core.file.FileSystem chmodRecursiveBlocking(java.lang.String path, java.lang.String perms, java.lang.String dirPerms) 
function chmodRecursiveBlocking =| path , perms , dirPerms |{
        return io.vertx.core.file.FileSystem.chmodRecursiveBlocking()
}
    # io.vertx.core.file.FileSystem chown(java.lang.String path, java.lang.String user, java.lang.String group, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function chown =| path , user , group , handler |{
        return io.vertx.core.file.FileSystem.chown()
}
    # io.vertx.core.file.FileSystem chownBlocking(java.lang.String path, java.lang.String user, java.lang.String group) 
function chownBlocking =| path , user , group |{
        return io.vertx.core.file.FileSystem.chownBlocking()
}
    # io.vertx.core.file.FileSystem props(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
function props =| path , handler |{
        return io.vertx.core.file.FileSystem.props()
}
    # io.vertx.core.file.FileProps propsBlocking(java.lang.String path) 
function propsBlocking =| path |{
        return io.vertx.core.file.FileProps.propsBlocking()
}
    # io.vertx.core.file.FileSystem lprops(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileProps>> handler) 
function lprops =| path , handler |{
        return io.vertx.core.file.FileSystem.lprops()
}
    # io.vertx.core.file.FileProps lpropsBlocking(java.lang.String path) 
function lpropsBlocking =| path |{
        return io.vertx.core.file.FileProps.lpropsBlocking()
}
    # io.vertx.core.file.FileSystem link(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function link =| link , existing , handler |{
        return io.vertx.core.file.FileSystem.link()
}
    # io.vertx.core.file.FileSystem linkBlocking(java.lang.String link, java.lang.String existing) 
function linkBlocking =| link , existing |{
        return io.vertx.core.file.FileSystem.linkBlocking()
}
    # io.vertx.core.file.FileSystem symlink(java.lang.String link, java.lang.String existing, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function symlink =| link , existing , handler |{
        return io.vertx.core.file.FileSystem.symlink()
}
    # io.vertx.core.file.FileSystem symlinkBlocking(java.lang.String link, java.lang.String existing) 
function symlinkBlocking =| link , existing |{
        return io.vertx.core.file.FileSystem.symlinkBlocking()
}
    # io.vertx.core.file.FileSystem unlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function unlink =| link , handler |{
        return io.vertx.core.file.FileSystem.unlink()
}
    # io.vertx.core.file.FileSystem unlinkBlocking(java.lang.String link) 
function unlinkBlocking =| link |{
        return io.vertx.core.file.FileSystem.unlinkBlocking()
}
    # io.vertx.core.file.FileSystem readSymlink(java.lang.String link, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> handler) 
function readSymlink =| link , handler |{
        return io.vertx.core.file.FileSystem.readSymlink()
}
    # java.lang.String readSymlinkBlocking(java.lang.String link) 
function readSymlinkBlocking =| link |{
        return java.lang.String.readSymlinkBlocking()
}
    # io.vertx.core.file.FileSystem delete(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function delete =| path , handler |{
        return io.vertx.core.file.FileSystem.delete()
}
    # io.vertx.core.file.FileSystem deleteBlocking(java.lang.String path) 
function deleteBlocking =| path |{
        return io.vertx.core.file.FileSystem.deleteBlocking()
}
    # io.vertx.core.file.FileSystem deleteRecursive(java.lang.String path, boolean recursive, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function deleteRecursive =| path , recursive , handler |{
        return io.vertx.core.file.FileSystem.deleteRecursive()
}
    # io.vertx.core.file.FileSystem deleteRecursiveBlocking(java.lang.String path, boolean recursive) 
function deleteRecursiveBlocking =| path , recursive |{
        return io.vertx.core.file.FileSystem.deleteRecursiveBlocking()
}
    # io.vertx.core.file.FileSystem mkdir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function mkdir =| path , handler |{
        return io.vertx.core.file.FileSystem.mkdir()
}
    # io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path) 
function mkdirBlocking =| path |{
        return io.vertx.core.file.FileSystem.mkdirBlocking()
}
    # io.vertx.core.file.FileSystem mkdir(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function mkdirByPathAndPermsAndHandler =| path , perms , handler |{
        return io.vertx.core.file.FileSystem.mkdir()
}
    # io.vertx.core.file.FileSystem mkdirBlocking(java.lang.String path, java.lang.String perms) 
function mkdirBlockingByPathAndPerms =| path , perms |{
        return io.vertx.core.file.FileSystem.mkdirBlocking()
}
    # io.vertx.core.file.FileSystem mkdirs(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function mkdirs =| path , handler |{
        return io.vertx.core.file.FileSystem.mkdirs()
}
    # io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path) 
function mkdirsBlocking =| path |{
        return io.vertx.core.file.FileSystem.mkdirsBlocking()
}
    # io.vertx.core.file.FileSystem mkdirs(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function mkdirsByPathAndPermsAndHandler =| path , perms , handler |{
        return io.vertx.core.file.FileSystem.mkdirs()
}
    # io.vertx.core.file.FileSystem mkdirsBlocking(java.lang.String path, java.lang.String perms) 
function mkdirsBlockingByPathAndPerms =| path , perms |{
        return io.vertx.core.file.FileSystem.mkdirsBlocking()
}
    # io.vertx.core.file.FileSystem readDir(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function readDir =| path , handler |{
        return io.vertx.core.file.FileSystem.readDir()
}
    # java.util.List<java.lang.String> readDirBlocking(java.lang.String path) 
function readDirBlocking =| path |{
        return java.util.List<java.lang.String>.readDirBlocking()
}
    # io.vertx.core.file.FileSystem readDir(java.lang.String path, java.lang.String filter, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> handler) 
function readDirByPathAndFilterAndHandler =| path , filter , handler |{
        return io.vertx.core.file.FileSystem.readDir()
}
    # java.util.List<java.lang.String> readDirBlocking(java.lang.String path, java.lang.String filter) 
function readDirBlockingByPathAndFilter =| path , filter |{
        return java.util.List<java.lang.String>.readDirBlocking()
}
    # io.vertx.core.file.FileSystem readFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.buffer.Buffer>> handler) 
function readFile =| path , handler |{
        return io.vertx.core.file.FileSystem.readFile()
}
    # io.vertx.core.buffer.Buffer readFileBlocking(java.lang.String path) 
function readFileBlocking =| path |{
        return io.vertx.core.buffer.Buffer.readFileBlocking()
}
    # io.vertx.core.file.FileSystem writeFile(java.lang.String path, io.vertx.core.buffer.Buffer data, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function writeFile =| path , data , handler |{
        return io.vertx.core.file.FileSystem.writeFile()
}
    # io.vertx.core.file.FileSystem writeFileBlocking(java.lang.String path, io.vertx.core.buffer.Buffer data) 
function writeFileBlocking =| path , data |{
        return io.vertx.core.file.FileSystem.writeFileBlocking()
}
    # io.vertx.core.file.FileSystem open(java.lang.String path, io.vertx.core.file.OpenOptions options, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.AsyncFile>> handler) 
function open =| path , options , handler |{
        return io.vertx.core.file.FileSystem.open()
}
    # io.vertx.core.file.AsyncFile openBlocking(java.lang.String path, io.vertx.core.file.OpenOptions options) 
function openBlocking =| path , options |{
        return io.vertx.core.file.AsyncFile.openBlocking()
}
    # io.vertx.core.file.FileSystem createFile(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function createFile =| path , handler |{
        return io.vertx.core.file.FileSystem.createFile()
}
    # io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path) 
function createFileBlocking =| path |{
        return io.vertx.core.file.FileSystem.createFileBlocking()
}
    # io.vertx.core.file.FileSystem createFile(java.lang.String path, java.lang.String perms, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> handler) 
function createFileByPathAndPermsAndHandler =| path , perms , handler |{
        return io.vertx.core.file.FileSystem.createFile()
}
    # io.vertx.core.file.FileSystem createFileBlocking(java.lang.String path, java.lang.String perms) 
function createFileBlockingByPathAndPerms =| path , perms |{
        return io.vertx.core.file.FileSystem.createFileBlocking()
}
    # io.vertx.core.file.FileSystem exists(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> handler) 
function exists =| path , handler |{
        return io.vertx.core.file.FileSystem.exists()
}
    # boolean existsBlocking(java.lang.String path) 
function existsBlocking =| path |{
        return boolean.existsBlocking()
}
    # io.vertx.core.file.FileSystem fsProps(java.lang.String path, io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.file.FileSystemProps>> handler) 
function fsProps =| path , handler |{
        return io.vertx.core.file.FileSystem.fsProps()
}
    # io.vertx.core.file.FileSystemProps fsPropsBlocking(java.lang.String path) 
function fsPropsBlocking =| path |{
        return io.vertx.core.file.FileSystemProps.fsPropsBlocking()
}
