package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyAwesomeController {

    @Autowired
    private MyAwesomeService myAwesomeService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name, @RequestParam String surname) {
        return "Hello World from Daniel to " + name + " " + surname;
    }

    @RequestMapping("/hello2/{name}")
    public String hello2(@PathVariable("name") String name) {
        return "Hello World from Daniel to " + name;
    }

    @RequestMapping("/customer")
    public Customer customer() {
        Customer customer = new Customer("Jakub", "Kowalski");
        return customer;
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public void message(@RequestBody String message) {
        System.out.println("podana wiadomość to: " + message);
    }

    @RequestMapping("/hello")
    public String hello3() {
        double result = myAwesomeService.add(2, 2);
        return "Hello World " + result;
    }
}
