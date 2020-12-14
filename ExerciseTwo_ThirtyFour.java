import java.util.Scanner;

public class ExerciseTwo_ThirtyFour {
    /*2.34 (World Population Growth Calculator) Use the web to determine the current world population and the annual world population growth rate.
    Write an application that inputs these values,then displays the estimated world population after one, two, three, four and five years.*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       /*
         current world population =76,841,564;
         annual world population growth rate = 100;
        */

        long CurrentPopulation;
        float PopulationGrowthRate;
        long yearOne;
        long yearTwo;
        long yearThree;
        long yearFour;
        long yearFive;


        System.out.print("Enter Current World Population: ");
        CurrentPopulation = input.nextLong();

        System.out.print("Enter Annual World Population Growth Rate(in percent): ");
        PopulationGrowthRate = input.nextFloat();
        PopulationGrowthRate = PopulationGrowthRate/ 100;

        // Calculation for one year
        yearOne = (long) (CurrentPopulation + ( CurrentPopulation * PopulationGrowthRate ));
        System.out.printf( "\nWorld Population Growth  after one year: %d\n", yearOne );

        CurrentPopulation = yearOne;


        // Calculation for two year

        yearTwo = (long)  (CurrentPopulation + ( CurrentPopulation * PopulationGrowthRate ));
        System.out.printf( "\nWorld Population Growth  after two years: %d\n", yearTwo );

        CurrentPopulation = yearTwo;

        // Calculation for three year
        yearThree = (long)  (CurrentPopulation + ( CurrentPopulation * PopulationGrowthRate ));
        System.out.printf( "\nWorld Population Growth  after three years: %d\n", yearThree );

        CurrentPopulation = yearThree;


        // Calculation for four year
        yearFour = (long)  (CurrentPopulation + ( CurrentPopulation * PopulationGrowthRate ));
        System.out.printf( "\nWorld Population Growth  after Four years: %d\n", yearFour );

        CurrentPopulation = yearFour;

        // Calculation for four year
        yearFive = (long)  (CurrentPopulation + ( CurrentPopulation * PopulationGrowthRate ));
        System.out.printf( "\nWorld Population Growth  after Five years: %d\n", yearFive );

        CurrentPopulation = yearFive;










    }
}
