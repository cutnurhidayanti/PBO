
/**
 * Write a description of class Pemain here.
 * 
 * @author Cut Nurhidayanti
 * @version 25-10-2021
 */

public class Pemain {

    //inisialisasi atribut
    private String nama;
    private int nilai;

    public Pemain(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama  = nama;
    }
    
    public int getNilai(){
        return this.nilai;
    }

    public void setNilai(int nilai){
        this.nilai  = nilai;
    }

    public void buatSquirrel(){
        System.out.println("Tupai Siap Melompat");
    }

    public void lompat(){
        System.out.println("tupai Lompat!");
    }



}
