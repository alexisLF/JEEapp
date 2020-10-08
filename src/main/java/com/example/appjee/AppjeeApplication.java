package com.example.appjee;
import com.example.appjee.daos.EmployeeDao;
import com.example.appjee.daos.FunctionDao;
import com.example.appjee.daos.RoleDao;
import com.example.appjee.entities.Employee;
import com.example.appjee.entities.Function;
import com.example.appjee.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
@RestController
public class AppjeeApplication {
    @Autowired
    private EmployeeDao employeeRepository;
    @Autowired
    private FunctionDao functionRepository;
    @Autowired
    private RoleDao roleRepository;
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
        Role r = new Role();
        r.setName("OUIII");
        r=roleRepository.save(r);

        e=employeeRepository.save(e);
        e.setRole(r);

        //Relation Many-to-Many not working !!!

        /*Function function = new Function();
        function.setName("F2");
        Function func = new Function();
        func.setName("F1");
        func=functionRepository.save(func);
        function=functionRepository.save(function);
        System.out.println(func);
        System.out.println(function);
        System.out.println(e);
        System.out.println(functionRepository.findAll());
        e.getFunctions().addAll(functionRepository.findAll());
        System.out.println("EUUUUUUUUUH" + e);*/


        e=employeeRepository.save(e);
        System.out.print(e.getId());
    }

}
