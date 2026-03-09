public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle"); // Memberi nama ke induk
        length = l;
        width = w;
    }

    @Override
    public double area() {
        return length * width; // Luas = panjang x lebar
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}