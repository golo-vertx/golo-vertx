package io.vertx.golo.core.cli;

import io.vertx.lang.golo.InternalHelper;
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
                // io.vertx.core.cli.CLI create(java.lang.String name) 
    // TypeParams: [] 
        public static CLI create(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.cli.CLI.create(name), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments) 
    // TypeParams: [] 
        public CommandLine parse(List<String> arguments) {
                //param classes(remove later):   LIST  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.parse(arguments), io.vertx.golo.core.cli.CommandLine.class); 
    }
        // io.vertx.core.cli.CommandLine parse(java.util.List<java.lang.String> arguments, boolean validate) 
    // TypeParams: [] 
        public CommandLine parse(List<String> arguments,boolean validate) {
                //param classes(remove later):   LIST   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.parse(arguments,validate), io.vertx.golo.core.cli.CommandLine.class); 
    }
        // java.lang.String getName() 
    // TypeParams: [] 
        public String getName() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.getName(); 
    }
        // io.vertx.core.cli.CLI setName(java.lang.String name) 
    // TypeParams: [] 
        public CLI setName(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setName(name), io.vertx.golo.core.cli.CLI.class); 
    }
        // java.lang.String getDescription() 
    // TypeParams: [] 
        public String getDescription() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.getDescription(); 
    }
        // io.vertx.core.cli.CLI setDescription(java.lang.String desc) 
    // TypeParams: [] 
        public CLI setDescription(String desc) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setDescription(desc), io.vertx.golo.core.cli.CLI.class); 
    }
        // java.lang.String getSummary() 
    // TypeParams: [] 
        public String getSummary() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.getSummary(); 
    }
        // io.vertx.core.cli.CLI setSummary(java.lang.String summary) 
    // TypeParams: [] 
        public CLI setSummary(String summary) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setSummary(summary), io.vertx.golo.core.cli.CLI.class); 
    }
        // boolean isHidden() 
    // TypeParams: [] 
        public boolean isHidden() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.isHidden(); 
    }
        // io.vertx.core.cli.CLI setHidden(boolean hidden) 
    // TypeParams: [] 
        public CLI setHidden(boolean hidden) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setHidden(hidden), io.vertx.golo.core.cli.CLI.class); 
    }
        // java.util.List<io.vertx.core.cli.Option> getOptions() 
    // TypeParams: [] 
        public List<Option> getOptions() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.getOptions(); 
    }
        // io.vertx.core.cli.CLI addOption(io.vertx.core.cli.Option option) 
    // TypeParams: [] 
        public CLI addOption(Option option) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.addOption(option), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CLI addOptions(java.util.List<io.vertx.core.cli.Option> options) 
    // TypeParams: [] 
        public CLI addOptions(List<Option> options) {
                //param classes(remove later):   LIST  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.addOptions(options), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CLI setOptions(java.util.List<io.vertx.core.cli.Option> options) 
    // TypeParams: [] 
        public CLI setOptions(List<Option> options) {
                //param classes(remove later):   LIST  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setOptions(options), io.vertx.golo.core.cli.CLI.class); 
    }
        // java.util.List<io.vertx.core.cli.Argument> getArguments() 
    // TypeParams: [] 
        public List<Argument> getArguments() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.getArguments(); 
    }
        // io.vertx.core.cli.CLI addArgument(io.vertx.core.cli.Argument arg) 
    // TypeParams: [] 
        public CLI addArgument(Argument arg) {
                //param classes(remove later):   DATA_OBJECT  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.addArgument(arg), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CLI addArguments(java.util.List<io.vertx.core.cli.Argument> args) 
    // TypeParams: [] 
        public CLI addArguments(List<Argument> args) {
                //param classes(remove later):   LIST  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.addArguments(args), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CLI setArguments(java.util.List<io.vertx.core.cli.Argument> args) 
    // TypeParams: [] 
        public CLI setArguments(List<Argument> args) {
                //param classes(remove later):   LIST  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.setArguments(args), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.Option getOption(java.lang.String name) 
    // TypeParams: [] 
        public Option getOption(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.getOption(name); 
    }
        // io.vertx.core.cli.Argument getArgument(java.lang.String name) 
    // TypeParams: [] 
        public Argument getArgument(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.getArgument(name); 
    }
        // io.vertx.core.cli.Argument getArgument(int index) 
    // TypeParams: [] 
        public Argument getArgument(int index) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getArgument(index); 
    }
        // io.vertx.core.cli.CLI removeOption(java.lang.String name) 
    // TypeParams: [] 
        public CLI removeOption(String name) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.removeOption(name), io.vertx.golo.core.cli.CLI.class); 
    }
        // io.vertx.core.cli.CLI removeArgument(int index) 
    // TypeParams: [] 
        public CLI removeArgument(int index) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.removeArgument(index), io.vertx.golo.core.cli.CLI.class); 
    }
        }
