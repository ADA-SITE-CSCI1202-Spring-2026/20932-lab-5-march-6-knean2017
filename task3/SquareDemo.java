package task3;

import task2.Rectangle;

public class SquareDemo {
    public static void main(String[] args) {
        Object s1 = new Rectangle(5, 10);
        Object s2 = new Rectangle(15, 10);        
        Object s3 = new Square(15);

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s2 equals s3: " + s2.equals(s3));
    }
}
