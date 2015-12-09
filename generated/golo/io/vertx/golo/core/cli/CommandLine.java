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
public static CommandLine create(io.vertx.core.cli.CLI cli) {
        //param classes(remove later):   API  
    return InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create(cli), io.vertx.golo.core.cli.CommandLine.class); 
}
// io.vertx.core.cli.CLI cli() 
public CLI cli() {
        //param classes(remove later):  
    return InternalHelper.safeCreate(this.delegate.cli(), io.vertx.golo.core.cli.CLI.class); 
}
// java.util.List<java.lang.String> allArguments() 
public List<String> allArguments() {
        //param classes(remove later):  
    return delegate.allArguments(); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
public <T> T getOptionValue(java.lang.String name) {
        //param classes(remove later):   STRING  
    return delegate.getOptionValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
public <T> T getArgumentValue(java.lang.String name) {
        //param classes(remove later):   STRING  
    return delegate.getArgumentValue(name); 
}
// <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
public <T> T getArgumentValue(int index) {
        //param classes(remove later):   PRIMITIVE  
    return delegate.getArgumentValue(index); 
}
// boolean isFlagEnabled(java.lang.String name) 
public boolean isFlagEnabled(java.lang.String name) {
        //param classes(remove later):   STRING  
    return delegate.isFlagEnabled(name); 
}
// boolean isOptionAssigned(io.vertx.core.cli.Option option) 
public boolean isOptionAssigned(io.vertx.core.cli.Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isOptionAssigned(option); 
}
// java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
public List<String> getRawValues(io.vertx.core.cli.Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValues(option); 
}
// java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
public String getRawValueForOption(io.vertx.core.cli.Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValueForOption(option); 
}
// boolean acceptMoreValues(io.vertx.core.cli.Option option) 
public boolean acceptMoreValues(io.vertx.core.cli.Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.acceptMoreValues(option); 
}
// java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
public String getRawValueForArgument(io.vertx.core.cli.Argument arg) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.getRawValueForArgument(arg); 
}
// boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
public boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isArgumentAssigned(arg); 
}
// boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
public boolean isSeenInCommandLine(io.vertx.core.cli.Option option) {
        //param classes(remove later):   DATA_OBJECT  
    return delegate.isSeenInCommandLine(option); 
}
}
