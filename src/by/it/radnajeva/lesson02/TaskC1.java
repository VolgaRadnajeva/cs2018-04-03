package by.it.radnajeva.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

import java.util.Scanner;

class TaskC1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        System.out.println("Ввод:");
        System.out.println(a + " " + b);
        System.out.println(" ");
        System.out.println("Вывод:");
        System.out.println("Sum = " + c);


    }


}
