package oops;
class StudentReportCard{
	int rollno;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int total;
	float avg;
	String grade;
	StudentReportCard(int rollno,String name,int m1,int m2,int m3,int m4,int m5){
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	void calculation(){
		total=this.m1+this.m2+this.m3+this.m4+this.m5;
		avg=total/5;
		if(avg>=90) {
			grade="A";
		}
		else if(avg>=80){
			grade="B";
		}
		else if(avg>=70){
			grade="C";
		}
		else if(avg>=60){
			grade="D";
		}
		else if(avg>=50){
			grade="D";
		}
		else {
			grade="E";
		}
	}
	void getDetails(){
		System.out.println(this.rollno+" \n"+this.name+" \n"+this.m1+" \n"+this.m2+" \n"+this.m3+" \n"+this.m4+" \n"+this.m5+" \n"+this.total+" \n"+this.avg+" \n"+this.grade);
	}
}
public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s=new StudentReportCard(39,"Sutharshini",8,73,92,34,43);
		s.calculation();
		s.grade="A";
		s.getDetails();
		StudentReportCard s1=new StudentReportCard(19,"Ezhilarasi",99,99,99,99,100);
		s1.calculation();
		s1.getDetails();
	}

}
