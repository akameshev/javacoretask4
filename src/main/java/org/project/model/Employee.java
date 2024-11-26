package org.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private LocalDate birthday;
    /**
     * Добавить в сотрудника свойство «пол» со значением созданного перечисления.
     */
    private Gender gender;
    private double salary;

    //region Builder
    public static class EmployeeBuilder{
        private int id;
        private String name;
        private LocalDate birthday;
        private Gender gender;
        private double salary;

        public EmployeeBuilder id(int id){
            this.id = id;
            return this;
        }
        public EmployeeBuilder name(String name){
            this.name = name;
            return this;
        }
        public EmployeeBuilder birthday(LocalDate birthday){
            this.birthday = birthday;
            return this;
        }
        public EmployeeBuilder gender(Gender gender){
            this.gender = gender;
            return this;
        }
        public EmployeeBuilder salary(double salary){
            this.salary = salary;
            return this;
        }
        public Employee build(){
            return new Employee(id, name, birthday, gender, salary);
        }
    }
    //endregion

    @Override
    public int compareTo(Employee o) {
        return this.birthday.compareTo(o.birthday);
    }

    /**
     * Добавить геттеры, сеттеры.(хотя я использовал Ломбок, но добавил так как указано в задании)
     * @return
     */
    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //endregion


}
