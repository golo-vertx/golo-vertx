package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;

import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpClientResponse;
import io.vertx.core.metrics.Measured;
import io.vertx.core.http.WebSocketStream;
import io.vertx.core.MultiMap;
import io.vertx.core.http.WebSocket;
// io.vertx.core.http.HttpClient 
public class HttpClient { 

private io.vertx.core.http.HttpClient delegate; 
public HttpClient(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClient)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
public boolean isMetricsEnabled() {
        return (boolean)delegate.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, requestURI); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.request(method, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.requestAbs(method, absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.requestAbs(method, absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(requestURI); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.get(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.getAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.getAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.getNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.getNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.getNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(requestURI); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.post(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.postAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.postAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(requestURI); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.head(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.headAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.headAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.headNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.headNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.headNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(requestURI); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.options(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.optionsAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.optionsAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.optionsNow(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.optionsNow(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClient)delegate.optionsNow(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(requestURI); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.put(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.putAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.putAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(port, host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(host, requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(port, host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(host, requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(requestURI); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.delete(requestURI, responseHandler); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) 
public io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) {
        return (io.vertx.core.http.HttpClientRequest)delegate.deleteAbs(absoluteURI); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return (io.vertx.core.http.HttpClientRequest)delegate.deleteAbs(absoluteURI, responseHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(host, requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, version, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, version, wsConnect, failureHandler); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, version, subProtocols, wsConnect); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return (io.vertx.core.http.HttpClient)delegate.websocket(requestURI, headers, version, subProtocols, wsConnect, failureHandler); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(port, host, requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(host, requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(port, host, requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(host, requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(port, host, requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(host, requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(port, host, requestURI, headers, version, subProtocols); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(host, requestURI, headers, version, subProtocols); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(requestURI); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(requestURI, headers); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(requestURI, headers, version); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return (io.vertx.core.http.WebSocketStream)delegate.websocketStream(requestURI, headers, version, subProtocols); 
}
// void close() 
public void close() {
        delegate.close(); 
}
}
