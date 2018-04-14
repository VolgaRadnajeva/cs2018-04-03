package by.it.radnajeva.lesson05;
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
        arr.add(0, "first string");
        arr.add(1, "second string");
        arr.add(2, "third string");
        arr.add(3, "fourth string");
        arr.add(4, "fifth string");


        int size = arr.size();
        System.out.println(size);
        for (
                int i = 0; i < arr.size(); i++)

    /*    {
            int j = arr.size() - i - 1;*/

            System.out.println(arr.get(i));
        }

    }
//}
