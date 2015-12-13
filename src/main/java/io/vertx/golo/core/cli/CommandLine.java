package io.vertx.golo.core.cli;

//[Debug] classMethodData = {io.vertx.core.cli.CommandLine=14} 
//[Debug] arr = [io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli), io.vertx.core.cli.CLI cli(), java.util.List<java.lang.String> allArguments(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index), boolean isFlagEnabled(java.lang.String name), boolean isOptionAssigned(io.vertx.core.cli.Option option), java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option), java.lang.String getRawValueForOption(io.vertx.core.cli.Option option), boolean acceptMoreValues(io.vertx.core.cli.Option option), java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg), boolean isArgumentAssigned(io.vertx.core.cli.Argument arg), boolean isSeenInCommandLine(io.vertx.core.cli.Option option)] 
//[Debug] This is a debuging message to check @code{} syntax
//myHashMap={0=8, 1372821607=-137106099, -1781294203=-385617849, 765568552=-129145282, 1389161783=1457056495, 570229926=1227741654, -9026600=-268953031, -1176784811=256752049, 1161203529=1287021574} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.cli.Option;
import java.util.List;
import io.vertx.core.cli.Argument;
//[confirm] Type: io.vertx.core.cli.CommandLine 
public class CommandLine {
//[Debug] toChangeName = {boolean isOptionAssigned(io.vertx.core.cli.Option option)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index)=true, java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option)=false, boolean acceptMoreValues(io.vertx.core.cli.Option option)=false, io.vertx.core.cli.CLI cli()=false, java.util.List<java.lang.String> allArguments()=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name)=true, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name)=false, java.lang.String getRawValueForOption(io.vertx.core.cli.Option option)=false, boolean isFlagEnabled(java.lang.String name)=false, java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg)=false, io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli)=false, boolean isArgumentAssigned(io.vertx.core.cli.Argument arg)=false, boolean isSeenInCommandLine(io.vertx.core.cli.Option option)=false}
//[Debug] dbgMethodName = {boolean isOptionAssigned(io.vertx.core.cli.Option option)=isOptionAssigned, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index)=getArgumentValue, java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option)=getRawValues, boolean acceptMoreValues(io.vertx.core.cli.Option option)=acceptMoreValues, io.vertx.core.cli.CLI cli()=cli, java.util.List<java.lang.String> allArguments()=allArguments, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name)=getArgumentValue, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name)=getOptionValue, java.lang.String getRawValueForOption(io.vertx.core.cli.Option option)=getRawValueForOption, boolean isFlagEnabled(java.lang.String name)=isFlagEnabled, java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg)=getRawValueForArgument, io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli)=create, boolean isArgumentAssigned(io.vertx.core.cli.Argument arg)=isArgumentAssigned, boolean isSeenInCommandLine(io.vertx.core.cli.Option option)=isSeenInCommandLine} 
//[Debug] dbgMethodParams = {boolean isOptionAssigned(io.vertx.core.cli.Option option)=1, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index)=1, java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option)=1, boolean acceptMoreValues(io.vertx.core.cli.Option option)=1, io.vertx.core.cli.CLI cli()=0, java.util.List<java.lang.String> allArguments()=0, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name)=1, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name)=1, java.lang.String getRawValueForOption(io.vertx.core.cli.Option option)=1, boolean isFlagEnabled(java.lang.String name)=1, java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg)=1, io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli)=1, boolean isArgumentAssigned(io.vertx.core.cli.Argument arg)=1, boolean isSeenInCommandLine(io.vertx.core.cli.Option option)=1} 
//[INFO]  methods=[io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli), io.vertx.core.cli.CLI cli(), java.util.List<java.lang.String> allArguments(), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name), <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index), boolean isFlagEnabled(java.lang.String name), boolean isOptionAssigned(io.vertx.core.cli.Option option), java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option), java.lang.String getRawValueForOption(io.vertx.core.cli.Option option), boolean acceptMoreValues(io.vertx.core.cli.Option option), java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg), boolean isArgumentAssigned(io.vertx.core.cli.Argument arg), boolean isSeenInCommandLine(io.vertx.core.cli.Option option)] 
//[INFO]  defaultDataObjectMap={io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli)=false, java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg)=true, boolean isSeenInCommandLine(io.vertx.core.cli.Option option)=true, java.lang.String getRawValueForOption(io.vertx.core.cli.Option option)=true, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index)=false, java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option)=true, boolean isArgumentAssigned(io.vertx.core.cli.Argument arg)=true, boolean isOptionAssigned(io.vertx.core.cli.Option option)=true, boolean isFlagEnabled(java.lang.String name)=false, <TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name)=false, java.util.List<java.lang.String> allArguments()=false, boolean acceptMoreValues(io.vertx.core.cli.Option option)=true, io.vertx.core.cli.CLI cli()=false} 
//[INFO] ifaceSimpleName=CommandLine
//[track] control goes into classbody.templ
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
  //Test variable from golo.templ - myHashMap={0=8, 1372821607=-137106099, -1781294203=-385617849, 765568552=-129145282, 1389161783=1457056495, 570229926=1227741654, -9026600=-268953031, -1176784811=256752049, 1161203529=1287021574}
  private io.vertx.core.cli.CommandLine delegate;
  public CommandLine(Object delegate) {
    this.delegate = (io.vertx.core.cli.CommandLine) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.cli.CommandLine create(io.vertx.core.cli.CLI cli)
//io.vertx.core.cli.CommandLine
  /**
   * Creates a command line object from the {@link io.vertx.golo.core.cli.CLI}. This object is intended to be used by
   * the parser to set the argument and option values.
   * @param cli the CLI definition
   * @return the command line object
   */
  public static CommandLine create(CLI cli) {
return    InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create((io.vertx.core.cli.CLI)cli.getDelegate()), io.vertx.golo.core.cli.CommandLine.class);
  }
//io.vertx.core.cli.CLI cli()
//io.vertx.core.cli.CLI
  /**
   * @return the model of this command line object.
   * @return 
   */
  public CLI cli() {
return    InternalHelper.safeCreate(this.delegate.cli(), io.vertx.golo.core.cli.CLI.class);
  }
//java.util.List<java.lang.String> allArguments()
//java.util.List<java.lang.String>
  /**
   * @return the ordered list of arguments. Arguments are command line arguments not matching an option.
   * @return 
   */
  public List<String> allArguments() {
return    this.delegate.allArguments();
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetOptionValue]> T getOptionValue(java.lang.String name)
//T
  /**
   * Gets the value of an option with the matching name (can be the long name, short name or arg name).
   * @param name the name
   * @return the value, <code>null</code> if not set
   */
  public <T> T getOptionValue(String name) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getOptionValue(name));
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(java.lang.String name)
//T
  /**
   * Gets the value of an argument with the matching name (arg name).
   * @param name the name
   * @return the value, <code>null</code> if not set
   */
  public <T> T getArgumentValue(String name) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getArgumentValue(name));
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.cli.CommandLine,methodNamegetArgumentValue]> T getArgumentValue(int index)
//T
  /**
   * Gets the value of an argument with the given index.
   * @param index the index
   * @return the value, <code>null</code> if not set
   */
  public <T> T getArgumentValue(int index) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getArgumentValue(index));
  }
