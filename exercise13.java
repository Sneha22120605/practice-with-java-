import java.util.Scanner;

class exercise13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;
        System.out.printf("Sum = %d\n Sub =%d\n Multiply = %d\n Division = %d\n", sum,sub,mult,div,rem);
    }

}
