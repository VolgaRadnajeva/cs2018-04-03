package by.it.miakchilo.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1,i2;
        System.out.print("Type first number, then press [Enter]: ");
        i1 = sc.nextInt();
        System.out.print("Type second number, then press [Enter]: ");
        i2 = sc.nextInt();
        System.out.printf("Sum = %d%n",i1+i2);
    }



}
