package Encapsulation;
public class PaySlipDetails {
	public static void main(String[] args) {
		PaySlip p=new PaySlip();
        p.empId=101;
        p.name="Pon Sutharshini";
        p.basicPay=30000;
        p.da=5000;
        p.hra=6000;
        p.deductions=3000;
        p.calculateSalary();
        p.display();
	}
}
