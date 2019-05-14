import java.util.ArrayList;

public class BlockCollectionBuilder {

    private String letter1 = "";
    private String letter2 = "";

    private String[] letters = {letter1, letter2};

   private Block block;

    public BlockCollectionBuilder(){
        this.block = new Block(letters);
    }


    public ArrayList makeCollection(){
        ArrayList<Block> blockCollection = new ArrayList<>();

        for(int blocks = 0; blocks <= 2; blocks++){
            blockCollection.add(this.block);
        }

        return blockCollection;
    }

    public Block getBlock() {
        return block;
    }
}
