package Assignment11;
import java.io.*;
import java.util.*;
public class CharecterCount {

    public static void main(String[] args) throws Exception {
        Map<String, Integer> charCount = new HashMap<>();
        FileReader file = new FileReader(
                "C:\\Users\\91836\\Dropbox\\My PC (LAPTOP-8HF9HD4O)\\Desktop\\zemoso1\\testfile.txt");
        int i;
        char x;
        while ((i = file.read()) != -1) {
                x = ((char)i);
                if (charCount.get(String.valueOf(x)) == null) {
                    charCount.put(String.valueOf(x), 1);
                } else {
                    charCount.put(String.valueOf(x), charCount.get(String.valueOf(x)) + 1);
                }



        }
        System.out.println(charCount);
        FileWriter myWriter = new FileWriter("C:\\Users\\91836\\Dropbox\\My PC (LAPTOP-8HF9HD4O)\\Desktop\\zemoso1\\storefile.txt");
        for (Map.Entry<String,Integer> entry : charCount.entrySet())

        myWriter.write("Key is.... " + entry.getKey() + ".......count is :" + entry.getValue()+"\n");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
}

