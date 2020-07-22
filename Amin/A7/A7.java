package A7;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A7 {

    // return sorted File object
    public static File fileWordSort (File file) {

        ArrayList<String> words = new ArrayList<>();
        String filePathName = String.format("/Users/Amin/IdeaProjects/" +
                "Java_W4_D04_fasy_amin/Amin/my_file/%s_sorted.txt", file.getName());
        try {
            File newFile = new File(filePathName);
            FileWriter newFileWriter = new FileWriter(filePathName);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                words.add(sc.next());
            }
            Collections.sort(words);
            for (String w: words) {
                newFileWriter.write(w + "\n");
            }
            newFileWriter.close();
            return newFile;

        } catch (Exception e) {
            System.out.println("Error occurred while counting eggs!");
            e.printStackTrace();
        }

       return null;
    }



    // read text file method
    public static void readFile (File file) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String word = sc.next();
                System.out.println(word);
            }

        } catch (Exception e) {
            System.out.println("An error occurred!");
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {

        // original file
        File orgFile = new File("/Users/Amin/IdeaProjects/" +
                "Java_W4_D04_fasy_amin/Amin/my_file/words.txt");
        File sortedFile = new File("/Users/Amin/IdeaProjects/" +
                "Java_W4_D04_fasy_amin/Amin/my_file/words_sorted.txt");
        sortedFile = fileWordSort(orgFile);


        System.out.println("\n====================================== Original File Content - " +
                "Unordered ======================================\n");
        readFile(orgFile);
        System.out.println("\n====================================== New File Content - " +
                "Ordered ======================================\n");
        readFile(sortedFile);




   /*     try { // creating words.txt
            FileWriter words = new FileWriter("/Users/Amin/IdeaProjects/" +
                    "Java_W4_D04_fasy_amin/Amin/my_file/words.txt");

            words.write("kick\n" + "cool\n" + "disclose\n" + "remember\n" + "enable\n" +
                    "pronounce\n" + "calm\n" + "detect\n" + "melt\n" +
                    "await\n" + "afford\n" + "add\n" + "survive\n" +
                    "deny\n" + "swim\n" + "fine\n" + "plan\n" +
                    "contrast\n" + "rebuild\n" + "comment");
            words.close();


        } catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();

        }*/

    }
}
