public class Main {
    public static void main(String[] args) {
        if(args[0] == "open"){
            Open open = new Open();
            open.execute(args[1]);
        }
        if(args[0] == "close"){
            Close close = new Close();
            close.execute();
        }
        if(args[0] == "save"){
            Save save = new Save();
            save.execute();
        }
        if(args[0] == "saveas"){
            SaveAs saveas = new SaveAs();
            saveas.execute(args[1]);
        }
        if(args[0] == "help"){
            Help help = new Help();
            help.execute();
        }
        if(args[0] == "exit"){
            Exit exit = new Exit();
            exit.execute();
        }
    }
}