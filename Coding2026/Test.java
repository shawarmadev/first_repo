import java.util.Scanner;
public class Test {

  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    Scanner scan = new Scanner(System.in);


      System.out.println("Enter your score :");
      int score = scan.nextInt();

      
      if (score >= 50) 
        System.out.println("You passed!");
      else
        System.out.println("You didn't pass.");

      
    scan.close();
    
  }
}