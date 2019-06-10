package services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import services.NameService;

@Service
@Qualifier("simple")
public class SimpleNameService implements NameService {

    public String getName() {
        return "Bill";
    }
}
