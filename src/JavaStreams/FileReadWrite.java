package JavaStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileReadWrite {
    public static void main(String[] args) {
   String sourceFilePath = "D:\\BridgeLabz-SIPP-Training\\JavaStreams\\source_case.txt";
        String destinationFilePath = "D:\\BridgeLabz-SIPP-Training\\JavaStreams\\destination_lowercase.txt";

        try {
            // Create a dummy source file for demonstration
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
                    fos.write("This is a test file.\n".getBytes());
                    fos.write("It contains multiple lines.\n".getBytes());
                    fos.write("Hello, Java Streams!".getBytes());
                }
                System.out.println("Created dummy source.txt for demonstration.");
            }

            // Read from source file
            FileInputStream fis = new FileInputStream(sourceFilePath);
            // Write to destination file
            FileOutputStream fos = new FileOutputStream(destinationFilePath);

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath);

            fis.close();
            fos.close();

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            if (e instanceof java.io.FileNotFoundException) {
                System.err.println("Source file '" + sourceFilePath + "' does not exist.");
            }
        }
    }
}