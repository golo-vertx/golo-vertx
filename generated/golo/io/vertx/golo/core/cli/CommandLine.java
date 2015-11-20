package io.vertx.golo.core.Cli;

import io.vertx.core.cli.CLI;
public class CommandLine { 

private io.vertx.core.cli.CommandLine originalInstance; 
// io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) 
public io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) {
        return originalInstance.create(cli); 
}
// io.vertx.core.cli.CLI cli() 
public io.vertx.core.cli.CLI cli() {
        return originalInstance.cli(); 
}
// java.util.List<java.lang.String> allArguments() 
public java.util.List<java.lang.String> allArguments() {
        return originalInstance.allArguments(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) {
        return originalInstance.getOptionValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) {
        return originalInstance.getArgumentValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
public <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) {
        return originalInstance.getArgumentValue(index); 
}
// boolean isFlagEnabled(java.lang.String name) 
public boolean isFlagEnabled(java.lang.String name) {
        return originalInstance.isFlagEnabled(name); 
}
// boolean isOptionAssigned(io.vertx.core.cli.Option option) 
public boolean isOptionAssigned(io.vertx.core.cli.Option option) {
        return originalInstance.isOptionAssigned(option); 
}
// java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
public java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) {
        return originalInstance.getRawValues(option); 
}
// java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
public java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) {
        return originalInstance.getRawValueForOption(option); 
}
// boolean acceptMoreValues(io.vertx.core.cli.Option option) 
public boolean acceptMoreValues(io.vertx.core.cli.Option option) {
        return originalInstance.acceptMoreValues(option); 
}
// java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
public java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) {
        return originalInstance.getRawValueForArgument(arg); 
}
// boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
public boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) {
        return originalInstance.isArgumentAssigned(arg); 
}
// boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
public boolean isSeenInCommandLine(io.vertx.core.cli.Option option) {
        return originalInstance.isSeenInCommandLine(option); 
}
}
