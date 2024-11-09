
import java.util.Scanner;

public class NumberOperationsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberService service = new NumberService();  
        
        System.out.println("Number Operations App:");
        System.out.println("-----------------------");
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();  
        
        int option = 0;
        
        do {
            
            System.out.println("\nSelect Operation:");
            System.out.println("1. Reverse the number");
            System.out.println("2. Sum of digits");
            System.out.println("3. Count of digits");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");
            option = sc.nextInt();  

            switch(option) {
                case 1:
                    int reversedNumber = service.reverseNumber(number);
                    System.out.println("Reversed Number: " + reversedNumber);
                    break;
                    
                case 2:
                    int sumOfDigits = service.sumDigits(number);
                    System.out.println("Sum of Digits: " + sumOfDigits);
                    break;
                    
                case 3:
                    int digitCount = service.countDigits(number);
                    System.out.println("Count of Digits: " + digitCount);
                    break;
                    
                case 0:
                    System.out.println("Exit from the program... Bye!");
                    break;
                    
                default:
                    System.out.println("Invalid Option! Please choose again.");
                    break;
            }
        } while(option != 0);
        
       
    }
}

