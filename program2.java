import java.util.Scanner;
public class program2 {
    public static void main(String[] args){
        int ch,op1,op2;
        char choice;
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("1.add");
            System.out.println("2.sub");
            System.out.println("enter values op1 & op2");
            op1=s.nextInt();
            op2=s.nextInt();
            System.out.println("enter choice 1.add & 2.sub");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:System.out.println("operation is add and the result is " + (op1+op2));
                break;
                case 2:System.out.println("operation is sub and the result is" + (op1-op2));
                break;
                default: System.out.println("enter 1 or 2");
            }
            System.out.println("enter y or Y to continue");
            choice=s.next().charAt(0);

        }
        while(choice=='Y'||choice=='y');
        System.out.println("program terminated");
    }
}
