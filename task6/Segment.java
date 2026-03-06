package task6;

class Segment implements Movable {
    private Point start, end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void moveUp() { start.moveUp(); end.moveUp(); }
    @Override
    public void moveDown() { start.moveDown(); end.moveDown(); }
    @Override
    public void moveLeft() { start.moveLeft(); end.moveLeft(); }
    @Override
    public void moveRight() { start.moveRight(); end.moveRight(); }

    @Override
    public String toString() {
        return "Segment from " + start + " to " + end;
    }
}
