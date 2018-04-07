package by.it.miakchilo.lesson03;

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
import java.util.Scanner;
class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Введите коэффициенты a, b и c квадратного уравнения через пробел, нажмите [Enter]: ");
        if (!sc.hasNextInt()) {
            System.out.println("Неверный ввод!"); return;
        }
        a = sc.nextInt();
        if (a==0) {
            System.out.println("Коэффициент а не может быть равен нулю"); return;
        }
        /* следовало бы еще проверить что введены реальные числа для коэффициентов b и с, либо что они опущены, и следовательно равняются нулю,
           но опустим для схематизма :)
         */
        b = sc.nextInt();
        c = sc.nextInt();
        double d = dis(a,b,c);
        if (d>0) {
            System.out.println( (b*-1+Math.sqrt(d)) / (2*a) + " " + (b*-1 - Math.sqrt(d)) / (2*a) );
        } else if (d==0) {
            System.out.println( ((double)b) / (2*a) * -1 );
        } else {
            System.out.println("Отрицательный дискриминант");
        }
    }
    public static double dis(int a, int b, int c) {
        return b*b-4*a*c;
    }
}
