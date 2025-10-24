public class Main {
    public static void main(String[] args) {
        if(args[0].equals("open")){
            Open open = new Open();
            try {
                open.execute(args[1]);
            } catch (Exception e) {
                System.out.println("2 arguments");
            }
        }
        if(args[0].equals("close")){
            Close close = new Close();
            close.execute();
        }
        if(args[0].equals("save")){
            Save save = new Save();
            save.execute();
        }
        if(args[0].equals("saveas")){
            SaveAs saveas = new SaveAs();
            try {
                saveas.execute(args[1]);
            } catch (Exception e) {
                System.out.println("2 arguments");
            }
        }
        if(args[0].equals("help")){
            Help help = new Help();
            help.execute();
        }
        if(args[0].equals("exit")){
            Exit exit = new Exit();
            exit.execute();
        }
    }
}