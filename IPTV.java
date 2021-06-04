public class IPTV extends ColorTV{
    private String IP;

    public IPTV(String IP, int size, int colors) {
        super(size, colors);
        this.IP = IP;
    }

    public void printProperty(){
        System.out.println("My IPTV is "+getSize()+" inches, "+getColors()+" colors and IP address is "+IP);
    }

    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 64, 2047);
        // 192.1.1.2 is IP address
        myTV.printProperty();
        }
    
}
