package Assignment1;
import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String searchPattern;

        File homeDir = new File("C:\\Users\\91836\\Dropbox\\My PC (LAPTOP-8HF9HD4O)\\Desktop");

        System.out.println("Enter the search expression: ");
        searchPattern = keyboard.nextLine();

        searchForFiles(homeDir, searchPattern);
    }

    public static void searchForFiles(File homeDir, String searchPattern) {
        File filesList[] = homeDir.listFiles();
        for(File file : filesList) {
            if(file.isFile()) {
                if(file.getName().matches(searchPattern)) {
                    System.out.println(file.toString());
                    break;
                }
            } else {
                searchForFiles(file, searchPattern);
            }
        }
    }
}
