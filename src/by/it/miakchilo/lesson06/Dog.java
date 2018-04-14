package by.it.miakchilo.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight; //вес собаки
    private double power; //сила укуса собаки


    public Dog(){}
    public Dog(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public Dog(String name, int age, int weight, double power){
        this(name,age);
        this.setWeight(weight);
        this.setPower(power);
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public double getChance() {
        return 0.2 * age + 0.3 * weight + 0.5 * power;
    }

    public boolean win(Dog otherDog) {
        return this.getChance() > otherDog.getChance();
    }
    public String toString() {
        return "Кличка: " + this.getName() + ". Возраст: " + this.getAge();
    }
}
