public class Fungsi {

    String nama;
    String level;

    // Fungsi(){
    // level = "100";
    // }

    Fungsi(String namaa, String levell) {
        nama = namaa;
        level = levell;
    }

    // contoh penggunaan this

    // Fungsi(String nama, String level) {
    // this.nama = nama;
    // this.level = level;
    // }

    void namamu() {
        System.out.println("nama anda " + nama);
    }

    void levelmu() {
        System.out.println("level anda " + level);
    }

}