package io.vertx.golo.core.buffer;

import java.lang.Object;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InternalHelper {

    public static <T, D> Object safeCreate(Object delegate, Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if(delegate != null) {
            Constructor ctor = type.getConstructor(new Class[]{Object.class});
            return ctor.newInstance(delegate);
        }
        return null;
    }
}
