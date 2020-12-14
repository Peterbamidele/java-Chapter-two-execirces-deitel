import java.sql.SQLOutput;
import java.util.Scanner;

public class Comparies {
    public static void main(String[] args){
        /*
        Compare integers using if statements, relational operators
         and equality operators.*/


        int firstValue;
        int secondValue;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your FirstInput: ");
        firstValue = input.nextInt();

        System.out.print("Enter your SecondInput: ");
        secondValue = input.nextInt();

        if(firstValue == secondValue)
            System.out.printf("%d == %d%n",firstValue,secondValue);

        if(firstValue != secondValue)
        System.out.printf("%d != %d%n ", firstValue,secondValue);

        if(firstValue > secondValue)
            System.out.printf("%d > %d%n",firstValue,secondValue);

        if (firstValue < secondValue)
            System.out.printf("%d < %d%n", firstValue,secondValue);

        if (firstValue <= secondValue)
            System.out.printf("%d <=%d%n", firstValue,secondValue);

        if (firstValue >= secondValue)
            System.out.printf("%d >= %d%n", firstValue,secondValue);

    }
}
