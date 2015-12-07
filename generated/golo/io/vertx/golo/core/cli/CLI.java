package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.cli.CommandLine;
// io.vertx.core.cli.CLI 
public class CLI { 

private io.vertx.core.cli.CLI delegate; 
public CLI(Object delegate) { 
    this.delegate = (io.vertx.core.cli.CLI)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.cli.CLI create(java.lang.String name) 
public static CLI {
        return (io.vertx.core.cli.CLI)InternalHelper.safeCreate(io.vertx.core.cli.CLI.create(name), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
public CommandLine {
        return (io.vertx.core.cli.CommandLine)delegate.parse(arguments); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
public CommandLine {
        return (io.vertx.core.cli.CommandLine)delegate.parse(arguments, validate); 
}
// java.lang.String getName() 
public String {
        return (java.lang.String)delegate.getName(); 
}
// io.vertx.core.cli.CLI setName(java.lang.String name) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setName(name); 
}
// java.lang.String getDescription() 
public String {
        return (java.lang.String)delegate.getDescription(); 
}
// io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setDescription(desc); 
}
// java.lang.String getSummary() 
public String {
        return (java.lang.String)delegate.getSummary(); 
}
// io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setSummary(summary); 
}
// boolean isHidden() 
public boolean {
        return (boolean)delegate.isHidden(); 
}
// io.vertx.core.cli.CLI setHidden(boolean hidden) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setHidden(hidden); 
}
// java.util.List<io.vertx.core.cli.Option> getOptions() 
public Option> {
        return (java.util.List<io.vertx.core.cli.Option>)delegate.getOptions(); 
}
// io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.addOption(option); 
}
// io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.addOptions(options); 
}
// io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setOptions(options); 
}
// java.util.List<io.vertx.core.cli.Argument> getArguments() 
public Argument> {
        return (java.util.List<io.vertx.core.cli.Argument>)delegate.getArguments(); 
}
// io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.addArgument(arg); 
}
// io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.addArguments(args); 
}
// io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.setArguments(args); 
}
// io.vertx.core.cli.Option getOption(java.lang.String name) 
public Option {
        return (io.vertx.core.cli.Option)delegate.getOption(name); 
}
// io.vertx.core.cli.Argument getArgument(java.lang.String name) 
public Argument {
        return (io.vertx.core.cli.Argument)delegate.getArgument(name); 
}
// io.vertx.core.cli.Argument getArgument(int index) 
public Argument {
        return (io.vertx.core.cli.Argument)delegate.getArgument(index); 
}
// io.vertx.core.cli.CLI removeOption(java.lang.String name) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.removeOption(name); 
}
// io.vertx.core.cli.CLI removeArgument(int index) 
public CLI {
        return (io.vertx.core.cli.CLI)delegate.removeArgument(index); 
}
}
