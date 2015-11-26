package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.cli.CLI;
// io.vertx.core.cli.CommandLine 
public class CommandLine { 

private io.vertx.core.cli.CommandLine delegate; 
public CommandLine(Object delegate) { 
    this.delegate = (io.vertx.core.cli.CommandLine)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) 
public static io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) {
        return (io.vertx.core.cli.CommandLine)InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create(cli), io.vertx.golo.core.cli.CommandLine.class); 
}
// io.vertx.core.cli.CLI cli() 
public io.vertx.core.cli.CLI cli() {
        return (io.vertx.core.cli.CLI)delegate.cli(); 
}
// java.util.List<java.lang.String> allArguments() 
public java.util.List<java.lang.String> allArguments() {
        return (java.util.List<java.lang.String>)delegate.allArguments(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
public <T>T {
        return (T)delegate.getOptionValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
public <T>T {
        return (T)delegate.getArgumentValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
public <T>T {
        return (T)delegate.getArgumentValue(index); 
}
// boolean isFlagEnabled(java.lang.String name) 
public boolean isFlagEnabled(java.lang.String name) {
        return (boolean)delegate.isFlagEnabled(name); 
}
// boolean isOptionAssigned(io.vertx.core.cli.Option option) 
public boolean isOptionAssigned(io.vertx.core.cli.Option option) {
        return (boolean)delegate.isOptionAssigned(option); 
}
// java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
public java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) {
        return (java.util.List<java.lang.String>)delegate.getRawValues(option); 
}
// java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
public java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) {
        return (java.lang.String)delegate.getRawValueForOption(option); 
}
// boolean acceptMoreValues(io.vertx.core.cli.Option option) 
public boolean acceptMoreValues(io.vertx.core.cli.Option option) {
        return (boolean)delegate.acceptMoreValues(option); 
}
// java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
public java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) {
        return (java.lang.String)delegate.getRawValueForArgument(arg); 
}
// boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
public boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) {
        return (boolean)delegate.isArgumentAssigned(arg); 
}
// boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
public boolean isSeenInCommandLine(io.vertx.core.cli.Option option) {
        return (boolean)delegate.isSeenInCommandLine(option); 
}
}
