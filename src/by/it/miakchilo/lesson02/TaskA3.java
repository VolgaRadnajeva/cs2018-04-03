package by.it.miakchilo.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k = i * i + j * j;
        // System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);   <-- простой способ, проверено
        System.out.printf("%d*%d+%d*%d=%d", i, i, j, j, k);             //  <-- более элегантный и читабельный способ, мне кажется
    }
}
