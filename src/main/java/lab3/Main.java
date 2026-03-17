package lab3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main() {
        try {
            printSmallTextFile("in.txt");
            System.out.println("\n\n");
            printLargerTextFile("in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            System.out.print("Writing outfile1.txt ... ");
            writeSmallTextFile("in.txt", "out.txt");
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    static void printSmallTextFile (String fileName) throws IOException {
        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);

        Path out = Paths.get("out.txt");
        BufferedWriter writer = Files.newBufferedWriter(out);



        for (String line : allLinesInMemory) {
            /*String[] s = line.split("/n");
            for (String ss : s) {
                System.out.println("[" + ss + "]");
            }*/
            String[] s2 = line.split("\\.");
            for(String s3:s2){
                s3=s3+". \n";
                writer.write(s3);
            }

        }
        writer.close();
    }

    static void printLargerTextFile (String fileName) throws IOException {
        System.out.println("Using Scanner:");
        Path path = Paths.get(fileName);
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                //process each line in some way
                System.out.println(": " + scanner.nextLine());
            }
        }
    }
    static void writeSmallTextFile(List<String> lines, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, lines);
    }

    static void writeLargerTextFile(List<String> lines, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
