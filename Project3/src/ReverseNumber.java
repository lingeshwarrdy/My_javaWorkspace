
public class ReverseNumber {

    
    public static int reverseDigits(int num) {
        int reverse = 0;
        int lastDigit;
        
        while (num!=0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        
        return reverse;
    }

    public static void main(String[] args) {
        int number = 4536;
        int reversedNumber = reverseDigits(number);  
        System.out.println(reversedNumber);
    }
}