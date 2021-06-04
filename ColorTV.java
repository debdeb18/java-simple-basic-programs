public class ColorTV extends TV {
    private int colors;

    public ColorTV(int size, int colors) {
        super(size);
        this.colors = colors;
    }

    public void printProperty() {
        System.out.println("My IPTV is "+getSize()+" inches, "+colors+" colors");
    }

    public int getColors() {
        return colors;
    }
    
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(64, 1024);
        myTV.printProperty();
        }
}