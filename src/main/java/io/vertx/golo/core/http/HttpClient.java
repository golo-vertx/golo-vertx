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
  /**
   * Whether the metrics are enabled for this measured object
   * @return true if the metrics are enabled
   */
  public boolean isMetricsEnabled() {
return    ((io.vertx.core.metrics.Measured) this.delegate).isMetricsEnabled();
  }
  /**
   * Create an HTTP request to send to the server at the specified host and port.
   * @param method the HTTP method
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest request(HttpMethod method, int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server at the specified host and default port.
   * @param method the HTTP method
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest request(HttpMethod method, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
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
  public HttpClientRequest request(HttpMethod method, int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest request(HttpMethod method, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server at the default host and port.
   * @param method the HTTP method
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest request(HttpMethod method, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.request(method, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest request(HttpMethod method, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.request(method, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server using an absolute URI
   * @param method the HTTP method
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.requestAbs(method, absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param method the HTTP method
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.requestAbs(method, absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest get(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest get(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest get(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest get(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest get(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.get(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest get(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.get(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest getAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP GET request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest getAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Sends an HTTP GET request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNow(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP GET request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP GET request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient getNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.getNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Create an HTTP POST request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest post(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest post(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest post(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest post(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest post(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.post(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest post(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.post(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest postAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP POST request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest postAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest head(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest head(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest head(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest head(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest head(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.head(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest head(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.head(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest headAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP HEAD request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest headAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Sends an HTTP HEAD request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNow(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP HEAD request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP HEAD request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient headNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.headNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest options(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest options(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest options(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest options(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest options(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.options(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest options(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.options(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP OPTIONS request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest optionsAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Sends an HTTP OPTIONS request to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNow(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP OPTIONS request to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNow(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Sends an HTTP OPTIONS request  to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient optionsNow(String requestURI, Handler<HttpClientResponse> responseHandler) {
    this.delegate.optionsNow(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    });
    return this;
  }
  /**
   * Create an HTTP PUT request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest put(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest put(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest put(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest put(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest put(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.put(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest put(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.put(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest putAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP PUT request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest putAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and port.
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(port, host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and default port.
   * @param host the host
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(host, requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and port, specifying a response handler to receive
   * the response
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(int port, String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(port, host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the specified host and default port, specifying a response handler to receive
   * the response
   * @param host the host
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(String host, String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(host, requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the default host and port.
   * @param requestURI the relative URI
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.delete(requestURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server at the default host and port, specifying a response handler to receive
   * the response
   * @param requestURI the relative URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest delete(String requestURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.delete(requestURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server using an absolute URI
   * @param absoluteURI the absolute URI
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteAbs(String absoluteURI) {
return    InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Create an HTTP DELETE request to send to the server using an absolute URI, specifying a response handler to receive
   * the response
   * @param absoluteURI the absolute URI
   * @param responseHandler the response handler
   * @return an HTTP client request object
   */
  public HttpClientRequest deleteAbs(String absoluteURI, Handler<HttpClientResponse> responseHandler) {
return    InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI, new Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
      }
    }), io.vertx.golo.core.http.HttpClientRequest.class);
  }
  /**
   * Connect a WebSocket to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(int port, String host, String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
  /**
   * Connect a WebSocket to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(int port, String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket to the host and relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String host, String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
  /**
   * Connect a WebSocket to the host and relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String host, String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket to the specified port, host and relative request URI, and with the specified headers
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
  /**
   * Connect a WebSocket to the specified host,relative request UR, and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String host, String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
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
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
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
  public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
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
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
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
  public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket at the relative request URI using the default host and port
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String requestURI, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
  /**
   * Connect a WebSocket at the relative request URI using the default host and port
   * @param requestURI the relative URI
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String requestURI, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
  /**
   * Connect a WebSocket at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @param wsConnect handler that will be called with the websocket when connected
   * @param failureHandler handler that will be called if websocekt connection fails
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String requestURI, MultiMap headers, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Connect a WebSocket at the relative request URI using the default host and port, the specified headers and the
   * specified version of WebSockets
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param wsConnect handler that will be called with the websocket when connected
   * @return a reference to this, so the API can be used fluently
   */
  public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
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
  public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect) {
    this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    });
    return this;
  }
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
  public HttpClient websocket(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Handler<WebSocket> wsConnect, Handler<Throwable> failureHandler) {
return    InternalHelper.safeCreate(this.delegate.websocket(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols, new Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
      }
    }, failureHandler), io.vertx.golo.core.http.HttpClient.class);
  }
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(int port, String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port
   * @param host the host
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String host, String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream to the specified port, host and relative request URI, and with the specified headers
   * @param port the port
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(int port, String host, String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String host, String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
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
  public WebSocketStream websocketStream(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream to the specified host, relative request URI and default port and with the specified headers and using
   * the specified version of WebSockets
   * @param host the host
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String host, String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
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
  public WebSocketStream websocketStream(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(port, host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
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
  public WebSocketStream websocketStream(String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(host, requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String requestURI) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port and the specified headers
   * @param requestURI the relative URI
   * @param headers the headers
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String requestURI, MultiMap headers) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate()), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port, the specified headers and the
   * specified version of WebSockets
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String requestURI, MultiMap headers, WebsocketVersion version) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Create a WebSocket stream at the relative request URI using the default host and port, the specified headers, the
   * specified version of WebSockets and the specified sub protocols
   * @param requestURI the relative URI
   * @param headers the headers
   * @param version the websocket version
   * @param subProtocols the subprotocols
   * @return a reference to this, so the API can be used fluently
   */
  public WebSocketStream websocketStream(String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols) {
return    InternalHelper.safeCreate(this.delegate.websocketStream(requestURI, (io.vertx.core.MultiMap)headers.getDelegate(), version, subProtocols), io.vertx.golo.core.http.WebSocketStream.class);
  }
  /**
   * Close the client. Closing will close down any pooled connections.
   * Clients should always be closed after use.
   */
  public void close() {
    this.delegate.close();
  }
}
