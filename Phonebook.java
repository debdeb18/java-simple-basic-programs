import java.util.Scanner;

public class Phonebook {
    public String find; 

    public Phonebook(String find) {
        this.find = find;
    }

    public void search(Phone[] p) {
        int i;
        for(i = 0; i < p.length; i++) {
            if(p[i].name.equals(find)) {
                p[i].show();
                return;
            }
        }
        System.out.println("Not found");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of persons: ");
        int num = sc.nextInt();
        Phone[] p = new Phone[num];

        Scanner sc1 = new Scanner(System.in);
        for(int i = 0; i < num; i++) {
            System.out.print("Input name & phone number >> ");
            String s = sc1.nextLine();
            String[] contact = s.split(" ");
            System.out.println("name "+contact[0]+" phone no >> "+contact[1]);
            p[i] = new Phone(contact[0], contact[1]);
        }

        System.out.println("Saved...");

        while(true){
            System.out.print("Search >> ");
            String str = sc1.next();

            if(str.equals("quit")) {
                break;
            }

            Phonebook mycontact = new Phonebook(str);
            mycontact.search(p);;
        }

        sc.close();
        sc1.close();
    }
}
