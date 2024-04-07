import java.util.Scanner;

class exercise20{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius of the circle:");
        double radius = input.nextDouble();
        System.out.println("Perimeter is :" + (2 * radius * Math.PI));
        System.out.println("Area is " + (radius * radius * Math.PI));
    }
}