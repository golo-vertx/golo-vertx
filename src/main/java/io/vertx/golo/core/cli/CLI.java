package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.cli.Option;
import java.util.List;
import io.vertx.core.cli.Argument;
// Type: io.vertx.core.cli.CLI 
public class CLI {
      private io.vertx.core.cli.CLI delegate;
  public CLI(Object delegate) {
    this.delegate = (io.vertx.core.cli.CLI) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//io.vertx.core.cli.CLI create(java.lang.String name)
//io.vertx.core.cli.CLI
  /**
   * Creates an instance of {@link io.vertx.golo.core.cli.CLI} using the default implementation.
   * @param name the name of the CLI (must not be <code>null</code>)
   * @return the created instance of {@link io.vertx.golo.core.cli.CLI}
   */
  public static CLI create(String name) {
return    InternalHelper.safeCreate(io.vertx.core.cli.CLI.create(name), io.vertx.golo.core.cli.CLI.class);
  }
//io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments)
//io.vertx.core.cli.CommandLine
  /**
   * Parses the user command line interface and create a new {@link io.vertx.golo.core.cli.CommandLine} containing extracting values.
   * @param arguments the arguments
   * @return the creates command line
   */
  public CommandLine parse(List<String> arguments) {
return    InternalHelper.safeCreate(this.delegate.parse(arguments), io.vertx.golo.core.cli.CommandLine.class);
  }
//io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate)
//io.vertx.core.cli.CommandLine
  /**
   * Parses the user command line interface and create a new {@link io.vertx.golo.core.cli.CommandLine} containing extracting values.
   * @param arguments the arguments
   * @param validate enable / disable parsing validation
   * @return the creates command line
   */
  public CommandLine parse(List<String> arguments, boolean validate) {
return    InternalHelper.safeCreate(this.delegate.parse(arguments, validate), io.vertx.golo.core.cli.CommandLine.class);
  }
//java.lang.String getName()
//java.lang.String
  /**
   * @return the CLI name.
   * @return 
   */
  public String getName() {
return    this.delegate.getName();
  }
//io.vertx.core.cli.CLI setName(java.lang.String name)
//io.vertx.core.cli.CLI
  /**
   * Sets the name of the CLI.
   * @param name the name
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI setName(String name) {
    this.delegate.setName(name);
    return this;
  }
//java.lang.String getDescription()
//java.lang.String
  /**
   * @return the CLI description.
   * @return 
   */
  public String getDescription() {
return    this.delegate.getDescription();
  }
//io.vertx.core.cli.CLI setDescription(java.lang.String desc)
//io.vertx.core.cli.CLI
  public CLI setDescription(String desc) {
    this.delegate.setDescription(desc);
    return this;
  }
//java.lang.String getSummary()
//java.lang.String
  /**
   * @return the CLI summary.
   * @return 
   */
  public String getSummary() {
return    this.delegate.getSummary();
  }
//io.vertx.core.cli.CLI setSummary(java.lang.String summary)
//io.vertx.core.cli.CLI
  /**
   * Sets the summary of the CLI.
   * @param summary the summary
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI setSummary(String summary) {
    this.delegate.setSummary(summary);
    return this;
  }
//boolean isHidden()
//boolean
  /**
   * Checks whether or not the current {@link io.vertx.golo.core.cli.CLI} instance is hidden.
   * @return <code>true</code> if the current {@link io.vertx.golo.core.cli.CLI} is hidden,  otherwise
   */
  public boolean isHidden() {
return    this.delegate.isHidden();
  }
//io.vertx.core.cli.CLI setHidden(boolean hidden)
//io.vertx.core.cli.CLI
  /**
   * Sets whether or not the current instance of {@link io.vertx.golo.core.cli.CLI} must be hidden. Hidden CLI are not listed when
   * displaying usages / help messages. In other words, hidden commands are for power user.
   * @param hidden enables or disables the hidden aspect of the CI
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI setHidden(boolean hidden) {
    this.delegate.setHidden(hidden);
    return this;
  }
//java.util.List<io.vertx.core.cli.Option> getOptions()
//java.util.List<io.vertx.core.cli.Option>
  /**
   * Gets the list of options.
   * @return the list of options, empty if none.
   */
  public List<Map<String, Object>> getOptions() {
return    this.delegate.getOptions().stream().map((underpants) -> (Map<String, Object>)InternalHelper.wrapObject(underpants.toJson())).collect(java.util.stream.Collectors.toList());
  }
//io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option)
//io.vertx.core.cli.CLI
  /**
   * Adds an option.
   * @param option the option, must not be <code>null</code>. (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI addOption(Map<String, Object> option) {
    this.delegate.addOption(option != null ? new io.vertx.core.cli.Option(new io.vertx.core.json.JsonObject(option)) : null);
    return this;
  }
//io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options)
//io.vertx.core.cli.CLI
  /**
   * Adds a set of options. Unlike {@link io.vertx.golo.core.cli.CLI#setOptions}}, this method does not remove the existing options.
   * The given list is appended to the existing list.
   * @param options the options, must not be <code>null</code>
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI addOptions(List<Map<String, Object>> options) {
    this.delegate.addOptions(options.stream().map((underpants) -> new Option(new JsonObject(underpants))).collect(java.util.stream.Collectors.toList()));
    return this;
  }
//io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options)
//io.vertx.core.cli.CLI
  /**
   * Sets the list of arguments.
   * @param options the list of options, must not be <code>null</code>
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI setOptions(List<Map<String, Object>> options) {
    this.delegate.setOptions(options.stream().map((underpants) -> new Option(new JsonObject(underpants))).collect(java.util.stream.Collectors.toList()));
    return this;
  }
//java.util.List<io.vertx.core.cli.Argument> getArguments()
//java.util.List<io.vertx.core.cli.Argument>
  /**
   * Gets the list of defined arguments.
   * @return the list of argument, empty if none.
   */
  public List<Map<String, Object>> getArguments() {
return    this.delegate.getArguments().stream().map((underpants) -> (Map<String, Object>)InternalHelper.wrapObject(underpants.toJson())).collect(java.util.stream.Collectors.toList());
  }
//io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg)
//io.vertx.core.cli.CLI
  /**
   * Adds an argument.
   * @param arg the argument, must not be <code>null</code> (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI addArgument(Map<String, Object> arg) {
    this.delegate.addArgument(arg != null ? new io.vertx.core.cli.Argument(new io.vertx.core.json.JsonObject(arg)) : null);
    return this;
  }
//io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args)
//io.vertx.core.cli.CLI
  /**
   * Adds a set of arguments. Unlike {@link io.vertx.golo.core.cli.CLI#setArguments}, this method does not remove the existing arguments.
   * The given list is appended to the existing list.
   * @param args the arguments, must not be <code>null</code>
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI addArguments(List<Map<String, Object>> args) {
    this.delegate.addArguments(args.stream().map((underpants) -> new Argument(new JsonObject(underpants))).collect(java.util.stream.Collectors.toList()));
    return this;
  }
//io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args)
//io.vertx.core.cli.CLI
  /**
   * Sets the list of arguments.
   * @param args the list of arguments, must not be <code>null</code>
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI setArguments(List<Map<String, Object>> args) {
    this.delegate.setArguments(args.stream().map((underpants) -> new Argument(new JsonObject(underpants))).collect(java.util.stream.Collectors.toList()));
    return this;
  }
//io.vertx.core.cli.Option getOption(java.lang.String name)
//io.vertx.core.cli.Option
  /**
   * Gets an <a href="../../../../../../../cheatsheet/Option.html">Option</a> based on its name (short name, long name or argument name).
   * @param name the name, must not be <code>null</code>
   * @return the <a href="../../../../../../../cheatsheet/Option.html">Option</a>, <code>null</code> if not found (see <a href="../../../../../../../cheatsheet/Option.html">Option</a>)
   */
  public Map<String, Object> getOption(String name) {
return    (Map<String, Object>)InternalHelper.wrapObject(this.delegate.getOption(name).toJson());
  }
//io.vertx.core.cli.Argument getArgument(java.lang.String name)
//io.vertx.core.cli.Argument
  /**
   * Gets an <a href="../../../../../../../cheatsheet/Argument.html">Argument</a> based on its name (argument name).
   * @param name the name of the argument, must not be <code>null</code>
   * @return the <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>, <code>null</code> if not found. (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   */
  public Map<String, Object> getArgumentname(String name) {
return    (Map<String, Object>)InternalHelper.wrapObject(this.delegate.getArgument(name).toJson());
  }
//io.vertx.core.cli.Argument getArgument(int index)
//io.vertx.core.cli.Argument
  /**
   * Gets an <a href="../../../../../../../cheatsheet/Argument.html">Argument</a> based on its index.
   * @param index the index, must be positive or zero.
   * @return the <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>, <code>null</code> if not found. (see <a href="../../../../../../../cheatsheet/Argument.html">Argument</a>)
   */
  public Map<String, Object> getArgumentindex(int index) {
return    (Map<String, Object>)InternalHelper.wrapObject(this.delegate.getArgument(index).toJson());
  }
//io.vertx.core.cli.CLI removeOption(java.lang.String name)
//io.vertx.core.cli.CLI
  /**
   * Removes an option identified by its name. This method does nothing if the option cannot be found.
   * @param name the option name
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI removeOption(String name) {
    this.delegate.removeOption(name);
    return this;
  }
//io.vertx.core.cli.CLI removeArgument(int index)
//io.vertx.core.cli.CLI
  /**
   * Removes an argument identified by its index. This method does nothing if the argument cannot be found.
   * @param index the argument index
   * @return the current {@link io.vertx.golo.core.cli.CLI} instance
   */
  public CLI removeArgument(int index) {
    this.delegate.removeArgument(index);
    return this;
  }
}
