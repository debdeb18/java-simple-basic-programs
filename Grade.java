import java.util.Scanner;

public class Grade {
    public int math, science, english, average;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        int sum = math + science + english;
        return sum/3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input scores in order of Math., Science and English >> ");

        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Grade me = new Grade(math, science, english);
        System.out.println("Average : "+ me.average());
        scanner.close();
    }
}
