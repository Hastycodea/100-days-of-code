package Day35;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    public static void main(String[] args) throws IOException {

        String dirPath = "Assignment";
        String filePath = "Assignment/home.txt";

        //creating a file and directory
        createFileAndDirectory(dirPath, filePath);
        
        
    }

    public static void createFileAndDirectory(String dirPath, String filePath) throws IOException {
        Path directory = Paths.get(dirPath);

        if (!Files.exists(directory)) {

            Files.createDirectories(directory);
            System.out.println("Dircetory created: " + directory.toAbsolutePath());
        }
        Path file = directory.resolve(filePath);
        if (!Files.exists(file)) {
            
            Files.createFile(file);
            System.out.println("File created: " + file.toAbsolutePath());
                
            }


    }
    
}
