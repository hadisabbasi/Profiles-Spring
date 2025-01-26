package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.GreetingService;

@RestController
@RequestMapping(path ="/")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;
    @RequestMapping(path="/hello/{name}", method = RequestMethod.GET)
    public String Hello(@PathVariable(value = "name") String name){
        return greetingService.SayHello(name);
    }
}
