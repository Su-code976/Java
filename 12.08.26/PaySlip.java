package Encapsulation;

public class PaySlip {
	int empId;
    String name;
    double basicPay;
    double da;
    double hra;
    double deductions;
    double grossSalary;
    double netSalary;
    void calculateSalary(){
        grossSalary=basicPay+da+hra;
        netSalary=grossSalary-deductions;
    }
    void display(){
        System.out.println("Employee ID:"+empId+"\nName:"+name+"\nBasic Pay:"+basicPay+"\nDA:"+da+"\nHRA:"+hra+"\nGross Salary:"+grossSalary+"\nDeductions:"+deductions+"\nNet Salary:"+netSalary);
    }
}
