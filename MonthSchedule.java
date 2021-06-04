import java.util.Scanner;

public class MonthSchedule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day[] d = new Day[31];

        //initialize array of Day
        for(int i=0;i< d.length; i++) {
            d[i] = new Day();
        }

        System.out.println("Monthly schedule management system");

        while(true) {             
        System.out.print("Todo (Input:1, Show:2, Quit:3) >> ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Date(1-30) : ");
            int day = sc.nextInt();
            System.out.print("Todo (Enter string without space) ? ");
            String todo = sc.next();
            d[day].set(todo);
        } else if (n == 2) {
            System.out.print("Date(1-30) : ");
            int day = sc.nextInt();
            d[day].show();
        } else if (n == 3) {
            break;
        } else {
            System.out.println("Invalid input");
        }

        }

        sc.close();
    }
}
