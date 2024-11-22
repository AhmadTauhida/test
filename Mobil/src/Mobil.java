public class Mobil {

    private int posisi = 0;
    

    public int maju (int langkah) {

        posisi = langkah + posisi;

        System.out.println("mobil maju " + langkah + " langkah");
        return posisi;
    }

    public int mundur (int langkah) {
        posisi = posisi - langkah;

        System.out.println("mobil mundur " + langkah + " langkah");
        return posisi;
    }

    public int getPosisi () {
        System.out.println("posisi saat ini: " + posisi);
        return posisi;
    }

    public static void main(String[] args) {

        Mobil mobil = new Mobil();


        System.out.println("=======Tracking Mobil Kelompok 3=======\n");

        mobil.maju(5);
        mobil.mundur(20);

        mobil.getPosisi();

    } 
}