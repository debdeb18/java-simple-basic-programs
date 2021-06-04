import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Num15 {
    public int num;
    public ArrayList<Integer> numbers;

    public void set(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getNum(int i) {
        return numbers.get(i);
    }

    public static ArrayList<Integer> create_rand_arr(ArrayList<Integer> arr) {
        for(int i = 0; i < 100; i++)
        {
            arr.add(i+1);
        }
        Collections.shuffle(arr);
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Scanner scanner = new Scanner (System.in);

        System.out.print("Number of elements >> ");
        int n = scanner.nextInt();
        int k;

        if (n >= 100) {
            System.out.println("Number inputted is not less than 100");
            scanner.close();
        }
        else {

        Num15 m = new Num15();
        m.set(create_rand_arr(temp));
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            k = m.getNum(i);
            arr[i] = k;
        }

        for(int i = 0; i < arr.length;) {
            for(int j = 0; j < 10; j++) {
                if (i < arr.length) {
                System.out.print(arr[i]+" ");
                i++;
                } 
                else {
                    break;
                }
            }
            System.out.println();
        }
        
		scanner.close();
        }
    }
}
