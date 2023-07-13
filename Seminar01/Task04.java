package Seminar01;

import java.util.Scanner;

public class Task04 {
    String str;

    public Task04() {
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        in.close();
    }

    public void printReversString() {
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
            
        }
    }
   
}
