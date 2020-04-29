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

        player1.eatSnack(); //menjalankan eatSnake
        System.out.println("Score Awal Player 1      = "+player1.score); //mengecek score player 1 sekarang
        System.out.println("Panjang Player 1         = "+player1.length); //mengecek panjang player 1 sekarang
        player1.eatOthers(player2); //kemudian player 1 memakan player2/eatOthers
        System.out.println("Score Player 1 Sekarang  = "+player1.score); //hasil score sekarang setelah memakan


    }
}
