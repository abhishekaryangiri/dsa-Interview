package interviewQuestion;

//1.Step1: crete a springboot project using SI
//2. import into eclise
//3.Create a new Java class (e.g., HelloController.java) and annotate it with @RestController. Define a simple REST endpoint.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMiniWebServicesRestAPI {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to the mini web service!";
    }
}

//Run the Application:
//4.Run the Spring Boot application. This can typically be done by running the main method in your Application class.

//5.Test the API:
//Open a web browser or a tool like curl/Postman and access http://localhost:8080/hello. You should see the response message.