import java.util.Scanner;
public class Example{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int a=sc.nextInt();
        System.out.print("enter second number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum :"+c);
    }
}