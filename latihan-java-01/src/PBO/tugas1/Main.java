package PBO.tugas1;

/**
 * program tupai lompat
 * @CutNurhidayanti
 * program ini berada pada package PBO.tugas1
 * merupakan program utama untuk menjalankan program
 * https://youtu.be/E_1pLIRFbM4
 */

import static PBO.tugas1.Squirrel.bidangLompat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inputPilihan = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("menu : ");
            System.out.println("1. Rule");
            System.out.println("2. Play");
            System.out.println("3. Exit");

            System.out.print("masukkan pilihan anda :");
            pilihan = inputPilihan.nextInt();

            Squirrel s2 = new Squirrel();            

            if(pilihan == 1){
                s2.Rule();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 2){
                boolean gassMain = true;
                System.out.println("====================selamat bermain sandy lompat sandy====================");
                do{
                    Squirrel s1 = new Squirrel();
                    s1.setSquirrel(s1.letaktupai, bidangLompat);
                    gassMain = s1.LanjutMain(gassMain);

                }while(gassMain);
                System.out.println("===========terimakasih telah bermain===========");
                break;
            }if(pilihan == 3){
                break;
            }else{
                System.out.println("masukkan input yang benar berupa angka 1/2/3");
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }
            
        }while(true);
        System.out.println("===terima kasih telah menggunakan program ini===");
    }
    
}
