package interviewQuestion;

//1.Step1: crete a springboot project using SI
//2. import into eclise
//3.Create a new Java class (e.g., HelloController.java) and annotate it with @RestController. Define a simple REST endpoint.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to the mini web service!";
    }
}

