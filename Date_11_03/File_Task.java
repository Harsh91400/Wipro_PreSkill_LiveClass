package Date_11_03;
import java.io.*;


public class File_Task {
    public static void main(String[] args) {
        try {
            FileWriter essayWriter = new FileWriter("essay.txt");
            essayWriter.write("Harshit Tripathi\n");
            essayWriter.write("Great Learning is a great platform for learning.\n");

            essayWriter.write("It is our Wipro Preskill Training.\n");
            essayWriter.close();

            BufferedReader reader = new BufferedReader(new FileReader("essay.txt"));
            String line;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
            reader.close();

            FileWriter reportWriter = new FileWriter("report.txt");
            reportWriter.write("Total number of lines: " + lineCount + "\n");
            reportWriter.write("Total number of words: " + wordCount + "\n");
            reportWriter.close();

            System.out.println("Report generated successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


