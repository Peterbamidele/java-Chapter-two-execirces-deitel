import java.util.Scanner;

public class ExerciseTwo_TwentyFive {
    /*(Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
    [Hint: Use the remainder operator. An even number is a multiple of 2.
    Any multiple of 2 leaves a remainder of 0 when divided by 2.]*/
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;

        //Collect input from user
        System.out.println("Enter a number:");
        number=input.nextInt();

        if(number(number)){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }
    public static boolean number(int num){
        if((num%2)==0)
            return true;
        else
            return false;
    }


    }

