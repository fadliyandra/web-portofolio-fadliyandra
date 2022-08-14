package com.tutorial;


class Mahasiswa{
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // methode tanpa retrn dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    //methode tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;

    }
    //metode denagn retun tai tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    //methode dengan retrun dan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah" + this.nama;
    }

}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "1223456");
        
        //methode
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);




    }

}