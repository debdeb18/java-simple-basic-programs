public class ColorPoint extends Point{
    private String colors;

    public ColorPoint() {
        this(0, 0);
        setColor("BLACK");
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String colors) {
        this.colors =  colors;
    }

    public String toString() {
        String temp = colors + " color on (" + getX() + ", " + getY() + ")";
        return temp;
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // Set BLACK on (0, 0)
        System.out.println(zeroPoint.toString());
        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}
