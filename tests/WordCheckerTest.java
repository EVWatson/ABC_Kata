import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordCheckerTest {

    private WordChecker checkWord;
    private BlockCollectionBuilder block;

    @Before
    public void setUp(){
        this.checkWord = new WordChecker();
        this.block = new BlockCollectionBuilder();
    }

    @Test
    public void splitWordIntoStringsReturnsIndividualLetters(){
        String word = "cat";

        String[] expectedResult = {"c", "a", "t"};

        String[] actualResult = checkWord.splitWordIntoStrings(word);

        for (int i = 0; i < actualResult.length; i++){
            System.out.println(actualResult[i]);
        }

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void isWordInBlockCollectionWhenCharacterIsOnBlocksReturnTrue(){
        String[] wordLetters = {"A"};
        ArrayList<Block> blocks = block.getAllBlocks();


        boolean actualResult = checkWord.isWordInBlockCollection(blocks, wordLetters);

        assertTrue(actualResult);
    }

    @Test
    public void isWordInBlockCollectionWhenCharacterIsNotOnBlocksReturnFalse(){

        String[] wordLetters = {"1"};
        ArrayList<Block> blocks = block.getAllBlocks();


        boolean actualResult = checkWord.isWordInBlockCollection(blocks, wordLetters);

        assertFalse(actualResult);
    }

    @Test
    public void ifThereAreEnoughBlocksToMakeGivenWordWillReturnTrue(){

        String[] lettersArray = {"B", "A", "R", "K"};
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertTrue(actualResult);


    }
//
//    @Test
//    public void isWordInBlockCollectionifThereAreNotEnoughBlocksToMakeGivenWordWillReturnFalse(){
//
//    }
//
//    @Test
//    public void isWordInBlockCollectionifWeHaveRemovedBlocksAndCannotMatchNextLetterWillReturnFalse(){
//
//    }
//
//    @Test
//    public void isWordInBlockCollectionifWeHaveRemovedBlocksButCanMatchNextLetterWillReturnTrue(){
//
//    }



}