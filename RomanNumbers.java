import java.util.Scanner;
public class RomanNumbers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int intValue = RomanToInteger.romanToInt(s);
        System.out.println("The integer value of " + s + " is " + intValue);
    }
}