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
  public HttpClientRequest requestHttpMethodIntStringString(HttpMethod method, int port, String host, String requestURI) {
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
  public HttpClientRequest requestHttpMethodStringString(HttpMethod method, String host, String requestURI) {
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
  public HttpClientRequest requestHttpMethodIntStringStringHandler<HttpClientResponse>(HttpMethod method, int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest requestHttpMethodStringStringHandler<HttpClientResponse>(HttpMethod method, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest requestHttpMethodString(HttpMethod method, String requestURI) {
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
  public HttpClientRequest requestHttpMethodStringHandler<HttpClientResponse>(HttpMethod method, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest requestAbsHttpMethodString(HttpMethod method, String absoluteURI) {
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
  public HttpClientRequest requestAbsHttpMethodStringHandler<HttpClientResponse>(HttpMethod method, String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest getIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest getStringString(String host, String requestURI) {
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
  public HttpClientRequest getIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest getStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest getString(String requestURI) {
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
  public HttpClientRequest getStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest getAbsString(String absoluteURI) {
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
  public HttpClientRequest getAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient getNowIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient getNowStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient getNowStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest postIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest postStringString(String host, String requestURI) {
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
  public HttpClientRequest postIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest postStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest postString(String requestURI) {
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
  public HttpClientRequest postStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest postAbsString(String absoluteURI) {
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
  public HttpClientRequest postAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest headIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest headStringString(String host, String requestURI) {
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
  public HttpClientRequest headIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest headStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest headString(String requestURI) {
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
  public HttpClientRequest headStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest headAbsString(String absoluteURI) {
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
  public HttpClientRequest headAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient headNowIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient headNowStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient headNowStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest optionsIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest optionsStringString(String host, String requestURI) {
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
  public HttpClientRequest optionsIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest optionsStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest optionsString(String requestURI) {
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
  public HttpClientRequest optionsStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest optionsAbsString(String absoluteURI) {
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
  public HttpClientRequest optionsAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient optionsNowIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient optionsNowStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient optionsNowStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest putIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest putStringString(String host, String requestURI) {
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
  public HttpClientRequest putIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest putStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest putString(String requestURI) {
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
  public HttpClientRequest putStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest putAbsString(String absoluteURI) {
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
  public HttpClientRequest putAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest deleteIntStringString(int port, String host, String requestURI) {
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
  public HttpClientRequest deleteStringString(String host, String requestURI) {
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
  public HttpClientRequest deleteIntStringStringHandler<HttpClientResponse>(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest deleteStringStringHandler<HttpClientResponse>(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest deleteString(String requestURI) {
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
  public HttpClientRequest deleteStringHandler<HttpClientResponse>(String requestURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClientRequest deleteAbsString(String absoluteURI) {
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
  public HttpClientRequest deleteAbsStringHandler<HttpClientResponse>(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
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
  public HttpClient websocketIntStringStringHandler<WebSocket>(int port, String host, String requestURI, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketIntStringStringHandler<WebSocket>Handler<Throwable>(int port, String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringStringHandler<WebSocket>(String host, String requestURI, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringStringHandler<WebSocket>Handler<Throwable>(String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketIntStringStringMultiMapHandler<WebSocket>(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketIntStringStringMultiMapHandler<WebSocket>Handler<Throwable>(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringStringMultiMapHandler<WebSocket>(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringStringMultiMapHandler<WebSocket>Handler<Throwable>(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketIntStringStringMultiMapWebsocketVersionHandler<WebSocket>(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketIntStringStringMultiMapWebsocketVersionHandler<WebSocket>Handler<Throwable>(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringStringMultiMapWebsocketVersionHandler<WebSocket>(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringStringMultiMapWebsocketVersionHandler<WebSocket>Handler<Throwable>(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketIntStringStringMultiMapWebsocketVersionStringHandler<WebSocket>(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketIntStringStringMultiMapWebsocketVersionStringHandler<WebSocket>Handler<Throwable>(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringStringMultiMapWebsocketVersionStringHandler<WebSocket>(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringStringMultiMapWebsocketVersionStringHandler<WebSocket>Handler<Throwable>(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringHandler<WebSocket>(String requestURI, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringHandler<WebSocket>Handler<Throwable>(String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringMultiMapHandler<WebSocket>(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringMultiMapHandler<WebSocket>Handler<Throwable>(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringMultiMapWebsocketVersionHandler<WebSocket>(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringMultiMapWebsocketVersionHandler<WebSocket>Handler<Throwable>(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public HttpClient websocketStringMultiMapWebsocketVersionStringHandler<WebSocket>(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
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
  public HttpClient websocketStringMultiMapWebsocketVersionStringHandler<WebSocket>Handler<Throwable>(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
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
  public WebSocketStream websocketStreamIntStringString(int port, String host, String requestURI) {
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
  public WebSocketStream websocketStreamStringString(String host, String requestURI) {
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
  public WebSocketStream websocketStreamIntStringStringMultiMap(int port, String host, String requestURI, MultiMap headers) {
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
  public WebSocketStream websocketStreamStringStringMultiMap(String host, String requestURI, MultiMap headers) {
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
  public WebSocketStream websocketStreamIntStringStringMultiMapWebsocketVersion(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version) {
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
  public WebSocketStream websocketStreamStringStringMultiMapWebsocketVersion(String host, String requestURI, MultiMap headers, WebsocketVersion version) {
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
  public WebSocketStream websocketStreamIntStringStringMultiMapWebsocketVersionString(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
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
  public WebSocketStream websocketStreamStringStringMultiMapWebsocketVersionString(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
//io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI)
//io.vertx.core.http.WebSocketStream
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStreamString(String requestURI) {
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
  public WebSocketStream websocketStreamStringMultiMap(String requestURI, MultiMap headers) {
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
  public WebSocketStream websocketStreamStringMultiMapWebsocketVersion(String requestURI, MultiMap headers, WebsocketVersion version) {
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
  public WebSocketStream websocketStreamStringMultiMapWebsocketVersionString(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
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
