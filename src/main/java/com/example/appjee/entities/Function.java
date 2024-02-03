package com.example.appjee.entities;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "functions")
public class Function {
    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(mappedBy = "functions")
    private List<Employee> employeeList;

    public Function(String name, Long id, List<Employee> employeeList) {
        this.name = name;
        this.id = id;
        this.employeeList = employeeList;
    }

    public Function() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", employeeList=" + employeeList +
                '}';
    }
}
