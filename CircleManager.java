import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Circle c[] = new Circle[3];
    
    for(int i=0;i< c.length; i++) {
        System.out.print("x, y, radius >> ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int radius = sc.nextInt();
        c[i] = new Circle(x, y, radius);
    }

    int temp = 0;
    int stack = -1;
    for(int i=0;i<c.length;i++) {
        if(c[i].getRad() > temp) {
            temp = c[i].getRad();
            stack = i;
        }
    } 
    
    c[stack].show();
    sc.close();
    }
}