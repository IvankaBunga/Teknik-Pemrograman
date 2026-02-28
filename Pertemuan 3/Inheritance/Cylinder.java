public class Cylinder extends Circle {
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(radius)
        this.height = height;
    }

    // Constructor with given radius, color, and height
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder

    // Di dalam class Cylinder
    @Override // membantu pembacaan kode dan lebih aman jika ada salah tulis nama method
    public double getArea() {
        // super.getArea() mengambil hasil dari class Circle (Luas Alas)
        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
    }

    public double getVolume() {
        // Memaksa Java memakai getArea milik class Circle, bukan milik class Cylinder
        return super.getArea() * height;
    }

    @Override // menggantikan/mengubah method toString() pada class circle
    public String toString() { // di dalam kelas Cylinder
        return "Cylinder: subclass of " + super.toString() // menggunakan toString() milik Circle
                + " height=" + height;
    }

}
