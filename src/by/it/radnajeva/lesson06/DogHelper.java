package by.it.radnajeva.lesson06;

public class DogHelper {
    //void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
    //double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogs) {
        double sum = 0;
        for (Dog dog : dogs) {
            sum=sum+dog.getAge();
        }
        return sum/dogs.length;
    }


}
