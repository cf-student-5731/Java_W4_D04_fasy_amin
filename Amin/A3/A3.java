package A3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        try {
            FileWriter wrtFile = new FileWriter("/Users/Amin/IdeaProjects/" +
                    "Java_W4_D04_fasy_amin/Amin/my_file/readme.txt");
            wrtFile.write("recipe for cooking egg:\n" +
                    "ingredients: egg\n" +
                    "put egg in boiling water\n" +
                    "cook for a few minutes\n" +
                    "take egg out\n" +
                    "done\n" +
                    "eat cooked egg\n" +
                    "you won");
            wrtFile.close();
            System.out.println("\n'readme.txt' file was written successfully!");
        } catch (Exception e) {
            System.err.println("An error occurred while writing file!");

        }


        try {
            File readmeFile = new File("/Users/Amin/IdeaProjects/" +
                    "Java_W4_D04_fasy_amin/Amin/my_file/readme.txt");
            Scanner scanner = new Scanner(readmeFile);
            while (scanner.hasNextLine()) {
                String output = scanner.nextLine();
                System.out.println(output);
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("An error occurred while reading 'readme.txt'!");
            e.printStackTrace();

        }


        // countEgg() method
    }

}
