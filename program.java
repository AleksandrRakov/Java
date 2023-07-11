/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         System.out.println("Hello world");
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         int s = 23;
//         double a = 20.56;
//         double result = a + s; 

//         System.out.println(result);
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         var s = 23;
//         var a = 20.56;
//         var result = a + s; 

//         System.out.println(result);
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         String s = "qwert"; 

//         System.out.println(s.charAt(3));
//     }
// }

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}