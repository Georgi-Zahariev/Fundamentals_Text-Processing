import java.util.Scanner;
 
public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullPathFile = scanner.nextLine();
        //C:\Internal\training-internal\Template.pptx
        //.split("\")
        String [] pathParts = fullPathFile.split("\\\\");
        //["C:", "Internal", "training-internal", "Template.pptx"]
        //1. пълното име на файла
        String fullFileName = pathParts[pathParts.length - 1]; //"Template.pptx"
        //.split(".") -> ["Template", "pptx"]
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];
 
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
 
    }
}