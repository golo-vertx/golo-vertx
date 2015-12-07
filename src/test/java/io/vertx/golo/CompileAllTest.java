package io.vertx.golo;

import helpers.Compiler;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Consumer;

public class CompileAllTest {

    @Test
    public void compileAllClasses() throws IOException{
        final int[] counter = new int[]{0};
        Compiler compiler = new Compiler();
        String destination = System.getProperty("user.dir") + compiler.classPath;
        Consumer<Path> compile = (path)-> {
            try {
                if(path.toString().endsWith(".java")) {
                    Assert.assertTrue(compiler.compile(path.toString(), compiler.classPath, destination));
                    counter[0]++;
                    System.out.printf("counter: " + counter[0] + " of 61 files are compiling");
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
