package services;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int add(int a, int b) {
        if (true) throw new RuntimeException(":(");
        return a + b;
    }
}
