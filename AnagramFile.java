import java.io.*;
import java.util.*;

public class AnagramFile {
    public void Write(ArrayList<String> data) throws Exception {
        BufferedWriter file = new BufferedWriter(new FileWriter("save.txt")); // Create file save.txt
        for (int i = 0; i < data.size(); i++) { // Iterate every element in Array List (Lines)
            file.write(data.get(i)); // Add line to file
            file.newLine();
        }
        file.close();
    }

    public ArrayList<String> Read() throws Exception {
        ArrayList<String> lines = new ArrayList<String>(); // Array List where every element is a line

        File file = new File("save.txt"); // Read file save.txt
        Scanner scan = new Scanner(file); // Prepare scanner
        while (scan.hasNextLine()) { // Iterate lines in file
            String data = scan.nextLine(); // Read line
            lines.add(data); // Add line to array
        }
        scan.close();
        return lines; // Return Array List
    }
}