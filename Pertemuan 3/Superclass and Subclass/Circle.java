public class Circle extends Shape {
    private double radius;

    // 1st Constructor: No-arg
    public Circle() {
        super(); // Memanggil constructor Shape()
        this.radius = 1.0;
    }

    // 2nd Constructor: Radius saja
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // 3rd Constructor: Radius, Color, dan Filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor Shape(color, filled)
        this.radius = radius;
    }

    // Getter dan Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode hitung Luas
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Metode hitung Keliling
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString()
    @Override
    public String toString() {
        // yyy adalah super.toString()
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
