package task2;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        return (this.width == r.width && this.height == r.height);
    }
}
