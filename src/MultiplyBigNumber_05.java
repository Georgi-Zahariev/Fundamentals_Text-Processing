 
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
 
public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
 
        System.out.println(firstNumber.multiply(secondNumber)); //умножение
        /*System.out.println(firstNumber.add(secondNumber)); //събиране
        System.out.println(firstNumber.subtract(secondNumber)); //изваждане
        System.out.println(firstNumber.divide(secondNumber)); //деление*/
    }
}