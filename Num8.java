import java.util.Scanner;

public class Num8 {
    public double x, y, rad;

    public Num8(double a, double b, double c){
        x = a;
        y = b;
        rad = c;
    }

    public void PrintResult(Num8 pt) {
        double distance = (x - pt.x) * (x - pt.x) + (y - pt.y) * (y - pt.y);
        double radSum = (rad + pt.rad) * (rad + pt.rad);
        if (distance < radSum) {
            System.out.println("Two circles are overlapped");
        } else {
            System.out.println("Two circles are not overlapped");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Input center and radius of 1st circle >> ");
		Num8 pt = new Num8(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

		System.out.print("Input center and radius of 2nd circle >> ");
		Num8 pt1 = new Num8(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        pt1.PrintResult(pt);
		scanner.close();
    }
}