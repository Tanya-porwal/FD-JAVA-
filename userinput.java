

import java.util.*;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int no = sc.nextInt();
        float price =sc.nextFloat();
        String names = sc.nextLine();
        
        System.out.println(name);
        System.out.println(names);
        System.out.println(no);
        System.out.println(price);

        sc.close();

    }
    
}
