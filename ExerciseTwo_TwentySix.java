import java.util.Scanner;

public class ExerciseTwo_TwentySix {
    /*(Multiples) Write an application that reads two integers, determines whether the first is a
    multiple of the second and prints the result. [Hint: Use the remainder operator.*/
    public static void main(String[] args){
        int firstInput ;
        int secondInput;
        Scanner scan = new Scanner(System.in);

        //collect input from user
        System.out.printf("Enter your first Number: ");
        firstInput= scan.nextInt();

        System.out.printf("Enter your second Number: ");
        secondInput = scan.nextInt();


        if(number(firstInput, secondInput)) {
            System.out.println(firstInput + " is a multiple of " + secondInput);
        }
            else
                {
                System.out.println(firstInput + " is  not a multiple of " + secondInput);
            }

        }
        public static boolean number(int num1, int num2){
            if((num1%num2)==0)
                return true;
            else
                return false;

        }
}

