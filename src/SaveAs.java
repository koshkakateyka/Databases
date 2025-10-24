import Impl.SaveAsImpl;

public class SaveAs implements SaveAsImpl {
    @Override
    public void execute(String filePath) {
        System.out.println("saveas");
    }
}
