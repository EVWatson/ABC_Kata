public class Message {

    static String word = "";

    static final String WELCOME = "Welcome to the ABC Word-Checker! \n ";
    static final String RULES_OF_THE_GAME = "" +
            "Here how the program works: \n " +
            "1. You have been given a set of 20 blocks; each block has two letters. \n " +
            "2. When prompted, enter one word. \n " +
            "3. The ABC Word-Checker will try to make your word from the blocks. \n " +
            "4. Once a letter has been used, the block it belongs to cannot be used again. \n " +
            "5. Not all words can be made with the current set of blocks. \n" +
            "6. The blocks will reset for each new word \n" +
            "7. Words are not case-sensitive";

    static final String ENTER_WORD = "Please enter your chosen word: ";
    static  final String CAN_MAKE_WORD = "Can make word";
    static  final String CANNOT_MAKE_WORD = "Cannot make word";
    static final String TRY_ANOTHER_WORD = "Would you like to try another word? Press Y to continue, N to quit";

}
