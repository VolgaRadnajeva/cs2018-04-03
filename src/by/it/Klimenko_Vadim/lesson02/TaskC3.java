package by.it.Klimenko_Vadim.lesson02;

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
import java.math.RoundingMode;
class TaskC3 {
    public static double getWeight(int weight) {
        return weight;
    }
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int weight = in.nextInt();
            double earth = 9.81;
            double mars = 3.86;
            double getWeight = (weight / (earth / mars));
            getWeight = getWeight * 100;
            int i = (int) Math.round(getWeight);
            getWeight = (double) i / 100;

            float q= (float)weight;
            System.out.println("Ввод :" + "\n" + q);

            getWeight = getWeight * 100;
            int j = (int) Math.round(getWeight);
            getWeight = (double) j / 100;

            System.out.println("Вывод :" + "\n" + getWeight);
        }
        }