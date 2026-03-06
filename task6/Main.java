package task6;

public class Main {
    public static void main(String[] args) {
        Movable[] shapes = new Movable[3];
        shapes[0] = new Point(0, 0);
        shapes[1] = new Segment(new Point(1, 1), new Point(2, 2));
        shapes[2] = new Circle(new Point(5, 5), 10);

        System.out.println("Before movement:");
        printShapes(shapes);

        // Move everything Up and Right
        moveAll(shapes, "up");
        moveAll(shapes, "right");

        System.out.println("\nAfter moving Up and Right:");
        printShapes(shapes);
    }

    public static void moveAll(Movable[] items, String direction) {
        for (Movable item : items) {
            switch (direction.toLowerCase()) {
                case "up" -> item.moveUp();
                case "down" -> item.moveDown();
                case "left" -> item.moveLeft();
                case "right" -> item.moveRight();
            }
        }
    }

    public static void printShapes(Movable[] items) {
        for (Movable item : items) {
            System.out.println(item);
        }
    }
}
