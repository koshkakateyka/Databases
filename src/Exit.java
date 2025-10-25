import Impl.ExitImpl;

public class Exit implements ExitImpl {
    @Override
    public boolean execute(){
        System.out.println("exit");
        return false;
    }
}
