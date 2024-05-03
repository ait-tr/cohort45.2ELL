import java.util.Random;

public class Cat extends Animal {

    private int livesWasted;

    private static final int MAX_LIVES = 9;


    public Cat(String name, String type, int age) {
        setName(name);
        this.type = type;
        setAge(age);
    }

    public Cat(String name, String type) {
        setName(name);
        this.type = type;
    }

    public Cat() {
        type = "дворняга";
    }


    private void die() {
        livesWasted++;
        System.out.println("Кот умер");
    }

    public boolean jump() {
        if (livesWasted == MAX_LIVES) {
            System.out.println("Извините, но кошка больше не может прыгать");
            return false;
        }

        Random random = new Random();
        int number = random.nextInt(0, 100);

        if (number == 0) {
            die();
        } else {
            System.out.println("Вау, как круто летим");
        }

        return true;
    }

    @Override //аннотация
    void born() {
        String name = getName();

        System.out.println("Кошечка родилась");
        System.out.println("Ее зовут " + name);
    }

    @Override
    void readInstruction() {
        System.out.println("1. не трогайте ее, она сама");
    }


}
