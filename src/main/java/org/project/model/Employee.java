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

    /**
     * Написать прототип компаратора - метод внутри класса сотрудника,
     * сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
     * без использования условного оператора.
     */
    @Override
    public int compareTo(Employee o) {
        return this.birthday.compareTo(o.birthday);
    }


}
