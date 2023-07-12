package Seminar01;

import java.util.Scanner;

public class Task01 {
    String name;

    public Task01() {
       System.out.println("Введите имя!"); 
       Scanner input = new Scanner(System.in);
       name = input.nextLine();
       input.close();
    }

    public void printHelloName() {
        System.out.println("Привет, " + name);
    }
}
