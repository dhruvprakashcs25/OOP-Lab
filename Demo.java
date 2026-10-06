public class Demo{
   public static void main(String args[]){
      Savings s = new Savings();
      s.accept();
      s.display();
      System.out.println("Interest Rate " + s.interest_rate);
      Current c = new Current();
      c.accept();
      c.display();
      System.out.println("Overdraft Limit :" + c.overdraft_limit);
   }
}