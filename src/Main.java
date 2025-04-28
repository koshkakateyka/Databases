import java.util.Objects;
import java.util.Scanner;
import java.io.File;

public class Main {
    private static int i = 0;
    private static String fileName;
    private static String path;
    private static String justArray;

    public static void main(String[] args) {
        String dirPath = System.getProperty("user.dir");
        File directory = new File(dirPath);

        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNext()) {
            String myStr = scanner.nextLine();
            if(myStr){
                smartSplit(myStr, 2);
            }


//            System.out.println(myStr);
//            String line = scanner.nextLine();
//            line = line.toLowerCase();
//
//            switch (){
//                case "open":
//                    i = 0;
//
//                    switch (i){
//                        case 0: break;
//                        case 1: System.out.println("open <file>"); break;
//                        case 2:
//
//                            break;
//                        default: break;
//                    }
//                    break;
//                    case "close":
//                        break;
//                    case "save":
//                        break;
//                    // я понимаю что saveas тут не так должен работать...
//                    case "saveas":
//                        i = 0;
//
//                        switch (i){
//                            case 0: break;
//                            case 1: System.out.println("saveas <file>"); break;
//                            case 2:
//
//                                break;
//                            default: break;
//                        }
//                        break;
//                    case "help":
//                        break;
//                    case "exit":
//                        break;
//                    default: System.out.println("Unknown command, for more information write this "+
//                            "command:\n> help"); break;
//
//            }

            System.out.print("> ");
        }
    }
    public static void smartSplit(String myStr, int words){
        int i = 0;
        String regex = " ";
        String[] myArray = myStr.split(regex);
        for (String s : myArray) {
            if(i < words){
                i++;
                System.out.println(s);
            }

        }
    }

}