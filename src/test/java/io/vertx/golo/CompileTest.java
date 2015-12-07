package io.vertx.golo;

import helpers.Compiler;
import org.junit.Assert;
import org.junit.Test;

public class CompileTest {

    Compiler compiler = new Compiler();
    String path = System.getProperty("user.dir") + "/generated/golo/io/vertx/golo/core/";

    @Test
    public void canCompileBufferFile() throws Exception {
        Assert.assertTrue(compiler.compile(path+"buffer/Buffer.java", compiler.classPath, null));
    }
    @Test
    public void canCompileCli() throws Exception{
        Assert.assertTrue(compiler.compile(path+"cli/CLI.java", compiler.classPath, null));
    }
    @Test
    public void canCompileContext() throws Exception{
        Assert.assertTrue(compiler.compile(path+"Context.java", compiler.classPath, null));
    }
    @Test
    public void message() throws Exception{
        Assert.assertTrue(compiler.compile(path+"eventbus/Message.java", compiler.classPath, null));
    }
    @Test
    public void cli() throws Exception{
        Assert.assertTrue(compiler.compile(path+"cli/CLI.java", compiler.classPath, null));
        Assert.assertTrue(compiler.compile(path+"cli/CommandLine.java", compiler.classPath, null));
    }
    @Test
    public void eventbus() throws Exception{
        Assert.assertTrue(compiler.compile(path+"eventbus/EventBus.java", compiler.classPath, null));
    }
    @Test
    public void future() throws Exception{
        Assert.assertTrue(compiler.compile(path+"Future.java", compiler.classPath, null));
    }
}
