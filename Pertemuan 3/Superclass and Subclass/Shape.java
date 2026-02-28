public class Shape {
    // Dua variabel instans
    private String color;
    private boolean filled;

    // No-arg constructor
    public Shape() {
        this.color = "blue";
        this.filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters dan Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Konvensi khusus boolean: isFilled() bukan getFilled()
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString()
    @Override
    public String toString() {
        String status = filled ? "filled" : "Not filled";
        return "A Shape with color of " + color + " and " + status;
    }
}
