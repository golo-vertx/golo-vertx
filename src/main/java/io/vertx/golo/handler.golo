module Handler

function handle = |request| {
    let response = request: response()
    response: end("Golo shiit!")
}