import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        double num = input.nextDouble();

        boolean By2 = num % 2 == 0;
        boolean By3 = num % 3 == 0;
        boolean By5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2 " + By2);
        System.out.println(num + " is divisible by 3 " + By3);
        System.out.println(num + " is divisible by 5 " + By5);


    }
}
