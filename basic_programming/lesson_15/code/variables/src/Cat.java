import java.util.Random;

public class Cat {

    // все поля ВСЕГДА private
    //методы:
    //Если вы хотите дать доступ к этому методу классам снаружи - public
    //Если не хотите, то private

    private String name;
    private final String type;
    private int age;

    private static final int MAX_LIVES = 9;

    private int livesWasted;


    //overloading
    public Cat(String name, String type, int age) {
        this.name = name;
        this.type = type;
        //две строки сверху можно заменить на this(name, type);
        this.age = age;
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Cat() {
        type = "дворняга";
    }


    private void die() {
        livesWasted++;
        System.out.println("Кот умер");
    }

    //геттеры = специальные методы, которые позволяют получить доступ к просмотру какого-либо поля

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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
