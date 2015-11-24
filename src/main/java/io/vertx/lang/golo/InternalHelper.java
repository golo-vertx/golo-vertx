package io.vertx.lang.golo;

import java.lang.Object;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InternalHelper {

    public static <T, D> Object safeCreate(Object delegate, Class<T> type) {
        if(delegate != null) {
            try {
                Constructor ctor = type.getConstructor(new Class[]{Object.class});
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
