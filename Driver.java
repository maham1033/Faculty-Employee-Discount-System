package polymorphism;

import polymorphism.Employee;
import polymorphism.faculty;
import java.util.Scanner;


public class Driver {
   public static void main(String[] args) {
//        Employee e=new Employee();
//        Faculty f=new Faculty();
       Employee E=new Employee("Maheerah","ABC",45,2,2.0,2.0);
       E.calcSalary();
       faculty f1=new faculty("Maheerah","ABC",
               45,2,2,2,"F","ENG",20);
       f1.calSalary();

   }
}