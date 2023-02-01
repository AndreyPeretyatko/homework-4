import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Ellipse(3, 5, 0, 0);
        figures[1] = new Rectangle(4, 2, 1, 2);
        figures[2] = new Square(4, 1, 2);
        figures[3] = new Circle(2, 3, 3);

        printFiguresArray(figures);
        System.out.println("=======================");

        changeCoordinateOfMovableFigures(figures);
        printFiguresArray(figures);
    }

    private static void changeCoordinateOfMovableFigures(Figure[] figures) {
        int randomX = new Random().nextInt(5);
        int randomY = new Random().nextInt(5);

        for (Figure figure: figures) {
            if (figure instanceof Movable) {
                ((Movable) figure).move(randomX, randomY);
            }
        }
    }

    public static void printFiguresArray(Figure[] figures) {
        for (Figure figure: figures) {
            figure.printPerimeter();
            if (figure instanceof Movable) {
                ((Movable) figure).printCoordinate();
            }
        }
    }
}
