package beans;

import org.springframework.beans.factory.FactoryBean;

public class CatFactory implements FactoryBean<Cat> {

    @Override
    public Cat getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }
}
