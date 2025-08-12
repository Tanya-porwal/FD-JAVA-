import java.util.*;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int a = sc.nextInt();
        System.out.println("Enter an other no ");
        int b = sc.nextInt();
        System.out.println("The sum of two no." + a + " and " + b + " is" + a+b );

        System.out.println("Enter a string");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter a Float");
        float price =sc.nextFloat();
        System.out.println(price);

        sc.close();

    }
    
}

