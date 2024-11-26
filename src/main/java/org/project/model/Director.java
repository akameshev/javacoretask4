package org.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


public class Director extends Employee{

    public Director(int id, String name, LocalDate birthday, Gender gender, double salary) {
        super(id, name, birthday, gender, salary);
    }

    //region Builder
    public static class DirectorBuilder{
        private int id;
        private String name;
        private LocalDate birthday;
        private Gender gender;
        private double salary;

        public DirectorBuilder id(int id){
            this.id = id;
            return this;
        }
        public DirectorBuilder name(String name){
            this.name = name;
            return this;
        }
        public DirectorBuilder birthday(LocalDate birthday){
            this.birthday = birthday;
            return this;
        }
        public DirectorBuilder gender(Gender gender){
            this.gender = gender;
            return this;
        }
        public DirectorBuilder salary(double salary){
            this.salary = salary;
            return this;
        }
        public Director build(){
            return new Director(id, name, birthday, gender, salary);
        }
    }
    //endregion

    public static void updateSalary(Employee employee) {
        if (employee.getClass()==Employee.class) {
            employee.setSalary(employee.getSalary() * 1.25);
        }
        else employee.setSalary(employee.getSalary() +0);
    }
}
