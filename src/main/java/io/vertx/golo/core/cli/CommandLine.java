package io.vertx.golo.core.cli;

//[Debug] This is a debuging message to check @code{} syntax
// {0=8, 883204693=399641995, 1803665059=1703004991, -1216209562=1411052605, -1924858927=-1095514636, -257636915=-1908058239, -1946792260=1455176751, -239011125=488156113, 197417064=1964690135} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.cli.Option;
import java.util.List;
import io.vertx.core.cli.Argument;
// Type: io.vertx.core.cli.CommandLine 
public class CommandLine {
      //[test] I am inside the classbody.templ
  //variable created inside classbody - <variable inside class body>
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
}
