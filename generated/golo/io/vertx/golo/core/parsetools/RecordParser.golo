module io.vertx.golo.core.Parsetools

import io.vertx.core.buffer.Buffer
    # void setOutput(io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function setOutput =| output |{
        return void.setOutput()
}
    # io.vertx.core.parsetools.RecordParser newDelimited(java.lang.String delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newDelimited =| delim , output |{
        return io.vertx.core.parsetools.RecordParser.newDelimited()
}
    # io.vertx.core.parsetools.RecordParser newDelimited(io.vertx.core.buffer.Buffer delim, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newDelimitedByDelimAndOutput =| delim , output |{
        return io.vertx.core.parsetools.RecordParser.newDelimited()
}
    # io.vertx.core.parsetools.RecordParser newFixed(int size, io.vertx.core.Handler<io.vertx.core.buffer.Buffer> output) 
function newFixed =| size , output |{
        return io.vertx.core.parsetools.RecordParser.newFixed()
}
    # void delimitedMode(java.lang.String delim) 
function delimitedMode =| delim |{
        return void.delimitedMode()
}
    # void delimitedMode(io.vertx.core.buffer.Buffer delim) 
function delimitedModeByDelim =| delim |{
        return void.delimitedMode()
}
    # void fixedSizeMode(int size) 
function fixedSizeMode =| size |{
        return void.fixedSizeMode()
}
    # void handle(io.vertx.core.buffer.Buffer buffer) 
function handle =| buffer |{
        return void.handle()
}
