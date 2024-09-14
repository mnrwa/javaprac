package lab1;

import java.util.Random;
import java.util.Scanner;

public class A3 {
    public static void a3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter some numbers: ");
        int n = sc.nextInt();
        Random rand = new Random();

        for(int i = 0; i < n; i++){
            int k = rand.nextInt(100);
            System.out.print(k + " ");
            //System.out.println(k + " ");
        }
    }
}
