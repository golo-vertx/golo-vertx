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
public static CLI create(java.lang.String name) {
        return InternalHelper.safeCreate(io.vertx.core.cli.CLI.create(name), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
public CommandLine parse(java.util.List<java.lang.String> arguments) {
        return InternalHelper.safeCreate(this.delegate.parse(arguments), io.vertx.golo.core.cli.CommandLine.class); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
public CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) {
        return InternalHelper.safeCreate(this.delegate.parse(arguments,validate), io.vertx.golo.core.cli.CommandLine.class); 
}
// java.lang.String getName() 
public String getName() {
        return delegate.getName(); 
}
// io.vertx.core.cli.CLI setName(java.lang.String name) 
public CLI setName(java.lang.String name) {
        return InternalHelper.safeCreate(this.delegate.setName(name), io.vertx.golo.core.cli.CLI.class); 
}
// java.lang.String getDescription() 
public String getDescription() {
        return delegate.getDescription(); 
}
// io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
public CLI setDescription(java.lang.String desc) {
        return InternalHelper.safeCreate(this.delegate.setDescription(desc), io.vertx.golo.core.cli.CLI.class); 
}
// java.lang.String getSummary() 
public String getSummary() {
        return delegate.getSummary(); 
}
// io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
public CLI setSummary(java.lang.String summary) {
        return InternalHelper.safeCreate(this.delegate.setSummary(summary), io.vertx.golo.core.cli.CLI.class); 
}
// boolean isHidden() 
public boolean isHidden() {
        return delegate.isHidden(); 
}
// io.vertx.core.cli.CLI setHidden(boolean hidden) 
public CLI setHidden(boolean hidden) {
        return InternalHelper.safeCreate(this.delegate.setHidden(hidden), io.vertx.golo.core.cli.CLI.class); 
}
// java.util.List<io.vertx.core.cli.Option> getOptions() 
public Option> getOptions() {
        return delegate.getOptions(); 
}
// io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
public CLI addOption(io.vertx.core.cli.Option option) {
        return InternalHelper.safeCreate(this.delegate.addOption(option), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
public CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return InternalHelper.safeCreate(this.delegate.addOptions(options), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
public CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return InternalHelper.safeCreate(this.delegate.setOptions(options), io.vertx.golo.core.cli.CLI.class); 
}
// java.util.List<io.vertx.core.cli.Argument> getArguments() 
public Argument> getArguments() {
        return delegate.getArguments(); 
}
// io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
public CLI addArgument(io.vertx.core.cli.Argument arg) {
        return InternalHelper.safeCreate(this.delegate.addArgument(arg), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return InternalHelper.safeCreate(this.delegate.addArguments(args), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return InternalHelper.safeCreate(this.delegate.setArguments(args), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.Option getOption(java.lang.String name) 
public Option getOption(java.lang.String name) {
        return delegate.getOption(name); 
}
// io.vertx.core.cli.Argument getArgument(java.lang.String name) 
public Argument getArgument(java.lang.String name) {
        return delegate.getArgument(name); 
}
// io.vertx.core.cli.Argument getArgument(int index) 
public Argument getArgument(int index) {
        return delegate.getArgument(index); 
}
// io.vertx.core.cli.CLI removeOption(java.lang.String name) 
public CLI removeOption(java.lang.String name) {
        return InternalHelper.safeCreate(this.delegate.removeOption(name), io.vertx.golo.core.cli.CLI.class); 
}
// io.vertx.core.cli.CLI removeArgument(int index) 
public CLI removeArgument(int index) {
        return InternalHelper.safeCreate(this.delegate.removeArgument(index), io.vertx.golo.core.cli.CLI.class); 
}
}
