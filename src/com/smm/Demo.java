package com.smm;

 class Employee {

    public String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name=name;
        this.salary=salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary=salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }


}
class Manager extends  Employee {

    public Manager(String name, float salary) {
        super(name, salary);
    }

    public String displayManager() {
        return "before updating name = "+name+" salary = "+getSalary();

    }

}
class Developer extends  Employee {


    public Developer(String name, float salary) {
        super(name, salary);

    }

    public String displayDeveloper() {
        return "before updating name = "+name+" salary = "+getSalary();

    }

}
public class Demo {
    public static void main(String [] args) {

        Manager obj1 = new Manager("john",1000.0f);
        System.out.println(obj1.displayManager());

        obj1.setSalary(2500.0f);
        System.out.println("updated salary "+obj1.getSalary());

        Developer obj2 = new Developer("aravind",500.0f);
        System.out.println(obj2.displayDeveloper());

        obj2.setSalary(1500.0f);
        System.out.println("updated salary "+obj2.getSalary());


    }

}
