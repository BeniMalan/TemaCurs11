package Pack;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Employee extends Person {
    public static void main(String[] args) {
        Employee emp1=new Employee("Denis",20,"Blond",300,"Intel");
        Employee emp2=new Employee("Denisa",30,"Saten",320,"Google");
        Employee emp3=new Employee("Alin",35,"negru",600,"Intel");
        Employee emp4=new Employee("Dana",40,"blond",1500,"FB");
        List<Employee>ListaAngjati=new ArrayList<>();
        ListaAngjati.add(emp1);
        ListaAngjati.add(emp2);
        ListaAngjati.add(emp3);
        ListaAngjati.add(emp4);
        System.out.println(personsBasedOnsalaries(ListaAngjati,300));
        System.out.println(gatherAllPersonsFromSameCompany(ListaAngjati,"Intel"));
        System.out.println(sumOfAllSalaries(ListaAngjati));
        System.out.println(greatestSalaryPayedByCompany(ListaAngjati));
    }
    public int getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }
    private int salary;
    private String company;

    public Employee(String name, int age, String hairColor, int salary, String company) {
        super(name, age, hairColor);
        this.salary = salary;
        this.company = company;
    }

    public static List<Employee> personsBasedOnsalaries(List<Employee> emp, int a) {
        List<Employee> L1 = new ArrayList<>();
        for (Employee p1 : emp) {
            if (p1.getSalary() > a) {
                L1.add(p1);
            }
        }
        return L1;
    }
    public static HashMap<String,String> gatherAllPersonsFromSameCompany(List<Employee>employees,String corp){
        HashMap<String,String>map1=new HashMap<>();
        for(Employee emp1:employees){
            if(emp1.getCompany().equals(corp)){
            map1.put(emp1.getName(), emp1.getCompany());
            }
        }
        return map1;
    }
    public static int sumOfAllSalaries(List<Employee>employees){
        int sum=0;
        for(Employee emp:employees){
            int salary = emp.getSalary();
            sum=sum+salary;
        }
        return sum;
    }
    public static String greatestSalaryPayedByCompany(List<Employee>employees){
      int Max=Integer.MIN_VALUE;
      String comp=" ";
        for (Employee emp:employees){
            if(emp.getSalary()>Max){
                Max=Max+emp.getSalary();
                comp=emp.getCompany();
            }
        }
        return comp;
    }
}
