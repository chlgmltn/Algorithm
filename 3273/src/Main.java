import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            set.add(num);
        }

        int x = in.nextInt();
        int count = 0;

        for (int i : set) {
            if (set.contains(x - i)) {
                count++;  // ✅ 유효한 쌍을 찾았으므로 count 증가
            }
        }

        count/=2;

        System.out.println(count);
        in.close();
    }
}