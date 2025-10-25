public class Help extends Command {
    @Override
    public void execute(){
        System.out.println("The following commands are supported:\n" +
                "open <file> opens <file>\n" +
                "close closes currently opened file\n" +
                "save saves the currently open file\n" +
                "saveas <file> saves the currently open file in <file>\n" +
                "help prints this information\n" +
                "exit exists the program\n");
    }
    @Override
    public void execute(String secondArgument){
        switch (secondArgument){
            case "open":
                System.out.println("provides you this informa...");
                break;
            case "close":
                System.out.println("provides you this informa...");
                break;
            case "save":
                System.out.println("provides you this informa...");
                break;
            case "saveas":
                System.out.println("provides you this informa...");
                break;
            case "help":
                System.out.println("provides you this informa...");
                break;
            case "exit":
                System.out.println("provides you this informa...");
                break;
            default:
                System.out.println("Unknown second command like: " + secondArgument);
                break;
        }
    }
}
