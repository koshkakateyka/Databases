import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command open = new Open();
        Command close = new Close();
        Command save = new Save();
        Command saveAs = new SaveAs();
        Command help = new Help();
        Command exit = new Exit();

        while(true){
            List<String> string = new ArrayList<>();

            // Create a scanner object
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner = new Scanner(input);
            // https://www.w3schools.com/java/ref_scanner_hasnext.asp
            // Read every token
            while(scanner.hasNext()) {
                string.add(scanner.next());
            }
            switch (string.get(0)){
                case "open":
                    // https://medium.com/@AlexanderObregon/javas-objects-equals-method-explained-3a84c963edfa
                    if(Objects.equals(string.get(0), "open") && string.size() == 2){
                        open.execute(string.get(1));
                    } else {
                        System.out.println("Only 2 arguments, but you have: " + string.size());
                    }
                    break;
                case "close":
                    if(Objects.equals(string.get(0), "close") && string.size() == 1){
                        close.execute();
                    }else {
                        System.out.println("Only 1 argument, but you have: " + string.size());
                    }
                    break;
                case "save":
                    if(Objects.equals(string.get(0), "save") && string.size() == 1){
                        save.execute();
                    }else {
                        System.out.println("Only 1 argument, but you have: " + string.size());
                    }
                    break;
                case "saveas":
                    if(Objects.equals(string.get(0), "saveas") && string.size() == 2){
                        saveAs.execute(string.get(1));
                    }else {
                        System.out.println("Only 2 arguments, but you have: " + string.size());
                    }
                    break;
                case "help":
                    if(Objects.equals(string.get(0), "help") && string.size() == 1){
                        help.execute();
                    } else if (Objects.equals(string.get(0), "help") && string.size() == 2) {
                        help.execute(string.get(1));
                    } else {
                        System.out.println("Only 1 or 2 arguments, but you have: " + string.size());
                    }
                    break;
                case "exit":
                    if(Objects.equals(string.get(0), "exit") && string.size() == 1){
                        exit.execute();
                    }else {
                        System.out.println("Only 1 argument, but you have: " + string.size());
                    }
                    break;
                default:
                    System.out.println("Unknown command like: " + string.get(0));
                    break;
            }
        }
    }
}