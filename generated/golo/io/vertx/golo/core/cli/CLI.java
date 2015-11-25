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
public static io.vertx.core.cli.CLI create(java.lang.String name) {
        return (io.vertx.core.cli.CLI)InternalHelper.safeCreate(io.vertx.core.cli.CLI.create(name), io.vertx.golo.core.cli.function_prototype:className.class); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
public io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) {
        return delegate.parse(arguments); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
public io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) {
        return delegate.parse(arguments, validate); 
}
// java.lang.String getName() 
public java.lang.String getName() {
        return delegate.getName(); 
}
// io.vertx.core.cli.CLI setName(java.lang.String name) 
public io.vertx.core.cli.CLI setName(java.lang.String name) {
        return delegate.setName(name); 
}
// java.lang.String getDescription() 
public java.lang.String getDescription() {
        return delegate.getDescription(); 
}
// io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
public io.vertx.core.cli.CLI setDescription(java.lang.String desc) {
        return delegate.setDescription(desc); 
}
// java.lang.String getSummary() 
public java.lang.String getSummary() {
        return delegate.getSummary(); 
}
// io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
public io.vertx.core.cli.CLI setSummary(java.lang.String summary) {
        return delegate.setSummary(summary); 
}
// boolean isHidden() 
public boolean isHidden() {
        return delegate.isHidden(); 
}
// io.vertx.core.cli.CLI setHidden(boolean hidden) 
public io.vertx.core.cli.CLI setHidden(boolean hidden) {
        return delegate.setHidden(hidden); 
}
// java.util.List<io.vertx.core.cli.Option> getOptions() 
public java.util.List<io.vertx.core.cli.Option> getOptions() {
        return delegate.getOptions(); 
}
// io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
public io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) {
        return delegate.addOption(option); 
}
// io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
public io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return delegate.addOptions(options); 
}
// io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
public io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return delegate.setOptions(options); 
}
// java.util.List<io.vertx.core.cli.Argument> getArguments() 
public java.util.List<io.vertx.core.cli.Argument> getArguments() {
        return delegate.getArguments(); 
}
// io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
public io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) {
        return delegate.addArgument(arg); 
}
// io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return delegate.addArguments(args); 
}
// io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return delegate.setArguments(args); 
}
// io.vertx.core.cli.Option getOption(java.lang.String name) 
public io.vertx.core.cli.Option getOption(java.lang.String name) {
        return delegate.getOption(name); 
}
// io.vertx.core.cli.Argument getArgument(java.lang.String name) 
public io.vertx.core.cli.Argument getArgument(java.lang.String name) {
        return delegate.getArgument(name); 
}
// io.vertx.core.cli.Argument getArgument(int index) 
public io.vertx.core.cli.Argument getArgument(int index) {
        return delegate.getArgument(index); 
}
// io.vertx.core.cli.CLI removeOption(java.lang.String name) 
public io.vertx.core.cli.CLI removeOption(java.lang.String name) {
        return delegate.removeOption(name); 
}
// io.vertx.core.cli.CLI removeArgument(int index) 
public io.vertx.core.cli.CLI removeArgument(int index) {
        return delegate.removeArgument(index); 
}
}
