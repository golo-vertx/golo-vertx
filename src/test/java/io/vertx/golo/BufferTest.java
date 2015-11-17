package io.vertx.golo;

import io.vertx.core.buffer.Buffer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
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
        String command = "golo compile generated/golo/io/vertx/golo/core/buffer/Buffer.golo";
        Assert.assertThat(invokeGoloFromCommandLine(command).toString(), CoreMatchers.is("[]"));
    }
}
