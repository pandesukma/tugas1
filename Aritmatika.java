package tugas01;

/**
 *
 * @author 21102075 I Nyoman Pande Sukma Pradnyana
 */
public class Aritmatika {
    private double hasil;
   
    public void tambah(double bil1, double bil2){
        this.hasil = bil1 + bil2;
    }
    public void kurang(double bil1, double bil2){
        this.hasil = bil1 - bil2;
    }
    public void kali(double bil1, double bil2){
        this.hasil = bil1 * bil2;
    }
    public void bagi(double bil1, double bil2){
        this.hasil = bil1 /bil2;
    }
    public double getHasil(){
        return this.hasil;
    }
            
}
      
