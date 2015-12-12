package io.vertx.golo.core;

//[Debug] This is a debuging message to check @code{} syntax
// {0=1, 691575266=1463342944} 
import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
// Type: io.vertx.core.Context 
public class Context {
      private io.vertx.core.Context delegate;
  public Context(Object delegate) {
    this.delegate = (io.vertx.core.Context) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
//boolean isOnWorkerThread()
//boolean
  /**
   * Is the current thread a worker thread?
   * <p>
   * NOTE! This is not always the same as calling {@link io.vertx.golo.core.Context#isWorkerContext}. If you are running blocking code
   * from an event loop context, then this will return true but {@link io.vertx.golo.core.Context#isWorkerContext} will return false.
   * @return true if current thread is a worker thread, false otherwise
   */
  public static boolean isOnWorkerThread() {
return    io.vertx.core.Context.isOnWorkerThread();
  }
//boolean isOnEventLoopThread()
//boolean
  /**
   * Is the current thread an event thread?
   * <p>
   * NOTE! This is not always the same as calling {@link io.vertx.golo.core.Context#isEventLoopContext}. If you are running blocking code
   * from an event loop context, then this will return false but {@link io.vertx.golo.core.Context#isEventLoopContext} will return true.
   * @return true if current thread is a worker thread, false otherwise
   */
  public static boolean isOnEventLoopThread() {
return    io.vertx.core.Context.isOnEventLoopThread();
  }
//boolean isOnVertxThread()
//boolean
  /**
   * Is the current thread a Vert.x thread? That's either a worker thread or an event loop thread
   * @return true if current thread is a Vert.x thread, false otherwise
   */
  public static boolean isOnVertxThread() {
return    io.vertx.core.Context.isOnVertxThread();
  }
//void runOnContext(io.vertx.core.Handler<java.lang.Void> action)
//void
  /**
   * Run the specified action asynchronously on the same context, some time after the current execution has completed.
   * @param action the action to run
   */
  public void runOnContext(Handler<Void> action) {
    this.delegate.runOnContext(action);
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, boolean ordered, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)
//void
  /**
   * Safely execute some blocking code.
   * <p>
   * Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.
   * <p>
   * When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context
   * (e.g. on the original event loop of the caller).
   * <p>
   * A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,
   * the handler should call the {@link io.vertx.golo.core.Future#complete} or {@link io.vertx.golo.core.Future#complete} method, or the {@link io.vertx.golo.core.Future#fail}
   * method if it failed.
   * @param blockingCodeHandler handler representing the blocking code to run
   * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
   * @param resultHandler handler that will be called when the blocking code is complete
   */
  public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler, boolean ordered, Handler<AsyncResult<T>> resultHandler) {
    this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
      }
    }, ordered, new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameexecuteBlocking]> void executeBlocking(io.vertx.core.Handler<io.vertx.core.Future<T>> blockingCodeHandler, io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> resultHandler)
//void
  /**
   * Invoke {@link io.vertx.golo.core.Context#executeBlocking} with order = true.
   * @param blockingCodeHandler handler representing the blocking code to run
   * @param resultHandler handler that will be called when the blocking code is complete
   */
  public <T> void executeBlocking(Handler<Future<T>> blockingCodeHandler, Handler<AsyncResult<T>> resultHandler) {
    this.delegate.executeBlocking(new Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        blockingCodeHandler.handle(new io.vertx.golo.core.Future(event));
      }
    }, new Handler<AsyncResult<Object>>() {
      public void handle(AsyncResult<Object> event) {
        AsyncResult<Object> f;
        if (event.succeeded()) {
          f = InternalHelper.<Object>result(InternalHelper.wrapObject(event.result()));
        } else {
          f = InternalHelper.<Object>failure(event.cause());
        }
        resultHandler.handle((AsyncResult)f);
      }
    });
  }
//java.lang.String deploymentID()
//java.lang.String
  /**
   * If the context is associated with a Verticle deployment, this returns the deployment ID of that deployment.
   * @return the deployment ID of the deployment or null if not a Verticle deployment
   */
  public String deploymentID() {
return    this.delegate.deploymentID();
  }
//io.vertx.core.json.JsonObject config()
//io.vertx.core.json.JsonObject
  /**
   * If the context is associated with a Verticle deployment, this returns the configuration that was specified when
   * the verticle was deployed.
   * @return the configuration of the deployment or null if not a Verticle deployment
   */
  public Map<String, Object> config() {
return    (Map<String, Object>)InternalHelper.wrapObject(this.delegate.config());
  }
//java.util.List<java.lang.String> processArgs()
//java.util.List<java.lang.String>
  /**
   * The process args
   * @return 
   */
  public List<String> processArgs() {
return    this.delegate.processArgs();
  }
//boolean isEventLoopContext()
//boolean
  /**
   * Is the current context an event loop context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.golo.core.Vertx#executeBlocking} from a
   * standard (not worker) verticle, the context will still an event loop context and this 
   * will return true.
   * @return true if false otherwise
   */
  public boolean isEventLoopContext() {
return    this.delegate.isEventLoopContext();
  }
//boolean isWorkerContext()
//boolean
  /**
   * Is the current context a worker context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.golo.core.Vertx#executeBlocking} from a
   * standard (not worker) verticle, the context will still an event loop context and this 
   * will return false.
   * @return true if the current context is a worker context, false otherwise
   */
  public boolean isWorkerContext() {
return    this.delegate.isWorkerContext();
  }
//boolean isMultiThreadedWorkerContext()
//boolean
  /**
   * Is the current context a multi-threaded worker context?
   * @return true if the current context is a multi-threaded worker context, false otherwise
   */
  public boolean isMultiThreadedWorkerContext() {
return    this.delegate.isMultiThreadedWorkerContext();
  }
//<TypeParamInfo.Method[name=T,typeName=io.vertx.core.Context,methodNameget]> T get(java.lang.String key)
//T
  /**
   * Get some data from the context.
   * @param key the key of the data
   * @return the data
   */
  public <T> T get(String key) {
return    // This cast is cleary flawed
    (T) InternalHelper.wrapObject(this.delegate.get(key));
  }
//void put(java.lang.String key, java.lang.Object value)
//void
  /**
   * Put some data in the context.
   * <p>
   * This can be used to share data between different handlers that share a context
   * @param key the key of the data
   * @param value the data
   */
  public void put(String key, Object value) {
    this.delegate.put(key, InternalHelper.unwrapObject(value));
  }
//boolean remove(java.lang.String key)
//boolean
  /**
   * Remove some data from the context.
   * @param key the key to remove
   * @return true if removed successfully, false otherwise
   */
  public boolean remove(String key) {
return    this.delegate.remove(key);
  }
//io.vertx.core.Vertx owner()
//io.vertx.core.Vertx
  /**
   * @return The Vertx instance that created the context
   * @return 
   */
  public Vertx owner() {
return    InternalHelper.safeCreate(this.delegate.owner(), io.vertx.golo.core.Vertx.class);
  }
//int getInstanceCount()
//int
  /**
   * @return  the number of instances of the verticle that were deployed in the deployment (if any) related
   * to this context
   * @return 
   */
  public int getInstanceCount() {
return    this.delegate.getInstanceCount();
  }
}
