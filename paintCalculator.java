import java.util.Scanner;
/*Assume that a gallon of plant of paint cover about 350 square feet of well space. Create an application
* with a main() method that prompt the user for the length, width, and height of a rectangular
 room.pass these three value to a method that does the following:
 * Calculate the wall area for a room
 * Passes the calculated wall area to another method that calculate and return the number of the gallon of paint need
 * Display the number of gallon needed
 * Compute the price based on paint price of $32 per gallon, assuming that the pointer can buy away fraction of a gallon of paint of the same price as a whole gallon
 * Return the price to the main()method */

            // Solution in  Pseudocode
    /*
     ask for length
     ask for width
     ask for height

     wall area = (length * height * 2) + (length 2 * height * 2)
     2. Number of Gallons = wallAArea/ 350;
     3. total = Number of Gallons

     The main() method display the final price. for example, the cost to paint a 15 by 20 foot
      with 10 foot celling $64.save the application as paintCalculator.java*/

public class paintCalculator {

    double height;
    double length1;
    double length2;


    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Ask user for input of length, width, height.
        System.out.print("Enter room Height: ");
        double height = input.nextDouble();

        System.out.print("Enter wall length: ");
        double length1  = input.nextDouble();

        System.out.print("Enter adjacent wall length:  ");
        double length2 = input.nextDouble();

         double cost = CalculateArea(height, length1,  length2);
        System.out.println("You total cost at $32/gallon is " + cost);

            }



       /*
       double wallArea = (length1 * height * 2) + (length2 * height * 2);
        double numofGals = wallArea/350;
        double TotalPrice = numofGals * 32;*/

    private static double CalculateArea(double height, double length1, double length2) {
        double wallArea = (length1 * height * 2) + (length2 * height * 2);
        System.out.println("You room has a wall area of " + wallArea);
        double gallonsNeeded = CalculateGallons(wallArea);
        System.out.println(gallonsNeeded + " gallons are needed to the room");
        double TotalPrice = gallonsNeeded * 32;
        return TotalPrice;
    }


    private static double CalculateGallons(double wallArea) {
        double numofGals = wallArea/350;
        return numofGals;
    }
}
