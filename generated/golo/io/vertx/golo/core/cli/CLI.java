package io.vertx.golo.core.Cli;

import io.vertx.core.cli.CommandLine;
public class CLI { 

private io.vertx.core.cli.CLI originalInstance; 
// io.vertx.core.cli.CLI create(java.lang.String name) 
public io.vertx.core.cli.CLI create(java.lang.String name) {
        return originalInstance.create(name); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
public io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) {
        return originalInstance.parse(arguments); 
}
// io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
public io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) {
        return originalInstance.parse(arguments, validate); 
}
// java.lang.String getName() 
public java.lang.String getName() {
        return originalInstance.getName(); 
}
// io.vertx.core.cli.CLI setName(java.lang.String name) 
public io.vertx.core.cli.CLI setName(java.lang.String name) {
        return originalInstance.setName(name); 
}
// java.lang.String getDescription() 
public java.lang.String getDescription() {
        return originalInstance.getDescription(); 
}
// io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
public io.vertx.core.cli.CLI setDescription(java.lang.String desc) {
        return originalInstance.setDescription(desc); 
}
// java.lang.String getSummary() 
public java.lang.String getSummary() {
        return originalInstance.getSummary(); 
}
// io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
public io.vertx.core.cli.CLI setSummary(java.lang.String summary) {
        return originalInstance.setSummary(summary); 
}
// boolean isHidden() 
public boolean isHidden() {
        return originalInstance.isHidden(); 
}
// io.vertx.core.cli.CLI setHidden(boolean hidden) 
public io.vertx.core.cli.CLI setHidden(boolean hidden) {
        return originalInstance.setHidden(hidden); 
}
// java.util.List<io.vertx.core.cli.Option> getOptions() 
public java.util.List<io.vertx.core.cli.Option> getOptions() {
        return originalInstance.getOptions(); 
}
// io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
public io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) {
        return originalInstance.addOption(option); 
}
// io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
public io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return originalInstance.addOptions(options); 
}
// io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
public io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) {
        return originalInstance.setOptions(options); 
}
// java.util.List<io.vertx.core.cli.Argument> getArguments() 
public java.util.List<io.vertx.core.cli.Argument> getArguments() {
        return originalInstance.getArguments(); 
}
// io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
public io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) {
        return originalInstance.addArgument(arg); 
}
// io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return originalInstance.addArguments(args); 
}
// io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
public io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) {
        return originalInstance.setArguments(args); 
}
// io.vertx.core.cli.Option getOption(java.lang.String name) 
public io.vertx.core.cli.Option getOption(java.lang.String name) {
        return originalInstance.getOption(name); 
}
// io.vertx.core.cli.Argument getArgument(java.lang.String name) 
public io.vertx.core.cli.Argument getArgument(java.lang.String name) {
        return originalInstance.getArgument(name); 
}
// io.vertx.core.cli.Argument getArgument(int index) 
public io.vertx.core.cli.Argument getArgument(int index) {
        return originalInstance.getArgument(index); 
}
// io.vertx.core.cli.CLI removeOption(java.lang.String name) 
public io.vertx.core.cli.CLI removeOption(java.lang.String name) {
        return originalInstance.removeOption(name); 
}
// io.vertx.core.cli.CLI removeArgument(int index) 
public io.vertx.core.cli.CLI removeArgument(int index) {
        return originalInstance.removeArgument(index); 
}
}
