package queue;

import java.util.Scanner;

public class PrinterTask {
	public static int choice;
	public static void main(String[] args) {
		Application a=new Application();
		Scanner sc=new Scanner(System.in);
		for (int choice = 0; choice != 5; ) {
		System.out.println("Enter the choice");
		choice =sc.nextInt();
		switch(choice){
			
			case 1:
				System.out.println("Enter the Task Id:");
				int id=sc.nextInt();
				System.out.println("Enter the Task Name:");
				sc.nextLine();
				String name=sc.nextLine();
				Task newTask=new Task(id,name);
                a.Addtask(newTask);
				break;
				
			case 2:
				a.showAllTask();
				break;
				
			case 3:
				a.nextTask();
				break;
				
			case 4:
				a.removeTask();
				break;
			case 5:
                System.out.println("Exiting...");
                sc.close();
                return;
			default:
				System.out.println("Invalid Choice");
			
		}
		}
	}

}
