module io.vertx.golo.core.Http

import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.metrics.Measured
import io.vertx.core.http.WebSocketStream
import io.vertx.core.MultiMap
import io.vertx.core.http.WebSocket
    # boolean isMetricsEnabled() 
function isMetricsEnabled ={
        return boolean.isMetricsEnabled()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) 
function request =| method , port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) 
function requestByMethodAndHostAndRequestURI =| method , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function requestByMethodAndPortAndHostAndRequestURIAndResponseHandler =| method , port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function requestByMethodAndHostAndRequestURIAndResponseHandler =| method , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) 
function requestByMethodAndRequestURI =| method , requestURI |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function requestByMethodAndRequestURIAndResponseHandler =| method , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.request()
}
    # io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) 
function requestAbs =| method , absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.requestAbs()
}
    # io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function requestAbsByMethodAndAbsoluteURIAndResponseHandler =| method , absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.requestAbs()
}
    # io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) 
function get =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) 
function getByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) 
function getByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.get()
}
    # io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) 
function getAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.getAbs()
}
    # io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.getAbs()
}
    # io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getNow =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.getNow()
}
    # io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getNowByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.getNow()
}
    # io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function getNowByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.getNow()
}
    # io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) 
function post =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) 
function postByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function postByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function postByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) 
function postByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function postByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.post()
}
    # io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) 
function postAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.postAbs()
}
    # io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function postAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.postAbs()
}
    # io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) 
function head =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) 
function headByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) 
function headByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.head()
}
    # io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) 
function headAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.headAbs()
}
    # io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.headAbs()
}
    # io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headNow =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.headNow()
}
    # io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headNowByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.headNow()
}
    # io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function headNowByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.headNow()
}
    # io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) 
function options =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) 
function optionsByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) 
function optionsByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.options()
}
    # io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) 
function optionsAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.optionsAbs()
}
    # io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.optionsAbs()
}
    # io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsNow =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.optionsNow()
}
    # io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsNowByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.optionsNow()
}
    # io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function optionsNowByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClient.optionsNow()
}
    # io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) 
function put =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) 
function putByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function putByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function putByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) 
function putByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function putByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.put()
}
    # io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) 
function putAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.putAbs()
}
    # io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function putAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.putAbs()
}
    # io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) 
function delete =| port , host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) 
function deleteByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function deleteByPortAndHostAndRequestURIAndResponseHandler =| port , host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function deleteByHostAndRequestURIAndResponseHandler =| host , requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) 
function deleteByRequestURI =| requestURI |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function deleteByRequestURIAndResponseHandler =| requestURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.delete()
}
    # io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) 
function deleteAbs =| absoluteURI |{
        return io.vertx.core.http.HttpClientRequest.deleteAbs()
}
    # io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
function deleteAbsByAbsoluteURIAndResponseHandler =| absoluteURI , responseHandler |{
        return io.vertx.core.http.HttpClientRequest.deleteAbs()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocket =| port , host , requestURI , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByPortAndHostAndRequestURIAndWsConnectAndFailureHandler =| port , host , requestURI , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByHostAndRequestURIAndWsConnect =| host , requestURI , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByHostAndRequestURIAndWsConnectAndFailureHandler =| host , requestURI , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByPortAndHostAndRequestURIAndHeadersAndWsConnect =| port , host , requestURI , headers , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByPortAndHostAndRequestURIAndHeadersAndWsConnectAndFailureHandler =| port , host , requestURI , headers , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByHostAndRequestURIAndHeadersAndWsConnect =| host , requestURI , headers , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByHostAndRequestURIAndHeadersAndWsConnectAndFailureHandler =| host , requestURI , headers , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByPortAndHostAndRequestURIAndHeadersAndVersionAndWsConnect =| port , host , requestURI , headers , version , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByPortAndHostAndRequestURIAndHeadersAndVersionAndWsConnectAndFailureHandler =| port , host , requestURI , headers , version , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByHostAndRequestURIAndHeadersAndVersionAndWsConnect =| host , requestURI , headers , version , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByHostAndRequestURIAndHeadersAndVersionAndWsConnectAndFailureHandler =| host , requestURI , headers , version , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByPortAndHostAndRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnect =| port , host , requestURI , headers , version , subProtocols , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByPortAndHostAndRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnectAndFailureHandler =| port , host , requestURI , headers , version , subProtocols , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByHostAndRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnect =| host , requestURI , headers , version , subProtocols , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByHostAndRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnectAndFailureHandler =| host , requestURI , headers , version , subProtocols , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByRequestURIAndWsConnect =| requestURI , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByRequestURIAndWsConnectAndFailureHandler =| requestURI , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByRequestURIAndHeadersAndWsConnect =| requestURI , headers , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByRequestURIAndHeadersAndWsConnectAndFailureHandler =| requestURI , headers , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByRequestURIAndHeadersAndVersionAndWsConnect =| requestURI , headers , version , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByRequestURIAndHeadersAndVersionAndWsConnectAndFailureHandler =| requestURI , headers , version , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
function websocketByRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnect =| requestURI , headers , version , subProtocols , wsConnect |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
function websocketByRequestURIAndHeadersAndVersionAndSubProtocolsAndWsConnectAndFailureHandler =| requestURI , headers , version , subProtocols , wsConnect , failureHandler |{
        return io.vertx.core.http.HttpClient.websocket()
}
    # io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) 
function websocketStream =| port , host , requestURI |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) 
function websocketStreamByHostAndRequestURI =| host , requestURI |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
function websocketStreamByPortAndHostAndRequestURIAndHeaders =| port , host , requestURI , headers |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
function websocketStreamByHostAndRequestURIAndHeaders =| host , requestURI , headers |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
function websocketStreamByPortAndHostAndRequestURIAndHeadersAndVersion =| port , host , requestURI , headers , version |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
function websocketStreamByHostAndRequestURIAndHeadersAndVersion =| host , requestURI , headers , version |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
function websocketStreamByPortAndHostAndRequestURIAndHeadersAndVersionAndSubProtocols =| port , host , requestURI , headers , version , subProtocols |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
function websocketStreamByHostAndRequestURIAndHeadersAndVersionAndSubProtocols =| host , requestURI , headers , version , subProtocols |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) 
function websocketStreamByRequestURI =| requestURI |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) 
function websocketStreamByRequestURIAndHeaders =| requestURI , headers |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
function websocketStreamByRequestURIAndHeadersAndVersion =| requestURI , headers , version |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
function websocketStreamByRequestURIAndHeadersAndVersionAndSubProtocols =| requestURI , headers , version , subProtocols |{
        return io.vertx.core.http.WebSocketStream.websocketStream()
}
    # void close() 
function close ={
        return void.close()
}
