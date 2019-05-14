import java.util.ArrayList;

public class BlockCollectionBuilder {

    private String letter1 = "";
    private String letter2 = "";

   private Block block;

    public BlockCollectionBuilder(){
        this.block = new Block(letter1, letter2);
    }

    /*
    TODO:
    1. pass in number of blocks to be built in method DONE
    2. work out how to put in block letters
     */

    public ArrayList makeCollection(int noOfBlocks){
        ArrayList<Block> blockCollection = new ArrayList<>();

        for(int blocks = 1; blocks <= noOfBlocks; blocks++){
            blockCollection.add(this.block);
        }

        return blockCollection;
    }

    public Block getBlock() {
        return block;
    }
}
