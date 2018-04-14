package by.it.Klimenko_Vadim.lesson04;

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
        System.out.println("Введите число и месяц 2018 года через пробел, нажмите [Enter]: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month= sc.nextInt();
        int total_day=0;
        if (day <= 0) {
            day = 1;
        } else if (day>31)
            day=1;
        if (month<=0) month=1;
        else if (month>12) month=12;
        int i=1;
        if (month==1){
            total_day=0;
        }
        else {
            while (i<month){
                if (i==1||i==3||i==5 ||i==7 ||i==8 ||i==10)
                    total_day+=31;
                else if (i==2)
                    total_day+=28;
                            else if (i==4||i==6||i==9||i==11)
                                total_day+=30;
             i++;
            }
        }

        System.out.println(total_day+day);
    }
}
