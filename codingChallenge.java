public class codingChallenge {
    public static void main(String[] args) {

        // membuat variabel tip dan tagihan
        double tip1, tip2, tip3;
        int tagihan1 = 275;
        int tagihan2 = 40;
        int tagihan3 = 430;

        // Menentukan besarnya tip menggunakan ternary operator
        tip1 = (tagihan1 >= 50 && tagihan1 <= 300) ? (tip1 = (double) tagihan1 * 0.15) : (tip1 = (double) tagihan1 * 0.2);
        tip2 = (tagihan2 >= 50 && tagihan2 <= 300) ? (tip2 = (double) tagihan2 * 0.15) : (tip2 = (double) tagihan2 * 0.2);
        tip3 = (tagihan3 >= 50 && tagihan3 <= 300) ? (tip3 = (double) tagihan3 * 0.15) : (tip3 = (double) tagihan3 * 0.2);

        // menentukan nilai akhir
        double nilaiAkhir1 = tagihan1 + tip1;
        double nilaiAkhir2 = tagihan2 + tip2;
        double nilaiAkhir3 = tagihan3 + tip3;

        // menampilkan output
        System.out.println("Tagihannya " + tagihan1 + ", tipnya " + tip1 + ", dan total nilainya " + nilaiAkhir1);
        System.out.println("Tagihannya " + tagihan2 + ", tipnya " + tip2 + ", dan total nilainya " + nilaiAkhir2);
        System.out.println("Tagihannya " + tagihan3 + ", tipnya " + tip3 + ", dan total nilainya " + nilaiAkhir3);

        //kasih masukan puh kalo ada harus dibenerin
    }
}
