package Daily_study_example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ch11_collection_hashmap {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee();

        // 같은 employee로 처리하고싶음
        employee.setId(1);
        employee2.setId(1);

        // equals 재정의 안하면 false. 다른객체이므로.
        System.out.println(employee.equals(employee2));

        Set<Employee> employees = new HashSet<>();
        employees.add(employee);
        employees.add(employee2);

        // hashcode 재정의 안하면 다른 객체로 처리되므로, employees에 저장된 employee가 두 명이 됨
        System.out.println(employees);
    }

    static class Employee{
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}

