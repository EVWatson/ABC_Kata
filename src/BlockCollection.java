import java.util.ArrayList;



public class BlockCollection {

    private ArrayList<Block> allBlocks;


    public BlockCollection(){
        allBlocks = new ArrayList<>();
        allBlocks.add(new Block("B", "O"));
        allBlocks.add(new Block("X", "K"));
        allBlocks.add(new Block("D", "Q"));
        allBlocks.add(new Block("C", "P"));
        allBlocks.add(new Block("N", "A"));
        allBlocks.add(new Block("G", "T"));
        allBlocks.add(new Block("R", "E"));
        allBlocks.add(new Block("T", "G"));
        allBlocks.add(new Block("Q", "D"));
        allBlocks.add(new Block("F", "S"));
        allBlocks.add(new Block("J", "W"));
        allBlocks.add(new Block("H", "U"));
        allBlocks.add(new Block("V", "I"));
        allBlocks.add(new Block("A", "N"));
        allBlocks.add(new Block("O", "B"));
        allBlocks.add(new Block("E", "R"));
        allBlocks.add(new Block("F", "S"));
        allBlocks.add(new Block("L", "Y"));
        allBlocks.add(new Block("P", "C"));
        allBlocks.add(new Block("Z", "M"));
    }

    public ArrayList<Block> getAllBlocks() {
        return allBlocks;
    }
}






//    public ArrayList addBlocksToCollection(int noOfBlocks){
//        ArrayList<Block> blockCollection = new ArrayList<>();
//
//        for(int blocks = 1; blocks <= noOfBlocks; blocks++){
//            blockCollection.add(this.block);
//        }
//
//        return blockCollection;
//    }
