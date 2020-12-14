import java.util.Scanner;

public class ExerciseTwo_ThirtyFive {
    /*
    * 2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
that calculates your daily driving cost, so that you can estimate how much money could be saved by
car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic
congestion. The application should input the following information and display the user’s cost per
day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day
* */
    public static void main(String[] args){
        int dailyDrivingCost;
        int gasolineCost;
        int milesPerGallon;
        int tolls;
        int parkingFees;
        int totalMiles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Total miles driven per day: ");
        totalMiles = input.nextInt();

        System.out.print("Enter Cost per gallon of gasoline: #");
        gasolineCost = input.nextInt();

        System.out.print("Enter Average miles per gallon: ");
        milesPerGallon = input.nextInt();

        System.out.print("Enter Parking fees per day: #");
        parkingFees = input.nextInt();

        System.out.print("Enter Tolls per day: #");
        tolls = input.nextInt();

        dailyDrivingCost = (totalMiles / milesPerGallon) * gasolineCost + parkingFees + tolls;

        System.out.printf("application that calculates your daily driving cost: %d\n", dailyDrivingCost);






    }
}
