package beans;

import annotation.Apeleaza;

public class Test {

    public void a() {
        System.out.println("A");
    }

    @Apeleaza(times = 3)
    public void b() {
        System.out.println("B");
    }

    @Apeleaza
    public void c() {
        System.out.println("C");
    }
}
