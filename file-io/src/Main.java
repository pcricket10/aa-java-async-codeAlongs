import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        File file = new File("colors.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("colors.txt created.");
//            } else {
//                System.out.println("colors.txt already exists.");
//            }
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
        // The second FileWriter constructor argument, true,
// indicates this is an appending write.

        // The second FileWriter constructor argument, true,
// indicates this is an appending write.
//        try (FileWriter fileWriter = new FileWriter("colors.txt", true);
//             PrintWriter writer = new PrintWriter(fileWriter)) {
//            writer.println("green");
//            writer.println("orange");
//            writer.println("purple");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//        System.out.println("File contents:");
//        try (FileReader fileReader = new FileReader("colors.txt");
//             BufferedReader reader = new BufferedReader(fileReader)){
//            // When there are no more lines, readLine() returns null.
//            for (String line = reader.readLine(); line != null; line = reader.readLine()){
//                System.out.println(line);
//            }
//
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
//        File file = new File("colors.txt");
//        boolean success = file.delete();
//        if(success) {
//            System.out.println("colors.txt was deleted.");
//        } else {
//            System.out.println("colors.txt was NOT deleted");
//        }
//        ArrayList<String> lines = new ArrayList<>();
//        lines.add("hydrogen");
//        lines.add("helium");
//        lines.add("lithium");
//
//        // Create a file and write to it.
//        Path path = Paths.get("elements.txt");
//        try {
//            Files.write(path, lines, StandardOpenOption.CREATE);
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
//
//        lines.clear();
//        lines.add("beryllium");
//        lines.add("boron");
//        lines.add("carbon");
//
//        // Append to a file.
//        try{
//            Files.write(path, lines, StandardOpenOption.APPEND);
//        } catch( IOException ex){
//            ex.printStackTrace();
//        }
//
//        // Read from the file.
//        try{
//            for(String line : Files.readAllLines(path)){
//                System.out.println(line);
//            }
//        } catch(IOException ex){
//            ex.printStackTrace();
//        }
//
//        // Delete the file.
//        try {
//            boolean success = Files.deleteIfExists(path);
//            if (success) {
//                System.out.println("elements.txt was deleted.");
//            } else {
//                System.out.println("elements.txt was NOT deleted.");
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        File workingDirectory = new File(".");
        for (String path : workingDirectory.list()) {
            File entry = new File(path);
            if (entry.isDirectory()) {
                System.out.print("Directory: ");
            } else {
                System.out.print("File     : ");
            }
            System.out.println(entry.getName());
        }


    }
}