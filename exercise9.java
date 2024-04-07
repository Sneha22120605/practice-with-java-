import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first number:");
        int a = input.nextInt();
        System.out.print("Input your second number");
        int b = input.nextInt();
        int c = (b / a);
        System.out.println();
        System.out.println("Division between two number:" +c);
    }
}