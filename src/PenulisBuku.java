public class PenulisBuku {

    String namaPenulis;

    String namaSemua[];

    public PenulisBuku() {
        this.namaPenulis = null;
    }

    public PenulisBuku(String nama) {
        this.namaPenulis = nama;
    }

    public PenulisBuku(String[] nama) {
        this.namaSemua = new String[nama.length];
        System.arraycopy(nama, 0, this.namaSemua, 0, nama.length);
    }
    void display() {
        if(this.namaPenulis != null){
            System.out.println("Penulis : " + this.namaPenulis + "\n");
        }else if(this.namaSemua.length != 0){
            this.displayArr();
        }
    }
    void displayArr() {
        System.out.print("Penulis : ");
        for (int i = 0; i < namaSemua.length; i++) {
            System.out.print(namaSemua[i]);
            if (i < namaSemua.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
}