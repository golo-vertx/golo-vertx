package io.vertx.golo;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
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
        String path = "/generated/golo/io/vertx/golo/core/buffer/Buffer.java";
        File file = new File(System.getProperty("user.dir") + path);
        try {
            MyClassLoader loader = new MyClassLoader(MyClassLoader.class.getClassLoader());
            Class buffer = loader.loadClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error: "+e.getMessage());
        }
        //io.vertx.golo.core.buffer.Buffer buffer = new io.vertx.golo.buffer.Buffer();
    }
}
