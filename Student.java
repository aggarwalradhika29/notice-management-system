import java.util.*;
//List, Scanner;
                        						//'STUDENT' CLASS with 2 methods: display AND manage
public class Student 
{
	public void display(List<Notice> notices)       // to display all the notices stored in the list
	{
		if(notices.isEmpty())
		{
			System.out.println("\nNo notices to be displayed!");
			return;
		}
		
		for(Notice notice : notices)
		{
			System.out.println("Notice id: "+notice.id);
			System.out.println("Notice message: "+notice.message+"\n");
		}
	}
	
	public void manage(List<Notice> notices) 		// to manage the activities for 'student' access in the system
	{
		char ch;
		do
		{
			System.out.println("\n\t\tYOU CAN ONLY VIEW THE NOTICES HERE!\n--------------\n| 1. Display |\n| 2. Exit    |\n--------------");
			System.out.print("Enter choice(1-2): ");
			Scanner sc= new Scanner(System.in);
			int choice= sc.nextInt();
			switch(choice) 
			{
			    case 1: 
				       display(notices);
				       break;

			    case 2:
				       break;

			    default: System.out.println("Please choose a valid option number!");
			}
			System.out.print("Do you want to continue as a STUDENT?(y/n): ");
			ch= sc.next().charAt(0);
		} 
		while( ch=='Y' || ch=='y' );
		return;		
	}
}
