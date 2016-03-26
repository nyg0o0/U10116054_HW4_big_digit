import java.util.*;

public class TestBigDigit {
  public static void main(String[] args) {

    // Prompt user to input a big number
    System.out.print("Pleas enter a big number: ");
    Scanner in = new Scanner(System.in);
    String inputStr = in.next();

    // Check for inputStr is a number or not
    try{ 
      System.out.print(Double.parseDouble(str));
    }
    catch (NumberFormatException e){ 
      System.out.println("This is not a digit);
    }
   
    // Record the number of digits (before and after decimal point)
    int intPart = inputStr.indexOf('.');
    int decimalPart = inputStr.length() - intPart - 1;  // string length - interger part - decimal point
    System.out.print(intPart + " " + decimalPart); 

    // Store the number into the array
  }
}