public class Num14 {
    int num;

    public Num14(int val) {
        num = val;
    }

    public void PrintAvg(int tot) {
        System.out.println("Avergae: "+ num/tot);
    }

    public static void main(String[] args) {
        int n, k = 0;
        Num14[] m = new Num14[10];
        for(int i = 0; i < 10; i++) {
            n = (int) (Math.random()*10 + 1);
            m[i] = new Num14(n);
        }

        System.out.print("Random numbers : ");
        for(int i = 0; i < m.length; i++) {
            System.out.print(m[i].num+" ");
            k = k + m[i].num;
        }
        System.out.println();

        Num14 sum = new Num14(k);
        sum.PrintAvg(m.length);
    }
}
