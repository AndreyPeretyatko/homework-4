public class Square extends Rectangle implements Movable {

    public Square(int sideA ) { super(sideA, sideA); }

    public Square(int sideA, int x, int y ) {
        super(x, y, sideA, sideA);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.getSideA();
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр квадрата равен " + this.getPerimeter() + ".");
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    @Override
    public void printCoordinate() {
        System.out.println("Координаты квадрата: х - " + this.getX() +
                ",y - " + this.getY() + ".");
    }
}
