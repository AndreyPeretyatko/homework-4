public class Ellipse extends Figure {

    public static double PI = Math.PI;
    private int r1;
    private int r2;

    public Ellipse() {}

    public Ellipse(int r1, int r2) {
        super(r1, r2);
    }

    public Ellipse(int r1, int r2, int x, int y) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = Math.max(r1, 0);
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = Math.max(r2, 0);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI *
                Math.pow(
                        ((Math.pow(r1,2) + Math.pow(r2,2)
                        ) / 2), 0.5);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр эллипса равен " + String.format("%.1f", this.getPerimeter()));
    }
}
