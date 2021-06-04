import java.util.Scanner;

public class Num10 {
    public double num1, num2;
    public String op;

    public Num10(String[] s){
        num1 = Double.parseDouble(s[0]);
        num2 = Double.parseDouble(s[2]);
        op = s[1];
    }

    public double Calc() {
        double result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException();
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                break;
        }
        return result;
    }

    public void PrintResult(double result) {
        System.out.println(num1+" "+op+" "+num2+" = "+result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter >> ");
        String s = scanner.nextLine();
        String[] input = s.split(" ");

		Num10 prob = new Num10(input);

        try {
            prob.PrintResult(prob.Calc());
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by 0 error");
        }
		scanner.close();
    }
}