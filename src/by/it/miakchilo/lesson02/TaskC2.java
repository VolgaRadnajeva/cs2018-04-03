package by.it.miakchilo.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        int i1,i2,sum;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.print("Type first number, then press [Enter]: ");
        i1 = sc.nextInt();
        System.out.print("Type second number, then press [Enter]: ");
        i2 = sc.nextInt();
        sum = i1+i2;
        System.out.printf("DEC:%d+%d=%d%n", i1, i2, sum);
        System.out.printf("BIN:%s+%s=%s%n", Integer.toBinaryString(i1), Integer.toBinaryString(i2), Integer.toBinaryString(sum));
        System.out.printf("HEX:%s+%s=%s%n", Integer.toHexString(i1), Integer.toHexString(i2), Integer.toHexString(sum));
        System.out.printf("OCT:%s+%s=%s%n", Integer.toOctalString(i1), Integer.toOctalString(i2), Integer.toOctalString(sum));
    }

}
