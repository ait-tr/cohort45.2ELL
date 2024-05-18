import java.io.Closeable;
import java.io.IOException;

public class Dog extends Animal implements Swimmable, AbleToEat {

    private int numberOfKnownCommands;

    public Dog(String name, String type, int age, int numberOfKnownCommands) {
        setName(name);
        this.type = type;
        setAge(age);
        this.numberOfKnownCommands = numberOfKnownCommands;
    }

    public Dog() {
    }

    public int getNumberOfKnownCommands() {
        return numberOfKnownCommands;
    }

    public void setNumberOfKnownCommands(int numberOfKnownCommands) {
        this.numberOfKnownCommands = numberOfKnownCommands;
    }


    @Override
    void born() {
        System.out.println("Я родилась, я собачка");
    }

    @Override
    void readInstruction() {
        System.out.println("1. говорите успокаивающим голосом");
        System.out.println("2. Не бесите собаку");
    }

    @Override
    public void swim() {
        System.out.println("Левой, правой");
        System.out.println("О, поплыла");
    }

    @Override
    public void eat(int countOfFood) {
        System.out.println("Собака хорошо поела: " + countOfFood);
    }

}
