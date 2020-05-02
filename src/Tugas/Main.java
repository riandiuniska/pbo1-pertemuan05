package Tugas;

public class Main {
    public static void main(String[] args) {
        //intance/pembuatan objek dari class yang sudah dideklarasikan sebelumnya.
        ProgramRencanaStudi cetakData1= new ProgramRencanaStudi();
        ProgramRencanaStudi cetakData2 = new ProgramRencanaStudi();
        ProgramRencanaStudi cetakData3 = new ProgramRencanaStudi();
        ProgramRencanaStudi cetakData4 = new ProgramRencanaStudi();

        //mengisi/mengakses nilai attribute.
        cetakData1.nama = "Muhammad Riandi";
        cetakData1.npm = "18631026";
        cetakData1.programStudi = "Teknik Informatika";
        cetakData1.semester = "4 (2019/2020 GENAP)";
        cetakData1.matkul = "PEMROGRAMAN BERBASIS OBJEK 1";
        cetakData1.kodeMatkul = "TIF3402";
        cetakData1.jumlahSks = "3";
        cetakData1.sks = 3;
        cetakData1.maxSks = 24;

        cetakData1.output1();
        cetakData1.output2();
        cetakData1.output3();

        cetakData2.matkul = "SISTEM INFORMASI GEOGRAFIS";
        cetakData2.kodeMatkul = "TIF3403";
        cetakData2.jumlahSks = "2";
        cetakData1.sks = cetakData1.sks + 2; //menjumlahkan dengan sks sebelumnya.
        cetakData2.output2();
        cetakData1.output3();

        cetakData3.matkul = "JARINGAN KOMPUTER 2";
        cetakData3.kodeMatkul = "TIF3404";
        cetakData3.jumlahSks = "2";
        cetakData1.sks = cetakData1.sks + 2; //menjumlahkan dengan sks sebelumnya.
        cetakData3.output2();
        cetakData1.output3();

        cetakData4.matkul = "PEMROGRAMAN WEB 2";
        cetakData4.kodeMatkul = "TIF3405";
        cetakData4.jumlahSks = "3";
        cetakData1.sks = cetakData1.sks + 3; //menjumlahkan dengan sks sebelumnya.
        cetakData4.output2();
        cetakData1.output3();

    }
}

