public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point newPoint) {
        return Math.sqrt((x - newPoint.getX()) * (x - newPoint.getX()) + (y - newPoint.getY()) * (y - newPoint.getY()));
    }

    public double distance(int a, int b) {
        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}