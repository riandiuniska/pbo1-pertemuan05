package ContohProgram;
//Class Main untuk menjalankan/membuat cetakan objek/bagaimana behavior dari objek dijalankan
public class Main {
    public static void main(String[] args) {
        //intance/pembuatan objek dari kelas yang sudah dideklarasikan sebelumnya
        Worm player1 = new Worm();
        Worm player2 = new Worm();

        //mengisi/mengakses nilai attribute
        player1.userName = "Rian";
        player1.score = 500;
        player1.length = 3.5;

        player2.userName = "Ucup";
        player2.score = 200;
        player2.length = 1.5;

        player1.eatSnack(); //menjalankan eatSnake
        System.out.println(player1.score); //mengecek score player 1 sekarang
        player1.eatOthers(player2); //kemudian player 1 memakan player2/eatOthers
        System.out.println(player1.score); //hasil score sekarang setelah memakan
    }
}
