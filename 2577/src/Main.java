import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;
        int sum;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        sum = num1 * num2 * num3;

        String str = Integer.toString(sum);

        int count [] = new int [15];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
        scanner.close();
    }
}