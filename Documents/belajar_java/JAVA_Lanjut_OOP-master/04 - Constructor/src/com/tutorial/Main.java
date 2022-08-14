package com.tutorial;

//class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;

}
// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // //contructor di panggil saat object pertama kali di buat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }
    
    //construktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);

    }
}


public class Main{
    public static void main(String[] args) throws Exception {


        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","123456","teknik pertenakan");
        Mahasiswa mahasiswa2 = new Mahasiswa("sayang", "1234455", "teknik pertambangan");




        // Polos objectPolos = new Polos();
        // objectPolos.dataString  = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
        
    }
}