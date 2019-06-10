package main;


import beans.Dog;
import beans.Owner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\STUDY\\kubeless\\examples\\javaspringinge6\\src\\main\\resources\\projectconfig.xml";
        FileSystemXmlApplicationContext c =
                new FileSystemXmlApplicationContext(path);

        //ClassPathXmlApplicationContext
        Owner o = c.getBean(Owner.class);
        Dog d = c.getBean(Dog.class);

        System.out.println(o);
        System.out.println(o.getDog());
        System.out.println(d);
    }
}
