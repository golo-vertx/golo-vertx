package io.vertx.golo.core.http;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import io.vertx.core.http.HttpMethod;
import io.vertx.golo.core.MultiMap;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.Handler;
// Type: io.vertx.core.http.HttpClient 
public class HttpClient { 

private io.vertx.core.http.HttpClient delegate; 
public HttpClient(Object delegate) { 
    this.delegate = (io.vertx.core.http.HttpClient)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// boolean isMetricsEnabled() 
// TypeParams: [] 
public boolean isMetricsEnabled() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    return this.delegate.isMetricsEnabled(); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,int port,String host,String requestURI) {
        //param classes(remove later):   ENUM   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):          
    return InternalHelper.safeCreate(this.delegate.request(method,port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,String host,String requestURI) {
        //param classes(remove later):   ENUM   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.request(method,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   ENUM   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):            API   
    return InternalHelper.safeCreate(this.delegate.request(method,port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   ENUM   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.request(method,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,String requestURI) {
        //param classes(remove later):   ENUM   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.request(method,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest request(io.vertx.core.http.HttpMethod method, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest request(HttpMethod method,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   ENUM   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.request(method,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest requestAbs(HttpMethod method,String absoluteURI) {
        //param classes(remove later):   ENUM   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.requestAbs(method,absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest requestAbs(io.vertx.core.http.HttpMethod method, java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest requestAbs(HttpMethod method,String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   ENUM   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.requestAbs(method,absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest get(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.get(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest get(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.get(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest get(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.get(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest get(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.get(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest get(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.get(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest get(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest get(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.get(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest getAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest getAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest getAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.getAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient getNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient getNow(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.getNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient getNow(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.getNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient getNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient getNow(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.getNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest post(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.post(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest post(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.post(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest post(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.post(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest post(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.post(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest post(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.post(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest post(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest post(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.post(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest postAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest postAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest postAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.postAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest head(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.head(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest head(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.head(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest head(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.head(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest head(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.head(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest head(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.head(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest head(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest head(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.head(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest headAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest headAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest headAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.headAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient headNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient headNow(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.headNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient headNow(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.headNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient headNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient headNow(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.headNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest options(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.options(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest options(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.options(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest options(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.options(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest options(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.options(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest options(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.options(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest options(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest options(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.options(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest optionsAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest optionsAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest optionsAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.optionsAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient optionsNow(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient optionsNow(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.optionsNow(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient optionsNow(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.optionsNow(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient optionsNow(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClient optionsNow(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.optionsNow(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest put(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.put(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest put(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.put(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest put(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.put(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest put(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.put(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest put(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.put(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest put(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest put(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.put(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest putAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest putAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest putAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.putAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest delete(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.delete(port,host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest delete(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.delete(host,requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest delete(int port,String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.delete(port,host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest delete(String host,String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.delete(host,requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI) 
// TypeParams: [] 
public HttpClientRequest delete(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.delete(requestURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest delete(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest delete(String requestURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.delete(requestURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI) 
// TypeParams: [] 
public HttpClientRequest deleteAbs(String absoluteURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClientRequest deleteAbs(java.lang.String absoluteURI, io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> responseHandler) 
// TypeParams: [] 
public HttpClientRequest deleteAbs(String absoluteURI,Handler<HttpClientResponse> responseHandler) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.deleteAbs(absoluteURI,new Handler<io.vertx.core.http.HttpClientResponse>() {
                          public void handle(io.vertx.core.http.HttpClientResponse event) {
responseHandler.handle(new io.vertx.golo.core.http.HttpClientResponse(event));
                          }
                        }), io.vertx.golo.core.http.HttpClientRequest.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):          API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   STRING   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):        API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   HANDLER  
    //evenTypes (remove later):            API   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   HANDLER   HANDLER  
    //evenTypes (remove later):            API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   STRING   API   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   STRING   API   HANDLER   HANDLER  
    //evenTypes (remove later):          API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM   HANDLER  
    //evenTypes (remove later):              API   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM   HANDLER   HANDLER  
    //evenTypes (remove later):              API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   STRING   API   ENUM   HANDLER  
    //evenTypes (remove later):            API   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   STRING   API   ENUM   HANDLER   HANDLER  
    //evenTypes (remove later):            API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM   STRING   HANDLER  
    //evenTypes (remove later):                API   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):                API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(port,host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   STRING   API   ENUM   STRING   HANDLER  
    //evenTypes (remove later):              API   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   STRING   API   ENUM   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):              API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(host,requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   HANDLER  
    //evenTypes (remove later):      API   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):      API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   API   HANDLER  
    //evenTypes (remove later):        API   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   API   HANDLER   HANDLER  
    //evenTypes (remove later):        API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   API   ENUM   HANDLER  
    //evenTypes (remove later):          API   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,WebsocketVersion version,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   API   ENUM   HANDLER   HANDLER  
    //evenTypes (remove later):          API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect) {
        //param classes(remove later):   STRING   API   ENUM   STRING   HANDLER  
    //evenTypes (remove later):            API   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        }), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.HttpClient websocket(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols, io.vertx.core.Handler<io.vertx.core.http.WebSocket> wsConnect, io.vertx.core.Handler<java.lang.Throwable> failureHandler) 
// TypeParams: [] 
public HttpClient websocket(String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols,Handler<WebSocket> wsConnect,Handler<Throwable> failureHandler) {
        //param classes(remove later):   STRING   API   ENUM   STRING   HANDLER   HANDLER  
    //evenTypes (remove later):            API     THROWABLE   
    return InternalHelper.safeCreate(this.delegate.websocket(requestURI,headers,version,subProtocols,new Handler<io.vertx.core.http.WebSocket>() {
                          public void handle(io.vertx.core.http.WebSocket event) {
wsConnect.handle(new io.vertx.golo.core.http.WebSocket(event));
                          }
                        },failureHandler), io.vertx.golo.core.http.HttpClient.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public WebSocketStream websocketStream(int port,String host,String requestURI) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI) 
// TypeParams: [] 
public WebSocketStream websocketStream(String host,String requestURI) {
        //param classes(remove later):   STRING   STRING  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
// TypeParams: [] 
public WebSocketStream websocketStream(int port,String host,String requestURI,MultiMap headers) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API  
    //evenTypes (remove later):          
    return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers) 
// TypeParams: [] 
public WebSocketStream websocketStream(String host,String requestURI,MultiMap headers) {
        //param classes(remove later):   STRING   STRING   API  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
// TypeParams: [] 
public WebSocketStream websocketStream(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM  
    //evenTypes (remove later):            
    return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
// TypeParams: [] 
public WebSocketStream websocketStream(String host,String requestURI,MultiMap headers,WebsocketVersion version) {
        //param classes(remove later):   STRING   STRING   API   ENUM  
    //evenTypes (remove later):          
    return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(int port, java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
// TypeParams: [] 
public WebSocketStream websocketStream(int port,String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols) {
        //param classes(remove later):   PRIMITIVE   STRING   STRING   API   ENUM   STRING  
    //evenTypes (remove later):              
    return InternalHelper.safeCreate(this.delegate.websocketStream(port,host,requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String host, java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
// TypeParams: [] 
public WebSocketStream websocketStream(String host,String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols) {
        //param classes(remove later):   STRING   STRING   API   ENUM   STRING  
    //evenTypes (remove later):            
    return InternalHelper.safeCreate(this.delegate.websocketStream(host,requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI) 
// TypeParams: [] 
public WebSocketStream websocketStream(String requestURI) {
        //param classes(remove later):   STRING  
    //evenTypes (remove later):    
    return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers) 
// TypeParams: [] 
public WebSocketStream websocketStream(String requestURI,MultiMap headers) {
        //param classes(remove later):   STRING   API  
    //evenTypes (remove later):      
    return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version) 
// TypeParams: [] 
public WebSocketStream websocketStream(String requestURI,MultiMap headers,WebsocketVersion version) {
        //param classes(remove later):   STRING   API   ENUM  
    //evenTypes (remove later):        
    return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers,version), io.vertx.golo.core.http.WebSocketStream.class); 
}
// io.vertx.core.http.WebSocketStream websocketStream(java.lang.String requestURI, io.vertx.core.MultiMap headers, io.vertx.core.http.WebsocketVersion version, java.lang.String subProtocols) 
// TypeParams: [] 
public WebSocketStream websocketStream(String requestURI,MultiMap headers,WebsocketVersion version,String subProtocols) {
        //param classes(remove later):   STRING   API   ENUM   STRING  
    //evenTypes (remove later):          
    return InternalHelper.safeCreate(this.delegate.websocketStream(requestURI,headers,version,subProtocols), io.vertx.golo.core.http.WebSocketStream.class); 
}
// void close() 
// TypeParams: [] 
public void close() {
        //param classes(remove later):  
    //evenTypes (remove later):  
    this.delegate.close(); 
}
}
