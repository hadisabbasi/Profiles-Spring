package service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GreetingServiceGerman implements GreetingService{
    @Override
    public String SayHello(String name) {
        return "Hallo" +name;
    }
}
