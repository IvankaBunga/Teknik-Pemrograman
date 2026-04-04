public class GenericsType<T> { //type parameter

    private T t; // nantinya variable T akan mengikuti tipe data yang diinisialisasikan

    // mengembalikan tipe T tidak perlu type casting lagi
    public T get() {
        return this.t;
    }

    // memasukkan nilai ke dalam variable
    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>(); // ini khusus untuk string (type safety)
        type.set("Java"); // valid
        // jika type.set(10), java otomatis memberikan error saat mengetik

        // menggunakan class generic tapi tidak menentukan tipe datanya
        GenericsType type1 = new GenericsType(); // raw type
        type1.set("Java"); // valid
        type1.set(10); // valid and autoboxing support
    }
}
