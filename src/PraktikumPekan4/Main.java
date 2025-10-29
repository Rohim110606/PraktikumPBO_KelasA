package PraktikumPekan4;

public class Main {
    public static void main(String[] args) {
        
        Book novel = new Novel("Laskar Pelangi", "Andrea Hirata", "Drama");
        Book magazine = new Magazine("National Geographic", "Various Authors", "Science");
        Book textbook = new Textbook("Pemrograman Java", "Anonimous", "Informatika");

     
        Users user = new Users();

      
        System.out.println("=== Detail Buku ===");
        user.viewBookDetails(novel);
        System.out.println();
        user.viewBookDetails(magazine);
        System.out.println();
        user.viewBookDetails(textbook);
        System.out.println();

     
        System.out.println("=== Proses Peminjaman Buku ===");
        user.borrowBook(novel);
        user.borrowBook(magazine);

       
        System.out.println("\nStatus Buku Setelah Dipinjam:");
        System.out.println(novel.getTitle() + " tersedia: " + novel.isAvailable());
        System.out.println(magazine.getTitle() + " tersedia: " + magazine.isAvailable());

       
        System.out.println("\n=== Proses Pengembalian Buku ===");
        user.returnBook(novel);

       
        System.out.println("\nStatus Buku Setelah Dikembalikan:");
        System.out.println(novel.getTitle() + " tersedia: " + novel.isAvailable());
    }
}
