package services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import services.HelloService;
import services.NameService;

@Service
public class SimpleHelloService implements HelloService {

    @Autowired
    @Qualifier("random")
    private NameService nameService;

    public void sayHello() {
        String name = nameService.getName();
        System.out.println("Hello, " + name + "!");
    }
}
