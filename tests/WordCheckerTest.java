import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckerTest {

    private WordChecker checkWord;

    @Before
    public void setUp(){
        this.checkWord = new WordChecker();
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

}