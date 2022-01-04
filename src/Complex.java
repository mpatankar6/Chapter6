public class Complex {

    private double real;
    private double imaginary;

    public Complex(double a) {
        this(a, 0d);
    }

    public Complex(double a, double b) {
        this.real = a;
        this.imaginary = b;
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public Complex add(Complex other) {
        double a = this.real + other.real;
        double b = this.imaginary + other.imaginary;
        return new Complex(a, b);
    }

    public Complex add(double real, double imaginary) {
        double a = this.real + real;
        double b = this.imaginary + imaginary;
        return new Complex(a, b);
    }

    public Complex multiply(Complex other) {
        double a = (this.real * other.real) - (this.imaginary * other.imaginary);
        double b = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(a, b);
    }

    public Complex multiply(double real, double imaginary) {
        double a = (this.real * real) - (this.imaginary * imaginary);
        double b = (this.real * imaginary) + (this.imaginary * real);
        return new Complex(a, b);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1);
        Complex c2 = new Complex(1, 4);
        Complex c3 = new Complex(2, 3);
        Complex c4 = new Complex(5, 6);
        Complex c5 = new Complex(0, 4);
        Complex c6 = new Complex(0, 0);

        System.out.println(c2.abs());
        System.out.println(c1.add(c2));
        System.out.println(c2.add(3, 5));
        System.out.println(c4.multiply(c5));
        System.out.println(c3.multiply(2, 3));

    }
}
