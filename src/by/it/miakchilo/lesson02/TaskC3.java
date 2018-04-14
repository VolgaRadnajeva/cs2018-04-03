package by.it.miakchilo.lesson02;

import java.rmi.MarshalException;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w;
        System.out.println("Type an earthly person's weight, then hit [Enter]: ");
        w = scanner.nextInt();
        System.out.println(getWeight(w));
    }

    public static double getWeight(int weight) {
        final double MARS = 3.86;
        final double EARTH = 9.81;
        double ratioMarsToEarth = MARS/EARTH;
        return (double)Math.round(weight*ratioMarsToEarth*100)/100;
    }
}
