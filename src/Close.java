import Impl.CloseImpl;

public class Close implements CloseImpl {
    @Override
    public void execute(){
        System.out.println("close");
    }
}
