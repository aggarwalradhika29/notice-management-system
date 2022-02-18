import java.io.*;
//BufferedReader, FileWriter, InputStreamReader
import java.util.*;
//List, Scanner;
													//ADMIN CLASS
public class Admin 
{
	
	public boolean containsNotice(List<Notice> notices, String id) 
	{
		int i;
		for(i = 0; i < notices.size(); i++) 
		{
			if(notices.get(i).id.equalsIgnoreCase(id))
				break;
		}
		if(i == notices.size())
			return false;
		return true;
	}
	
	public void display(List<Notice> notices)									// to display all the notices in the file
	{
		if(notices.isEmpty())
		{
			System.out.println("No notices to display!");
			return;
		}
		for(Notice notice : notices) 
		{
			System.out.println("\nNotice id: " + notice.id);
			System.out.println("Notice message: " + notice.message);
		}
	}
	
	public List<Notice> add(Notice notice, List<Notice> notices) throws Exception 				// to add a notice in the list
	{
		if(notice.message.replace("\\s", "").isEmpty() || notice.message.replace("\\s", "").equalsIgnoreCase("") || notice.message.trim().isEmpty())
		{
			throw new Exception("WARNING! Message content can't be left blank!");		//throwing exception for blank content
		}
		notices.add(notice);
		System.out.println("Added!");
		return notices;
	}
	
	public List<Notice> update(List<Notice> notices, String id, String message)					// to append the notice content
	{
		if(!containsNotice(notices, id))
		{
			System.out.println("Notice id not found in list, please add or choose another id!");
			return notices;
		}
		int noticeId = -1;
		for(int i = 0; i < notices.size(); i++) 
		{
			if(notices.get(i).id.equalsIgnoreCase(id)) 
			{
				noticeId = i;
				break;
			}
		}
		Notice noticeNew = new Notice(id, message);
		notices.set(noticeId, noticeNew);
		System.out.println("Updated!\n");
		return notices;
	}
	
	public List<Notice> delete(List<Notice> notices, String id)									// to delete a notice from the list
	{
		if(!containsNotice(notices, id))
		{
			System.out.println("Notice id not found in list, please add or choose another id !");
			return notices;
		}
		int noticeId = -1;
		for(int i = 0; i < notices.size(); i++) 
		{
			if(notices.get(i).id.equalsIgnoreCase(id)) {
				noticeId = i;
				break;
			}
		}
		notices.remove(noticeId);
		System.out.println("Deleted!");
		return notices;
	}


	public File manage(File f, List<Notice> notices) throws Exception 							// to manage the activities for 'admin' access in the system
	{
		char ch;
		do 
		{
			System.out.println("\n--------------\n| ADMIN MENU |\n--------------\n| 1.Add      |\n| 2.Display  |\n| 3.Update   |\n| 4.Delete   |\n| 5.Exit     |\n--------------");
			System.out.print("\nPlease enter a choice of number: ");
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) 
			{
			    case 1:
				         System.out.print("Please enter notice id: ");
				         String id= sc.next();
				         System.out.print("Enter message: ");
				         String msg= buf.readLine();
				         Notice notice = new Notice(id, msg);
				         notices = add(notice, notices);
				         break;

			    case 2: 
				         display(notices);
				         break;

			    case 3:
				         System.out.print("Please enter the id of the notice to be changed: ");
				         String idUp= sc.next();
				         System.out.print("Enter new message: ");
				         String msgUp= buf.readLine();
				         notices = update(notices, idUp, msgUp);
				         break;

			    case 4:
				         System.out.print("Please enter the id of the notice to be deleted: ");
				         notices = delete(notices, sc.next());
				         break;

			    case 5:  break;

			    default: System.out.println("Please choose a valid option number!");
			}

										//updating the operations in file
			try
			{
				FileWriter fw= new FileWriter(f,false);
				BufferedWriter bw= new BufferedWriter(fw);
				for(Notice notice : notices) 
		        {
					bw.write(notice.id);
					bw.write("\n");
					bw.write(notice.message);
					bw.write("\n");
				}
				bw.close();
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			System.out.print("\nDo you want to continue as an ADMIN or back to login window?(y/n): ");
			ch= sc.next().charAt(0);
		} while( ch=='Y' || ch=='y' );
		return f;		
	}
}