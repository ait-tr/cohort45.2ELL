public class Dog extends Animal {

    private int numberOfKnownCommands;

    public Dog(String name, String type, int age, int numberOfKnownCommands) {
        this.name = name;
        this.type = type;
        this.age = age;
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
}
