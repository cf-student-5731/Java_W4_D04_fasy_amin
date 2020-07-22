package A1_A2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {

    public static void main(String[] args) {
        try {
            File fileObj = new File("/Users/Amin/IdeaProjects/" +
                    "Java_W4_D04_fasy_amin/Amin/my_file/myFile.txt");
            if (fileObj.createNewFile()) {
                System.out.printf("New file, %s, was created. %n", fileObj.getName());
            } else {
                System.out.println("'" + fileObj.getName() + "' already exists!");
            }

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();

        }


        // write to file
        try {
            FileWriter file = new FileWriter("/Users/Amin/IdeaProjects/" +
                    "Java_W4_D04_fasy_amin/Amin/my_file/myFileTwo.txt");
            file.write("Hello World!");
            file.close();
            System.out.println("File was written successfully!");

        } catch (Exception e) {
            System.err.println("An error occurred!");
            e.printStackTrace();
        }
    }
}

