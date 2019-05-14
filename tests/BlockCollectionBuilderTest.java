import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
    public void makeCollectionAddsNewBlockObjectToArrayListUntilCorrectNumberOfBlocksAdded(){

        Block blocks = blockCollection.getBlock();

        ArrayList<Block> expectedResult = new ArrayList<>();
        expectedResult.add(blocks);
        expectedResult.add(blocks);
        expectedResult.add(blocks);


        List actualResult = blockCollection.makeCollection();

        assertEquals(expectedResult, actualResult);
    }

}

