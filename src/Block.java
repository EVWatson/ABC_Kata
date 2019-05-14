import java.util.ArrayList;

public class Block {

    private String letter1;
    private String letter2;


    public Block(String[] letters){
        this.letter1 = letters[0];
        this.letter2 = letters[1];
    }


    public String getLetter1() {
        return letter1;
    }

    public String getLetter2() {
        return letter2;
    }
}
