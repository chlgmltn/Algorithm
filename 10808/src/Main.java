import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;

        Scanner scanner = new Scanner(System.in);
        word=scanner.nextLine();

        int count [] = new int [26];

        for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
        }

        for(int i= 0; i<count.length; i++){
            System.out.print(count[i]+" ");
        }

        scanner.close();
    }
}