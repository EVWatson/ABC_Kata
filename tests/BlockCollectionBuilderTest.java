import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BlockCollectionBuilderTest {

    private BlockCollectionBuilder blockCollection;

    @Before
    public void setUp(){
        this.blockCollection = new BlockCollectionBuilder();
    }

    @Test
    public void makeCollectionAddsNewBlockObjectToArrayListUntilSpecifiedNumberOfBlocksAdded(){

        Block blocks = blockCollection.getBlock();

        ArrayList<Block> expectedResult = new ArrayList<>();
        expectedResult.add(blocks);
        expectedResult.add(blocks);
        expectedResult.add(blocks);


        List actualResult = blockCollection.makeCollection(3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void applyLettersToBlockAssignsLettersFromArrayOfLettersToEachBlockVariable(){
        Block block = new Block("B", "O");

        String[][] allLetters = {{"B", "O"}};

        String expectedResult = block.getLetter1() + block.getLetter2();

        System.out.println(expectedResult);

        blockCollection.applyLettersToEachBlock(allLetters);

        String actualResult = blockCollection.getBlock().getLetter1() + blockCollection.getBlock().getLetter2();

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);




    }

}

