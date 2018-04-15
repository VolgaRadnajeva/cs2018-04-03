package by.it.Bondarchuk.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/



public class TaskC3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int i = 2;
        String d = null, f = null, g = null;
        while (i <= a) {
            int j = 2;
            switch (i) {
                case 1:
                    d = "один";
                    break;
                case 2:
                    d = "два";
                    break;
                case 3:
                    d = "три";
                    break;
                case 4:
                    d = "четыре";
                    break;
                case 5:
                    d = "пять";
                    break;
                case 6:
                    d = "шесть";
                    break;
                case 7:
                    d = "семь";
                    break;
                case 8:
                    d = "восемь";
                    break;
                case 9:
                    d = "девять";
                    break;
                case 10:
                    d = "десять";
                    break;
                default:
                    break;
            }
            while (j <= b) {
                switch (j) {
                    case 1:
                        f = "один";
                        break;
                    case 2:
                        f = "два";
                        break;
                    case 3:
                        f = "три";
                        break;
                    case 4:
                        f = "четыре";
                        break;
                    case 5:
                        f = "пять";
                        break;
                    case 6:
                        f = "шесть";
                        break;
                    case 7:
                        f = "семь";
                        break;
                    case 8:
                        f = "восемь";
                        break;
                    case 9:
                        f = "девять";
                        break;
                    case 10:
                        f = "десять";
                        break;
                    default:
                        break;
                }
                int r = i * j;
                switch (r) {
                    case 4:
                        g = "четыре";
                        break;
                    case 6:
                        g = "шесть";
                        break;
                    case 8:
                        g = "восемь";
                        break;
                    case 9:
                        g = "девять";
                        break;
                    case 10:
                        g = "десять";
                        break;
                    case 12:
                        g = "двенадцать";
                        break;
                    case 14:
                        g = "четырнадцать";
                        break;
                    case 15:
                        g = "пятнадцать";
                        break;
                    case 16:
                        g = "шестнадцать";
                        break;
                    case 18:
                        g = "восемнадцать";
                        break;
                    case 20:
                        g = "двадцать";
                        break;
                    case 21:
                        g = "двадцать один";
                        break;
                    case 24:
                        g = "двадцать четыре";
                        break;
                    case 25:
                        g = "двадцать пять";
                        break;
                    case 27:
                        g = "двадцать семь";
                        break;
                    case 28:
                        g = "двадцать восемь";
                        break;
                    case 30:
                        g = "тридцать";
                        break;
                    case 32:
                        g = "тридцать два";
                        break;
                    case 35:
                        g = "тридцать пять";
                        break;
                    case 36:
                        g = "тридцать шесть";
                        break;
                    case 40:
                        g = "сорок";
                        break;
                    case 42:
                        g = "сорок два";
                        break;
                    case 45:
                        g = "сорок пять";
                        break;
                    case 48:
                        g = "сорок восемь";
                        break;
                    case 49:
                        g = "сорок девять";
                        break;
                    case 50:
                        g = "пятьдесят";
                        break;
                    case 54:
                        g = "пятьдесят четыре";
                        break;
                    case 56:
                        g = "пятьдесят шесть";
                        break;
                    case 60:
                        g = "шестьдесят";
                        break;
                    case 63:
                        g = "шестьдесят три";
                        break;
                    case 64:
                        g = "шестьдесят четыре";
                        break;
                    case 70:
                        g = "семьдесят";
                        break;
                    case 72:
                        g = "семьдесят два";
                        break;
                    case 80:
                        g = "восемьдесят";
                        break;
                    case 81:
                        g = "восемьдесят один";
                        break;
                    case 90:
                        g = "девяносто";
                        break;
                    case 100:
                        g = "сто";
                        break;
                    default:
                        break;
                }
                System.out.println(d + " умножить на " + f + " равно " + g);
                j++;
            }
            i++;

        }

    }
}