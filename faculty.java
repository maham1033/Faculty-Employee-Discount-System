package polymorphism;

public class faculty extends Employee {
   protected String designation;
   protected String department;
   protected int years_of_edu;

   public faculty() {
       System.out.println("default");
   }

   public faculty(String name, String address, int emp_no,
                  int pay, int house_rent, int medical_allow, String d, String dep, int y) {
       super(name, address, emp_no, pay, house_rent, medical_allow);
       designation = d;
       department = dep;
       years_of_edu = y;
   }


   public void calSalary() {
       double netpay = super.calcSalary();
       if (years_of_edu < 16) {
           netpay += 0;

       }
       if (years_of_edu == 16) {
           netpay += 1500;

       }
       if (years_of_edu == 20) {
           netpay += 2000;
           ;

       }
       if (years_of_edu > 25) {
           netpay += 3000;


       }
       System.out.println(netpay);
   }
}
