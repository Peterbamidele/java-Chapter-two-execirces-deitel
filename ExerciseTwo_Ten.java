import java.util.Scanner;
public class ExerciseTwo_Ten {
    /*
    Assuming that x = 2 and y = 3 , what does each of the following statements display?
    a) System.out.printf("x = %d%n", x);
    b) System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
    c) System.out.printf("x =");
    d) System.out.printf("%d = %d%n", (x + y), (y + x));*/

    public static void main(String[] args){
        int x = 2;
        int y = 3;
        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x = ");
        System.out.println("\n");
        System.out.printf("%d = %d%n", (x + y), (y + x));


    }

}
