package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson5;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\purplebeam\\IdeaProjects\\Java-CF-Chapters\\src\\gr\\aueb\\codingfactory\\other\\datalabsthessalonikiexr\\lesson5\\JavaFile.txt"))) {
            StringBuilder builder = new StringBuilder();
            PrintWriter writer = new PrintWriter("output.txt","UTF-8");
            String line = reader.readLine();

            while (line != null){
                builder.append(line);
                builder.append(System.lineSeparator());
                line = reader.readLine();

            }

            String everything = builder.toString().toUpperCase();
            System.out.println(everything);

            writer.println(everything);
            writer.close();

        } catch (IOException e) {
            System.out.println("Denied." + e.getMessage());
        }
    }
}
