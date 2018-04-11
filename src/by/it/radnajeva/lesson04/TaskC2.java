package by.it.radnajeva.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int i1 = 31;
        int i2 = 30;


        if (month == 1)
            System.out.println(day);
        else if (month == 2)
            System.out.println(i1 + day);
        else if (month >= 3 && month <= 7) {
            if ((month % 2) == 0)
                System.out.println(i1 * (month / 2) + i2 * ((month / 2)-1) - 2 + day);
            else
                System.out.println(i1 * (month / 2) + i2 * (month / 2) - 2 + day);
        } else if (month >= 8 && month <= 12) {
            if ((month % 2) == 0)
                System.out.println(i1 * (month / 2) + i2 * (month / 2 - 1) - 2 + day);
            else
                System.out.println(i1 * (month / 2 + 1) + i2 * ((month / 2)-1) - 2 + day);
        }

    }

}
