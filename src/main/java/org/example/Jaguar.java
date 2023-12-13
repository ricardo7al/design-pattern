package org.example;

public class Jaguar extends Animal implements IFeline {

        private int age;
        private float weight;

    public Jaguar(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString(){
        return "My age:" + this.getAge() + "My weight:" + this.getWeight();
    }

    @Override
    public void roar() {
        System.out.println("The jaguar roars");

    }

    @Override
    public void meow() {
        System.out.println("The jaguar does not meow");
    }

    @Override
    public void hunt() {
        System.out.println("The jaguar hunts");

    }
}
