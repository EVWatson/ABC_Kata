import java.util.ArrayList;

public class WordChecker {

//    private BlockCollection makeBlocks;



    public WordChecker(){
//        this.makeBlocks = new BlockCollection();
    }

    public String[] splitWordIntoStrings(String word){
        word = word.toUpperCase();
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
        boolean result = true;
        int letter = 0;

        while (letter < wordBrokenIntoLetters.length && result) {
            if (isLetterFromWordOnAnAvailableBlock(blocksCollection, wordBrokenIntoLetters[letter])){
                letter++;
            } else {
                result = false;
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

}
