import java.util.*;
public class Student{
   
   String name, usn;
   
   public void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name, usn: ");
      name = sc.nextLine();
      usn = sc.nextLine();
   }
   
   public void display(){
      System.out.println("Name : " + name);
      System.out.println("USN : " + usn);
   }
   
   public static void main(String args[]){
      Student s[] = new Student[3];
      for(int i = 0; i<3 ; i++){
         s[i] = new Student();
         s[i].accept();   
      }
      for(int i = 0; i<3 ; i++){
         s[i].display();
      }
   } 
}