package service;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
    String SayHello(String name);
}
