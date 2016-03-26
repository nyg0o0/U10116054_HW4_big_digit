import java.util.*;

public class TestBigDigit {
  public static void main(String[] args) {
    // Prompt user to input a big number
    System.out.print("Pleas enter a big number: ");
    Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.print(str);
    int intPart = str.indexOf('.');
    int decimalPart = str.length() - intPart - 1;
    System.out.print(intPart + " " + decimalPart);
  }
}