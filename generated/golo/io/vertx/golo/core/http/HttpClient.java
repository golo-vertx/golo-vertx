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
        return delegate.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.request(method,port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.request(method,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.request(method,port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.request(method,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.request(method,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.request(method,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) 
public HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.requestAbs(method,absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.requestAbs(method,absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.get(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest get(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.get(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.get(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.get(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) 
public HttpClientRequest get(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.get(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.get(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) 
public HttpClientRequest getAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.getNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.getNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.getNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.post(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest post(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.post(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.post(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.post(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) 
public HttpClientRequest post(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.post(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.post(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) 
public HttpClientRequest postAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.head(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest head(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.head(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.head(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.head(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) 
public HttpClientRequest head(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.head(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.head(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) 
public HttpClientRequest headAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.headNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.headNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.headNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.options(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest options(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.options(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.options(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.options(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) 
public HttpClientRequest options(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.options(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.options(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) 
public HttpClientRequest optionsAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.optionsNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.optionsNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.optionsNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.put(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest put(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.put(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.put(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.put(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) 
public HttpClientRequest put(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.put(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.put(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) 
public HttpClientRequest putAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.delete(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) 
public HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.delete(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.delete(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.delete(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) 
public HttpClientRequest delete(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.delete(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.delete(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) 
public HttpClientRequest deleteAbs(java.lang.String absoluteURI) {
        return InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
public HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) {
        return InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
public HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) {
        return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) 
public WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) 
public WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) 
public WebSocketStream websocketStream(java.lang.String requestURI) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) 
public WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
public WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
public WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) {
        return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// void close() 
public void close() {
        delegate.close(); 
}
}
