package io.vertx.lang.golo;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.lang.Object;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InternalHelper {

    public static Object wrapObject(Object obj) {
        if (obj instanceof JsonObject) {
            JsonObject json = (JsonObject) obj;
            json.getMap().forEach((k, v) -> {
                json.put(k, wrapObject(v));
            });
            return json;
        } else if(obj instanceof JsonArray) {
            JsonArray array = (JsonArray) obj;
            JsonArray ret = new JsonArray();
            array.stream().forEach((it) -> {
                ret.add(wrapObject(it));
            });
            return ret;
        } else if (obj instanceof io.vertx.core.buffer.Buffer) {
            //return new io.vertx.golo.core.buffer.Buffer((io.vertx.core.buffer.Buffer) obj);
        }
        return obj;
    }


    public static <T, D> T safeCreate(D delegate, Class<T> type) {
        if(delegate != null) {
            try {
                Constructor<T> ctor = type.getConstructor(new Class[]{Object.class});
                return ctor.newInstance(delegate);
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
