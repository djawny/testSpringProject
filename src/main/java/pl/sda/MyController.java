package pl.sda;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name, @RequestParam String surname) {
        return "Hello World from Daniel to " + name + " " + surname;
    }

    @RequestMapping("/hello2/{name}")
    public String hello2(@PathVariable("name") String name) {
        return "Hello World from Daniel to " + name;
    }
}
