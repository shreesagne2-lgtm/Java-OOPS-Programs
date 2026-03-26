import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);

        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        System.out.println("Total number of words: " + count);
    }
}