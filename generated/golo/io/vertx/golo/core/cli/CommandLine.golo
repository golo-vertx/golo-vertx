module io.vertx.golo.core.Cli

import io.vertx.core.cli.CLI
    # io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli) 
function createByCli =| cli |{
        return io.vertx.core.cli.CommandLine.create()
}
    # io.vertx.core.cli.CLI cli() 
function cli ={
        return io.vertx.core.cli.CLI.cli()
}
    # java.util.List<java.lang.String> allArguments() 
function allArguments ={
        return java.util.List<java.lang.String>.allArguments()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name) 
function getOptionValueByName =| name |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]>.getOptionValue()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name) 
function getArgumentValueByName =| name |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]>.getArgumentValue()
}
    # <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index) 
function getArgumentValueByIndex =| index |{
        return <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]>.getArgumentValue()
}
    # boolean isFlagEnabled(java.lang.String name) 
function isFlagEnabledByName =| name |{
        return boolean.isFlagEnabled()
}
    # boolean isOptionAssigned(io.vertx.core.cli.Option option) 
function isOptionAssignedByOption =| option |{
        return boolean.isOptionAssigned()
}
    # java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option) 
function getRawValuesByOption =| option |{
        return java.util.List<java.lang.String>.getRawValues()
}
    # java.lang.String getRawValueForOption(io.vertx.core.cli.Option option) 
function getRawValueForOptionByOption =| option |{
        return java.lang.String.getRawValueForOption()
}
    # boolean acceptMoreValues(io.vertx.core.cli.Option option) 
function acceptMoreValuesByOption =| option |{
        return boolean.acceptMoreValues()
}
    # java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg) 
function getRawValueForArgumentByArg =| arg |{
        return java.lang.String.getRawValueForArgument()
}
    # boolean isArgumentAssigned(io.vertx.core.cli.Argument arg) 
function isArgumentAssignedByArg =| arg |{
        return boolean.isArgumentAssigned()
}
    # boolean isSeenInCommandLine(io.vertx.core.cli.Option option) 
function isSeenInCommandLineByOption =| option |{
        return boolean.isSeenInCommandLine()
}
