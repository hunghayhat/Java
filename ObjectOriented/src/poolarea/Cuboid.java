package poolarea;

public class Cuboid extends Rectangle {
    final double height;

    public Cuboid (double length, double width, double height) {
        super(width, length);
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    public double getHeight () {
        return this.height;
    }

    public double getVolume () {
        return getArea() * height;
    }
}
