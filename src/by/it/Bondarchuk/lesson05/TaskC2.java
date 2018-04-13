package by.it.Bondarchuk.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] mas = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i]=sc.nextInt();
        }
        sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }





    public static void sort(int[] array) {
        //Напишите тут ваш код
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]<array[j+1]){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }



    }

}
