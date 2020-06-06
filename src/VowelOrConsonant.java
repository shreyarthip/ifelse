import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println("Please Enter any alphabet");
        ch = scanner.next().charAt(0);

        // Print out vowel
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
            System.out.println("This alphabet is vowel");
        }
        // Print out consonant
        else {
            System.out.println("This alphabet is consonant");
        }
    }
}









