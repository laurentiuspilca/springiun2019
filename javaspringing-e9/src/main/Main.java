package main;

import annotation.Apeleaza;
import beans.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("beans.Test");

        Test t = new Test();

        Method [] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            m.setAccessible(true);
            if (m.isAnnotationPresent(Apeleaza.class)) {
                Apeleaza a = m.getAnnotation(Apeleaza.class);
                for (int i=0; i<a.times(); i++) {
                    m.invoke(t);
                }
            }
        }

    }
}
