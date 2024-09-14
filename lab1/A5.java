package lab1;

import java.util.Scanner;

public class A5 {
    public void a5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        int mult = 1;

        while (num != 0) {
            sum += num % 10;
            mult *= num % 10;
            num /= 10;
        }
        System.out.println("The sum is : "+sum + "\n" + "The mult is : "+mult);
    }
}
