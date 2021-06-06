import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

 String namaDepan = "Miftah";
 String namaTengah = "Hadi";
 String namaBelakang = "Syah";
 int usia = 20;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjad = 'A';
 boolean tampan = true;
 
 System.out.println("======== FASE INPUT========");
 System.out.print("Input Nama Depan :");
 namaDepan = JOptionPane.showInputDialog("Input Nama Depan : ");
 System.out.print("Input Nama Tengah :");
 namaTengah = scanner.nextLine();
 System.out.print("Input Nama Belakang :");
 namaBelakang = scanner.nextLine();
 System.out.print("Input Usia : ");
 usia = scanner.nextInt();
 System.out.print("Input IPK: ");
 ipk = scanner.nextDouble();
 System.out.print("");
 System.out.print("Input Nilai Abjad : ");
 nilaiAbjad = scanner.next().charAt(0);
 System.out.print("Tampan? : ");
 tampan = scanner.nextBoolean();

 System.out.println("======== FASE OUTPUT =========");
 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama tengah : " + namaTengah);
 System.out.println("Nama belakang: " + namaBelakang);
 System.out.println("Usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.err.println("Tampan : " + tampan);

 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);
 
 }
}