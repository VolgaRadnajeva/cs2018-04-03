package by.it.miakchilo.lesson06;

public class DogHelper {
    public static void printAllNames(Dog[] dogs){
        for (Dog d: dogs) {
            System.out.print(d.getName() + " ");
        }
        System.out.println();
    }; //должен печатать в консоль через пробел имена всех собак
    public static double averageAge(Dog[] dogs){
        int sum=0;
        for (Dog d: dogs) {
            sum += d.getAge();
        }
        return (double)sum / dogs.length;
    }; //должен вычислять средний возраст переданных ему собак

}
