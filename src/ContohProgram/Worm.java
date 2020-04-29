package ContohProgram;

public class Worm {
    //attribute di dalam class, yang mana cetakannya ada didalam kelas dan nilai nya di dalam objek
    String userName;
    int score;
    double length;

    //behavior/method/objek/yang bisa dikerjakan oleh objek(cacing)
    void eatSnack(){
        System.out.println("Nom... Nom... Nom... Nom......");
    }

    void eatOthers(Worm worm) { //memakan sesama cacing
        score += 500;
    }
}
