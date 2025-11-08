package Date_11_03;
import java.io.*;

public class Merge_Two_TxtFile {
    public static void main(String[] args) {
        try {
            // Step 1: Open both input files
            BufferedReader file1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader file2 = new BufferedReader(new FileReader("file2.txt"));

            // Step 2: Create output file
            BufferedWriter mergedFile = new BufferedWriter(new FileWriter("merged.txt"));

            // Step 3: Read lines one by one
            String line1 = file1.readLine();
            String line2 = file2.readLine();

            // Step 4: Loop until both files are finished
            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    mergedFile.write(line1);
                    mergedFile.newLine(); // go to next line
                    line1 = file1.readLine();
                }

                if (line2 != null) {
                    mergedFile.write(line2);
                    mergedFile.newLine();
                    line2 = file2.readLine();
                }
            }

            // Step 5: Close all files
            file1.close();
            file2.close();
            mergedFile.close();

            // Step 6: Print message
            System.out.println("Merge completed successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

