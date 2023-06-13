package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika hend = new Matematika(5,4);
        
        System.out.println("Hasil penjumlahan: "+hend.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+hend.setPengurangan());
        System.out.println("Hasil perkalian: "+hend.setPerkalian());
        System.out.println("Hasil pembagian: "+hend.setPembagian());
    }
    
}
