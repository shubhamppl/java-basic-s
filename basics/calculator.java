import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char a;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
     //used for taking input could be used (int) also
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      a = reader.next().charAt(0);
      switch(a) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + a + " " + num2 + " = " + ans);
   }
}
