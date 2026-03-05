import java.util.Scanner;

public class Menu {
    private final Scanner input = new Scanner(System.in);
    private int n;
    public Category ctg = new Category();

    public void displayMenu(){
        System.out.println("Selamat Datang di Perpustakaan Kami\nSilahkan Cek Koleksi Kami");
        System.out.println("1. Cek Kategori");
        System.out.println("2. Tampilkan Semua");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda : ");
        this.n = input.nextInt();
        input.nextLine();
    }

    public void display(){
        switch(n){
            case 1 -> {
                System.out.println("1. Teknologi");
                System.out.println("2. Filsafat");
                System.out.println("3. Sejarah");
                System.out.println("4. Agama");
                System.out.println("5. Psikologi");
                System.out.println("6. Politik");
                System.out.println("7. Fiksi");
                System.out.print("Silahkan input pilihan Anda : ");
                int a = input.nextInt();
                input.nextLine();
                ctg.displayCategory(a);
                System.out.print("Ingin Cek Lagi ?? (Y/T)");
                String y = input.nextLine();
                System.out.println();
                if(y.equalsIgnoreCase("Y")) display();
            }

            case 2 ->{
                ctg.displayAll();
            }

            case 3 -> {
                System.out.println("Terima Kasih");
            }

            default ->{
                System.out.println("Invalid");
                displayMenu();
            }
        }
    }
}