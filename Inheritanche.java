package inheritanche;
import java.util.Scanner;
public class Inheritanche{
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       BMW bmw = new BMW();
       Porsche prch = new Porsche();
       
       while (true){
           System.out.println("\n-LIST KENDARAAN-");
           System.out.println("1. BMW\n2. Porsche\nk. Keluar");
           System.out.println("Masukan Pilihan : ");
           String pilihan = sc.next();
           
           switch(pilihan) {
               case "1":
                   bmw.tampilkan();
                   break;
               case "2":
                   prch.setJenis("Mobil");
                   prch.setMerk("Carrera GT");
                   prch.setHarga(44000);
                   prch.tampilkan();
                   break;
               case "k":
                   System.out.println("-TERIMA KASIH");
                   System.exit(0);
                   break;
           }
       }
    }

}

