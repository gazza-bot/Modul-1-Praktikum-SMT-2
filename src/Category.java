import java.util.ArrayList;

public class Category {
    public void displayCategory(int inputan) {

        switch (inputan) {
            // Teknologi
            case 1 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();

                daftarBuku.add(new JudulBuku("Introduction to Java Programming"));
                daftarBuku.add(new JudulBuku("Introduction to C++ Programming"));
                daftarBuku.add(new JudulBuku("The Shallows"));
                daftarBuku.add(new JudulBuku("The Code Breaker"));
                daftarBuku.add(new JudulBuku("Genius Makers"));
                daftarAuth.add(new PenulisBuku("Daniel Y Liang"));
                daftarAuth.add(new PenulisBuku("Daniel Y Liang"));
                daftarAuth.add(new PenulisBuku("Nicholas Carr"));
                daftarAuth.add(new PenulisBuku("Walter Isaacson"));
                daftarAuth.add(new PenulisBuku("Cade Metz"));
                System.out.println("==== Teknologi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Filsafat
            case 2 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();
                daftarBuku.add(new JudulBuku("Dunia Sophie"));
                daftarBuku.add(new JudulBuku("Filosofi Teras"));
                daftarBuku.add(new JudulBuku("The Passions of The Soul"));
                daftarBuku.add(new JudulBuku("Madilog"));
                daftarBuku.add(new JudulBuku("Filsafat Ilmu 101"));
                daftarAuth.add(new PenulisBuku("Jostein Gaarder"));
                daftarAuth.add(new PenulisBuku("Henry Manampiring"));
                daftarAuth.add(new PenulisBuku("Rene Descartes"));
                daftarAuth.add(new PenulisBuku("Tan Malaka"));
                daftarAuth.add(new PenulisBuku("Paul Kleinman"));
                System.out.println("==== Filsafat ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Sejarah
            case 3 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();

                daftarBuku.add(new JudulBuku("Tetralogi Buru: Bumi Manusia"));
                daftarBuku.add(new JudulBuku("Laut Bercerita"));
                daftarBuku.add(new JudulBuku("Cantik itu Luka"));
                daftarBuku.add(new JudulBuku("Gadis Kretek"));
                daftarBuku.add(new JudulBuku("Hatta : Jejak yang Melampaui Zaman"));
                
                daftarAuth.add(new PenulisBuku("Pramoedya Ananta Toer"));
                daftarAuth.add(new PenulisBuku("Leila S. Chudori"));
                daftarAuth.add(new PenulisBuku("Eka Kurniawan"));
                daftarAuth.add(new PenulisBuku("Ratih Kumala"));
                daftarAuth.add(new PenulisBuku("Mohammad Hatta"));
                
                System.out.println("==== Sejarah ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Agama
            case 4 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();
                daftarBuku.add(new JudulBuku("Ihya Ulumuddin"));
                daftarBuku.add(new JudulBuku("Sejarah Lengkap Penyebaran Islam"));
                daftarBuku.add(new JudulBuku("Riyadhus Sholih"));
                daftarBuku.add(new JudulBuku("Fathul Qorib"));
                daftarBuku.add(new JudulBuku("Bulughul Maram"));
                daftarAuth.add(new PenulisBuku("Imam Al Ghazali"));
                daftarAuth.add(new PenulisBuku("Prof. Dr. Thomas W. Arnold"));
                daftarAuth.add(new PenulisBuku("Imam An Nawawi"));
                daftarAuth.add(new PenulisBuku("Syaikh Muhammad bin Qasim Al Ghazi"));
                daftarAuth.add(new PenulisBuku("Ibnu Hajar Al Asqalani"));
                System.out.println("==== Agama ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Psikologi
            case 5 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();
                String[] psi = { "Kerry Patterson", "Joseph Grenny", "Ron McMillan", "Al Switzler" };
                String[] psi2 = { "Amir Levine", "Rachel S.F" };
                daftarBuku.add(new JudulBuku("Crucial Conversation: Tools for Talking when Stakes are High"));
                daftarBuku.add(new JudulBuku("Attached: The new Science of Adult Attachment"));
                daftarBuku.add(new JudulBuku("Thinking, Fast and Slow"));
                daftarBuku.add(new JudulBuku("Influence: The Psychology of Persuasion"));
                daftarBuku.add(new JudulBuku("Man's Search for Meaning"));
                daftarAuth.add(new PenulisBuku(psi));
                daftarAuth.add(new PenulisBuku(psi2));
                daftarAuth.add(new PenulisBuku("Daniel Kahnemann"));
                daftarAuth.add(new PenulisBuku("Robert B. Cialdini"));
                daftarAuth.add(new PenulisBuku("Viktor E. Frankl"));
                System.out.println("==== Psikologi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Politik
            case 6 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();
                String pol[] = { "Daron Acemoglu", "James A. Robinson" };
                daftarBuku.add(new JudulBuku("The Prince (Sang Pangeran)"));
                daftarBuku.add(new JudulBuku("Why Nations Fail"));
                daftarBuku.add(new JudulBuku("The Republic"));
                daftarBuku.add(new JudulBuku("1984"));
                daftarBuku.add(new JudulBuku("On Liberty"));
                daftarAuth.add(new PenulisBuku("Niccolo Macchiaveli"));
                daftarAuth.add(new PenulisBuku(pol));
                daftarAuth.add(new PenulisBuku("Plato"));
                daftarAuth.add(new PenulisBuku("George Orwell"));
                daftarAuth.add(new PenulisBuku("John Stuart Mill"));
                System.out.println("==== Politik ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }
            // Fiksi
            case 7 -> {
                ArrayList<JudulBuku> daftarBuku = new ArrayList<>();
                ArrayList<PenulisBuku> daftarAuth = new ArrayList<>();
                daftarBuku.add(new JudulBuku("Pulang & Pergi"));
                daftarBuku.add(new JudulBuku("To Kill a Mockingbird"));
                daftarBuku.add(new JudulBuku("Seratus tahun Kesunyian"));
                daftarBuku.add(new JudulBuku("Pride and Prejudice"));
                daftarBuku.add(new JudulBuku("The Stranger"));
                daftarAuth.add(new PenulisBuku("Tere Liye"));
                daftarAuth.add(new PenulisBuku("Harper Lee"));
                daftarAuth.add(new PenulisBuku("Gabriel Garcia Marquez"));
                daftarAuth.add(new PenulisBuku("Jane Austen"));
                daftarAuth.add(new PenulisBuku("Albert Camus"));
                System.out.println("==== Fiksi ====");
                for (int idx = 0; idx < daftarBuku.size(); idx++) {
                    daftarBuku.get(idx).display();
                    daftarAuth.get(idx).display();
                }
                System.out.println("=====================\n");
            }

            default -> {
                System.out.println("Invalid Input / Parameter");
            }
        }
    }

    public void displayAll() {
        for (int i = 1; i <= 7; i++) {
            this.displayCategory(i);
        }
    }
}