public class Circle extends Ellipse implements Movable {
    public Circle() {
    }

    public Circle(int r1) {
        super(r1, r1);
    }

    public Circle(int r1, int x, int y) {
        super(r1, r1, x, y);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр круга равен " + String.format("%.1f", this.getPerimeter())
                + ".");
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    @Override
    public void printCoordinate() {
        System.out.println("Координаты круга: х - " + this.getX() +
                ",y - " + this.getY() + ".");
    }
}
