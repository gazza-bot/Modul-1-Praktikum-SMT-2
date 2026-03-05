
public class Category {
    public void displayCategory(int i) {
        switch (i) {
            // Teknologi
            case 1 -> {
                JudulBuku buku1 = new JudulBuku("Introduction to Java Programming");
                JudulBuku buku2 = new JudulBuku("Introduction to C++ Programming");
                JudulBuku buku3 = new JudulBuku("The Shallows");
                JudulBuku buku4 = new JudulBuku("The Code Breaker");
                JudulBuku buku5 = new JudulBuku("Genius Makers");
                PenulisBuku auth1 = new PenulisBuku("Daniel Y Liang");
                PenulisBuku auth2 = new PenulisBuku("Daniel Y Liang");
                PenulisBuku auth3 = new PenulisBuku("Nicholas Carr");
                PenulisBuku auth4 = new PenulisBuku("Walter Isaacson");
                PenulisBuku auth5 = new PenulisBuku("Cade Metz");
                System.out.println("==== Teknologi ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.display();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Filsafat
            case 2 -> {
                JudulBuku buku1 = new JudulBuku("Dunia Sophie");
                JudulBuku buku2 = new JudulBuku("Filosofi Teras");
                JudulBuku buku3 = new JudulBuku("The Passions of The Soul");
                JudulBuku buku4 = new JudulBuku("Madilog");
                JudulBuku buku5 = new JudulBuku("Filsafat Ilmu 101");
                PenulisBuku auth1 = new PenulisBuku("Jostein Gaarder");
                PenulisBuku auth2 = new PenulisBuku("Henry Manampiring");
                PenulisBuku auth3 = new PenulisBuku("Rene Descartes");
                PenulisBuku auth4 = new PenulisBuku("Tan Malaka");
                PenulisBuku auth5 = new PenulisBuku("Paul Kleinman");
                System.out.println("==== Filsafat ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.display();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Sejarah
            case 3 -> {
                JudulBuku buku1 = new JudulBuku("Tetralogi Buru: Bumi Manusia");
                JudulBuku buku2 = new JudulBuku("Laut Bercerita");
                JudulBuku buku3 = new JudulBuku("Cantik itu Luka");
                JudulBuku buku4 = new JudulBuku("Gadis Kretek");
                JudulBuku buku5 = new JudulBuku("Hatta : Jejak yang Melampaui Zaman");
                PenulisBuku auth1 = new PenulisBuku("Pramoedya Ananta Toer");
                PenulisBuku auth2 = new PenulisBuku("Leila S. Chudori");
                PenulisBuku auth3 = new PenulisBuku("Eka Kurniawan");
                PenulisBuku auth4 = new PenulisBuku("Ratih Kumala");
                PenulisBuku auth5 = new PenulisBuku("Mohammad Hatta");
                System.out.println("==== Sejarah ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.display();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Agama
            case 4 -> {
                JudulBuku buku1 = new JudulBuku("Ihya Ulumuddin");
                JudulBuku buku2 = new JudulBuku("Sejarah Lengkap Penyebaran Islam");
                JudulBuku buku3 = new JudulBuku("Riyadhus Sholih");
                JudulBuku buku4 = new JudulBuku("Fathul Qorib");
                JudulBuku buku5 = new JudulBuku("Bulughul Maram");
                PenulisBuku auth1 = new PenulisBuku("Imam Al Ghazali");
                PenulisBuku auth2 = new PenulisBuku("Prof. Dr. Thomas W. Arnold");
                PenulisBuku auth3 = new PenulisBuku("Imam An Nawawi");
                PenulisBuku auth4 = new PenulisBuku("Syaikh Muhammad bin Qasim Al Ghazi");
                PenulisBuku auth5 = new PenulisBuku("Ibnu Hajar Al Asqalani");
                System.out.println("==== Agama ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.display();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Psikologi
            case 5 -> {
                JudulBuku buku1 = new JudulBuku("Crucial Conversation: Tools for Talking when Stakes are High");
                JudulBuku buku2 = new JudulBuku("Attached: The new Science of Adult Attachment");
                JudulBuku buku3 = new JudulBuku("Thinking, Fast and Slow");
                JudulBuku buku4 = new JudulBuku("Influence: The Psychology of Persuasion");
                JudulBuku buku5 = new JudulBuku("Man's Search for Meaning");
                String[] psi = { "Kerry Patterson", "Joseph Grenny", "Ron McMillan", "Al Switzler" };
                String[] psi2 = { "Amir Levine", "Rachel S.F" };
                PenulisBuku auth1 = new PenulisBuku(psi);
                PenulisBuku auth2 = new PenulisBuku(psi2);
                PenulisBuku auth3 = new PenulisBuku("Daniel Kahnemann");
                PenulisBuku auth4 = new PenulisBuku("Robert B. Cialdini");
                PenulisBuku auth5 = new PenulisBuku("Viktor E. Frankl");
                System.out.println("==== Psikologi ====");
                buku1.display();
                auth1.displayArr();
                buku2.display();
                auth2.displayArr();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Politik
            case 6 -> {
                JudulBuku buku1 = new JudulBuku("The Prince (Sang Pangeran)");
                JudulBuku buku2 = new JudulBuku("Why Nations Fail");
                JudulBuku buku3 = new JudulBuku("The Republic");
                JudulBuku buku4 = new JudulBuku("1984");
                JudulBuku buku5 = new JudulBuku("On Liberty");
                PenulisBuku auth1 = new PenulisBuku("Niccolo Macchiaveli");
                String pol[] = { "Daron Acemoglu", "James A. Robinson" };
                PenulisBuku auth2 = new PenulisBuku(pol);
                PenulisBuku auth3 = new PenulisBuku("Plato");
                PenulisBuku auth4 = new PenulisBuku("George Orwell");
                PenulisBuku auth5 = new PenulisBuku("John Stuart Mill");
                System.out.println("==== Politik ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.displayArr();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
                System.out.println("=====================\n");
            }
            // Fiksi
            case 7 -> {
                JudulBuku buku1 = new JudulBuku("Pulang & Pergi");
                JudulBuku buku2 = new JudulBuku("To Kill a Mockingbird");
                JudulBuku buku3 = new JudulBuku("Seratus tahun Kesunyian");
                JudulBuku buku4 = new JudulBuku("Pride and Prejudice");
                JudulBuku buku5 = new JudulBuku("The Stranger");
                PenulisBuku auth1 = new PenulisBuku("Tere Liye");
                PenulisBuku auth2 = new PenulisBuku("Harper Lee");
                PenulisBuku auth3 = new PenulisBuku("Gabriel GArcia Marquez");
                PenulisBuku auth4 = new PenulisBuku("Jane Austen");
                PenulisBuku auth5 = new PenulisBuku("Albert Camus");
                System.out.println("==== Fiksi ====");
                buku1.display();
                auth1.display();
                buku2.display();
                auth2.display();
                buku3.display();
                auth3.display();
                buku4.display();
                auth4.display();
                buku5.display();
                auth5.display();
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