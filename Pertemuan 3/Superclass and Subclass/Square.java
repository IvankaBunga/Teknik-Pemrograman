public class Square extends Rectangle {

    // 1. Constructor No-arg
    public Square() {
        super(); // Memanggil Rectangle() default (1.0, 1.0)
    }

    // 2. Constructor side saja
    public Square(double side) {
        super(side, side); // Memastikan width = length
    }

    // 3. Constructor Lengkap (Penting: samakan urutan dengan Rectangle)
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter side
    public double getSide() {
        return getWidth();
    }

    // Setter side: Pusat kontrol geometri Square
    public void setSide(double side) {
        // Menggunakan super untuk langsung mengubah field di Rectangle
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side); // Memaksa length ikut berubah
    }

    @Override
    public void setLength(double side) {
        setSide(side); // Memaksa width ikut berubah
    }

    @Override
    public String toString() {
        // super.toString() akan menghasilkan output Rectangle
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
