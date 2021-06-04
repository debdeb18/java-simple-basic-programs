import java.util.Scanner;

public class Num18 {
    public String name;

    public Num18(String name) {
        this.name = name;
    }

    public void PrintScore(String[] course, int[] score) {
        int i;
        for(i = 0; i < 5; i++) {
            if(course[i].equals(name)) {
                System.out.println(score[i]);
                return;
            }
        }
        System.out.println("Invalid subject");
        return;
    }

    public static void main(String[] args) throws Exception {
        String course[] = {"Java", "c++", "HTML", "Kotlin", "Python"};
        int score[] = {95, 88, 76, 62, 55};
        Num18 x1;
        Scanner scanner = new Scanner (System.in);

        while(true) {
		    System.out.print("Subject >> ");
		    String s = scanner.next();

            if(s.equals("Quit")) {
                break;
            }

            x1 = new Num18(s);
            x1.PrintScore(course, score);
        }

		scanner.close();
    }
}