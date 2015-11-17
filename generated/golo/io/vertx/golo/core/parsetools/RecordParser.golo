module io.vertx.golo.core.Parsetools

import io.vertx.core.buffer.Buffer
    # void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function setOutputByOutput =| output |{
        return void.setOutput()
}
    # io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newDelimitedByDelimAndOutput =| delim , output |{
        return io.vertx.core.parsetools.RecordParser.newDelimited()
}
    # io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newDelimitedByDelimAndOutput =| delim , output |{
        return io.vertx.core.parsetools.RecordParser.newDelimited()
}
    # io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newFixedBySizeAndOutput =| size , output |{
        return io.vertx.core.parsetools.RecordParser.newFixed()
}
    # void delimitedMode(java.lang.String delim) 
function delimitedModeByDelim =| delim |{
        return void.delimitedMode()
}
    # void delimitedMode(io.vertx.core.buffer.Buffer delim) 
function delimitedModeByDelim =| delim |{
        return void.delimitedMode()
}
    # void fixedSizeMode(int size) 
function fixedSizeModeBySize =| size |{
        return void.fixedSizeMode()
}
    # void handle(io.vertx.core.buffer.Buffer buffer) 
function handleByBuffer =| buffer |{
        return void.handle()
}
