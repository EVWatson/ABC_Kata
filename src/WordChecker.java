import java.util.ArrayList;

public class WordChecker {

    /*
    1. get word, split into letters
    2. take first letter, compare to arrayList: if found, delete the block from array list and return true
    3. if true, move on to searching for next letter (if there is one)
    4. if false, stop searching
     */

    private String givenWord;

    public WordChecker(){
        this.givenWord = givenWord;
    }

    public String[] splitWordIntoStrings(String word){
        return word.split("");
    }

    




    public String getGivenWord() {
        return givenWord;
    }
}
