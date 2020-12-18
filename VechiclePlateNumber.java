/*....Progarm to display a  VehiclePlateNumber...*/
public class VechiclePlateNumber {
    public static void main(String[] args){
    // generate three random uppercase letter
        int firstLetter = 65+ (int)(Math.random() * 20);
        int secondLetter = 65+ (int)(Math.random() * 20);
        int thirdLetter = 65+ (int)(Math.random() * 20);

        //generate four random VehiclePlateNumber
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);
        int num4 = (int) (Math.random() * 10);

        // Display vechice number to user
        System.out.println("NGN " + (char)firstLetter  +  (char)secondLetter  +  (char)thirdLetter + num1 + num2 + num3 + num4 );
        System.out.println("ABJ " + num1 + num2 + num3 + num4+ (char)firstLetter + (char)secondLetter + (char)thirdLetter);
        System.out.println("" + (char)firstLetter + num1 + num2 + (char)secondLetter + (char)thirdLetter + num3 + num4);


    }
}