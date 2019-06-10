package services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import services.NameService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Qualifier("random")
public class RandomNameService implements NameService {

    @Override
    public String getName() {
        List<String> names = Arrays.asList("John", "Bill", "George");
        int i = new Random().nextInt(3);
        return names.get(i);
    }
}
