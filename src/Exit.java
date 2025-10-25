public class Exit extends Command {
    @Override
    public void execute(){
        System.out.println("exit");
        System.exit(0);
    }
}
