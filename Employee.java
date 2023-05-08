package polymorphism;

public class Employee extends Person {
   protected int Emp_no;
   protected int pay;
   protected double house_rent;
   protected double medical_allow;

   public Employee() {
       System.out.println("default");
   }

   public Employee(String name, String address, int emp_no,
                   int p, double hr, double m) {
       super(name, address);
       Emp_no = emp_no;
       pay = p;
       house_rent = hr;
       medical_allow = m;

   }

   public double calcSalary() {
       double netpay = pay / (1 + house_rent + medical_allow);
       System.out.println(netpay);
       return netpay;
   }


   @Override
   public String toString() {
       return "Employee{" +
               "Emp_no=" + Emp_no +
               ", pay=" + pay +
               ", house_rent=" + house_rent +
               ", medical_allow=" + medical_allow +
               '}';
   }


}
