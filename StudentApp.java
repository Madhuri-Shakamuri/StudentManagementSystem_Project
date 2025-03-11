package StudentManagementSystem;

import java.util.Scanner;

public class StudentApp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StudentService service =new StudentService();
        System.out.println("Student Management System : ");
        

            
        while(true)
        {
            System.out.println("1. Add Students ");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student ");
            System.out.println("4. Update  Student ");
            System.out.println("5. Delete Student ");
            System.out.println("6. Exit ");
            System.out.println("Enter your Choice :");
            int choice=sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter ID : ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name : ");
                    String name=sc.nextLine();
                    System.out.println("Enter Age : ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Course : ");
                    String course=sc.nextLine();
                    
                    service.addStudent(new Student(id,name,age,course));
                    
                    break;

                case 2:  
                     service.displayStudents();
                     break;

                case 3:
                     System.out.println("Enter Student Id to search: ");
                     int search_id=sc.nextInt();
                     Student s=service.searchStudent(search_id);
                     if(s!=null)
                     {
                        System.out.println("Student found\nStudent details : ");
                        s.display();
                     }
                     else 
                     System.out.println("Student not found");
                     break;

                case 4:
                     System.out.println("Provide required data for update:"); 
                     System.out.println("Enter ID : ");
                    int id1=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name : ");
                    String name1=sc.nextLine();
                    System.out.println("Enter Age : ");
                    int age1=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Course : ");
                    String course1=sc.nextLine();
                    if(service.updateStudent(id1,name1, age1, course1))
                    System.out.println("Updated the details");
                    else 
                    System.out.println("Not updated");
                     break;

                case 5:
                     System.out.println("Enter the id to delete the student details");
                      int id2=sc.nextInt();
                     if(service.deleteStudent(id2))
                     {
                        System.out.println("Student deleted successfully");
                     }
                     else 
                     System.out.println("Student not found");
                     break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice try again!");
                    break;

            }
        }
        




    }
    
}
