package Daily_study_example;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import java.lang.*;
import java.util.*;

class Employee {
    int id;
    String name,department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

}

class SortbyId implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return - employee1.id + employee2.id; // 뒤에꺼가 크면 음수: 자리 그대로
    }
}

public class ch11_comparator {

    public static void main(String[] args) {
        ArrayList<Employee> workers = new ArrayList<>();

        Employee employee1 = new Employee(11, "Kim Coding", "Software Engineering");
        Employee employee2 = new Employee(5, "Hello World", "Growth Marketing");
        Employee employee3 = new Employee(7, "Park Hacker", "Software Engineering");

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for (Employee employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }

        Collections.sort(workers, new SortbyId());

        for (Employee employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }
    }
}