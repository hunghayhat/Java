public class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal () {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real1, double imaginary1){
        this.real += real1;
        this.imaginary += imaginary1;
    }

    public void subtract (double real1, double imaginary1){
        this.real -= real1;
        this.imaginary -= imaginary1;
    }

    public void add (ComplexNumber a){
        this.real += a.getReal();
        this.imaginary += a.getImaginary();
    }

    public void subtract (ComplexNumber a){
        this.real -= a.getReal();
        this.imaginary -= a.getImaginary();
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}