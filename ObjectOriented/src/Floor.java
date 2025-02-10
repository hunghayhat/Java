public class Floor {
    private double width, length;


    public Floor (double length, double width) {
        if (length < 0) length = 0;
        else this.length = length;
        if (width < 0) width = 0;
        else this.width = width;
        
    }

    public double getArea () {
        return width * length;
    }
}