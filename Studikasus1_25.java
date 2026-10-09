
import java.util.Scanner;
public class Studikasus1_25 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int hargaPerCup = 18000;
    int jumlahCup, uangBayar;
    int totalHarga, diskon, totalBayar;
    int kembalian, kurang;
    System.out.println("Masukkan jumlah cup");
    jumlahCup = sc.nextInt();
    System.out.println("Masukkan uang bayar");
    uangBayar = sc.nextInt();
    totalHarga = jumlahCup*hargaPerCup;
    System.out.println("total harga" +totalHarga);
    if (totalHarga>=100000) {
        diskon = totalHarga*10/100;
    } else {
        diskon = 0;
    }
    System.out.println("diskon" +diskon);
    totalBayar = totalHarga-diskon;
    System.out.println("total bayar" +totalBayar);
        if (uangBayar>=totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian" +kembalian);
        } else{
        kurang = totalBayar - uangBayar;
        System.out.println("uang tidak cukup, kurang Rp" +kurang);
        }
    }
}