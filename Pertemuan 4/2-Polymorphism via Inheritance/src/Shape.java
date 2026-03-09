public abstract class Shape {
    protected String shapeName;

    // Constructor untuk memberi nama bentuk
    public Shape(String name) {
        shapeName = name;
    }

    // Method abstrak: setiap anak wajib punya cara hitung luas sendiri
    public abstract double area();

    // Mengembalikan nama bentuk saat diprint
    public String toString() {
        return shapeName;
    }
}