package by.it.miakchilo.lesson04;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */


import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа через пробел, нажмите [Enter]: ");
        int i1 = sc.nextInt(), i2 = sc.nextInt(), i3 = sc.nextInt();
        if (i1 == i2 && i2 == i3) {
            System.out.printf("%d %d %d", i1, i2, i3);
        } else if (i1 == i2) {
            System.out.printf("%d %d", i1, i2);
        } else if (i2 == i3) {
            System.out.printf("%d %d", i2, i3);
        } else if (i1 == i3) {
            System.out.printf("%d %d", i1, i3);
        }
    }
}
