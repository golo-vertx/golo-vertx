package io.vertx.golo.core.Http;

import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.metrics.Measured;
import io.vertx.core.http.WebSocketStream;
import io.vertx.core.MultiMap;
import io.vertx.core.http.WebSocket;
public class HttpClient { 

private io.vertx.core.http.HttpClient originalInstance; 
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return originalInstance.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.request(method, port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.request(method, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.request(method, port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.request(method, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) {
        return originalInstance.request(method, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.request(method, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) {
        return originalInstance.requestAbs(method, absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.requestAbs(method, absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.get(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.get(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.get(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.get(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) {
        return originalInstance.get(requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.get(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) {
        return originalInstance.getAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.getAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.getNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.getNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.getNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.post(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.post(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.post(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.post(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) {
        return originalInstance.post(requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.post(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) {
        return originalInstance.postAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.postAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.head(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.head(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.head(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.head(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) {
        return originalInstance.head(requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.head(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) {
        return originalInstance.headAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.headAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.headNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.headNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.headNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.options(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.options(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.options(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.options(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) {
        return originalInstance.options(requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.options(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) {
        return originalInstance.optionsAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.optionsAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.optionsNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.optionsNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.optionsNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.put(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.put(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.put(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.put(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) {
        return originalInstance.put(requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.put(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) {
        return originalInstance.putAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.putAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.delete(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.delete(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.delete(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.delete(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) {
        return originalInstance.delete(requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.delete(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) {
        return originalInstance.deleteAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return originalInstance.deleteAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(port, host, requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(port, host, requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(host, requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(host, requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(port, host, requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(port, host, requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(host, requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(host, requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(port, host, requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(port, host, requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(host, requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(host, requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(host, requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(host, requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return originalInstance.websocket(requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return originalInstance.websocket(requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) {
        return originalInstance.websocketStream(port, host, requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) {
        return originalInstance.websocketStream(host, requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return originalInstance.websocketStream(port, host, requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return originalInstance.websocketStream(host, requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return originalInstance.websocketStream(port, host, requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return originalInstance.websocketStream(host, requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return originalInstance.websocketStream(port, host, requestURI, headers, version, subProtocols); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return originalInstance.websocketStream(host, requestURI, headers, version, subProtocols); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) {
        return originalInstance.websocketStream(requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return originalInstance.websocketStream(requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return originalInstance.websocketStream(requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return originalInstance.websocketStream(requestURI, headers, version, subProtocols); 
}
// void close() 
public void close() {
        return originalInstance.close(); 
}
}
