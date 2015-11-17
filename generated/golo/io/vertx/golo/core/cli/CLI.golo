module io.vertx.golo.core.Cli

import io.vertx.core.cli.CommandLine
    # io.vertx.core.cli.CLI create(java.lang.String name) 
function createByName =| name |{
        return io.vertx.core.cli.CLI.create()
}
    # io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
function parseByArguments =| arguments |{
        return io.vertx.core.cli.CommandLine.parse()
}
    # io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
function parseByArgumentsAndValidate =| arguments , validate |{
        return io.vertx.core.cli.CommandLine.parse()
}
    # java.lang.String getName() 
function getName ={
        return java.lang.String.getName()
}
    # io.vertx.core.cli.CLI setName(java.lang.String name) 
function setNameByName =| name |{
        return io.vertx.core.cli.CLI.setName()
}
    # java.lang.String getDescription() 
function getDescription ={
        return java.lang.String.getDescription()
}
    # io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
function setDescriptionByDesc =| desc |{
        return io.vertx.core.cli.CLI.setDescription()
}
    # java.lang.String getSummary() 
function getSummary ={
        return java.lang.String.getSummary()
}
    # io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
function setSummaryBySummary =| summary |{
        return io.vertx.core.cli.CLI.setSummary()
}
    # boolean isHidden() 
function isHidden ={
        return boolean.isHidden()
}
    # io.vertx.core.cli.CLI setHidden(boolean hidden) 
function setHiddenByHidden =| hidden |{
        return io.vertx.core.cli.CLI.setHidden()
}
    # java.util.List<io.vertx.core.cli.Option> getOptions() 
function getOptions ={
        return java.util.List<io.vertx.core.cli.Option>.getOptions()
}
    # io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
function addOptionByOption =| option |{
        return io.vertx.core.cli.CLI.addOption()
}
    # io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
function addOptionsByOptions =| options |{
        return io.vertx.core.cli.CLI.addOptions()
}
    # io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
function setOptionsByOptions =| options |{
        return io.vertx.core.cli.CLI.setOptions()
}
    # java.util.List<io.vertx.core.cli.Argument> getArguments() 
function getArguments ={
        return java.util.List<io.vertx.core.cli.Argument>.getArguments()
}
    # io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
function addArgumentByArg =| arg |{
        return io.vertx.core.cli.CLI.addArgument()
}
    # io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
function addArgumentsByArgs =| args |{
        return io.vertx.core.cli.CLI.addArguments()
}
    # io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
function setArgumentsByArgs =| args |{
        return io.vertx.core.cli.CLI.setArguments()
}
    # io.vertx.core.cli.Option getOption(java.lang.String name) 
function getOptionByName =| name |{
        return io.vertx.core.cli.Option.getOption()
}
    # io.vertx.core.cli.Argument getArgument(java.lang.String name) 
function getArgumentByName =| name |{
        return io.vertx.core.cli.Argument.getArgument()
}
    # io.vertx.core.cli.Argument getArgument(int index) 
function getArgumentByIndex =| index |{
        return io.vertx.core.cli.Argument.getArgument()
}
    # io.vertx.core.cli.CLI removeOption(java.lang.String name) 
function removeOptionByName =| name |{
        return io.vertx.core.cli.CLI.removeOption()
}
    # io.vertx.core.cli.CLI removeArgument(int index) 
function removeArgumentByIndex =| index |{
        return io.vertx.core.cli.CLI.removeArgument()
}
