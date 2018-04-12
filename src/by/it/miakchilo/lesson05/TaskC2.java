package by.it.miakchilo.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Введите 20 чисел с клавиатуры");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int f: arr) {
            System.out.println(f);
        }
    }

    private static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if (array[j]>array[j-1]) {
                    temp=array[j-1]; array[j-1]=array[j]; array[j]=temp;
                }
            }
        }
    }

}
