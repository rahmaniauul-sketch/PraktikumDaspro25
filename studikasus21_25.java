
import java.util.Scanner;
public class studikasus21_25 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String jenisKegiatan, perlombaan, programKreativitasMahasiswa;
            String penyelenggara, namaMahasiswa;
            int peringkatJuara, statusPendanaanPKM, jumlahDokumen, kurangDokumen;
            
            System.err.println("Masukkan nama mahasiswa");
            namaMahasiswa = sc.nextLine();
            System.out.println("Masukkan jenis kegiatan");
            jenisKegiatan = sc.nextLine();
            System.err.println("Masukkan jumlah dokumen");
            jumlahDokumen = sc.nextInt();
            System.out.println("masukkan peringkat ");
            peringkatJuara = sc.nextInt(); 
           
            if (jumlahDokumen==4) {
                if (jenisKegiatan.equals("BELMAWA")||jenisKegiatan.equals("BAKORMA")||jenisKegiatan.equals("Mandiri")){
                    if (peringkatJuara>0 && peringkatJuara<=3) {
                        System.out.println("status : dokumen lengkap. Dana penghargaan diberikan karena jenis kegiatan dan status peringkat sesuai ");
                    }else {
                        System.out.println("tidak memperoleh dana penghargaan");
                    }
             
           
            }else{
                kurangDokumen=4-jumlahDokumen;
                System.out.println("status :tidak memperoleh dana karena syarat tidak sesuai atau dokumen tidak lengkap,kurang " +kurangDokumen);
            
             
            }
        }
        }
}
        
    


