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
        int letter = 0;
        while (letter < word.length) {
            int blockCollectionIndex = 0;
            while (blockCollectionIndex < blocksCollection.size()) {
                String letter1 = blocksCollection.get(blockCollectionIndex).getLetter1();
                String letter2 = blocksCollection.get(blockCollectionIndex).getLetter2();

                if (letter1.equals(word[letter]) || letter2.equals(word[letter])) {
                    blocksCollection.remove(blockCollectionIndex);
                    break;
                }

                if(blockCollectionIndex == blocksCollection.size()-1){
                    result = false;
                    break;
                }
                blockCollectionIndex++;
            }

            if (!result){
                break;
            }
            letter++;
        }
        return result;
    }




    public String getGivenWord() {
        return givenWord;
    }
}
