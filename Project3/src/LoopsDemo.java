public class LoopsDemo {
    
    public static void printJavaVersions() {
        int i = 1;
        while (i <= 23) {
            System.out.print("Java " + i + "   "); 
            i++;
        }
        System.out.println(); 
    }

    public static void printAlphabets() {
        int i = 65;
        while (i <= 90) {
            char c = (char) i;
            System.out.print(c + " "); 
            i++;
        }
        System.out.println(); 
    }

    public static void printAlphabet() {
        int i = 97;
        while (i <= 122) {
            char c = (char) i;
            System.out.print(c + " ");
            i++;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        printJavaVersions(); 
        printAlphabets();   
        printAlphabet();     
    }
}
