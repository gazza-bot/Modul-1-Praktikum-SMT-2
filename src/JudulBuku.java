public class JudulBuku {
    String judul;

    public JudulBuku() {
        this.judul = "Lorem ipsum";
    }

    public JudulBuku(String judulBuku) {
        this.judul = judulBuku;
    }

    void display() {
        System.out.println("Judul : " + this.judul);
    }
}
