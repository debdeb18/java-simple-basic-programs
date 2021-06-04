import java.util.Scanner;

public class Num13 {
    int num;

    public Num13(int val) {
        num = val;
    }

    public void PrintMultiple3() {
        if ((num % 3) == 0) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Input 10 positive integers >> ");
        Num13[] m = new Num13[10];
        for(int i = 0; i < 10; i++) {
            m[i] = new Num13(scanner.nextInt());
        }

        System.out.print("Multiples of 3 : ");
        for(int i = 0; i < m.length; i++) {
            m[i].PrintMultiple3();
        }
        System.out.println();
		scanner.close();
    }
}
