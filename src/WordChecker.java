import java.util.ArrayList;

public class WordChecker {

    /*
    1. get word, split into letters
    2. take first letter, compare to arrayList: if found, delete the block from array list and return true
    3. if true, move on to searching for next letter (if there is one)
    4. if false, stop searching
     */

    private String givenWord;
    private BlockCollectionBuilder makeBlocks;

    public WordChecker(){
        this.givenWord = givenWord;
        this.makeBlocks = new BlockCollectionBuilder();
    }

    public String[] splitWordIntoStrings(String word){
        return word.split("");
    }


    public boolean isWordInBlockCollection(ArrayList<Block> blocksCollection, String[] word){
        boolean result = true;
        int wordLetter =0;
        while (wordLetter < word.length) {
            int block = 0;
            while (block < blocksCollection.size()) {
                String letter1 = blocksCollection.get(block).getLetter1();
                String letter2 = blocksCollection.get(block).getLetter2();

                if (letter1.equals(word[wordLetter]) || letter2.equals(word[wordLetter])) {
                    blocksCollection.remove(block);
                    break;
                } else {
                    block++;
                }
            }
            wordLetter++;
        }
        return result;
    }




    public String getGivenWord() {
        return givenWord;
    }
}
