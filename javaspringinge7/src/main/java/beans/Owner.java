package beans;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Owner {

    //@Autowired
    private Cat cat;

    @PostConstruct
    public void init() {
        System.out.println("Owner was created");
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
