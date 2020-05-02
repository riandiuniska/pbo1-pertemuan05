package Tugas;

public class ProgramRencanaStudi {
    //attribute di dalam class
    String nama;
    String npm;
    String programStudi;
    String semester;
    String matkul;
    String kodeMatkul;
    String jumlahSks;
    int sks;
    int maxSks;

    //behavior
    void output1(){
        System.out.println("====================================================");
        System.out.println("Nama                    = "+nama);
        System.out.println("NPM                     = "+npm);
        System.out.println("Program Studi           = "+programStudi);
        System.out.println("Semester                = "+semester);
        System.out.println("====================================================");
    }

    void output2(){
        System.out.println("Mata Kuliah             = "+matkul);
        System.out.println("Kode Mata Kuliah        = "+kodeMatkul);
        System.out.println("SKS                     = "+jumlahSks);
    }

    void output3(){
        System.out.println("SKS yang Sudah di Ambil = "+sks);
        System.out.println("Maksimal SKS            = "+maxSks);
        System.out.println("");
    }

}
