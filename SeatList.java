public class SeatList {
    private String name;
    //private int seatno;

    public SeatList(int n) {
        this.name = "-" + String.valueOf(n) + "-";
        //this.seatno = n;
    }

    public void set(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.print(name);
    }
    
}
