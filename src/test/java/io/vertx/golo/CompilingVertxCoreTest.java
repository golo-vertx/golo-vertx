package io.vertx.golo;

import helpers.Compiler;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class CompilingVertxCoreTest {

    @Test
    public void compileAllClasses() throws IOException{
        Compiler compiler = new Compiler();
        Consumer<Path> compile = (path)-> {
            try {
                if(path.toString().endsWith(".java")) {
                    compiler.compile(path.toString(), compiler.classPath);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Path start = Paths.get(System.getProperty("user.dir") + "/generated");
        forEachFile(start, compile);
    }

    private void forEachFile(Path start, Consumer<Path> function) throws IOException {
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                function.accept(file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
