package org.project;

import org.project.model.Director;
import org.project.model.Employee;
import org.project.model.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //region EmloyeeCreation
        Employee employee = new Employee.EmployeeBuilder()
                .id(1)
                .name("Jessica")
                .birthday(LocalDate.of(1971, 12, 01))
                .gender(Gender.FEMALE)
                .salary(11000)
                .build();

        Employee employee2 = new Employee.EmployeeBuilder()
                .id(1)
                .name("Morgan")
                .birthday(LocalDate.of(1999, 05, 29))
                .gender(Gender.MALE)
                .salary(10000)
                .build();

        Director director = (Director) new Director.DirectorBuilder()
                .id(2)
                .name("Josh")
                .birthday(LocalDate.of(1970, 02, 15))
                .gender(Gender.MALE)
                .salary(20000)
                .build();

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(director);
        //endregion

        congratulateEmployees(employees);

    }


    /**
     * Добавить в основную программу перечисление с праздниками
     * (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
     * принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом,
     * женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
     *
     * @param employees - Массив сотрудников
     */

    private static void congratulateEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
//            if (validateHolidays()==Holidays.NEW_YEAR){
//                System.out.println("Congratulations! Happy new year!" + employee.getName());
//                return;
//            }
//            if (employee.getGender() == Gender.FEMALE && validateHolidays()==Holidays.MARCH_8) {
//                System.out.println("Dear " + employee.getName() + ", We are congregate you with 8 march ");
//            }
//            if (employee.getGender() == Gender.MALE && validateHolidays()==Holidays.FEBRUARY_23) {
//                System.out.println("Dear " + employee.getName() + ", We are congregate you with 23 february ");
//            }
//            else {
//                System.out.println("There are no Holidays today for " + employee.getName());
//
//            }
            switch (validateHolidays()){
                case MARCH_8:
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("Dear " + employee.getName() + ", We are congregate you with 8 march ");
                    }
                    break;
                case FEBRUARY_23:
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("Dear " + employee.getName() + ", We are congregate you with 23 february ");
                    }
                    break;
                case NEW_YEAR:
                    {
                        System.out.println("Happy new year " + employee.getName());
                    }
                    break;
                default:
                    System.out.println("No holidays today, sorry((");
                    break;
            }
        }
    }
    private static Holidays validateHolidays() {
        if (LocalDate.now().getMonth().getValue()==3 && LocalDate.now().getDayOfMonth()==8)
            return Holidays.MARCH_8;
        if (LocalDate.now().getMonth().getValue()==2 && LocalDate.now().getDayOfMonth()==23)
            return Holidays.FEBRUARY_23;
        if (LocalDate.now().getMonth().getValue()==12 && LocalDate.now().getDayOfMonth()==31)
            return Holidays.NEW_YEAR;
        else{
            return Holidays.NOT_HOLIDAY;}
    }


}