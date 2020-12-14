import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Adding_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FirstNumber;
        int SecondNumber;
        int total;

        System.out.print("Enter first Number: ");
        FirstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        SecondNumber = input.nextInt();

         total = FirstNumber + SecondNumber;

        System.out.printf("total  %d%n",(FirstNumber + SecondNumber));
        System.out.printf("Product %d%n",(FirstNumber * SecondNumber));
        System.out.printf("quotient  %d%n",(FirstNumber / SecondNumber));
        System.out.printf("mode  %d%n",(FirstNumber % SecondNumber));



    }
}