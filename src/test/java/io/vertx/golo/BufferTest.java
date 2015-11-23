package io.vertx.golo;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarFile;
import java.util.stream.Collectors;


public class BufferTest {

    private List invokeGoloFromCommandLine(String command) throws Exception {
        Process tr = Runtime.getRuntime().exec(new String[]{"bash", "-i","-c",command});
        BufferedReader rd = new BufferedReader( new InputStreamReader( tr.getInputStream() ) );
        tr.waitFor();
        return rd.lines().collect(Collectors.toList());
    }

    @Test
    public void goloCommandLineToolIsInstalled() throws Exception {
        List result = invokeGoloFromCommandLine("golo");
        Assert.assertThat(result.toString(),
                CoreMatchers.containsString("Usage: golo [options] [command] [command options]"));
    }

    @Test
    public void canCompileBufferFile() throws Exception {
        String path = "/generated/golo/io/vertx/golo/core/cli/CLI.java";
        File file = new File(System.getProperty("user.dir") + path);
        File[] files1 = new File[]{file};

        String jarPath = "/extractedClass/vertx-core.jar/";
        JarFile vertxFiles = new JarFile(System.getProperty("user.dir") + jarPath);
        JarFile[] files2 = new JarFile[]{vertxFiles};

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

       // fileManager.getJavaFileObjects(vertxFiles);
        Iterable<? extends JavaFileObject> compilationUnits1 =
                fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files1));
        compiler.getTask(null, fileManager, null, null, null, compilationUnits1).call();

        fileManager.close();
    }
}
