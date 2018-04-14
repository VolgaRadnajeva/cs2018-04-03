package by.it.miakchilo.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/

import java.util.Scanner;
public class TaskA1 {
    public static void main(String[] args) {
        System.out.print("Введите массив из 10-ти целых чисел, нажмите [Enter]: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        for (i =0; i<=9; i++) {
            arr[9-i] = scanner.nextInt();
        }
        for (i =0; i <=9 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
