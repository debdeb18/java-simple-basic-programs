import java.util.Scanner;

public class Reservation {
    public String person;
    public int seat;
    public char classSeat;

    public Reservation() {
        this.person = null;
        this.seat = 0;
    };

    public Reservation(String person, int seat) {
        this.person = person;
        this.seat = seat;
    }

    public void printMenu() {
        System.out.print("1 : Reservation \n2 : Status \n3 : Cancel \n4 : Quit \n>>> ");
    }

    public void printStatus(SeatList[]A, SeatList[]B, SeatList[]S) {
        print(S, 'S');
        print(A, 'A');
        print(B, 'B');
    }

    public void print(SeatList[] x, char z){
        System.out.print("Class "+z+" >> ");
        for(int i = 0; i < x.length; i++) {
            x[i].show();
        }
        System.out.println();
    }

    public static void initialize(SeatList[] x) {
        for (int i = 0; i < 10; i++) {
            x[i] = new SeatList(i + 1);
        }
    }

    public boolean reserve1(SeatList[] x, char z, Scanner sc) {
        System.out.print("Name >> ");
        String temps = sc.next();

        System.out.print("Seat number >> ");
        int tempi = sc.nextInt();
        
        if (tempi < 1 || tempi > 10) {
            System.out.println("Invalid seat number");
            return false;
        }
        person = temps;
        seat = tempi;

        x[seat - 1].set(person);
        System.out.println(z+" class seat number #"+seat+" reserved for "+person+" \n");
        return true;
    }

    public boolean reserve(SeatList[]A, SeatList[]B, SeatList[]S, Scanner sc) {
        System.out.print("Class S(1), A(2), B(3) >> ");
        int input = sc.nextInt();
        boolean ret = false;

        switch (input) {
            case 1:
                print(S, 'S');
                while(ret == false) {
                ret = reserve1(S, 'S', sc);
                }
                break;
            case 2:
                print(A, 'A');
                while(ret == false) {
                    ret = reserve1(A, 'A', sc);
                }
                break;
            case 3:
                print(B, 'B');
                while(ret == false) {
                    ret = reserve1(B, 'B', sc);
                }
                break;
            default:
                System.out.println("Invalid class seat");
                return false;
        }
        return true;
    }

    public void search(SeatList[] x, char z, Scanner sc) {
        System.out.print("Name >> ");
        String temps = sc.next();

        int i;
        for(i = 0; i < x.length; i++) {
            String temp = x[i].getName();
            if(temp.equals(temps)) {
                x[i] = new SeatList(i + 1);
                System.out.println("Reservation for "+temp+", Class "+z+" #"+(i + 1)+" cancelled.\n");
                return;
            }
        }
        System.out.println("Not found");
        return;
    }

    public boolean cancel(SeatList[]A, SeatList[]B, SeatList[]S, Scanner sc) {
        System.out.print("Class S(1), A(2), B(3) >> ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                search(S, 'S', sc);
                break;
            case 2:
                search(A, 'A', sc);
                break;
            case 3:
                search(B, 'B', sc);
                break;
            default:
                System.out.println("Invalid class seat");
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SeatList[] A = new SeatList[10];
        SeatList[] B = new SeatList[10];
        SeatList[] S = new SeatList[10];
        initialize(A);
        initialize(B);
        initialize(S);
        Reservation now = new Reservation();

        System.out.println("DK Concert hall reservation system");

        while(true) {
        now.printMenu();
        int choice = sc.nextInt();

        if(choice == 1) {
                boolean ret = false;
                while(ret == false) {
                    ret = now.reserve(A, B, S, sc);
                }
        } else if(choice == 2) {
                now.printStatus(A, B, S);
        } else if(choice == 3) {
                now.cancel(A, B, S, sc);
        } else if(choice == 4) {
                break;
        } else {
            System.out.println("Invalid input");
        }//if

        }//while loop

        sc.close();
    }
}
