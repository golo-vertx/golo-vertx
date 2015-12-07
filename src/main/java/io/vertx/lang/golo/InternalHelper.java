package io.vertx.lang.golo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InternalHelper {

    public static <T, D> T safeCreate(D delegate, Class<T> type) {
        if(delegate != null) {
            try {
                Constructor<T> ctor = type.getConstructor(Object.class);
                T t = ctor.newInstance(delegate);
                System.out.println("TYPE: ");
                System.out.println(t.getClass());
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
