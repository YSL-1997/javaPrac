import java.util.Scanner;

public class PrintInt {
  public static void main(String[] args) {
    // create a reader instance s.t. takes input from standard input - keyboard
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");

    // nextInt() reades the next int from the keyboard
    int num = reader.nextInt();

    System.out.println("You entered: " + num);
    reader.close();
  }
}