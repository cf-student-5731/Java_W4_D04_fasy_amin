package A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class A3 {

    // countEgg() method
    public static int countEgg (File file) {
        int counter = 0;
        try {
            ArrayList<String> words = new ArrayList<>();

            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                words.add(sc.next());
            }
            for (String str : words) {
                if (str.equalsIgnoreCase("egg")) {
                    counter++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while counting eggs!");
            e.printStackTrace();
        }

        return counter;
    }



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

            System.out.printf("%nEgg repeated %d times in the text file '%s.' %n",
                    countEgg(readmeFile),  readmeFile.getName());

        } catch (Exception e) {
            System.out.println("An error occurred while reading 'readme.txt'!");
            e.printStackTrace();

        }



    }

}
