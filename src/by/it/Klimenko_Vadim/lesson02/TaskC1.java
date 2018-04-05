package by.it.Klimenko_Vadim.lesson02;

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
        int a;
        int b;
        int sum;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Ввод:"+"\n"+a+" "+b);
        System.out.println("Вывод:"+"\n"+"Sum = "+sum);
    }
}
