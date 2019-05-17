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

    /*
    1. take each letter of word, and check to see if is on a block in the collection
    2. check each block one at a time, against each letter that the block has.
    3.if the letter is not on the current block, move on to the next one
    3. if the letter is found, delete the block, then move on to the next letter (if present), else return the overall result for the search of the word
    4. if the letter is not found on any of the blocks, and all blocks have been checked, stop and return an overall result of false. do not move to the next letter of the word (if present)
     */


    public boolean isWordInBlockCollection(ArrayList<Block> blocksCollection, String[] wordBrokenIntoLetters){
        boolean result = false;
        int letter = 0;

        while (letter < wordBrokenIntoLetters.length) {
            if (isLetterFromWordOnAnAvailableBlock(blocksCollection, wordBrokenIntoLetters[letter])){
                result = true;
                letter++;
            } else {
                break;
            }
        }
        return result;
    }




    private boolean isLetterFromWordOnAnAvailableBlock(ArrayList<Block> blocksCollection, String letter){
        boolean answer = false;

        int block = 0;
        while(block < blocksCollection.size()){
            String letter1 = blocksCollection.get(block).getLetter1();
            String letter2 = blocksCollection.get(block).getLetter2();
            if(letter1.equals(letter) || letter2.equals(letter)) {
                blocksCollection.remove(block);
                answer = true;
                break;
            }
            block++;
        }
        return answer;
    }




    public String getGivenWord() {
        return givenWord;
    }
}
