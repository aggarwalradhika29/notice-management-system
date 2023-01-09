# notice-management-system

NOTICE MANAGEMENT SYSTEM

## PROBLEM STATEMENT

-	Create a Notice Board Management System in Java which can 
1.	Add
2.	Update
3.	Delete
There are two types of users involved: 
1.	Student 
2.	Admin 
-	Students can only view the notices while admin can display, add, delete and update notices. 
-	Create appropriate classes Student, Admin and Notice.
-	All the notices created should be stored in an array.

--------------------------------------------------------------------------------------------------------------------------------------

## Definition of Done:

1.	The system should ask user to enter user name and password. On successful login, System should open.
2.	The system should ask user to enter an option from the selected list of operations on Notice Board.(View, Add, Update, Delete)
3.	Use Exception handling to check:
			a) The content of the Notice is not left blank
4.	The system should perform the desired operation on the notices using notices.txt file for the logged in user (Add, Delete, Update, display notice).

--------------------------------------------------------------------------------------------------------------------------------------

## PROBLEM ANALYSIS

Hardware Requirements:

•	Computer

Software Requirements:

•	Sublime text editor
•	Java complier
•	Command Prompt

--------------------------------------------------------------------------------------------------------------------------------------

## DESIGN

DATA I/O -

Step 1:
Login window allows only 2 users to access the further system.

Step 2:
Admin/student window shows the menu and after each task asks the user if he/she wants to go back to login window or work more in admin/student panel.

Step 3: 
In Admin panel,
-	On addition, notice id and content are inputted and added to the notice list.
-	On display, it shows all the notices present in the list.
-	On updating, it asks the notice id to be updated, and then the new content for it.
-	On deletion, it asks the notice id and deletes that particular notice.
In student panel, 
-	It can only display notices here.

Step 4:
After logging out of admin/student panel, it asks if the user wants to work more in the system. If yes, it takes the user back to login window else exits the system.
--------------------------------------------------------------------------------------------------------------------------------------

** Notices are stored in .txt file like this: 
![image](https://user-images.githubusercontent.com/91591831/211331736-0fcfdd8f-13ee-4883-89a5-95e43af8b431.png)


--------------------------------------------------------------------------------------------------------------------------------------

## IMPLEMENTATION AND TESTING

TOTAL FILES:
1.	NoticeManagement.java (MAIN CLASS)
  a.	Login window
  b.	File Handling
  c.	Method to convert notices into String

2.	Notice.java
  a.	Data members- id, message
  b.	Constructors

3.	Admin.java
  a.	Admin menu
  b.	Add method 
  c.	Display method
  d.	Update method
  e.	Delete method

4.	Student.java
  a.	Student menu
  b.	Display method

5.	Notices.txt
  a.	Stores all notices

** An ArrayList of type notice is used throughout the system and the same is stored in a .txt file by converting all of its content into String.
 ![image](https://user-images.githubusercontent.com/91591831/211332366-e87c023a-74d4-4c37-bca9-22e954edf017.png)


Completing the DoDs(Source code snippets):

1.	Login:
 	![image](https://user-images.githubusercontent.com/91591831/211332477-7530c44a-d5c0-4872-ac8a-338e9c425332.png)

2.	Operation Menu:
 	![image](https://user-images.githubusercontent.com/91591831/211332511-96d06742-15f5-4840-8e38-363cc89dcb4f.png)

3.	Exception for blank content:
 	![image](https://user-images.githubusercontent.com/91591831/211332627-407133ff-15cf-4369-94f0-d82bd275910f.png) 

4.	File Handling:
  	![image](https://user-images.githubusercontent.com/91591831/211332667-e0fb13a0-4b26-4c2f-86c7-5e556bffa05c.png)
	![image](https://user-images.githubusercontent.com/91591831/211332692-44959dc5-f2ca-4f4f-9b01-559da3b8afed.png)
	
--------------------------------------------------------------------------------------------------------------------------------------
## OUTPUT (Screenshots)
1.	The LOG-IN window
 ![image](https://user-images.githubusercontent.com/91591831/211333513-f286f0db-6dad-4b91-9787-0deb15aa9f66.png)

2.	Admin Menu
	![image](https://user-images.githubusercontent.com/91591831/211333472-3a026d73-e67c-4396-88c3-adddcdaa1884.png)

	a.	Add function
	![image](https://user-images.githubusercontent.com/91591831/211333439-ac248756-52a2-4451-a472-27b0ea025b51.png)

	b.	Display function
	![image](https://user-images.githubusercontent.com/91591831/211333417-9a6c5262-aa06-46c0-bc88-51f05af775d2.png)

	c.	Update function
	![image](https://user-images.githubusercontent.com/91591831/211333398-6abed4ff-2f6c-44ab-ac48-5b16c2ec0c15.png)

	d.	Delete function
 	![image](https://user-images.githubusercontent.com/91591831/211333354-33522a9a-d503-4b19-b1ae-d5da5c78e642.png)


UPDATED LIST:
![image](https://user-images.githubusercontent.com/91591831/211333317-af9015ee-0a1f-4a71-9a8d-42ffcc115def.png)

 
3.	Student Menu
 	![image](https://user-images.githubusercontent.com/91591831/211333271-0a114296-d52d-43c7-a039-db5f6d0df99c.png)

	a.	Display all
 	![image](https://user-images.githubusercontent.com/91591831/211333211-df433c1e-2be6-4443-9419-0cdb6ff20083.png)


4.	Failed log-in
 	![image](https://user-images.githubusercontent.com/91591831/211333166-59eba5bc-a7eb-4c49-b3ee-835bbe26c123.png)

	

--------------------------------------------------------------------------------------------------------------------------------------

## CONCLUSION

•	The system can work for two users viz. admin and student which later have their own content accesses. 

•	Admin access is vast with add, delete, update and display options while student can only view the notices.

•	The system stores notices into an array list with id and the message for a particular notice.
--------------------------------------------------------------------------------------------------------------------------------------

## FUTURE SCOPE

•	Graphical User Interface can be used to make the user-system interaction more interesting.

•	We can use databases to make our system code work more effectively.
--------------------------------------------------------------------------------------------------------------------------------------

END
