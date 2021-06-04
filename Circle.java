class Circle {
    private double x, y;
    private int radius;
    
    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("Biggest circle info is ("+x+", "+y+") r = "+radius);
    }

    public int getRad(){
        return radius;
    }
}
