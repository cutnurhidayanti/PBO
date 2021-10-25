/**
 * Write a description of class KotakAngka here.
 * 
 * @author Cut Nurhidayanti
 * @version 25-10-2021
 */

import java.util.Scanner;

public class KotakAngka {

    //inisialisasi atribut
    private int jumlahKotak;
    private int[][] kotak; 
    private int letakTupai;
    private int posisiAwal;
    private int nilai;

    Scanner input = new Scanner(System.in);

    public KotakAngka(){
        jumlahKotak=10;
        kotak = new int[jumlahKotak][jumlahKotak];
    }

    //method untuk menampilkan posisi awal tupai
    public int posisiTupai(){
        int min = 1, max = 100;
        letakTupai = (int) ((int) min + Math.random()*(max-min));
        return letakTupai;
    }
    
    //untuk menampilkan lapangan tupai lompat serta posisi awal tupai
    public void PrintKotakAngka(){
        int mulai = 1;
        letakTupai = posisiTupai();
        int nyawa= kesempatan(letakTupai);
        kotak = new int[jumlahKotak][jumlahKotak];
        int minimalLompat = minimal(kotak,letakTupai);
        System.out.println("+---------------------------------------------------------------------------------------+ ");
        System.out.println("|\t\t\t\tJump Squirrel Jump\t\t\t\t\t| ");
        System.out.println("+---------------------------------------------------------------------------------------+ ");
        for(int i = 0; i<kotak.length; i++){
            System.out.print("|\t");
            for(int j = 0; j<kotak[i].length; j++){
                kotak[i][j] = mulai;
                if(kotak[i][j]==letakTupai){
                    posisiAwal = letakTupai;
                }
                System.out.print(kotak[i][j]+"\t");
                mulai++;
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---------------------------------------------------------------------------------------+ ");
        System.out.println("tupai berada pada angka : "+posisiAwal);
        lompat(minimalLompat, nyawa);
    }

    //kesempatan lompat tupai sesuai posisi awal tupai
    public int kesempatan(int posisiTupai){
        int nyawa;
        if(posisiTupai<=50){
            nyawa = 20;
        }else{
            nyawa = 10;
        }
        return nyawa;
    }

    //method untuk tupai melompat
    public void lompat(int minimalLompat, int batasLompat){
        int nyawa = batasLompat;
        System.out.println("nyawa : "+nyawa);
        for(int i=0; i<batasLompat || nyawa != 0; i++){
            System.out.print("lompat ke : ");
            int lompatan = input.nextInt(); 

            //tupai dilarang melompat
            if(letakTupai==10||letakTupai==20||letakTupai==30||letakTupai==40||letakTupai==50||letakTupai==60||letakTupai==70||letakTupai==80||letakTupai==90){
                if(lompatan-letakTupai ==1){
                    System.out.println("\nTUPAI KELUAR JALUR !\n");
                    System.out.println("letak tupai : "+letakTupai);
                    System.out.println("nyawa : "+nyawa);
                    continue;
                }
            }else if(letakTupai==11||letakTupai==21||letakTupai==31||letakTupai==41||letakTupai==51||letakTupai==61||letakTupai==71||letakTupai==81||letakTupai==91){
                if(lompatan-letakTupai == -1){
                    System.out.println("\nTUPAI KELUAR JALUR !\n");
                    System.out.println("letak tupai : "+letakTupai);
                    System.out.println("nyawa : "+nyawa);
                    continue;
                }
            }

            //lompatan tupai
            if(letakTupai+1 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai-1 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai+10 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai-10 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai+9 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai-9 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai+11 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else if(letakTupai-11 == lompatan){
                nyawa -=1;
                letakTupai = lompatan;
            }else{
                System.out.println("\nWRONG JUMP !");
            }
            
            int lompatanUser = i+1;
            System.out.println("\nletak tupai : "+letakTupai);
            System.out.println("nyawa : "+nyawa);
            int nilaiUser = nilai(minimalLompat, lompatanUser);
            if(letakTupai==100 && nyawa>=0){
                System.out.println("Selamat Anda Memenangkan Game ini !\nanda menang dengan poin : "+nilaiUser+" good job !");
                System.out.println("minimal lompatan berdasarkan komputer : "+minimalLompat+" langkah.\nlompatan anda : "+lompatanUser+" langkah.");
                break;
            }else if(nyawa==0){
                System.out.println("minimal lompatan berdasarkan komputer : "+minimalLompat+" langkah. \nlompatan anda : "+lompatanUser+" langkah.");
                System.out.println("total poin yang anda dapatkan adalah zonk !");
                System.out.println("Ups, jangan bersedih hati ayo dicoba lagi dan semangat !");
                break;
            }
        }
    }

    //lompatan terpendek menurut komputer
    public int minimal(int[][] kotak, int posisiTupai){
        int i=1,a=0,b=0, minimal;
        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                kotak[x][y]= i;
                i++;
                if(kotak[x][y]==posisiTupai){
                    a=x;
                    b=y;
                }
            }
        }
        if(a>=b)
            minimal= 9-b;
           
        else
            minimal= 9-a;
       
        return minimal;
    }

    //methot mengembalikan nilai ketika tupai selesai melompat
    public int nilai(int minimalLompat, int lompatanUser){
        int kurangNilai = lompatanUser-minimalLompat;
        nilai = 100 - 5*kurangNilai;
        return nilai;
    }



}