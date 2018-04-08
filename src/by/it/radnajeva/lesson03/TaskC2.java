package by.it.radnajeva.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class TaskC2 {
    public static int sumDigitsInNumber(int number) {
        int digit;
        int sumDigitsInNumber = 0;
        digit = number % 10;
        sumDigitsInNumber = sumDigitsInNumber + digit;
        number = number / 10;
        digit = number % 10;
        sumDigitsInNumber = sumDigitsInNumber + digit;
        number = number / 10;
        digit = number % 10;
        sumDigitsInNumber = sumDigitsInNumber + digit;
        number = number / 10;
        sumDigitsInNumber = sumDigitsInNumber + number;
        return sumDigitsInNumber;

    }

/*    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int result=sumDigitsInNumber(number);
        System.out.println(result);

    }
*/


    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

}
