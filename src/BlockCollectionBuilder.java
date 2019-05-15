import java.util.ArrayList;



public class BlockCollectionBuilder {

    private Block b1;
    private Block b2;
    private Block b3;
    private Block b4;
    private Block b5;
    private Block b6;
    private Block b7;
    private Block b8;
    private Block b9;
    private Block b10;
    private Block b11;
    private Block b12;
    private Block b13;
    private Block b14;
    private Block b15;
    private Block b16;
    private Block b17;
    private Block b18;
    private Block b19;
    private Block b20;

    private ArrayList<Block> allBlocks;


    public BlockCollectionBuilder(){
        this.b1 = new Block("B", "O");
        this.b2 = new Block("X", "K");
        this.b3 = new Block("D", "Q");
        this.b4 = new Block("C", "P");
        this.b5 = new Block("N", "A");
        this.b6 = new Block("G", "T");
        this.b7 = new Block("R", "E");
        this.b8 = new Block("T", "G");
        this.b9 = new Block("Q", "D");
        this.b10 = new Block("F", "S");
        this.b11 = new Block("J", "W");
        this.b12 = new Block("H", "U");
        this.b13 = new Block("V", "I");
        this.b14 = new Block("A", "N");
        this.b15 = new Block("O", "B");
        this.b16 = new Block("E", "R");
        this.b17 = new Block("F", "S");
        this.b18 = new Block("L", "Y");
        this.b19 = new Block("P", "C");
        this.b20 = new Block("Z", "M");

        this.allBlocks = addBlocksToCollection();
    }



    private ArrayList<Block> addBlocksToCollection(){

        ArrayList<Block> blockCollection = new ArrayList<>();
        blockCollection.add(this.b1);
        blockCollection.add(this.b2);
        blockCollection.add(this.b3);
        blockCollection.add(this.b4);
        blockCollection.add(this.b5);
        blockCollection.add(this.b6);
        blockCollection.add(this.b7);
        blockCollection.add(this.b8);
        blockCollection.add(this.b9);
        blockCollection.add(this.b10);
        blockCollection.add(this.b11);
        blockCollection.add(this.b12);
        blockCollection.add(this.b13);
        blockCollection.add(this.b14);
        blockCollection.add(this.b15);
        blockCollection.add(this.b16);
        blockCollection.add(this.b17);
        blockCollection.add(this.b18);
        blockCollection.add(this.b19);
        blockCollection.add(this.b20);

        return blockCollection;
    }


    public Block getB1() {
        return b1;
    }

    public Block getB2() {
        return b2;
    }

    public Block getB3() {
        return b3;
    }

    public Block getB4() {
        return b4;
    }

    public Block getB5() {
        return b5;
    }

    public Block getB6() {
        return b6;
    }

    public Block getB7() {
        return b7;
    }

    public Block getB8() {
        return b8;
    }

    public Block getB9() {
        return b9;
    }

    public Block getB10() {
        return b10;
    }

    public Block getB11() {
        return b11;
    }

    public Block getB12() {
        return b12;
    }

    public Block getB13() {
        return b13;
    }

    public Block getB14() {
        return b14;
    }

    public Block getB15() {
        return b15;
    }

    public Block getB16() {
        return b16;
    }

    public Block getB17() {
        return b17;
    }

    public Block getB18() {
        return b18;
    }

    public Block getB19() {
        return b19;
    }

    public Block getB20() {
        return b20;
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
