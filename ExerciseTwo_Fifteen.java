import java.util.Scanner;

public class ExerciseTwo_Fifteen {
    /*2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
    from the user and prints their sum, product, difference and quotient (division).*/
    public static void main(String[] args){
        int x;
        int y;
        int result;

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter your first value: ");
        x = Input.nextInt();

        System.out.println("Enter your second value: ");
        y = Input.nextInt();

//  sum method
       result = x + y;
       System.out.printf("sum is %d%n", result);

// quotient method
        result = x / y;
        System.out.printf("quotient is %d%n", result);
// product method
        result = x * y;
        System.out.printf("product is %d%n", result);
// difference method
        result = x - y;
        System.out.printf("difference is %d%n", result);

    }
}
