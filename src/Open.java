import Impl.OpenImpl;

import java.io.*;

public class Open implements OpenImpl {
    @Override
    public void execute(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            int c; while((c = fileReader.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
