package main;

import exemplu.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("exemplu.Cat");

        Constructor<?> constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);

        Object o = constructor.newInstance();

        Field f = c.getDeclaredField("nume");
        f.setAccessible(true);
        f.set(o, "Tom");

        Method m = c.getDeclaredMethod("showName");
        m.setAccessible(true);
        m.invoke(o);
    }
}
