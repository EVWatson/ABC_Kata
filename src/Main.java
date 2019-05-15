import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        BlockCollectionBuilder collectBlocks = new BlockCollectionBuilder();

        ArrayList blocks = collectBlocks.getAllBlocks();

            for(int i = 0; i< blocks.size(); i++){
                System.out.println(blocks);
            }

    }
}