//boolean isFlagEnabled(java.lang.String name)
//boolean
  /**
   * Gets the value of an option marked as a flag.
   * <p/>
   * Calling this method an a non-flag option throws an {@link java.lang.IllegalStateException}.
   * @param name the option name
   * @return <code>true</code> if the flag has been set in the command line, <code>false</code> otherwise.
   */
  public boolean isFlagEnabled(String name) {
return    this.delegate.isFlagEnabled(name);
  }
//boolean isOptionAssigned(io.vertx.core.cli.Option option)
//boolean
  /**
   * Checks whether or not the given option has been assigned in the command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return <code>true</code> if the option has received a value,  otherwise.
   */
  public boolean isOptionAssigned(Map<String, Object> option) {
return    this.delegate.isOptionAssigned(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
//java.util.List<java.lang.String> getRawValues(io.vertx.core.cli.Option option)
//java.util.List<java.lang.String>
  /**
   * Gets the raw values of the given option. Raw values are simple "String", not converted to the option type.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return the list of values, empty if none
   */
  public List<String> getRawValues(Map<String, Object> option) {
return    this.delegate.getRawValues(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
//java.lang.String getRawValueForOption(io.vertx.core.cli.Option option)
//java.lang.String
  /**
   * Gets the raw value of the given option. Raw values are the values as given in the user command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return the value, <code>null</code> if none.
   */
  public String getRawValueForOption(Map<String, Object> option) {
return    this.delegate.getRawValueForOption(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
//boolean acceptMoreValues(io.vertx.core.cli.Option option)
//boolean
  /**
   * Checks whether or not the given option accept more values.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return  if the option accepts more values,  otherwise.
   */
  public boolean acceptMoreValues(Map<String, Object> option) {
return    this.delegate.acceptMoreValues(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
//java.lang.String getRawValueForArgument(io.vertx.core.cli.Argument arg)
//java.lang.String
  /**
   * Gets the raw value of the given argument. Raw values are the values as given in the user command line.
   * @param arg the argument (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   * @return the value, <code>null</code> if none.
   */
  public String getRawValueForArgument(Map<String, Object> arg) {
return    this.delegate.getRawValueForArgument(arg != null ? new io.vertx.core.cli.Argument(new io.vertx.core.json.JsonObject(arg)) : null);
  }
//boolean isArgumentAssigned(io.vertx.core.cli.Argument arg)
//boolean
  /**
   * Checks whether or not the given argument has been assigned in the command line.
   * @param arg the argument (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   * @return <code>true</code> if the argument has received a value,  otherwise.
   */
  public boolean isArgumentAssigned(Map<String, Object> arg) {
return    this.delegate.isArgumentAssigned(arg != null ? new io.vertx.core.cli.Argument(new io.vertx.core.json.JsonObject(arg)) : null);
  }
//boolean isSeenInCommandLine(io.vertx.core.cli.Option option)
//boolean
  /**
   * check whether or not the given option has been seen in the user command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return <code>true</code> if the user command line has used the option
   */
  public boolean isSeenInCommandLine(Map<String, Object> option) {
return    this.delegate.isSeenInCommandLine(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
    //[track] control returns from classbody.templ
}
//[INFO] var concrete=true
//[debug] came from concrete part 
