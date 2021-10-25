/**
 * Write a description of class Main here.
 * merupakan kelas utama untuk run program
 * 
 * @author Cut Nurhidayanti
 * @version 25-10-2021
 */

import java.util.Scanner;

public class Main {

    //inisialisasi atribut
    private boolean play;

    public static void roleGame(){
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\t\t\t\t\t\tperaturan permainan tupai lompat\t\t\t\t\t|");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| 1. Pemain diharapkan untuk membuat squirrel melompat (jump) ketempat yang ditentukan oleh permainan\t\t\t|");
        System.out.println("| 2. Pilihan posisi melompat adalah ke kanan, ke kiri, ke atas,ke bawah atau diagonalnya sebanyak 1 kotak yang bersisian|");
        System.out.println("| 3. Tujuan akhir lompatan adalah mencapai kotak dengan angka 100   \t\t\t\t\t\t\t|");
        System.out.println("| 4. Jika berhasil sampai ke kotak angka 100 maka pemain menang   \t\t\t\t\t\t\t|");
        System.out.println("| 5. Jika pemain melompat ke kotak yang salah atau tupai keluar jalur maka nilai akan dikurangkan dan nyawa tupai tetap |");
        System.out.println("| 6. Jika posisi awal squirrel pada rentang angka 1-50 maka maksimal squirrel boleh melompat 20 kali  \t\t\t|");
        System.out.println("| 7. Jika posisi awal squirrel pada rentang angka 51-99 maka maksimal squirrel boleh melompat sebanyak 10 kali     \t|");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
    }

    public static boolean mainkan(Boolean play){
        System.out.print("apakah ingin lanjut bermain (y/n) : ");
        Scanner input = new Scanner(System.in);
        String ayo;
        do{
            ayo = input.next();

            if("n".equalsIgnoreCase(ayo)){
                play = false;
                break;
            }if("y".equalsIgnoreCase(ayo)){
                play =true;
                break;
            }else{
                System.err.print("Silahkan masukkan inputan berupa (y/n) : ");
                continue;
            }
        }while(true);

        return play;
    }

    public static void MainSquirrelJump(String namaAwal){
        Scanner ubahNama = new Scanner(System.in);
        String nama = namaAwal;
        Pemain p1 = new Pemain(nama);
        System.out.print("apakah ingin merubah nama (y/n) : ");
        
        do{
            String ayo;
            ayo = ubahNama.next();

            if("n".equalsIgnoreCase(ayo)){
                break;
            }if("y".equalsIgnoreCase(ayo)){
                System.out.print("inputkan nama baru\t\t: ");
                nama = ubahNama.next();
                p1.setNama(nama);
                break;
            }else{
                System.err.print("Silahkan masukkan inputan berupa (y/n) : ");
                continue;
            }
        }while(true);
        System.out.println("\nselamat bermain "+p1.getNama()+" semoga berhasil !");

        
        KotakAngka kotak1 = new KotakAngka();
        p1.buatSquirrel();
        p1.lompat();
        kotak1.PrintKotakAngka();

    }

    
    public static void main(String[] args) {
        Scanner inputPilihan = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("+-----------------------+ ");
            System.out.println("|\t  Menu\t\t| ");
            System.out.println("+-----------------------+ ");
            System.out.println("|\t1. Rule\t\t|");
            System.out.println("|\t2. Play\t\t|");
            System.out.println("|\t3. Exit\t\t|");
            System.out.println("+-----------------------+ ");

            System.out.print("masukkan pilihan anda : ");
            pilihan = inputPilihan.nextInt();            

            if(pilihan == 1){
                roleGame();
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 2){
                boolean play = true;
                System.out.println("<===================---< selamat datang di game tupai lompat >---===================>");
                System.out.print("\nmasukkan nama anda\t\t: ");
                String nama = input.nextLine();
                do{
                    MainSquirrelJump(nama);
                    play = mainkan(play);

                }while(play);
                System.out.print("tekan enter untuk keluar...");
                Enter.nextLine();
                System.out.println("\n<===================---< terimakasih telah bermain >---===================>");
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
        
        inputPilihan.close();
        Enter.close();
    }
    
}
