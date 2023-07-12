package Seminar01;

import java.util.Calendar;
import java.util.Scanner;

public class Task02 {
        String name;

    public Task02() {
       System.out.println("Введите имя!"); 
       Scanner input = new Scanner(System.in);
       name = input.next();
       input.close();
    }

    public void goodTime() {
       Calendar calendar = Calendar.getInstance();
       int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
       if(hourOfDay >= 5 && hourOfDay <12) {
        System.out.println("Доброе утро " + name);
       }else if(hourOfDay >= 12 && hourOfDay < 18) {
        System.out.println("Доброе день " + name);
       }else if(hourOfDay >= 18 && hourOfDay < 23) {
        System.out.println("Доброе вечер " + name);
       }else {
        System.out.println("Доброе ночи " + name);
       }

    }

}
