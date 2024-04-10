import java.util.Scanner;

class exercise30{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = in.nextInt();

        System.out.println("Enter your second number:");
        int num2 = in.nextInt();

        System.out.println("Enter your third number:");
        int num3 = in.nextInt();

        if ( num1 > num2)
        if ( num1 > num3)
        System.out.println("The greatest number:" + num1);

        if ( num2 > num1)
        if ( num2 > num3)
        System.out.println("The greatest number:" + num2);

        if ( num3 > num1)
        if ( num3 > num2)
        System.out.println("The greatest number:" + num3);


    }
}