import java.io.*;
import java.util.*;
// Scanner, List, ArrayList
												
public class NoticeManagement   //main class
{
	
	private static String userAId = "radhika";            // username & password for the login(admin)
	private static String passwordA = "radhika1234";
	private static String userSId = "student";            // username & password for the login(student)
	private static String passwordS = "student1234";
	
	protected static boolean isAdmin(String id, String pass)		// to check whether the user is the admin or not
	{
		if(id.equalsIgnoreCase(userAId) && pass.equalsIgnoreCase(passwordA))
			return true;
		else
			return false;
	}
	
	protected static boolean isStudent(String id, String pass)		// to check whether the user is the student or not
	{
		if(id.equalsIgnoreCase(userSId) && pass.equalsIgnoreCase(passwordS))
			return true;
		else
			return false;
	}

	public static String noticesToString(List<Notice> notices)		// to display all the notices from the list in the string format
	{
		String allNotices = "";
		for(Notice notice : notices) 
		{
			allNotices = allNotices+ "Id : "+notice.id+"\nMessage : "+notice.message+"\n";
		}
		return allNotices;
	}
	
	public static void main(String args[]) throws Exception 		// main method
	{
		char ch;
		List<Notice> notices = new ArrayList<Notice>();				// creating a list of type Notice
		File f= new File("Notices.txt");
		notices= makeList(f, notices);
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("| N O T I C E\tB O A R D\tM A N A G E M E N T\tS Y S T E M |");
		System.out.println("---------------------------------------------------------------------\n\n");
		do 
		{
			System.out.println("\t--------- L O G I N ----------");
			System.out.print("\t| Enter username: ");
			String user= sc.next();
			System.out.print("\t| Enter password: ");
			String pass= sc.next();
			System.out.println("\t------------------------------");
			boolean approveAdmin= isAdmin(user, pass);
			boolean approveStudent= isStudent(user, pass);       
			Student student= new Student();  
			Admin admin= new Admin();
			if(approveAdmin == true) 
			{
				System.out.println("\n\t\tLogged  in  as  an  ADMIN!");
				f = admin.manage(f,notices);					// invokes manage method of 'admin' class
			}
			else if(approveStudent == true)
			{
				System.out.println("\n\n\t\tLogged  in  as  a  STUDENT!");
				student.manage(notices);							// invokes manage method of 'student' class
			}

			else
			{
				System.out.println("F A I L E D  L O G I N !");
			}
			System.out.print("\n\t\tYou are about to log out. Wanna continue the NM System?(y/n): ");
			ch= sc.next().charAt(0);
		}
		while( ch=='Y' || ch=='y' );
		System.out.println("\nE X I T E D !");
	}

	static List<Notice> makeList(File f, List<Notice> notices)
	{
		try
		{
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String line= " ";
			int i=0;
			while((line= br.readLine()) != null && i<(f.length()/2))
			{
				Notice n= new Notice(line, br.readLine());
				notices.add(i,n);
				i++;
			}
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return notices;
	}

/*	static List<Notice> noticeList(List<Notice> notices)
	{
		Notice n1= new Notice("CIR1", "Hello everyone! New session is going to start in a few weeks. Hope everyone enjoyed the journey till now.");
		Notice n2= new Notice("CIR2", "The institute is organising a blood donation camp during the summer break. Active participation is expected!");
		Notice n3= new Notice("CIR3", "Hello viewers! Exams for higher grades are going to start next week. Prepare well!");
		Notice n4= new Notice("CIR4", "Everybody is requested to switch on their camera during assessments.");
		Notice n5= new Notice("CIR5", "The school has planned a trip for its students. Destination- Shimla, Duration- July 10 to july 15, Fee- Rs 3000 per head. Interested students may contact their class heads.");
		notices.add(n1);
		notices.add(n2);
		notices.add(n3);
		notices.add(n4);
		notices.add(n5);

		return notices;
	}*/

}
