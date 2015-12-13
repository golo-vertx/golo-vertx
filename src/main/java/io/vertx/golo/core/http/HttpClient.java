package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpClient 
public class HttpClient implements Measured {
      private io.vertx.core.http.HttpClient delegate;
  public HttpClient(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpClient) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isMetricsEnabled()
//boolean
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the specified host and port.
   * @param method the HTTP method
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodPortHostRequestURI(HttpMethod method, int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the specified host and default port.
   * @param method the HTTP method
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodHostRequestURI(HttpMethod method, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodPortHostRequestURIResponseHandler(HttpMethod method, int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodHostRequestURIResponseHandler(HttpMethod method, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the default host and port.
   * @param method the HTTP method
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodRequestURI(HttpMethod method, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest requestMethodRequestURIResponseHandler(HttpMethod method, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server using an absolute URI
   * @param method the HTTP method
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest requestAbsMethodAbsoluteURI(HttpMethod method, String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.requestAbs(method, absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest requestAbsMethodAbsoluteURIResponseHandler(HttpMethod method, String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.requestAbs(method, absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest getPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest getHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest getPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest getHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest getRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest getRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest getAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP GET request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest getAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP GET request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNowPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP GET request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNowHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP GET request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNowRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest postPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest postHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest postPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest postHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest postRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest postRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest postAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP POST request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest postAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest headPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest headHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest headPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest headHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest headRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest headRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest headAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP HEAD request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest headAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP HEAD request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNowPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP HEAD request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNowHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP HEAD request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNowRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP OPTIONS request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP OPTIONS request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNowPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP OPTIONS request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNowHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClient
  /**
   * Sends an HTTP OPTIONS request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNowRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest putPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest putHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest putPortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest putHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest putRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest putRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest putAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP PUT request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest putAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest deletePortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest deletePortHostRequestURIResponseHandler(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteHostRequestURIResponseHandler(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteRequestURIResponseHandler(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteAbsAbsoluteURI(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler)
//io.vertx.core.http.HttpClientRequest
  /**
   * Create an HTTP DELETE request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteAbsAbsoluteURIResponseHandler(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIWsConnect(int port, String host, String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIWsConnectFailureHandler(int port, String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the host and relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIWsConnect(String host, String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the host and relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIWsConnectFailureHandler(String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersWsConnect(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersWsConnectFailureHandler(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersWsConnect(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersWsConnectFailureHandler(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using
   * the specified version of WebSockets
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersVersionWsConnect(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers and using
   * the specified version of WebSockets
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersVersionWsConnectFailureHandler(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using
   * the specified version of WebSockets
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersVersionWsConnect(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host, relative request URI and default port with the specified headers and using
   * the specified version of WebSockets
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersVersionWsConnectFailureHandler(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersVersionSubProtocolsWsConnect(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketPortHostRequestURIHeadersVersionSubProtocolsWsConnectFailureHandler(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersVersionSubProtocolsWsConnect(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket to the specified host, relative request URI and default port, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketHostRequestURIHeadersVersionSubProtocolsWsConnectFailureHandler(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIWsConnect(String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIWsConnectFailureHandler(String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersWsConnect(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersWsConnectFailureHandler(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the
   * specified version of WebSockets
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersVersionWsConnect(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the
   * specified version of WebSockets
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersVersionWsConnectFailureHandler(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the
   * specified version of WebSockets and the specified sub protocols
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersVersionSubProtocolsWsConnect(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
//io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler)
//io.vertx.core.http.HttpClient
  /**
   * Connect a WebSocket at the relative request URI using the default host and port, the specified headers, the
   * specified version of WebSockets and the specified sub protocols
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocketRequestURIHeadersVersionSubProtocolsWsConnectFailureHandler(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamPortHostRequestURI(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamHostRequestURI(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI, and with the specified headers
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamPortHostRequestURIHeaders(int port, String host, String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamHostRequestURIHeaders(String host, String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI, with the specified headers and using
   * the specified version of WebSockets
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamPortHostRequestURIHeadersVersion(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers and using
   * the specified version of WebSockets
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamHostRequestURIHeadersVersion(String host, String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamPortHostRequestURIHeadersVersionSubProtocols(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port, with the specified headers, using
   * the specified version of WebSockets, and the specified websocket sub protocols
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols to use
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamHostRequestURIHeadersVersionSubProtocols(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamRequestURI(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamRequestURIHeaders(String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port, the specified headers and the
   * specified version of WebSockets
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamRequestURIHeadersVersion(String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port, the specified headers, the
   * specified version of WebSockets and the specified sub protocols
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamRequestURIHeadersVersionSubProtocols(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
//void close()
//void
  /**
   * Close the client. Closing will close down any pooled connections.
   * Clients should always be closed after use.
   */
  public void close() {
    this.delegate.close();
  }
}
