package lab1;

import java.util.Scanner;

public class A2 {
    public static void a2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words: ");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
