import java.util.*;
public class Account{
   
   String acc_no, name;
   
   void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter account number, name :");
      acc_no = sc.nextLine();
      name = sc.nextLine();
   }
   
   void display(){
      System.out.println("Account Number :" + acc_no);
      System.out.println("Name : " + name);
   }
}
