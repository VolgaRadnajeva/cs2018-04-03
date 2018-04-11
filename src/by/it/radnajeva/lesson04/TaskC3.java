package by.it.radnajeva.lesson04;

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
/*        int i;
        int j;
        String i1 = "один";
        String i2 = "два";
        String i3 = "три";
        String i4 = "четыре";
        String i5 = "пять";
        String i6 = "шесть";
        String i7 = "семь";
        String i8 = "восемь";
        String i9 = "девять";
        String i10 = "десять";
        String i12 = "двенадцать";
        String i14 = "четтырнадцать";
        String i15 = "пятнадцать";
        String i16 = "шестнадцать";
        String i18 = "восемнадцать";
        String i20 = "двадцать";
        String i21 = "двадцать один";
        String i24 = "двадцать четыре";
        String i25 = "двадцать пять";
        String i27 = "двадцать семь";
        String i28 = "двадцать восемь";
        String i30 = "тридцать";
        String i32 = "тридцать два";
        String i35 = "тридцать пять";
        String i36 = "тридцать шесть";
        String i40 = "сорок";
        String i42 = "сорок два";
        String i45 = "сорок пять";
        String i48 = "сорок восемь";
        String i49 = "сорок девять";
        String i50 = "пятьдесят";
        String i54 = "пятьдесят четыре";
        String i56 = "пятьдесят шесть";
        String i60 = "шестьдесят";
        String i63 = "шестьдесят три";
        String i64 = "шестьдесят четыре";
        String i70 = "семдесят";
        String i72 = "семдесят два";
        String i80 = "восемдесят";
        String i81 = "восемдесят один";
        String i90 = "девяносто";
        String i100 = "сто";
        String a = " умножить на ";
        String b = " равно ";


        for (i = 2; i <= 10; i++) {
            switch (i) {
                case 2:
                    System.out.println(i2 + a + i2 + b + i4);
                    System.out.println(i2 + a + i3 + b + i6);
                    System.out.println(i2 + a + i4 + b + i8);
                    System.out.println(i2 + a + i5 + b + i10);
                    System.out.println(i2 + a + i6 + b + i12);
                    System.out.println(i2 + a + i7 + b + i14);
                    System.out.println(i2 + a + i8 + b + i16);
                    System.out.println(i2 + a + i9 + b + i18);
                    System.out.println(i2 + a + i10 + b + i20);
                case 3:
                    System.out.println(i3 + a + i2 + b + i6);
                    System.out.println(i3 + a + i3 + b + i9);
                    System.out.println(i3 + a + i4 + b + i12);
                    System.out.println(i3 + a + i5 + b + i15);
                    System.out.println(i3 + a + i6 + b + i18);
                    System.out.println(i3 + a + i7 + b + i21);
                    System.out.println(i3 + a + i8 + b + i24);
                    System.out.println(i3 + a + i9 + b + i27);
                    System.out.println(i3 + a + i10 + b + i30);
                case 4:
                    System.out.println(i4 + a + i2 + b + i8);
                    System.out.println(i4 + a + i3 + b + i12);
                    System.out.println(i4 + a + i4 + b + i16);
                    System.out.println(i4 + a + i5 + b + i20);
                    System.out.println(i4 + a + i6 + b + i24);
                    System.out.println(i4 + a + i7 + b + i28);
                    System.out.println(i4 + a + i8 + b + i32);
                    System.out.println(i4 + a + i9 + b + i36);
                    System.out.println(i4 + a + i10 + b + i40);
                case 5:
                    System.out.println(i5 + a + i2 + b + i10);
                    System.out.println(i5 + a + i3 + b + i15);
                    System.out.println(i5 + a + i4 + b + i20);
                    System.out.println(i5 + a + i5 + b + i25);
                    System.out.println(i5 + a + i6 + b + i30);
                    System.out.println(i5 + a + i7 + b + "тридцать пять");
                    System.out.println(i5 + a + i8 + b + "сорок");
                    System.out.println(i5 + a + i9 + b + "сорок пять");
                    System.out.println(i5 + a + i10 + b + "пятьдесят");
                case 6:
                    System.out.println(i6 + a + i2 + b + "двенадцать");
                    System.out.println(i6 + a + i3 + b + "восемнадцать");
                    System.out.println(i6 + a + i4 + b + "двадцать четыре");
                    System.out.println(i6 + a + i5 + b + "тридцать");
                    System.out.println(i6 + a + i6 + b + "тридцать шесть");
                    System.out.println(i6 + a + i7 + b + "сорок два");
                    System.out.println(i6 + a + i8 + b + "сорок восемь");
                    System.out.println(i6 + a + i9 + b + "восемнадцать");
                    System.out.println(i6 + a + i10 + b + "шестьдесят");
                case 7:
                    System.out.println(i7 + a + i2 + b + "четыре");
                    System.out.println(i7 + a + i3 + b + "шесть");
                    System.out.println(i7 + a + i4 + b + "восемь");
                    System.out.println(i7 + a + i5 + b + "десять");
                    System.out.println(i7 + a + i6 + b + "двенадцать");
                    System.out.println(i7 + a + i7 + b + "четырнадцать");
                    System.out.println(i7 + a + i8 + b + "шестнадцать");
                    System.out.println(i7 + a + i9 + b + "восемнадцать");
                    System.out.println(i7 + a + i10 + b + "семьдесят");
                case 8:
                    System.out.println(i8 + a + i2 + b + "четыре");
                    System.out.println(i8 + a + i3 + b + "шесть");
                    System.out.println(i8 + a + i4 + b + "восемь");
                    System.out.println(i8 + a + i5 + b + "десять");
                    System.out.println(i8 + a + i6 + b + "двенадцать");
                    System.out.println(i8 + a + i7 + b + "четырнадцать");
                    System.out.println(i8 + a + i8 + b + "шестнадцать");
                    System.out.println(i8 + a + i9 + b + "восемнадцать");
                    System.out.println(i8 + a + i10 + b + "восемдесят");
                case 9:
                    System.out.println(i9 + a + i2 + b + "четыре");
                    System.out.println(i9 + a + i3 + b + "шесть");
                    System.out.println(i9 + a + i4 + b + "восемь");
                    System.out.println(i9 + a + i5 + b + "десять");
                    System.out.println(i9 + a + i6 + b + "двенадцать");
                    System.out.println(i9 + a + i7 + b + "четырнадцать");
                    System.out.println(i9 + a + i8 + b + "шестнадцать");
                    System.out.println(i9 + a + i9 + b + "восемнадцать");
                    System.out.println(i9 + a + i10 + b + "девяносто");
                case 10:
                    System.out.println(i10 + a + i2 + b + "четыре");
                    System.out.println(i10 + a + i3 + b + "шесть");
                    System.out.println(i10 + a + i4 + b + "восемь");
                    System.out.println(i10 + a + i5 + b + "десять");
                    System.out.println(i10 + a + i6 + b + "двенадцать");
                    System.out.println(i10 + a + i7 + b + "четырнадцать");
                    System.out.println(i10 + a + i8 + b + "шестнадцать");
                    System.out.println(i10 + a + i9 + b + "восемнадцать");
                    System.out.println(i10 + a + i10 + b + "сто");
            }

        }

        j = 1;
        System.out.println();

    }
}
}}
*/}}