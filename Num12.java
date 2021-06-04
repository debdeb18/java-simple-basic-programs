import java.util.Scanner;

public class Num12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
		System.out.print("Input a lowercase alphabet >> ");
		String input = scanner.next();
        char c = input.charAt(0);
		
		PrintAlphabet(c);
		
		scanner.close();
    }

    public static void PrintAlphabet(char input) {
        int num = (int)input - 96;
        int i, j, k;
        for (i = num; i > 0; i--) {
            for (j = 0; j < i; j++) {
                k = j + 97;
                System.out.print((char)k);
            }
            System.out.println();
        } 
    }
}