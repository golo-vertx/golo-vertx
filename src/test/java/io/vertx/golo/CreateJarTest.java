package io.vertx.golo;

import helpers.JarCreator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.JarEntry;

public class CreateJarTest {

    String jarArchive = "/src/test/resources/generated.jar";
    String pathToClasses = "/src/test/java/compiledFiles";

    @Test
    public void createJar() throws Exception{
        System.out.println();
        String rootPath = System.getProperty("user.dir");
        String input = rootPath + pathToClasses;
        String outputJar = rootPath + jarArchive;

        JarCreator creator = new JarCreator();
        creator.createJarArchive(input, outputJar, rootPath+pathToClasses);
    }
}
