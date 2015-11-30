package io.vertx.golo;

import helpers.Compiler;
import org.junit.Assert;
import org.junit.Test;



public class CompileTest {

    Compiler compiler = new Compiler();
    String path = System.getProperty("user.dir") + "/generated/golo/io/vertx/golo/core/";

    @Test
    public void canCompileBufferFile() throws Exception {
        Assert.assertTrue(compiler.compile(path+"buffer/Buffer.java", compiler.classPath));
    }
    @Test
    public void canCompileCli() throws Exception{
        Assert.assertTrue(compiler.compile(path+"cli/CLI.java", compiler.classPath));
    }
    @Test
    public void canCompileContext() throws Exception{
        Assert.assertTrue(compiler.compile(path+"Context.java", compiler.classPath));
    }
    @Test
    public void message() throws Exception{
        Assert.assertTrue(compiler.compile(path+"eventbus/Message.java", compiler.classPath));
    }
    @Test
    public void cli() throws Exception{
        Assert.assertTrue(compiler.compile(path+"cli/CLI.java", compiler.classPath));
        Assert.assertTrue(compiler.compile(path+"cli/CommandLine.java", compiler.classPath));
    }
    @Test
    public void eventbus() throws Exception{
        Assert.assertTrue(compiler.compile(path+"eventbus/EventBus.java", compiler.classPath));
    }
}
