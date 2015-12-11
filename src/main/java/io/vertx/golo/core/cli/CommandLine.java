package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.cli.Option;
import java.util.List;
import io.vertx.core.cli.Argument;
// Type: io.vertx.core.cli.CommandLine 
public class CommandLine {
      private io.vertx.core.cli.CommandLine delegate;
  public CommandLine(Object delegate) {
    this.delegate = (io.vertx.core.cli.CommandLine) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Creates a command line object from the {@link io.vertx.golo.core.cli.CLI}. This object is intended to be used by
   * the parser to set the argument and option values.
   * @param cli the CLI definition
   * @return the command line object
   */
  public static CommandLine create(CLI cli) {
return    InternalHelper.safeCreate(io.vertx.core.cli.CommandLine.create((io.vertx.core.cli.CLI)cli.getDelegate()), io.vertx.golo.core.cli.CommandLine.class);
  }
  /**
   * @return the model of this command line object.
   * @return 
   */
  public CLI cli() {
return    InternalHelper.safeCreate(this.delegate.cli(), io.vertx.golo.core.cli.CLI.class);
  }
  /**
   * @return the ordered list of arguments. Arguments are command line arguments not matching an option.
   * @return 
   */
  public List<String> allArguments() {
return    this.delegate.allArguments();
  }
  /**
   * Gets the value of an option with the matching name (can be the long name, short name or arg name).
   * @param name the name
   * @return the value, <code>null</code> if not set
   */
  public <T> T getOptionValue(String name) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getOptionValue(name));
  }
  /**
   * Gets the value of an argument with the matching name (arg name).
   * @param name the name
   * @return the value, <code>null</code> if not set
   */
  public <T> T getArgumentValue(String name) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getArgumentValue(name));
  }
  /**
   * Gets the value of an argument with the given index.
   * @param index the index
   * @return the value, <code>null</code> if not set
   */
  public <T> T getArgumentValue(int index) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.getArgumentValue(index));
  }
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
  /**
   * Checks whether or not the given option has been assigned in the command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return <code>true</code> if the option has received a value,  otherwise.
   */
  public boolean isOptionAssigned(Map<String, Object> option) {
return    this.delegate.isOptionAssigned(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
  /**
   * Gets the raw values of the given option. Raw values are simple "String", not converted to the option type.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return the list of values, empty if none
   */
  public List<String> getRawValues(Map<String, Object> option) {
return    this.delegate.getRawValues(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
  /**
   * Gets the raw value of the given option. Raw values are the values as given in the user command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return the value, <code>null</code> if none.
   */
  public String getRawValueForOption(Map<String, Object> option) {
return    this.delegate.getRawValueForOption(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
  /**
   * Checks whether or not the given option accept more values.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return  if the option accepts more values,  otherwise.
   */
  public boolean acceptMoreValues(Map<String, Object> option) {
return    this.delegate.acceptMoreValues(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
  /**
   * Gets the raw value of the given argument. Raw values are the values as given in the user command line.
   * @param arg the argument (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   * @return the value, <code>null</code> if none.
   */
  public String getRawValueForArgument(Map<String, Object> arg) {
return    this.delegate.getRawValueForArgument(arg != null ? new io.vertx.core.cli.Argument(new io.vertx.core.json.JsonObject(arg)) : null);
  }
  /**
   * Checks whether or not the given argument has been assigned in the command line.
   * @param arg the argument (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   * @return <code>true</code> if the argument has received a value,  otherwise.
   */
  public boolean isArgumentAssigned(Map<String, Object> arg) {
return    this.delegate.isArgumentAssigned(arg != null ? new io.vertx.core.cli.Argument(new io.vertx.core.json.JsonObject(arg)) : null);
  }
  /**
   * check whether or not the given option has been seen in the user command line.
   * @param option the option (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return <code>true</code> if the user command line has used the option
   */
  public boolean isSeenInCommandLine(Map<String, Object> option) {
return    this.delegate.isSeenInCommandLine(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
  }
}
