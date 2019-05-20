import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordCheckerTest {

    private WordChecker checkWord;
    private BlockCollection block;

    @Before
    public void setUp(){
        this.checkWord = new WordChecker();
        this.block = new BlockCollection();
    }

    @Test
    public void splitWordIntoStringsReturnsArrayOfIndividualLetters(){
        String word = "cat";

        String[] expectedResult = {"C", "A", "T"};

        String[] actualResult = checkWord.splitWordIntoStrings(word);

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void whenLetterIsOnAnAvailableBlockReturnsTrue(){
        String[] wordLetters = {"A"};
        ArrayList<Block> blocks = block.getAllBlocks();


        boolean actualResult = checkWord.isWordInBlockCollection(blocks, wordLetters);

        assertTrue(actualResult);
    }

    @Test
    public void whenLetterIsNotOnAnyAvailableBlocksReturnsFalse(){

        String[] wordLetters = {"1"};
        ArrayList<Block> blocks = block.getAllBlocks();


        boolean actualResult = checkWord.isWordInBlockCollection(blocks, wordLetters);

        assertFalse(actualResult);
    }

    @Test
    public void whenThereAreEnoughBlocksToMakeGivenWordWillReturnTrue(){

        String[] lettersArray = {"B", "A", "R", "K"};
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertTrue(actualResult);


    }

    @Test
    public void whenThereAreNotEnoughBlocksToMakeGivenWordWillReturnFalse(){
        String[] lettersArray = {"C", "O", "M", "M", "O", "N"};
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertFalse(actualResult);

    }

    @Test
    public void whenWeHaveRemovedBlocksAndCannotMatchTheNextLetterWillReturnFalse(){

        String[] lettersArray = {"B", "O", "O", "K"};
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertFalse(actualResult);
    }

    @Test
    public void whenWeHaveRemovedBlocksButCanMatchNextLetterWillReturnTrue(){
        String[] lettersArray = {"S", "Q", "U", "A", "D"};
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertTrue(actualResult);

    }



    @Test
    public void whenWordIsGivenIsCapitalisedWillReturnTrueWhenLettersCanBeMatchedToBlocks(){
        String givenWord = "Squad";

        String[] lettersArray = checkWord.splitWordIntoStrings(givenWord);
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertTrue(actualResult);
    }

    @Test
    public void whenWordIsGivenIsAMixtureOfLowerAndUpperCaseWillReturnTrueWhenLettersCanBeMatchedToBlocks(){
        String givenWord = "SqUaD";

        String[] lettersArray = checkWord.splitWordIntoStrings(givenWord);
        ArrayList<Block> blocks = block.getAllBlocks();

        boolean actualResult = checkWord.isWordInBlockCollection(blocks, lettersArray);

        assertTrue(actualResult);
    }


}