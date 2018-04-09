package by.it.Klimenko_Vadim.lesson03;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    private static double x (int a, int b, int c){
        double x= (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return x;
    }
    private static double y (int a, int b, int c){
        double y= (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=b * b - 4 * a * c;
        double q1=x(a,b,c);
        double q2=y(a,b,c);
        if (d<0) System.out.println("Отрицательный дискриминант");
        if (q1==q2) {System.out.println("Вывод"+"\n"+q1);}
        if (q1>q2 || q1<q2) {System.out.println("Вывод"+"\n"+q1+" "+q2);}

    }

}
