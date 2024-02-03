package com.example.appjee;
import com.example.appjee.daos.EmployeeDao;
import com.example.appjee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class AppjeeApplication {
    @Autowired
    private EmployeeDao employeeRepository;
    public static void main(String[] args) {
        SpringApplication.run(AppjeeApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @PostConstruct
    private void testJpa() {
        Employee e = new Employee();
        e.setFirstname("First");
        e.setLastname("Last");

        e=employeeRepository.save(e);
        System.out.print(e.getId());
    }

}
