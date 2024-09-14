package lab1;

import java.util.Scanner;

public class A4 {
    public void a4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        String truePassword = "somePassword";

        if(password.equals(truePassword))
            System.out.println("Your password is correct");
        else
            System.out.println("Your password is incorrect");
    }
}
