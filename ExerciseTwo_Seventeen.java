import java.util.Scanner;

public class ExerciseTwo_Seventeen {
    /* (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
    user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
    shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
    representation of the average. So, if the sum of the values is 7, the average should be 2, not
    2.3333....]*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        double sum = 0;
        int average= 0;
        double product=0;

        // collect input from user
        System.out.printf("Enter a First Number: ");
        firstNumber = input.nextInt();

        System.out.printf("Enter a Second Number: ");
        secondNumber = input.nextInt();

        System.out.printf("Enter Third Number: ");
        thirdNumber = input.nextInt();

        if(firstNumber > secondNumber & firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is the Greatest ");
        }
        else if (secondNumber > firstNumber & secondNumber > thirdNumber){
            System.out.println(secondNumber + "is the Greatest ");
        }
        else{
            System.out.println(thirdNumber + "is Greatest");
        }

        // looking for least among the number user input

        if (firstNumber < secondNumber & firstNumber < thirdNumber){
            System.out.println(firstNumber + "is the lowest");
        }
        else if(secondNumber < firstNumber & secondNumber < thirdNumber){
            System.out.println(secondNumber + "is the lowest");
        }
        else{
            System.out.println(thirdNumber + "is the lowest");}

        // Calculation for input by user
        sum =  firstNumber + secondNumber + thirdNumber;
        average =(int)sum/3;
        product = firstNumber * secondNumber * thirdNumber;

        // result of user input
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+sum);
        System.out.println("Product : "+product);


        }
 }

