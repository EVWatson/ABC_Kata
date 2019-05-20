import java.util.Scanner;

public class IOManager {

    private WordChecker checkWords;
    private BlockCollectionBuilder allBlocks;

    public IOManager(){
        this.checkWords = new WordChecker();
        this.allBlocks = new BlockCollectionBuilder();
    }

    public void runProgram(){

            printMessage(Message.WELCOME);
            printMessage(Message.RULES_OF_THE_GAME);
            printMessage(Message.ENTER_WORD);
            String[] wordToCheck = checkWords.splitWordIntoStrings(getWord());
            boolean canMakeWord = checkWords.isWordInBlockCollection(allBlocks.getAllBlocks(), wordToCheck);

            if(canMakeWord){
                printMessage(Message.CAN_MAKE_WORD);
            } else {
                printMessage(Message.CANNOT_MAKE_WORD);
            }

    }


    public String getWord(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void printMessage(String message){
        System.out.println(message);
    }


    public WordChecker getCheckWords() {
        return checkWords;
    }
}
