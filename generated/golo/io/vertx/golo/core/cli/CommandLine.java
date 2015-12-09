package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.core.cli.Option;
import java.util.List;
import io.vertx.core.cli.Argument;
// Type: io.vertx.core.cli.CommandLine 
public class CommandLine { 

private io.vertx.core.cli.CommandLine delegate; 
public CommandLine(Object delegate) { 
    this.delegate = (io.vertx.core.cli.CommandLine)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) 
// TypeParams: [] 
public static CommandLine create(CLI cli) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create(cli), io.vertx.golo.core.cli.CommandLine.class); 
}
// io.vertx.core.cli.CLI cli() 
// TypeParams: [] 
public CLI cli() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.cli(), io.vertx.golo.core.cli.CLI.class); 
}
// java.util.List<java.lang.String> allArguments() 
// TypeParams: [] 
public List<String> allArguments() {
        //param classes(remove later):  
    return delegate.allArguments(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]] 
public <T> T getOptionValue(String name) {
        //param classes(remove later):   STRING  
    return delegate.getOptionValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]] 
public <T> T getArgumentValue(String name) {
        //param classes(remove later):   STRING  
    return delegate.getArgumentValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
// TypeParams: [TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]] 
public <T> T getArgumentValue(int index) {
        //param classes(remove later):   PRIMITIVE  
    return delegate.getArgumentValue(index); 
}
// boolean isFlagEnabled(java.lang.String name) 
// TypeParams: [] 
public boolean isFlagEnabled(String name) {
        //param classes(remove later):   STRING  
    return delegate.isFlagEnabled(name); 
}
// boolean isOptionAssigned(io.vertx.core.cli.Option option) 
// TypeParams: [] 
public boolean isOptionAssigned(Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isOptionAssigned(option); 
}
// java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
// TypeParams: [] 
public List<String> getRawValues(Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValues(option); 
}
// java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
// TypeParams: [] 
public String getRawValueForOption(Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValueForOption(option); 
}
// boolean acceptMoreValues(io.vertx.core.cli.Option option) 
// TypeParams: [] 
public boolean acceptMoreValues(Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.acceptMoreValues(option); 
}
// java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
// TypeParams: [] 
public String getRawValueForArgument(Argument arg) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValueForArgument(arg); 
}
// boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
// TypeParams: [] 
public boolean isArgumentAssigned(Argument arg) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isArgumentAssigned(arg); 
}
// boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
// TypeParams: [] 
public boolean isSeenInCommandLine(Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isSeenInCommandLine(option); 
}
}
