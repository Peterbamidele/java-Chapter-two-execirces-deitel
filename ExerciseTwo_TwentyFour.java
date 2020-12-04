import java.util.Scanner;


public class ExerciseTwo_TwentyFour {
    /*
    (Largest and Smallest Integers) Write an application that reads five integers and determines
    and prints the largest and smallest integers in the group. Use only the programming techniques you
    learned in this chapter.
     */
    public static void main(String[] args){
        Scanner value = new Scanner (System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int largest;
        int smallest;

        //input from user

        System.out.print ("\nEnter Your First Number: ");
        num1= value.nextInt();
        System.out.print ("\nEnter Your Second Number: ");
        num2= value.nextInt();
        System.out.print ("\nEnter Your Third Number: ");
        num3= value.nextInt();
        System.out.print ("\nEnter Your Fourth Number: ");
        num4= value.nextInt();
        System.out.print ("\nEnter Your Fifth Number: ");
        num5= value.nextInt();
        System.out.print ("\nEnter Your Sixth Number: ");
        num6= value.nextInt();

// assume largest is the first number
        largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;
        if (num6 > largest) largest = num6;

// assume smallest is the first number
        smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;
        if (num6 < smallest) smallest = num6;

        System.out.printf ("\nLargest = %d\nSmallest = %d\n", largest, smallest);

    }

    }

