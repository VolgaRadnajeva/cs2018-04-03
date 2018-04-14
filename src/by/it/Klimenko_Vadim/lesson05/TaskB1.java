package by.it.Klimenko_Vadim.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Привет ");
        arr.add("как");
        arr.add("твои");
        arr.add("дела,");
        arr.add("друг");
        System.out.println(arr.size());
        for (String s:
                arr) {
            System.out.println(s);
        }
    }

}

