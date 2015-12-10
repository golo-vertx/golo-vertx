package io.vertx.lang.golo;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.golo.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalHelper {

    public static Object unwrapObject(Object obj) {
        if (obj instanceof Map) {
            return new JsonObject((Map) obj);
        } else if (obj instanceof List) {
            return new JsonArray((List<Object>) obj);
        } else if (obj instanceof Buffer) {
            return ((Buffer) obj).getDelegate();
        }
        return obj;
    }

    public static Object wrapObject(Object obj) {
        if (obj instanceof JsonObject) {
            JsonObject json = (JsonObject)obj;
            Map<String, Object> map = new HashMap<>();
            json.getMap().forEach((k,v) -> {
                map.put(k,wrapObject(v));
            });
            return map;
        } else if (obj instanceof JsonArray) {
            JsonArray json = (JsonArray)obj;
            List list = new ArrayList<>();
            json.getList().forEach((it) -> {
                list.add(wrapObject(it));
            });
            return list;
        } else if (obj instanceof io.vertx.core.buffer.Buffer) {
            return new Buffer((io.vertx.core.buffer.Buffer) obj);
        }
        return obj;
    }

    public static <V> AsyncResult<V> result(V value) {
        return Future.succeededFuture(value);
    }

    public static <V> AsyncResult<V> failure(Throwable t) {
        return Future.failedFuture(t);
    }

    public static <T, D> T safeCreate(D delegate, Class<T> type) {
        if(delegate != null) {
            try {
                Constructor<T> ctor = type.getConstructor(Object.class);
                T t = ctor.newInstance(delegate);
                return t;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
