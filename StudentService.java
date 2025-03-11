package StudentManagementSystem;

import java.util.ArrayList;

public class StudentService 
{
 private ArrayList<Student> students=new ArrayList<>();

    public void addStudent(Student student)
    {
      students.add(student);
      System.out.println("Student added successfully!");
    }


    public void displayStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("No students found");
        }
        else
        for(Student stu:students)
        {
         stu.display();
        }  

    }


    public Student searchStudent(int id)
    {
     for(Student s:students)
     {
        if(s.getId()==id)
        {
            return s;
        }
        
     }  
     return null;
    }
    public boolean updateStudent(int id,String name,int age,String course)
    {
     Student s=searchStudent(id);
     if(s!=null)
     {
        s.setName(name);
        s.setAge(age);
        s.setCourse(course);
        return true;
     }
     return false;
    }
    public boolean deleteStudent(int id)
    {
      Student s=searchStudent(id);
      if(s!=null)
      {
        students.remove(s);
        return true;
      }
      return false;
    }
   



    
}