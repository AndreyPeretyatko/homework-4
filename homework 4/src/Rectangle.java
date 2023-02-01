public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(int sideA, int sideB, int x, int y) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = Math.max(sideA, 0);
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = Math.max(sideB, 0);
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getSideA() + this.getSideB());
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр прямоугольника равен " + this.getPerimeter() + ".");
    }
}
