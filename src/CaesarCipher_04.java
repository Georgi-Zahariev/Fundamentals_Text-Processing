 
import java.util.Scanner;
 
public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decryptedText = scanner.nextLine(); //"Programming is cool!"
        StringBuilder encryptedText = new StringBuilder(); //кодирания текст
 
        for (char symbol : decryptedText.toCharArray()) {
            //кодирам символа
            char encryptedSymbol = (char)(symbol + 3);
            //добавям към кодирания текст
            encryptedText.append(encryptedSymbol);
        }
 
        System.out.println(encryptedText);
    }
}