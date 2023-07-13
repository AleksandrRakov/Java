package Seminar01;

import java.util.Scanner;

public class Task03 {
    int size;
    int[] array;
    int a;

    
    public Task03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = in.nextInt();
        System.out.println("Введите массив");
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Введите целое число");
        a = in.nextInt();
        in.close();

    }
    public void getMax() {
        int counter = 0;
        int anotherCounter =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                anotherCounter++;
            }else if (anotherCounter !=0){
                if(counter < anotherCounter) {
                    counter = anotherCounter;
                    anotherCounter = 0;
                }
            }
        }
        int answer = counter < anotherCounter ? anotherCounter : counter;
        System.out.println("Максимальное число порядка идущих " + answer);
    }
}
