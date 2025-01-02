package com.smm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee implements Comparable <SortEmployee> {

     String name;
     double salary;

     public SortEmployee(String name, double salary) {
          this.name=name;
          this.salary=salary;
     }


     @Override
     public int compareTo(SortEmployee other) {
          return Double.compare(other.salary, this.salary);
     }


     @Override
     public String toString() {
          return "name: " + name + ", salary: " + salary;
     }


     public static void main(String [] args) {

          List<SortEmployee> list = new ArrayList<>();

          list.add(new SortEmployee("ajay",5000.0));
          list.add(new SortEmployee("abhi",10000.0));
          list.add(new SortEmployee("reshma",7500.0));

          Collections.sort(list);

          System.out.println("in sorted oredr");
          for(SortEmployee s : list) {
               System.out.println(s);
          }

     }

}
