package by.it.Klimenko_Vadim.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        ArrayList<Integer> mulOf3 = new ArrayList<Integer>();
        ArrayList<Integer> mulOf2 = new ArrayList<Integer>();
        ArrayList<Integer> rest = new ArrayList<Integer>();

        System.out.println("Введите 20 чисел с клавиатуры");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            rest.add(arr[i]);

            if(arr[i] % 3 ==0) mulOf3.add(arr[i]);
            if(arr[i] % 2 ==0) mulOf2.add(arr[i]);
        }
        rest.removeAll(mulOf2);
        rest.removeAll(mulOf3);

        printList(mulOf3);
        printList(mulOf2);
        printList(rest);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}