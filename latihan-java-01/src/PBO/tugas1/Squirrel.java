package PBO.tugas1;

/**
 * program tupai lompat
 * @CutNurhidayanti
 * program ini berada pada package PBO.tugas1
 * merupakan class dari tupai 
 * code / permainan akan dijalankan di program utama main
 */

import java.util.Scanner;

public class Squirrel{

    int randomBaris;
    int randomKolom;
    int letaktupai;
    

    Scanner input = new Scanner(System.in);

    static int[][] bidangLompat = new int[][]{
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
        {91, 92, 93, 94, 95, 96, 97, 98, 99, 100},
    };    

    //posisi tupai awal
    public Squirrel(){
        randomBaris = (int) Math.floor(Math.random() * 10);
        randomKolom = (int) (Math.random()*10);
        letaktupai = bidangLompat[randomBaris][randomKolom];
    }
      

    /**
     * program untuk menampilkan posisi awal tupai didalam bidangLompat tupai
     */
    int posisiawal;
    public void setSquirrel(int letaktupai, int[][] bidangLompat){
        for(int i = 0; i<bidangLompat.length; i++){
            for(int j = 0; j<bidangLompat[i].length; j++){
                System.out.print(bidangLompat[i][j]+ " \t" );
                if(bidangLompat[i][j] == this.letaktupai){
                    posisiawal = letaktupai;
                }  
            }
            System.out.println();
        }
        System.out.println("letak awal tupai anda sekarang = "+posisiawal);
        lompat(posisiawal);
    }

    /**
     * program cara tupai melompat dengan berbagai kondisi
     * ketika tupai berada di range 0-50 dan pada range 51-100
     * memperlihatkan cara tupai melompat pada 1 kotak bersisian
     * memperlihatkan cara tupai melompat pada diagonal kotak yang bersisian
     */


    int batasLompat, userInput, jalanSingkat = 0, JalanPanjang = 0;
    public void lompat(int posisiawal) {
        if(posisiawal>0 && posisiawal<=50){//rentang tuupai melompat
            System.out.println("tupai berada pada rentang 0-50 dengan nyawamax lompat 20x");
            batasLompat = 20;
            letaktupai = posisiawal;
            while(batasLompat != 0){
                System.out.print("jump to : ");
                userInput = input.nextInt();
                if(letaktupai+1 == userInput){//tupai melompat ke kanan 1 kotak
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;//memperlihatkan nyawa tupai
                    JalanPanjang = JalanPanjang +1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){//kondisi untuk katak yang menang
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-1 == userInput){//tupai melompat ke kiri 1 korak
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang +1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+10 == userInput){//tupai melompat 1 kotak kebawah, maju
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang +1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-10 == userInput){//tupai melompat 1 kotak keatas, mundur
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang +1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+9 == userInput){//melompat serong ke kiri bawah 1 kotak
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-9 == userInput){//melompat serong ke kanan atas 1 motak
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+11 == userInput){//melompat serong kanan bawah 1 kotak
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                            System.out.println("selamat anda memenangkan game ini yuhu....");
                            break;
                    }
                    continue;
                }if(letaktupai-11 == userInput){//melompat serong kiri 1 kotas keatas
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <20){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }else{
                    System.out.println("wrong jump");//ketika lompatan lebih dari 1 kotak
                }
            }
            if(batasLompat == 0){
                System.out.println("tupai kalah");
            }if(jalanSingkat == JalanPanjang){
                System.out.println("jumlah jalan singkat dan jalan biasa yang ditempuh tupai adalah sama-sama "+jalanSingkat +" langkah");
            }if(jalanSingkat != JalanPanjang){
                System.out.println("jumlah jalan singkat yang ditempuh tupai adalah "+jalanSingkat+" langkah");
                System.out.println("jumlah jalan biasa yang ditempuh tupai adalah "+JalanPanjang+" langkah");
            }
        }if(posisiawal>50 && posisiawal<=100){//rentang tupai melompat
            System.out.println("tupai berada pada rentang 51-100 dengan max lompat 10x");
            batasLompat = 10;
            letaktupai = posisiawal;
            while(batasLompat != 0 ){
                System.out.print("jump to : ");
                userInput = input.nextInt();
                if(letaktupai+1 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-1 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+10 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-10 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    JalanPanjang = JalanPanjang + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+9 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-9 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai+11 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }if(letaktupai-11 == userInput){
                    letaktupai = userInput;
                    System.out.println("tupai ada di nomor : "+letaktupai);
                    batasLompat = batasLompat - 1;
                    jalanSingkat = jalanSingkat + 1;
                    System.out.println("nyawa : " +batasLompat);
                    if(letaktupai == 100 && batasLompat <10){
                        System.out.println("selamat anda memenangkan game ini yuhu....");
                        break;
                    }
                    continue;
                }else{
                    System.out.println("wrong jump");
                }
            }

            if(batasLompat == 0){
                System.out.println("tupai kalah");
            }if(jalanSingkat == JalanPanjang){
                System.out.println("jumlah jalan singkat dan jalan biasa yang ditempuh tupai adalah sama-sama "+jalanSingkat +" langkah");
            }if(jalanSingkat != JalanPanjang){
                System.out.println("jumlah jalan singkat yang ditempuh tupai adalah "+jalanSingkat+" langkah");
                System.out.println("jumlah jalan biasa yang ditempuh tupai adalah "+JalanPanjang+" langkah");
            }   
        }
    }

    /**
     * merupakan program ketika pemainn ingin mengulang permainan
     */

    String ayo;
    boolean gassMain = true;
    public boolean LanjutMain(boolean gassMain){
        System.out.print("apakah ingin lanjut bermain (y/n) :");
        do{
            ayo = input.nextLine();

            if("n".equalsIgnoreCase(ayo)){
                gassMain = false;
                break;
            }if("y".equalsIgnoreCase(ayo)){
                gassMain =true;
                break;
            }
        }while(true);

        return gassMain;
    }

    /**
     * merupakan peraturan dari permainan tanpa mereturn nilai apapun
     * method ini akan digunakan untuk memperlihatkan peraturan permainan kepada user
     */

    public void Rule(){
        System.out.println("===peraturan permainan tupai lompat===");
        System.out.println("1. Pemain diharapkan untuk membuat squirrel melompat (jump) ketempat yang ditentukan oleh permainan");
        System.out.println("2. Pilihan posisi melompat adalah ke kanan, ke kiri, ke atas,ke bawah atau diagonalnya sebanyak 1 kotak yang bersisian");
        System.out.println("3. Tujuan akhir lompatan adalah mencapai kotak dengan angka 100");
        System.out.println("4. Jika berhasil sampai ke kotak angka 100 maka pemain menang");
        System.out.println("5. Jika posisi awal squirrel pada rentang angka 1-50 maka maksimal squirrel boleh melompat 20 kali");
        System.out.println("6. Jika posisi awal squirrel pada rentang angka 51-99 maka maksimal squirrel boleh melompat sebanyak 10 kali\n");
    }

    
}
