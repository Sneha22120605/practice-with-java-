import java.util.Scanner;

public class exercise29{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input value:");
        double input = in.nextDouble();

        if(input > 0)
        {
            if( input < 1)
            {
                System.out.println("Positive small number");
            }
            else if ( input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if ( input < 0)
        {
            if(Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if(Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negtive number");
            }
        }
        else
        {
            System.out.println("zero");
        }
    }
}