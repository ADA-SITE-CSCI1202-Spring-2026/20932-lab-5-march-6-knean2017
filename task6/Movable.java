package task6;

//Movable interface
// a. Define an interface Movable with four methods:
// i. moveUp
// ii. moveDown
// iii. moveLeft
// iv. moveRight
// b. Take the Point class and implement Movable interface so that any object of the point
// can be moved to al four directions on a 2D coordinate system.
// c. Apply the same to Segment class.
// d. Define a Circle class which is represented by the center point and a radius.
// i. Make Circle implement Movable.
// e. Test the added behavior.
// f. Create an array consisting of a mixture of Points, Segments, Circles in a Main class.
// g. Write a method that will take that array as input and move all of them to any directio

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

