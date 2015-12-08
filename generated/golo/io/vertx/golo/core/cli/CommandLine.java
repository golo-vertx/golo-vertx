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
public static CommandLine create(io.vertx.core.cli.CLI cli) {
        return InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create(cli), io.vertx.golo.core.cli.CommandLine.class); 
}
// io.vertx.core.cli.CLI cli() 
public CLI cli() {
        return InternalHelper.safeCreate(this.delegate.cli(), io.vertx.golo.core.cli.CLI.class); 
}
// java.util.List<java.lang.String> allArguments() 
public String> allArguments() {
        return delegate.allArguments(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
public <T> T getOptionValue(java.lang.String name) {
        return delegate.getOptionValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
public <T> T getArgumentValue(java.lang.String name) {
        return delegate.getArgumentValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
public <T> T getArgumentValue(int index) {
        return delegate.getArgumentValue(index); 
}
// boolean isFlagEnabled(java.lang.String name) 
public boolean isFlagEnabled(java.lang.String name) {
        return delegate.isFlagEnabled(name); 
}
// boolean isOptionAssigned(io.vertx.core.cli.Option option) 
public boolean isOptionAssigned(io.vertx.core.cli.Option option) {
        return delegate.isOptionAssigned(option); 
}
// java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
public String> getRawValues(io.vertx.core.cli.Option option) {
        return delegate.getRawValues(option); 
}
// java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
public String getRawValueForOption(io.vertx.core.cli.Option option) {
        return delegate.getRawValueForOption(option); 
}
// boolean acceptMoreValues(io.vertx.core.cli.Option option) 
public boolean acceptMoreValues(io.vertx.core.cli.Option option) {
        return delegate.acceptMoreValues(option); 
}
// java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
public String getRawValueForArgument(io.vertx.core.cli.Argument arg) {
        return delegate.getRawValueForArgument(arg); 
}
// boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
public boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) {
        return delegate.isArgumentAssigned(arg); 
}
// boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
public boolean isSeenInCommandLine(io.vertx.core.cli.Option option) {
        return delegate.isSeenInCommandLine(option); 
}
}
