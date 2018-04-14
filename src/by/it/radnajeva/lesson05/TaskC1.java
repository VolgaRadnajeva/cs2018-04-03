package by.it.radnajeva.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
            list.add(Integer.parseInt(sc.next()));
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer j = list.get(i);
            if (j % 3 == 0)
                three.add(j);
            if (j % 2 == 0)
                two.add(j);
            if ((j % 3 != 0) && (j % 2 != 0))
                other.add(j);
        }
        printList(three);
        printList(two);
        printList(other);







/*        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        ArrayList list = new ArrayList(20);
        while (true) {
            String s = sc.next();
            if (s.isEmpty()) break;
            else list.add(Integer.parseInt(s));
        }
        ArrayList three=new ArrayList();
        ArrayList two=new ArrayList();
        ArrayList other=new ArrayList();

*/
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
