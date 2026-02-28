public class Rectangle extends Shape {
    private double width;
    private double length;

    // 1st Constructor: No-arg (default)
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // 2nd Constructor: Hanya width dan length
    public Rectangle(double width, double length) {
        super(); // Menggunakan default color dan filled dari Shape
        this.width = width;
        this.length = length;
    }

    // 3rd Constructor: Parameter lengkap
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Mengirim color dan filled ke constructor Shape
        this.width = width;
        this.length = length;
    }

    // Getter dan Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metode hitung Luas
    public double getArea() {
        return width * length;
    }

    // Metode hitung Keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString()
    @Override
    public String toString() {
        // super.toString() akan memanggil "A Shape with color of xxx and filled/Not filled"
        return "A Rectangle with width=" + width + " and length=" + length +
                ", which is a subclass of " + super.toString();
    }
}
