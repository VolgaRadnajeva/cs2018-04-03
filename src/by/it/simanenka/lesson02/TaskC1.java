package by.it.simanenka.lesson02;

import java.util.Scanner;

import static java.lang.System.in;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
            System.out.println("Введите число");
            Scanner sc=new Scanner(in);
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i+j);
    }




}
