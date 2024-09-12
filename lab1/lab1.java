package lab1;

import java.util.Random;
import java.util.*;

//вариант 1

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      System.out.println("Enter your name: ");
//      String name = sc.next();
//      System.out.println("Hello "+name);
//

//      number 2
//      System.out.println("Enter some words: ");
//      String str = sc.nextLine();
//      for (int i = str.length() - 1; i >= 0; i--) {
//          System.out.print(str.charAt(i) + " ");
//      }


//        number 3
//        System.out.println("Enter some numbers: ");
//        int n = sc.nextInt();
//        Random rand = new Random();
//
//        for(int i = 0; i < n; i++){
//            System.out.print(rand.nextInt(100) + " ");
//        }

        //number 4
//        System.out.println("Enter your password: ");
//        String password = sc.nextLine();
//        String truePassword = "somePassword";
//
//        if(password.equals(truePassword))
//            System.out.println("Your password is correct");
//        else
//            System.out.println("Your password is incorrect");
//

        //number 5
//        System.out.println("Enter the number : ");
//        int num = sc.nextInt();
//        int sum = 0;
//        int mult = 1;
//
//        while (num != 0) {
//            sum += num % 10;
//            mult *= num % 10;
//            num /= 10;
//        }
//
//        System.out.println("The sum is : "+sum + "\n" + "The mult is : "+mult);

        //System.out.println("Баханов Владимир, 12.09.24, 14.09.24");


//Вариант 2
        Random rand = new Random();

        System.out.println("Введите количество элементов:");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000);
        }

        int min = array[0];
        int max = array[0];

        List<Integer> divisionOn3Or9 = new ArrayList<>();
        List<Integer> divisionOn5And7 = new ArrayList<>();

        System.out.println("Четные и нечетные числа:");
        for (int i = 0; i < n; i++) {

            if (array[i] % 2 == 0) {
                System.out.println("array[" + i + "] = " + array[i] + " - Четное число");
            } else {
                System.out.println("array[" + i + "] = " + array[i] + " - Нечетное число");
            }

            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }

            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                divisionOn3Or9.add(array[i]);
            }

            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                divisionOn5And7.add(array[i]);
            }
        }

        System.out.println("\nМаксимальный элемент в массиве: " + max);
        System.out.println("Минимальный элемент в массиве: " + min);

        System.out.println("\nЧисла, которые делятся на 3 или на 9:");
        for (int num : divisionOn3Or9) {
            System.out.println(num);
        }

        System.out.println("\nЧисла, которые делятся на 5 и на 7:");
        for (int num : divisionOn5And7) {
            System.out.println(num);
        }

        System.out.println("\nВсе трехзначные числа, в десятичной записи которых нет одинаковых цифр:");
        for (int i = 0; i < n; i++) {
            if ((array[i] >= 100 && array[i] <= 999)
                    && (array[i] / 100 != (array[i] / 10) % 10
                    && (array[i] / 10) % 10 != array[i] % 10
                    && array[i] % 10 != array[i] / 100))
            {
                System.out.println(array[i]);
            }
        }

        System.out.println("Простые числа:");
        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            if (array[i] <= 1) continue;
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(array[i]);
            }
        }

        Arrays.sort(array);
        System.out.println("Числа в порядке возрастания: " + Arrays.toString(array));
        System.out.println("Числа в порядке убывания: " + Arrays.toString(Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray()));

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }
        System.out.println("Числа в порядке убывания частоты встречаемости:");
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " раз"));

        System.out.println("Счастливые числа:");
        for (int i = 0; i < n; i++) {
            String numStr = String.valueOf(array[i]);
            if (numStr.length() % 2 == 0) {
                int halfLength = numStr.length() / 2;
                int firstHalf = 0, secondHalf = 0;
                for (int j = 0; j < halfLength; j++) {
                    firstHalf += numStr.charAt(j) - '0';
                    secondHalf += numStr.charAt(j + halfLength) - '0';
                }
                if (firstHalf == secondHalf) {
                    System.out.println(array[i]);
                }
            }
        }

        System.out.println("Числа-палиндромы:");
        for (int i = 0; i < n; i++) {
            String numStr = String.valueOf(array[i]);
            if (new StringBuilder(numStr).reverse().toString().equals(numStr)) {
                System.out.println(array[i]);
            }
        }

        sc.close();



    }
}

